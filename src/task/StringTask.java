package task;

public class StringTask {

	public static void main(String[] args) {
		StringTask("Hello");	
		taskTwo("abcdefgh");
		System.out.println(taskThree("Ryan", "Sohail"));
		System.out.println(taskThree("Ryan", "Ryan"));
	}
	
	
	public static void StringTask(String word) {
		int wordlength = word.length();
		if(wordlength >=5) {
			if(wordlength % 2 == 1) {
				int center = wordlength / 2;
				System.out.println(word.substring(center, center + 1));
			}
		}
	}
	
	public static void taskTwo(String word) {
		int wordlength = word.length();
		if (wordlength > 5) {
			if (wordlength % 2 == 0) {
				int center = wordlength / 2;
				System.out.println(word.substring(center - 1, center +1));
			}
		}
	}
	public static boolean taskThree (String valueOne, String valueTwo) {
		return valueOne.equals(valueTwo);
	}
}
