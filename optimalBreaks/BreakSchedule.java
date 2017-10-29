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
	
	 int totalCost (String word, ArrayList<Integer> breakList) { // TODO Complete for Task 2

		 int i = 0;
		 int j = word.length();

		 if (i==j || breakList.size()<=0 || ){
		 	return 0
		 }
		 else if(breakList.size()==1){
		 	if(breakList.get(0)==j){
		 		return 0;
			}
		 }
		 else if (!(breakList.contains(i)) || !(breakList.contains(j))){
		 	return (j-i+1) + Math.min(totalCost(word.substring(i, breakList.get(k)), breakList[0,k-1]) + totalCost(word.substring(breakList.get(k)+1), breakList[k+1,j]));
		 }
		 else if(breakList.get(0)==i){
		 	return totalCost(word.substring(i+1, j), breakList.remove(0));
		 }

		 return 0;

		 }
	 
	// Precondition: word is a string and breakList is an array of integers in strictly increasing order
	//               the last element of breakList is no more than the number of characters in word.
	// Postcondition: Return the schedule of breaks so that word is broken according to the list of
	// 					breaks specified in breakList which yields the minimum total cost.
	 
	 ArrayList<Integer> breakSchedule (String word, ArrayList<Integer> breakList) { // TODO Complete for Task 3
		 return null;
	 }	 
}
