package algorithms;

import java.util.ArrayList;
import java.util.List;

//this Algorithm still need to be improved,
//the time complexity is n^3
public class BigNumber {
	
	public List<Integer> BigNumberMultiple(
		List<Integer> firstNumList, List<Integer> secondNumList){
		
		int totalLength = firstNumList.size() + secondNumList.size() + 1;
		List<Integer> answer = new ArrayList<Integer>();	
		//initial answer list
		for(int i = 0; i < totalLength; i++){
			answer.add(i, 0);
		}
		System.out.println(answer.size());
		
		//every position starts from 0
		for(int firstNumPos = 0; firstNumPos < firstNumList.size(); firstNumPos ++){
			for(int secondPos = 0; secondPos < secondNumList.size(); secondPos ++){
				System.out.println("Loop aPos:"+firstNumPos+" Loop b:"+secondPos);
				int currentPos = firstNumPos + secondPos;
				int currentPosVal = answer.get(currentPos);
				//answer_n =  firstNum_a * secondNum_b (n = a + b)
				currentPosVal += firstNumList.get(firstNumPos) * secondNumList.get(secondPos);
				answer.set(currentPos, currentPosVal);
				//check every carry in answer list
				checkForCarry(answer);
			}
		}
		return answer;
	}
	
	private void checkForCarry(List<Integer> answer){
		for(int currentPos = 0; currentPos < answer.size(); currentPos++){
			int currentPosVal = answer.get(currentPos);
			
			//if carry
			if(currentPosVal >= 10){
				//let the remained be the currentPosVal
				int carry = currentPosVal / 10;
				currentPosVal = currentPosVal % 10;
				answer.set(currentPos, currentPosVal);
				//add carry
				int currentPosPlus1 = currentPos + 1;
				if(currentPos + 1 <= answer.size()){
					int currentPosPlus1Val = answer.get(currentPos + 1);
					currentPosPlus1Val = currentPosPlus1Val + carry;
					answer.set(currentPosPlus1, currentPosPlus1Val);
				}	
			}
		}
	}
	
	//TODO
	//String Parser
	private List<Integer> converStringToList(String inputStr){
		List<Integer> result = new ArrayList<Integer>();
		
	}
	
	//TODO
	//File Reader
	
	//this method is used to reverse the input String
	//in order to convert them into list
	//NOTE: this method actually can be achieve by "StringBuffer.reverse()"
	private String reverseStr(String input){

		List<Character> tmpForward = new ArrayList<Character>();
		List<Character> tmpBackward = new ArrayList<Character>();
		
		//initial tmp, add input.toCharArray() into tmpForward List
		char[] inputArray = input.toCharArray();
		for(int pos = 0; pos < input.length(); pos++){
			tmpForward.add(inputArray[pos]);
		}

		for(int pos = input.length() - 1; pos >= 0; pos--){
			tmpBackward.add(pos, arg1);
		}
		return output;
	}
	
	private List<Character> putStrIntoCharList(String input){
		List<Character> result = new ArrayList<Character>();
		for(int pos = 0; pos < input.length(); pos++){
			result.add(input.charAt(pos));
		}
		return result;
	}
	
	private String putCharListIntoStr(List<Character> inputList){
		Object[] inputCharArray = inputList.toArray();
		String result = new String();
	}
	
	private List<Character> reverseCharList(List<Character> inputList){
		List<Character> forwardList = inputList;
		List<Character> backwardList = new ArrayList<Character>();
		//initial backwardList
		for(int pos = 0; pos < forwardList.size(); pos++){
			backwardList.add(' ');
		}
		//reverse the inputList's content 
		for(int pos = forwardList.size() - 1; pos >= 0; pos--){
			backwardList.add(inputList.get(pos));
		}
		return backwardList;
	}
}
