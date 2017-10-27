// package allPermutations;
import java.util.*;

public class AllPermutations {
	public static void main(String[] args) {
		AllPermutations permu = new AllPermutations();
		String ss = args[0];
		List<String> result = new ArrayList<>();
		result = permu.permutations(ss);
		for (int i = 0; i < result.size(); i ++) {
			System.out.println(result.get(i));
		}

	}
	public List<String> permutations(String set) {
		List<String> result = new ArrayList<String>();
		if (set == null) {
			return result;
		}
		char[] array = set.toCharArray();
		permutations(array, result, 0);
		return result;
	}
	public void permutations(char[] array, List<String> result, int level) {
		if (level == array.length) {
			result.add(new String(array));
		}
		Set<Character> used = new HashSet<>();
		for(int i = level; i < array.length; i ++) {
			if (used.add(array[i])) {
				swap(array, i, level);
				permutations(array, result, level + 1);
				swap(array,i, level);

			}
		}
		
	}

	public void swap(char[] array, int left, int right) {
		char tmp = array[left];
		array[left] = array[right];
		array[right] = tmp;

	}
	
}