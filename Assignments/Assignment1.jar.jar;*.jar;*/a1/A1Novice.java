package a1;
import java.util.Scanner;

public class A1Novice {

	public static void main (String[] args){
		Scanner s = new Scanner(System.in);
		process(s);
	}
	
	public static void process(Scanner s){
		int count = s.nextInt();
		int squareCount = 0;
		int wideCount = 0;
		int tallCount = 0;
		int [] perimeters = new int[count];
		int [] areas = new int[count];
		String [] rectLetters = new String[count];
		
		int largestPerimeter = 0;
		int smallestPerimeter = 1000;
		String largestPerimeterLetter = "";
		String smallestPerimeterLetter = "";
		
		for(int i = 0; i<count; i++){
			
			rectLetters[i] = s.next();
			int dim1 = s.nextInt();
			int dim2 = s.nextInt();
			int dim3 = s.nextInt();
			int dim4 = s.nextInt();
			int [] dimensions = {dim1, dim2, dim3, dim4};
			
			perimeters[i] = 2*Math.abs(dimensions[2]-dimensions[0]) + 2*Math.abs(dimensions[3]-dimensions[1]);
			areas[i] = Math.abs(dimensions[2]-dimensions[0]) * Math.abs(dimensions[3]-dimensions[1]);
			
			if( Math.abs(dimensions[2]-dimensions[0]) == Math.abs(dimensions[3]-dimensions[1])){
				squareCount++;
			} else if(Math.abs(dimensions[2]-dimensions[0]) > Math.abs(dimensions[3]-dimensions[1]))
				wideCount++;
			else {
				tallCount++;
			}
		}
		
		System.out.println("Square count = " + squareCount);
		System.out.println("Wide count = " + wideCount);
		System.out.println("Tall count = " + tallCount);
		
		
		
		for(int i = 0; i< perimeters.length; i++)
        {
                if(perimeters[i] > largestPerimeter){
                        largestPerimeter = perimeters[i];
                		largestPerimeterLetter = rectLetters[i];
                } else if (perimeters[i] < smallestPerimeter) {
                        smallestPerimeter = perimeters[i];
                		smallestPerimeterLetter = rectLetters[i];
                }
        }
		System.out.println("Min perimeter = " + smallestPerimeter + " (" + smallestPerimeterLetter + ")");
		System.out.println("Max perimeter = " + largestPerimeter + " (" + largestPerimeterLetter + ")");
		
		int largestArea = areas[0];
		int smallestArea = areas[0];
		String largestAreaLetter = "";
		String smallestAreaLetter = "";
		
		for(int i = 0; i< areas.length; i++)
        {
                if(areas[i] > largestArea) {
                        largestArea = areas[i];
                		largestAreaLetter = rectLetters[i];
                } else if (areas[i] < smallestArea){
                        smallestArea = areas[i];
                		smallestAreaLetter = rectLetters[i];
                }
        }
		System.out.println("Min area = " + smallestArea + " (" + smallestAreaLetter + ")");
		System.out.println("Max area = " + largestArea + " (" + largestAreaLetter + ")");
	}
}
