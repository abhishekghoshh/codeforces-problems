package src;

public class NextRound {
	public static class File {
		public static void main(String[] args) {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			int n = sc.nextInt();
			int max = sc.nextInt();
			int count = 0, score;
			for (int i = 0; i < n; i++) {
				score = sc.nextInt();
				count += (score > max ? 1 : 0);
			}
			System.out.println(count);
			sc.close();
		}
	}
}
