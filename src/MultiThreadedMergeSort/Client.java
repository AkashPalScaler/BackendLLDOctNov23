package MultiThreadedMergeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayList<Integer> arrToSort = new ArrayList<Integer>(Arrays.asList(8,6,2,9,5,4,1,3));
        ExecutorService es = Executors.newCachedThreadPool();

        Future<ArrayList<Integer>> sortedArrFuture = es.submit(new Sorter(arrToSort, es));
        ArrayList<Integer> sortedArr = sortedArrFuture.get();

        System.out.println(sortedArr);
    }
}
