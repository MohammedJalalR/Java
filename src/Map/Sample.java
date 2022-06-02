package Map;

import java.util.HashMap;
import java.util.Map.Entry;

public class Sample {

	public static void main(String[] args) {

		HashMap<String, Integer> l1 = new HashMap();
		String[] arr = { "hi", "hello", "bye", "hi", "hi", "bye" };
		for (String s : arr) {
			if (!l1.containsKey(s)) {
				l1.put(s, 1);
			} else {
				int count = l1.get(s);
				l1.put(s, count + 1);
			}
		}
		for (Entry o1 : l1.entrySet()) {
			if (l1.get(o1.getKey()) > 1) {
				System.out.println(o1.getKey() + " " + o1.getValue());
			}
		}
	}

}
