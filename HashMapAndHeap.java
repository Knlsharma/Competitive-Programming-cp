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

// Longest Consecutive Sequence Of Elements
public static void LowestCS(int[] arr) {
	HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>();


	for (int val : arr) {
		hm.put(val, true);
	}

	for (int val : arr) {
		if (hm.containsKey(val - 1)) {
			hm.put(val, true);
		}

	}

	int msp = 0;
	int ml = 0;
	for (int val : arr) {
		int tl = 1;
		int tsp = val;
		while (hm.containsKey(tl + tsp)) {
			tl++;
		}
		if (tl > ml) {
			ml = tl;
			msp = tsp;
		}
	}

	for (int i = 0 ; i < ml ; i++) {
		System.out.println(msp + i);
	}
}

/*
 *  Priority Queue Operations

 *  peek : T => O(1)
 *  add : T => O(log n)
 *  remove :  T => O(log n)
 */

PriorityQueue<Integer> pq = new PriorityQueue<>();
//   PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
int[] ranks = {12, 12, 31, 1, 23, 53, 9};

for (int val : ranks) { // O(n)
	pq.add(val);         // O(logn)
}
// Overall Complexity : O(nlogn) = Loop + add in queue

while (pq.size() > 0) {  // O(n)
	System.out.println(pq.peek());   // O(1)
	pq.remove();           // O(logn)
}

// K Largest Elements
public static void kLargest(int[] arr, int k) {
	if (k == 0 || arr.length == 0) {
		return;
	}

	PriorityQueue<Integer> pq = new PriorityQueue<>();
	for (int i = 0 ; i < arr.length ; i++) {
		if (i < k) {
			pq.add(arr[i]);
		} else {
			if (arr[i] > pq.peek()) {
				pq.remove(pq.peek());
				pq.add(arr[i]);
			}
		}
	}

	while (pq.size() > 0) {  // O(n)
		System.out.println(pq.peek());   // O(1)
		pq.remove();           // O(logn)
	}

}


// Sort K-sorted Array
public static void sortKSortedArray(int[] arr, int k) {
	PriorityQueue<Integer> pq = new PriorityQueue<>();
	for (int i = 0 ; i <= k ; i++) {
		pq.add(arr[i]);
	}

	for (int i = k + 1 ; i < arr.length ; i++) {
		System.out.println(pq.remove());
		pq.add(arr[i]);
	}

	while (pq.size() > 0) {
		System.out.println(pq.remove());
	}
}

// Merge K Sorted Lists
public static class Pair implements Comparable<Pair> {
	int li;
	int di;
	int val;

	Pair(int li, int di, int val) {
		this.li = li;
		this.di = di;
		this.val = val;
	}

	public int compareTo(Pair o) {
		return this.val - o.val;
	}
}
public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists) {
	ArrayList<Integer> rv = new ArrayList<>();

	PriorityQueue<Pair> pq = new PriorityQueue<>();

	for (int i = 0 ; i < lists.size() ; i++) {
		Pair p = new Pair(i, 0, lists.get(0).get(i));
		pq.add(p);
	}

	while (pq.size() > 0) {
		Pair p = pq.remove();
		rv.add(p.val);
		p.di++;

		if (p.di < lists.get(p.li).size()) {
			p.val = lists.get(p.li).get(p.di);
			pq.add(p);
		}
	}

	return rv;
}


}

