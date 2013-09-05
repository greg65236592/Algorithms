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
		for(int aPos = 0; aPos < firstNumList.size(); aPos ++){
			for(int bPos = 0; bPos < secondNumList.size(); bPos ++){
				System.out.println("Loop aPos:"+aPos+" Loop b:"+bPos);
				int currentPos = aPos + bPos;
				int currentPosVal = answer.get(currentPos);
				currentPosVal += firstNumList.get(aPos) * secondNumList.get(bPos);
				answer.set(currentPos, currentPosVal);
				
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
	
	//TODO
	//File Reader
}
