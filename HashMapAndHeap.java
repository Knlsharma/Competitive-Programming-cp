import java.io.*;
import java.util.*;

class HashMapAndHeap {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0 ; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (hm.containsKey(ch)) {
				int oldfreq = hm.get(ch);
				hm.put(ch, oldfreq + 1);
			} else {
				hm.put(ch , 1);
			}
		}

		char mfc = str.charAt(0);
		for (Character key : hm.keySet()) {
			if (hm.get(key) > hm.get(mfc)) {
				mfc = key;
			}
		}
		System.out.println(mfc);
	}

	// Get Common Elements - 1
	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

	for (int val : arr1) {
		if (hm.containsKey(val)) {
			int oldfreq = hm.get(val);
			hm.put(val, oldfreq + 1);
		} else {
			hm.put(val, 1);
		}
	}

	for (int val2 : arr2) {
		if (hm.containsKey(val2)) {
			System.out.println(val2);
			hm.remove(val2);
		}
	}

	// Get Common Elements - 2
	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

	for (int val : arr1) {
		if (hm.containsKey(val)) {
			int oldfreq = hm.get(val);
			hm.put(val, oldfreq + 1);
		} else {
			hm.put(val, 1);
		}
	}

	for (int val2 : arr2) {
		if (hm.containsKey(val2) && hm.get(val2) > 0) {
			System.out.println(val2);
			int oldfreq = hm.get(val2);
			hm.put(val2, oldfreq - 1);
		}
	}
}

}


}
