package assignmentAnswers;
import java.util.*;
public class Answer03 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayList<Integer> A1 = new ArrayList<Integer>();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int arraySize = scn.nextInt();
		for (int i = 0; i < arraySize; i++) {
			System.out.println("Enter the elements: ");
			A1.add(scn.nextInt());
		}
		
		answerThree(A1);
		scn.close();
	}
	
	public static void answerThree(ArrayList<Integer> A1) {
		if(A1.size() == 0) {
			System.out.println(Integer.MIN_VALUE);
		}
		else {
			Collections.sort(A1);
			System.out.println(A1.get(A1.size()-1));
		}


	}

}
