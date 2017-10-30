import java.util.*;

public class ReverseWord {


	public void reverseWord(char[] array, int start, int end) {
		while (start <= end ) {
			swap(array, start ++, end --);
		}
		return;
	}

	public void swap(char[] array, int left, int right) {
		char tmp = array[left];
		array[left] = array[right];
		array[right] = tmp;
	}
}