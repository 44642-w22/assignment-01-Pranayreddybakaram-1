package assignmentAnswers;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
public class Answer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> D = new ArrayDeque<>();
		List<Integer> Al = new ArrayList<>();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the length of Deque");
		int len = scn.nextInt();		
		System.out.println("Enter the list of Characters for Deque");
		for(int i=1; i<=len;i++) {
			D.add(scn.next());
		}		
		System.out.println("Enter the length of Array of operations");
		int len_array = scn.nextInt();		
		System.out.println("Enter the Array of operations in 1 and 0 ");
		for(int i=1; i<=len_array;i++) {
			Al.add(scn.nextInt());
		}		
		System.out.println("List of Deque : " + D);
		System.out.println("Array of operations : " + Al);		
		Deque<String> D_dup = new LinkedList<>(D);
		Stack<String> S = new Stack<>();		
		for(int e : Al) {
			switch(e) {
			 	case 1: if(!D_dup.isEmpty()) {
			 		S.add(D_dup.pollFirst());
			 		break;
			 	}
			 	case 0: if(!S.isEmpty()) {
			 		D_dup.addFirst(S.pop());
			 		break;
			 	}
			}
		}		
		Iterator<String> objIterator = D_dup.iterator();  
		while(objIterator.hasNext())
		{
			System.out.print(objIterator.next());
		}
		scn.close();

	}

}
