package chess;
import java.util.ArrayList;

public class CheckInput {
	
	
	public static boolean checkCoordinateValidity(String input){
		/*
		check string is length 2
		split string
		first input 1 to 8 (0 to 7 for array)
		second input letter from a to h (translate to number from 0 to 7 for array)
		*/


		if(input.length() != 2){
			System.out.print("not lengh 2");
			return false;
		}
		Character number = input.charAt(0);
		Character letter = input.charAt(1);
		System.out.print(number + " "+ letter);

		ArrayList<Character> validNumber = new ArrayList<Character>();
		validNumber.add('1');
		validNumber.add('2');
		validNumber.add('3');
		validNumber.add('4');
		validNumber.add('5');
		validNumber.add('6');
		validNumber.add('7');
		validNumber.add('8');
		
		ArrayList<Character> validLetter = new ArrayList<Character>();
		validLetter.add('a');
		validLetter.add('b');
		validLetter.add('c');
		validLetter.add('d');
		validLetter.add('e');
		validLetter.add('f');
		validLetter.add('g');
		validLetter.add('h');

		for(int i = 0; i < validNumber.size(); i++){
			boolean equalNumber = number.equals(validNumber.get(i));
            if(equalNumber) {
                for(int j = 0; j < validLetter.size(); j++){
					boolean equalLetter = letter.equals(validLetter.get(j));
					if(equalLetter) {
						return true;
					}
				}    
            }    
        }
		return false;
	}
}
