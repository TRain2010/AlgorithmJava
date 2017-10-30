import java.util.*;

public class StringReplace{
	public static void main(String args[]) {
		StringReplace sp = new StringReplace();
		System.out.println("Input string: " + args[0]);
		System.out.println("Stirng to replace: " + args[1]);
		System.out.println("Replace string with: " + args[2]);
		System.out.println("Result: " + sp.stringReplace(args[0], args[1], args[2]));

	}

	public String stringReplace(String input, String s, String t) {
		StringBuilder sb = new StringBuilder();
		int fromIndex = 0;
		int matchIndex = input.indexOf(s, fromIndex);
		while (matchIndex != -1) {
			sb.append(input, fromIndex, matchIndex).append(t);
			fromIndex = matchIndex + s.length();
			matchIndex = input.indexOf(s, fromIndex);
		}
		sb.append(input, fromIndex, input.length());
		return sb.toString();
	}
}