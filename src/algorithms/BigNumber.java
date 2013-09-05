package algorithms;

import java.util.ArrayList;
import java.util.List;

//this Algorithm still need to be improved,
//the time complexity is n^3
public class BigNumber {
	
	public String BigNumberMultiple(String firstNum, String secondNum){
		
		//convert string into calculable data structure
		List<Integer> firstNumList = castCharListToIntegerList(
				convertStrToCharList(reverseStr(firstNum)));
		
		List<Integer> secondNumList = castCharListToIntegerList(
				convertStrToCharList(reverseStr(secondNum)));
		
		int totalLength = firstNumList.size() + secondNumList.size() + 1;
		List<Integer> answerList = new ArrayList<Integer>();	
		//initial answer list
		for(int i = 0; i < totalLength; i++){
			answerList.add(i, 0);
		}
		
		//every position starts from 0
		for(int firstNumPos = 0; firstNumPos < firstNumList.size(); firstNumPos ++){
			for(int secondPos = 0; secondPos < secondNumList.size(); secondPos ++){
				System.out.println("Loop aPos:"+firstNumPos+" Loop b:"+secondPos);
				int currentPos = firstNumPos + secondPos;
				int currentPosVal = answerList.get(currentPos);
				//answer_n =  firstNum_a * secondNum_b (n = a + b)
				currentPosVal += firstNumList.get(firstNumPos) * secondNumList.get(secondPos);
				answerList.set(currentPos, currentPosVal);
				//check every carry in answer list
				checkForCarry(answerList);
			}
		}
		return cutFrontZero(reverseStr(convertCharListToStr(castIntegerListToCharList(answerList))));
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
				if(currentPos + 1 < answer.size()){
					int currentPosPlus1Val = answer.get(currentPos + 1);
					currentPosPlus1Val = currentPosPlus1Val + carry;
					answer.set(currentPosPlus1, currentPosPlus1Val);
				}	
			}
		}
	}
	
	//TODO
	//File Reader
	
	private List<Character> convertStrToCharList(String input){
		List<Character> result = new ArrayList<Character>();
		for(int pos = 0; pos < input.length(); pos++){
			result.add(input.charAt(pos));
		}
		return result;
	}
	
	private String convertCharListToStr(List<Character> inputList){
		String result = "";
		for(int pos = 0; pos < inputList.size(); pos++){
			result += inputList.get(pos);
		}
		return result;
	}
	
	private List<Integer> castCharListToIntegerList(List<Character> inputList){
		List<Integer> result = new ArrayList<Integer>();
		for(Character currentChar : inputList){
			result.add(Integer.valueOf(currentChar.toString()));
		}
		return result;
	}
	
	private List<Character> castIntegerListToCharList(List<Integer> inputList){
		List<Character> result = new ArrayList<Character>();
		for(Integer currentInt : inputList){
			result.add(String.valueOf(currentInt).toCharArray()[0]);
		}
		return result;
	}
	
	//this method is used to reverse the input String
	//in order to convert them into list
	//NOTE: this method actually can be achieve by "StringBuffer.reverse()"
	private String reverseStr(String input){
		List<Character> forwardList = convertStrToCharList(input);
		List<Character> backwardList = reverseCharList(forwardList);
		return convertCharListToStr(backwardList);
	}
	
	private List<Character> reverseCharList(List<Character> inputList){
		List<Character> forwardList = inputList;
		List<Character> backwardList = new ArrayList<Character>();

		//reverse the inputList's content 
		for(int pos = forwardList.size() - 1; pos >= 0; pos--){
			backwardList.add(inputList.get(pos));
		}
		return backwardList;
	}
	
	//This method is used for cutting the 0s in front of the answer
	//e.g. 11*11 = 00132 >> 132
	private String cutFrontZero(String input){
		String result = "";
		int inputPos = 0;
		int startingPos = 0;
		while(true){
			if(input.charAt(inputPos) != '0'){
				startingPos = inputPos;
				break;
			}
			inputPos ++;	
		}
		for(int pos = startingPos; pos < input.length(); pos++){
			result += input.charAt(pos);
		}
		return result;
	}
}
