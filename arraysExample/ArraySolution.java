package arraysExample;

public class ArraySolution {

	public static void main(String[] args) {
		//creation 1D array
		int[] a1 = new int[6];
		int count = 1;
		for(int i=0;i<a1.length;i++) {
			a1[i] = count;
			count++;
		}
		for(int j=0;j<a1.length;j++) {
			System.out.print(a1[j] + " ");
		}
		
		System.out.println("\n---------------------------\n");
		
		
		//creation and implementation of 2D array
		
		int [][] a2 = new int[3][4];
		int count2 = 1;
		for(int i = 0;i < a2.length;i++) {
			for(int j=0;j<a2[i].length;j++) {
				a2[i][j] = count2;
				count2++;
			}
		}
		for(int i = 0;i < a2.length;i++) {
			for(int j=0;j<a2[i].length;j++) {
				System.out.print(a2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
