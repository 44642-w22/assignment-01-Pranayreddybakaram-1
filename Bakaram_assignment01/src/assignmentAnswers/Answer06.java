package assignmentAnswers;
import java.util.*;
public class Answer06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the even number for size of stack: ");
		int size = scn.nextInt();
		while(true) {
			if (size % 2 == 0) {
				break;
			}
			else {
				System.out.println("you have entered odd number!. Please enter even number again: ");
				size = scn.nextInt();
			}
		}
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the element into the stack: ");
			stack.push(scn.nextInt());
		}
		
		answerSix(stack,size);
        scn.close();
	}
	
	public static void answerSix(Stack<Integer> stack, int size) {
		ArrayList<Integer> Al = new ArrayList<>();
		int x = size / 2;
		for (int i = 0; i < size; i++) {
			if(i < x) {
				Al.add(stack.pop());
			}
			else {
				Al.add(stack.get(i-x));
			}
		}
		System.out.println(Al);


	}

}
