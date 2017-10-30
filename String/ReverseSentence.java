import java.util.*;

public class ReverseSentence {


	public static void main(String[] args) {
		ReverseSentence rv = new ReverseSentence();
		System.out.println(rv.reverseSentence(args[0]));

	}

	public String reverseSentence(String input) {
		if (input == null || input.length() < 2) {
			return input;
		}
		char[] array = input.toCharArray();
		ReverseWord reverseWord = new ReverseWord();
		reverseWord.reverseWord(array, 0, array.length - 1);
		
		int start = 0;
		for (int i = 0; i < array.length; i ++) {
			if (array[i] == ' ') {
				reverseWord.reverseWord(array, start, i - 1);
				start = i +1;
			}
		}

		// reverse the last word
		reverseWord.reverseWord(array, start, array.length-1);
		return (new String(array));
	}
}