package assignmentAnswers;
import java.util.*;
public class Answer08 {
	public static void main(String[] args) {
		
	Queue<Integer> Q = new LinkedList<>();
	
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter the size of Queue: ");
	int size = scn.nextInt();
	for (int i = 0; i < size; i++) {
		System.out.println("Enter the elements to Queue: ");
		Q.add(scn.nextInt());
	}

	answerEight (Q,size);
	scn.close();
	
}

public static void answerEight(Queue<Integer> Q1, int size) {
	ArrayList<Integer> Al1 = new ArrayList<>();
	ArrayList<Integer> Al2 = new ArrayList<>();
	for (Integer item: Q1) {
        Al1.add(item);
    }
	
	for(int i = 0; i < size/2; i++) {
		Al2.add(Al1.get(size-i-1));
		Al2.add(Al1.get(i));
	}
	if (size % 2 != 0) {
		Al2.add(Al1.get(size/2));
	}
	
	System.out.println(Al2);


}
}
