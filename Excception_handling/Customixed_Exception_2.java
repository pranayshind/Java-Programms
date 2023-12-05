package Excception_handling;

import java.util.Arrays;
import java.util.ArrayList;

class CustomException extends RuntimeException{
	public CustomException(String message) {
		super(message);
	}
}

public class Customixed_Exception_2 {
	ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java","Python","JavaScript"));
	
	public void CheckLanguage(String language) {
		if(languages.contains(language)) {
			throw new CustomException(language+" already exist");
		
		}
		else {
			languages.add(language);
			System.out.println(language+" is added to ArrayList");
			
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customixed_Exception_2 obj = new Customixed_Exception_2();
		obj.CheckLanguage("Swift");
		obj.CheckLanguage("Java");
		
		

	}

}
