package src;

public class Team {
	public static class File {
		public static void main(String[] args) {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			int n = sc.nextInt();
			int count = 0;
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				count += ((a + b + c) >= 2 ? 1 : 0);
			}
			System.out.println(count);
			sc.close();
		}
	}
}
