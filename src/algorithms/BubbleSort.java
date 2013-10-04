package algorithms;

import java.util.List;

/*
 * @ Purpose: This class is the implement of Bubble Sort
 * @ Author: Greg Huang
 */
public class BubbleSort {
	
	public List<Integer> performBubbleSort(List<Integer> unsortedList){
		
		//Should perform n-round to achieve sorting whole list
		//While at round n, the target number should bubble to the position at 
		//unsortedList.size()-2
		for (int round = 0; round < unsortedList.size() - 2; round++){
			bubbleSort(unsortedList, unsortedList.size() - 2 - round);
			System.out.println("Round: "+round+"   List:" + unsortedList);
		}
		
		return unsortedList;
	}
	
	//bubble sort the target number to index n
	private void bubbleSort(List<Integer> unsortedList, int index){
		for (int currentPos = 0; currentPos <= index; currentPos++){
			if(unsortedList.get(currentPos) > unsortedList.get(currentPos+1)){
				swapAtIndex(unsortedList, currentPos);
			}
		}
	}
	
	//swap the integer at index i and i+1
	private void swapAtIndex(List<Integer> waitToSwap, int index){
		int i = 0;
		int iplus1 = 0;
		int temp = 0;
		
		i = waitToSwap.get(index);
		iplus1 = waitToSwap.get(index+1);
		
		temp = i;
		i = iplus1;
		iplus1 = temp;
		
		waitToSwap.set(index, i);
		waitToSwap.set(index+1, iplus1);
	}

}
