package optimalBreaks;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class BreakSchedule {


    // Use this class to implement programs for Tasks 2 & 3. Your file must not change the package name,
    // nor the class name. You must not change the names nor the signatures of the two program stubs
    // in this file. You may augment this file with any other method or variable/data declarations that you
    // might need to implement the dynamic programming strategy requested for Tasks 2&3.
    // Make sure however that all your declarations are public.


    // Precondition: word is a string and breakList is an array of integers in strictly increasing order
    //               the last element of breakList is no more than the number of characters in word.
    // Postcondition: Return the minimum total cost of breaking the string word into |breakList|+1 pieces, where
    //                the position of each each break is specified by the integers in breakList.
    //                Refer to the assignment specification for how a single break contributes to the cost.

    int zero = 0;
    int indexLength = 0;
    int first = 0;
    int last = 0;

    ArrayList<ArrayList<ArrayList<ArrayList<Integer>>>> table = new ArrayList<ArrayList<ArrayList<ArrayList<Integer>>>>();

    int totalCost(String word, List<Integer> breakList) { // TODO Complete for Task 2


        if (breakList != null && word != null && word.length()!= 0) {
            indexLength = word.length() - 1;
            last = breakList.size() - 1;
        }

        if (breakList != null && word != null && word.length() != 0 && breakList.size() != 0) {

            if (breakList.size() == 1 && breakList.get(0) == indexLength) {
                System.out.println("1");
                return 0;
            } else if (!(breakList.contains(zero)) && !(breakList.contains(indexLength))) {
                breakList.stream().map((i) -> i = i - breakList.get(0));
                System.out.println("2");
                return (indexLength - zero + 1) +
                        Math.min(
                                totalCost(
                                        word.substring(zero, breakList.get(first)),
                                        breakList.subList(0, first)),
                                totalCost(
                                        word.substring(breakList.get(first) + 1),
                                        breakList.subList(first, breakList.size()).stream().map((i) -> i - breakList.get(0)).collect(Collectors.toList())
                                )
                        );
            } else if (breakList.get(first) == zero) {
                System.out.println("3");
                return Math.min(
                        totalCost(
                                word.substring(zero, breakList.get(first) + 1),
                                breakList.subList(0, first + 1)),
                        Math.min(
                                totalCost(
                                        word.substring(breakList.get(first) + 1),
                                        breakList.subList(first + 1, breakList.size()).stream().map((i) -> i - breakList.get(0)).collect(Collectors.toList())
                                ),
                                totalCost(
                                        word.substring(zero + 1, indexLength + 1), breakList.subList(1, breakList.size())
                                )
                        ));

            } else{
                System.out.println("4");
                return 0;
            }

        } else {
            System.out.println("5");
            return 0;
        }
    }

    // Precondition: word is a string and breakList is an array of integers in strictly increasing order
    //               the last element of breakList is no more than the number of characters in word.
    // Postcondition: Return the schedule of breaks so that word is broken according to the list of
    // 					breaks specified in breakList which yields the minimum total cost.

    ArrayList<Integer> breakSchedule(String word, ArrayList<Integer> breakList) { // TODO Complete for Task 3
        int zero = 0;
        int indexLength = word.length();
        int first = 0;
        if (breakList != null) {
            return null;
        } else return null;
    }
}

