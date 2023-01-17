package src;

public class DivideWatermellons {
	public static class File {
		public static void main(String[] args) {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			int w = sc.nextInt();
			if ((w & 1) == 0 && w > 2) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			sc.close();
		}
	}
}
