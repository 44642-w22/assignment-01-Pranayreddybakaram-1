package assignmentAnswers;
import java.util.LinkedList;
import java.util.Scanner;

public class Answer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		LinkedList<Integer> list1 = new LinkedList<>();
		System.out.println("enter the size of list: ");
		int arraySize = scn.nextInt();
		while(arraySize>0) { 
			System.out.println("Enter the elements to the list : ");
	        list1.add(scn.nextInt());
	        arraySize--;  
	        }
	        scn.close();
	    answerOne(list1);
	}
	public static void answerOne(LinkedList<Integer> list1) {
    	LinkedList<Integer> list2 = new LinkedList<>();
    	for (int i = 0; i < list1.size(); i++) {
    		int x = list1.get(i);
    		int sum = 0;
    		for (int j=1; j<=x/2; j++) {
    			if (x%j == 0) {
    				sum += j;
    			}
    		}
    		if (sum == x) {
    			list2.add(x);
    		}
    	}
    	System.out.println(list2);

	}

}
