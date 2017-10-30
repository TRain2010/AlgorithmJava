import java.util.*;

public class StringDecompress{
	public static void main(String args[]) {
		StringDecompress sd = new StringDecompress();
		System.out.println(sd.decompress(args[0]));
		return;

	}

	public String decompress(String input) {
		if (input == null|| input.length() < 2) {
			return input;
		}
		StringBuilder sb = new StringBuilder();


		char[] array = input.toCharArray();
		for (int i = 0; i < array.length; i ++) {
			char c = array[i];
			i++;
			int count = array[i] - '0';
			for (int j = 0; j < count; j ++) {
				sb.append(c);
			}
		}

		return sb.toString();
	}
}