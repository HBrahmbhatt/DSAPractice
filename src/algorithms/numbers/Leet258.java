package algorithms.numbers;

public class Leet258 {
//	Any number where it's digits add to 9 is always divisible by 9. 
//	(18, 27, 36, 45, 54, 63, 72, 81, 90, etc.) 
//	Therefore the 'digital root' for any number divisible by 9 is always 9.
//  When you've a number that doesn't add up to 9, then you'll have to find
//	its remainder w.r.t. 9 because that will be its 'digital root'
	public int addDigits(int num) {
		if (num == 0) {
			return num;
		}
		if (num % 9 == 0) {
			return 9;
		} else {
			return num % 9;
		}
	}
}
