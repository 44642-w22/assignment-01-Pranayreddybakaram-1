package assignmentAnswers;
import  java.util.*;
public class Answer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Al1 = new ArrayList<String>();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter size of array list : ");
		int arraySize = scn.nextInt();
		for (int i = 0; i < arraySize; i++) {
			System.out.println("Enter the elements to store into array list : ");
			Al1.add(scn.next());
		}
		
		answerFour(Al1, arraySize);
		scn.close();
	}
	
	public static void answerFour(ArrayList<String> Al1, int size) {
		ArrayList<String> Al2 = new ArrayList<String>();
		int [] arr = new int [size];
		for (int i = 0; i < size; i++) {
			arr[i] = Al1.get(i).length();
		}
			
		Arrays.sort(arr);
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (arr[i] == Al1.get(j).length()) {
					Al2.add(Al1.get(j));
					Al1.set(j, "");
				}
			}
		}
		
		System.out.println(Al2);	


	}

}
