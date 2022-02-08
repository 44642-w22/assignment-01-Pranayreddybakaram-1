package assignmentAnswers;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
public class Answer09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> Q = new LinkedList<>();
		Queue<Integer> Q_even = new LinkedList<>();
		Queue<Integer> Q_odd = new LinkedList<>();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the length of Queue :");
		int len = scn.nextInt();		
		System.out.println("Enter the list of Integers for Queue :");
		for(int i=1; i<=len;i++) 
		{
			Q.add(scn.nextInt());
		}		
		Queue<Integer> Q_dup = new LinkedList<>(Q);
		for(int e : Q_dup) 
		{
			if(e%2==0) {
					Q_even.add(e);	
			}else{
					Q_odd.add(e);				
				}
		}
		List<Integer> Al = new ArrayList<Integer>(len);			
		for(int i=0;i<len;i++) 
		{
				if(Al.size()<len) 
				{
					if(!Q_even.isEmpty()) 
					{
						Al.add(Q_even.poll());
					}
					if(Al.size()<len) 
					{
						if(!Q_odd.isEmpty()) 
						{
							Al.add(Q_odd.poll());	
						}
					}
				}
		}
		System.out.println("Output : " + Al);
		scn.close();

	}

}
