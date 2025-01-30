package src.Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetsOfArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<List<Integer>> subsetList = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        subsets(list, subsetList, subset, 0);
        printArr(subsetList);
    }

    private static void subsets(List<Integer> list, List<List<Integer>> subsetList, List<Integer> subset, int currentIdx) {
        // Base Case
        if(currentIdx >= list.size()) {
            subsetList.add(new ArrayList<>(subset));
            return;
        };

        // Exclude element
        subsets(list, subsetList, subset, currentIdx+1);

        // Include Element
        subset.add(list.get(currentIdx));
        subsets(list, subsetList, subset, currentIdx+1);

        // Backtrack - Remove the last element added to the list
        subset.removeLast();
    }

    private static void printArr(List<List<Integer>> arr) {
        for(List<Integer> e : arr) {
            System.out.print(e + ", ");
        }
    }

}
