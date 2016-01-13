package a1;
import java.util.*;

public class A1Jedi {
	
	public static void main(String[] args){
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
		
		for(int i = 0; i<rectCount; i++){
			ArrayList<String> intersectionLetters = new ArrayList<String>();
			for(int j = 0; j<(rectCount); j++){
				if(i!=j){
						
					if(  (	(rectangles[i][0] >= rectangles[j][0]) && (rectangles[i][2] >= rectangles[j][0]) &&
							(rectangles[i][0] >= rectangles[j][2]) && (rectangles[i][2] >= rectangles[j][2]) ) ||
							
						 (	(rectangles[i][0] <= rectangles[j][0]) && (rectangles[i][2] <= rectangles[j][0]) &&
							(rectangles[i][0] <= rectangles[j][2]) && (rectangles[i][2] <= rectangles[j][2]) ) ||							
							
						 (	(rectangles[i][1] >= rectangles[j][1]) && (rectangles[i][3] >= rectangles[j][1]) &&
						 	(rectangles[i][1] >= rectangles[j][3]) && (rectangles[i][3] >= rectangles[j][3]) ) ||
						
						 (	(rectangles[i][1] <= rectangles[j][1]) && (rectangles[i][3] <= rectangles[j][1]) &&
							(rectangles[i][1] <= rectangles[j][3]) && (rectangles[i][3] <= rectangles[j][3]) )
					){
						
					}else{
						intersectionLetters.add(rectLetters[j]);
					}						
				}
			}
			
			String intersectionLettersString = "";
			for (int m = 0; m < intersectionLetters.size(); m++){
				intersectionLettersString +=  intersectionLetters.get(m);
			}
			
			if(intersectionLettersString.equals("")) {
				System.out.println(rectLetters[i] + " intersects nothing");
			}else{
				System.out.print(rectLetters[i] + " intersects ");
			
				for (int c = 0; c < intersectionLettersString.length(); ++c) {
					System.out.print(intersectionLettersString.charAt(c) + " ");
				}
				System.out.println("");
			}
		}
	}
}
