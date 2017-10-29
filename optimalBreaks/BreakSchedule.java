package optimalBreaks;

import java.util.ArrayList;
import java.util.*;

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

    int [][][][] table;
    int totalCost(String word, List<Integer> breakList) { // TODO Complete for Task 2

        int zero = 0;
        int indexLength = word.length()-1;
        int first = 0;
        int last = 0;
        if(breakList != null)   last = breakList.size() - 1;

        //table = new int[indexLength][indexLength][breakList.size()][breakList.size()];
        if (breakList != null) {

            if (zero == indexLength || last <= 0) {
                return 0;
            } else if (breakList.size() == 1 && breakList.get(0) == indexLength) {
                return 0;
            } else if (!(breakList.contains(zero)) || !(breakList.contains(indexLength))) {
                return (indexLength - zero + 1) +
                        Math.min(
                                totalCost(
                                        word.substring(zero, breakList.get(first)),
                                        breakList.subList(0, first )),
                                totalCost(
                                        word.substring(breakList.get(first) + 1),
                                        breakList.subList(first, breakList.size())
                                )
                        );
            } else if (first == zero) {
                return totalCost(word.substring(zero + 1, indexLength + 1), breakList.subList(1, breakList.size()));
            }

            return 0;
        } else
            return 0;

    }

    // Precondition: word is a string and breakList is an array of integers in strictly increasing order
    //               the last element of breakList is no more than the number of characters in word.
    // Postcondition: Return the schedule of breaks so that word is broken according to the list of
    // 					breaks specified in breakList which yields the minimum total cost.

    ArrayList<Integer> breakSchedule(String word, ArrayList<Integer> breakList) { // TODO Complete for Task 3
        int zero = 0;
        int indexLength = word.length();
        int first = 0;
        if (zero == indexLength || breakList.size() <= 0) {
            return null;
        } else if (breakList.size() == 1 && breakList.get(0) == indexLength) {
            return null;
        }
        return null;
    }
}
