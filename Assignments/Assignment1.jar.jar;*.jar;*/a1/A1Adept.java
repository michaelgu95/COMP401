package a1;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		process(s);	

	}
	public static void process(Scanner s){
		int rectCount = s.nextInt();
		String [] rectLetters = new String[rectCount];
		int [][] rectangles = new int [rectCount][4];
		
		
		
		for(int i = 0; i<rectCount; i++){
			rectLetters[i] = s.next();
			rectangles[i] = new int []{s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()};
		}	
		
		int pointCount = s.nextInt();
		int [][] points = new int[pointCount][2];
		for( int i = 0; i<pointCount; i++){
			points[i] = new int[]{s.nextInt(), s.nextInt()};
		}
		
		
		for(int i = 0; i<rectCount; i++){
			int intersectionCount = 0;
			for(int j = 0; j<pointCount; j++){
				if ( ((rectangles[i][0] < points[j][0] && points[j][0] < rectangles[i][2]) || (rectangles[i][0] > points[j][0] && points[j][0] > rectangles[i][2])) && ((rectangles[i][1] < points[j][1] && points[j][1] < rectangles[i][3])|| (rectangles[i][1] > points[j][1] && points[j][1] > rectangles[i][3]) )) {
					intersectionCount++;
				}
			}
			System.out.println(rectLetters[i] + " contains " + intersectionCount + " points");
		}
	}
}
