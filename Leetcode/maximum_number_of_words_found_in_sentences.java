package Leetcode;

public class maximum_number_of_words_found_in_sentences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		//System.out.println(arr.length);  =>3
		int count=0;
		for(int i=0;i<arr.length;i++) {
			String[] arr1 = arr[i].split(" ");
			if(arr1.length>count) {
				count = arr1.length;
			}
			
		}
		System.out.println(count);
		

	}

}
