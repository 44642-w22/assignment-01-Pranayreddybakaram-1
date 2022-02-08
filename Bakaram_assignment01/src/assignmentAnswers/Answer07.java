package assignmentAnswers;
import java.util.*;

public class Answer07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> Q = new LinkedList<>();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of the Queue: ");
		int size = scn.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the elements: ");
			Q.add(scn.nextInt());
		}
		answerSeven(Q,size);
	}
	
	public static void answerSeven(Queue<Integer> Q1, int size) {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + Q1.poll()*(int)(Math.pow(2, i));
		}
		System.out.println(sum);


	}

}
