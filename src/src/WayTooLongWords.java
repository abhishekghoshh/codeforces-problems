package src;

public class WayTooLongWords {
	public static class File {
		public static void main(String[] args) {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				String word = sc.next();
				int length = word.length();
				if (length > 10) {
					word = new StringBuilder().append(word.charAt(0)).append(length - 2).append(word.charAt(length - 1))
							.toString();
				}
				System.out.println(word);
			}
			sc.close();
		}
	}
}
