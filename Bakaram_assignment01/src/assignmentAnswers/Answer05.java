package assignmentAnswers;
import java.util.*;
public class Answer05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the input brackets :");  
		String strInput = scn.nextLine();
		answerFive(strInput);
		scn.close();
	}

	private static void answerFive(String strInput) {
		boolean defalt = true;
		ArrayList<Character> openBrackets = new ArrayList<>();
		openBrackets.add('(');
		openBrackets.add('[');
		openBrackets.add('{');

		Stack<Character> inputStack = new Stack<>(); 
		for (int i = 0; i < strInput.length(); i++) {
			if (openBrackets.contains(strInput.charAt(i))) {
				inputStack.push(strInput.charAt(i));

			} else {
				char peekEle;
				if (inputStack.size() > 0) {
					peekEle = inputStack.peek();
				} else {
					defalt = false;
					break;
				}

				if (inputStack.size() > 0 && (peekEle == '{' && strInput.charAt(i) == '}'
						|| peekEle == '(' && strInput.charAt(i) == ')'
						|| peekEle == '[' && strInput.charAt(i) == ']')) {
					inputStack.pop();
				} else {
					defalt = false;
					break;
				}
			}
		}

		if (defalt && inputStack.isEmpty())
			System.out.println(true);
		else
			System.out.println(false);


	}

}
