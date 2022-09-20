import java.util.LinkedList;
import java.util.Queue;

public class Main
{
	public static void main(String[] args) throws Exception {
		
		Queue<String> enrollmentList = new LinkedList<>();
		
		System.out.println("======== INF214-CCDATRCL Enrollment List ========");
		
		//Enqueue 5 of your classmates in this section
		enrollmentList.add("Idel Lawrence Aranilla Pogi");
		enrollmentList.add("Justine Nica Abella");
		enrollmentList.add("Ronn Adia");
		enrollmentList.add("Winna Jane Babilis");
		enrollmentList.add("Jap Bolanos");
		
		//Get the size of the queue
		System.out.println("Number of students enrolled: " +enrollmentList.size());
		
		//Get the front of the queue
		System.out.println("Student at the front of the queue is: " +enrollmentList.peek());
		
		//Dequeue 5 of your classmates 
		enrollmentList.remove();
		enrollmentList.remove();
		enrollmentList.remove();
		enrollmentList.remove();
		enrollmentList.remove();

        	//Enqueue another 5 of you classmates
		enrollmentList.add("Victor Vinnie Lars Calalang");
		enrollmentList.add("Kean John Dipatillo");
		enrollmentList.add("Alexander John Du");
		enrollmentList.add("Ivan Guansing");
		enrollmentList.add("Jonnah Hermosura");
		
		//Get the size of the queue
		System.out.println("\nNumber of students enrolled: " +enrollmentList.size());
		
		//Get the front of the queue
		System.out.println("Student at the front of the queue is: " +enrollmentList.peek());
	
	}
}
