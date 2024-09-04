import java.util.Arrays;
class Sort {
	public static void main(String args[]) {
		int data[] = {4, -5, 2, 6, 1};
		Arrays.sort(data);
		for (int c: data) {
			System.out.println(c);
		}
	}
}