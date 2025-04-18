package algorithms.string;

public class Leet151 {

	// The champ solution
	public String reverseWords(String s) {
		if (s == null)
			return null;

		char[] a = s.toCharArray();
		int n = a.length;

		// step 1. reverse the whole string
		reverse(a, 0, n - 1);
		// step 2. reverse each word
		reverseWords(a, n);
		// step 3. clean up spaces
		return cleanSpaces(a, n);
	}

	void reverseWords(char[] a, int n) {
		int i = 0, j = 0;

		while (i < n) {
			while (i < j || i < n && a[i] == ' ')
				i++; // skip spaces
			while (j < i || j < n && a[j] != ' ')
				j++; // skip non spaces
			reverse(a, i, j - 1); // reverse the word
		}
	}

	// trim leading, trailing and multiple spaces
	String cleanSpaces(char[] a, int n) {
		int i = 0, j = 0;

		while (j < n) {
			while (j < n && a[j] == ' ')
				j++; // skip spaces
			while (j < n && a[j] != ' ')
				a[i++] = a[j++]; // keep non spaces
			while (j < n && a[j] == ' ')
				j++; // skip spaces
			if (j < n)
				a[i++] = ' '; // keep only one space
		}

		return new String(a).substring(0, i);
	}

	// reverse a[] from a[i] to a[j]
	private void reverse(char[] a, int i, int j) {
		while (i < j) {
			char t = a[i];
			a[i++] = a[j];
			a[j--] = t;
		}
	}

	// Brute force
	public String reverseWordsLevel1(String s) {
		String temp = "";
		String rev = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				temp += s.charAt(i);
			} else {
				if (temp != "") {
					if (rev == "") {
						rev = temp;
						temp = "";
					} else {
						rev = temp + ' ' + rev;
						temp = "";
					}
				} else {
					continue;
				}
			}
		}
		if (temp != "" && rev != "") {
			rev = temp + ' ' + rev;
		} else {
			rev = temp + rev;
		}
		return rev;
	}

	// Using inbuilt functions
	public String reverseWordsInBuilt(String s) {
		String[] str = (s.trim()).split("\\s+");
		int left = 0;
		int right = str.length - 1;

		while (left < right) {
			String temp = str[left];
			str[left] = str[right];
			str[right] = temp;
			left++;
			right--;
		}

		return String.join(" ", str);
	}
}
