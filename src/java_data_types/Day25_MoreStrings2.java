package java_data_types;

public class Day25_MoreStrings2 {

	public static void main(String[] args) {

		String name = "Hello World";
		char[] characters = name.toCharArray(); //'H' 'e' 'l' 'l' 'o' , 'W' 'o' 'r' 'l' 'd'
				
				System.out.println(characters.length);
				
				for(int i=0; i<characters.length;i++) { 
					System.out.println(characters[i]);
				}
				
				String sentence = "Hello today we are learning more strings.";
				String[] words = sentence.split(" ");
				
				for(int a=0;a<words.length;a++) { 
					System.out.println(words[a]);
					
					
					
					

				}
	}
	}

