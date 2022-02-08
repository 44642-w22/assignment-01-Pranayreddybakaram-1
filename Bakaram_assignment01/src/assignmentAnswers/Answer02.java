package assignmentAnswers;
import java.util.*;

public class Answer02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	
	LinkedList<Integer> list1 = new LinkedList<>();
	System.out.println("Enter the size of linked list : ");
	int listSize = scn.nextInt();
	System.out.println("Enter the value of k whose sum equal to pairs of continuous elements: ");
	int x = scn.nextInt();
	while(listSize>0) { 
		System.out.println("Enter the elements to add into list : ");
        list1.add(scn.nextInt());
        listSize--;    
        }
        scn.close();   
        
    answerTwo(list1,x);
    
}
public static void answerTwo(LinkedList<Integer> list1, int k) {
	
	LinkedList<ArrayList<Integer>> list2 = new LinkedList<>();
	for (int i = 0; i <list1.size()-1; i++) {
		ArrayList<Integer> Al = new ArrayList<>();
			if (k == (list1.get(i)+list1.get(i+1))) {
				Al.add(list1.get(i));
				Al.add(list1.get(i+1));
				list2.add(Al);
			}
			
		}
	System.out.println(list2);


}
}
