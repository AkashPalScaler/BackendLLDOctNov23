package MultiThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<ArrayList<Integer>> {
    ArrayList<Integer> arrToSort;
    ExecutorService es;

    public Sorter(ArrayList<Integer> arrToSort, ExecutorService es){
        this.arrToSort = arrToSort;
        this.es = es;
    }

    @Override
    public ArrayList<Integer> call() throws Exception {
        //Base case
        if(arrToSort.size() <= 1){
            return arrToSort;
        }

        int mid = arrToSort.size()/2;

        ArrayList<Integer> leftArr = new ArrayList<>();
        ArrayList<Integer> rightArr = new ArrayList<>();

        for(int i=0;i<mid;i++){
            leftArr.add(arrToSort.get(i));
        }
        for(int i=mid;i<arrToSort.size();i++){
            rightArr.add(arrToSort.get(i));
        }

//        ExecutorService es = Executors.newCachedThreadPool();

        Callable<ArrayList<Integer>> leftSortingTask = new Sorter(leftArr, es);
        Callable<ArrayList<Integer>> rightSortingTask = new Sorter(rightArr, es);

        Future<ArrayList<Integer>> leftSortedArrFuture = es.submit(leftSortingTask);
        Future<ArrayList<Integer>> rightSortedArrFuture = es.submit(rightSortingTask);

        ArrayList<Integer> sortedLeftArray = leftSortedArrFuture.get();
        ArrayList<Integer> sortedRightArray = rightSortedArrFuture.get();

//        mergeBoth -> left and right
        // Merging the two sorted arrays
        int i= 0; // start of left
        int j = 0; //start of right

        ArrayList<Integer> sortedArray = new ArrayList();

        while (i < sortedLeftArray.size() && j < sortedRightArray.size()) {
            if (sortedLeftArray.get(i) <= sortedRightArray.get(j)) {
                sortedArray.add(sortedLeftArray.get(i));
                i += 1;
            } else {
                sortedArray.add(sortedRightArray.get(j));
                j += 1;
            }
        }

        while (i < sortedLeftArray.size()) {
            sortedArray.add(sortedLeftArray.get(i));
            i += 1;
        }

        while (j < sortedRightArray.size()) {
            sortedArray.add(sortedRightArray.get(j));
            j += 1;
        }

        return sortedArray;
    }
}
