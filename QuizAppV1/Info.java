import java.util.*;
public class Info{
	private String [] keyWords;
	private String [] multipleChoice;
	private String difficulty;
	private String question;
	private String answer;
	private String solution;
	
	public Info(){
		keyWords = new String[]{""};
		multipleChoice = new String[]{""};
		difficulty = question = answer = solution = "";
	}
	
	public Info(String [] k, String d, String q, String a, String s, String [] m){
		difficulty = d;
		question = q;
		answer = a;
		solution = s;
		if(k != null){
			keyWords = new String[k.length];
			for(int i = 0; i < k.length; i++){
				keyWords[i] = k[i];
			}
		}
		if(m != null){
			multipleChoice = new String[m.length];
			for(int i = 0; i < m.length; i++){
				multipleChoice[i] = m[i];
			}
		}
	}
	public String [] getMultipleChoice(){
		return multipleChoice;
	}
	public void setMultipleChoice(String [] arr){
		multipleChoice = new String[arr.length];
		for(int i = 0; i < arr.length; i++){
			multipleChoice[i] = arr[i];
		}
	}
	public String [] getKeyWords(){
		return keyWords;
	}
	
	public void setKeyWords(String [] k){
		keyWords = new String[k.length];
		for(int i = 0; i < k.length; i++){
			keyWords[i] = k[i];
		}
	}
	public String getDifficulty(){
		return difficulty;
	}
	public void setDifficulty(String d){
		difficulty = d;
	}
	public String getQuestion(){
		return question;
	}
	public void setQuestion(String q){
		question = q;
	}
	public String getAnswer(){
		return answer;
	}
	public void setAnswer(String a){
		answer = a;
	}
	public String getSolution(){
		return solution;
	}
	public void setSolution(String s){
		solution = s;
	}
	public String compare(Info other){
		String err = "";
		if(!difficulty.equals(other.getDifficulty())){
			return err = "Difficulty error, First: " + difficulty + ", Second: " + other.getDifficulty() + "\n";
		}else if(!question.equals(other.getQuestion())){
			return err = "Question error, First: " + question + ", Second: " + other.getQuestion() + "\n";
		}else if(!answer.equals(other.getAnswer())){
			return err = "Answer error, First: " + answer + ", Second: " + other.getAnswer() + "\n";
		}else if(!solution.equals(other.getSolution())){
			return err = "Solution error, First: " + solution + ", Second: " + other.getSolution() + "\n";
		}else if(!Arrays.equals(keyWords, other.getKeyWords())){
			err = "KeyWord Error, ";
			int n = keyWords.length;
			if(n > other.getKeyWords().length){
				n = other.getKeyWords().length;
			}
			for(int i = 0; i< n; i ++ ){
				if(!keyWords[i].equals(other.getKeyWords()[i])){
					err = err+"At index " + i + ", the first is: "+ keyWords[i] + " and the second is: " + other.getKeyWords()[i] +".\n";
				}
			}
			return err;
		}else if(!Arrays.equals(multipleChoice, other.getMultipleChoice())){
			err = "MultipleChoice Error, ";
			int n = multipleChoice.length;
			if(n > other.getMultipleChoice().length){
				n = other.getMultipleChoice().length;
			}
			for(int i = 0; i< n; i ++ ){
				if(!multipleChoice[i].equals(other.getMultipleChoice()[i])){
					err = err+"At index " + i + ", the first is: "+ multipleChoice[i] + " and the second is: " + other.getMultipleChoice()[i] +".\n";
				}
			}
			return err;
		}
		return err;
	}	
	
	
	
	
}