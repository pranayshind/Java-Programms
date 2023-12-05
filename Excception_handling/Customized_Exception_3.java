package Excception_handling;

import java.util.ArrayList;
import java.util.Arrays;

class CustomException extends Exception{
	public CustomException(String message) {
		super(message);
	}
}

public class Customized_Exception_3 {
	ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java","Python","JavaScript"));
	
	public void CheckLanguage(String language) throws CustomException {
		if(languages.contains(language)) {
			throw new CustomException(language+" already exist");
		
		}
		else {
			languages.add(language);
			System.out.println(language+" is added to ArrayList");
			
		}
	}
	
	

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		Customixed_Exception_2 obj = new Customixed_Exception_2();
		obj.CheckLanguage("Swift");
		obj.CheckLanguage("Java");
		
		

	}
	

}

