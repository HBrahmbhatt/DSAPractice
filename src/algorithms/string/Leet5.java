package algorithms.string;

public class Leet5 {
	// Need to optimize this
	public String longestPalindrome(String s) {
		String ans = "";

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (palindrome(s, i, j)) {
					String temp = s.substring(i, j + 1);
					if (ans.length() < temp.length()) {
						ans = temp;
					}
				}
			}
		}
		if (ans != "") {
			return ans;
		}
		return "" + s.charAt(0);
	}

	public boolean palindrome(String a, int l, int r) {
		while (l <= r) {
			if (a.charAt(l) != a.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
}
