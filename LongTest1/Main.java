import java.util.Stack;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        
        // ARRAYS (50 points)
        System.out.println("======================================================");
        // 1. Create an array of characters of your SURNAME.
        char[] Surname = {'A', 'R', 'A', 'N', 'I', 'L', 'L', 'A'};
    
        // 2. Display each character of your SURNAME on each line.
        System.out.println("My Surname is: ");
    	for (int i = 0; i<Surname.length; i++) {
            System.out.println(Surname[i]);
    	}
        // 3. Display the first character of your SURNAME.
        System.out.println("\nThe first character of my Surname is: " +Surname[0]);
        
        // 4. Display the last character of your SURNAME.
        System.out.println("The last character of my Surname is: " +Surname[7] +"\n");
    
        // 5. Display the character of your SURNAME in reverse order.
        System.out.println("My reversed Surname is: ");
        for (int i = Surname.length-1; i>=0; i--) { 
            System.out.println(Surname[i]);
        }
    
        //******************************************************************************
        // LINKED LIST (25 points)
        System.out.println("======================================================");
        
        // 1. Create a Linked list of the last six numbers of your STUDENT NUMBER.
        LinkedList<String> StudentNo = new LinkedList<>();
        
        StudentNo.add("1");
        StudentNo.add("0");
        StudentNo.add("8");
        StudentNo.add("3");
        StudentNo.add("8");
        StudentNo.add("8");
    
        // 2. Add an asterisk (*) to the head/front of the Linked list.
        StudentNo.addFirst("*");
    
        // 3. Add an asterisk (*) to the tail/end of the Linked list.
        StudentNo.addLast("*");
        
        // 4. Display the Linked list.
        System.out.println("My Student No. is: " +StudentNo);
    
        // 5. Display the last character of the Linked list.
        System.out.println("The last character of my Student No. is: " +StudentNo.get(7));
      
        // 6. Replace the last character of the Linked list with the exclamation symbol (!).
        StudentNo.set(7, "!");
    
        // 7. Remove the first character of the Linked list.
        StudentNo.remove(0);
        
        // 8. Display the LinkedList.
        System.out.println("My Updated Student No. is: " +StudentNo);
        
        //******************************************************************************
        // STACK (25 points)
        System.out.println("======================================================");
        
        // 1. Create a Stack of characters of your SURNAME.
        Stack<String> surname = new Stack<>();
        
        surname.push("A");
        surname.push("R");
        surname.push("A");
        surname.push("N");
        surname.push("I");
        surname.push("L");
        surname.push("L");
        surname.push("A");
    
        // 2. Print the Stack.
        System.out.println("My Surname is: " +surname);
    
        // 3. Add a "INF214" to the stack.
        surname.push("INF214");
        
        /*
        surname.push(" ");
        surname.push("I");
        surname.push("N");
        surname.push("F");
        surname.push("2");
        surname.push("1");
        surname.push("4");
        */
    
        // 4. Print the Stack.
        System.out.println("My Surname and Section is: " +surname);
    
        // 5. Remove "INF214".
        surname.pop();
        /*
        surname.pop();
        surname.pop();
        surname.pop();
        surname.pop();
        surname.pop();
        */
    
        // 6. Add "CCDATRCL-INF214".
        surname.push("CCDATRCL-INF214");
        
        /*
        surname.push("C");
        surname.push("C");
        surname.push("D");
        surname.push("A");
        surname.push("T");
        surname.push("R");
        surname.push("C");
        surname.push("L");
        surname.push("-");
        surname.push("I");
        surname.push("N");
        surname.push("F");
        surname.push("2");
        surname.push("1");
        surname.push("4");
        */
    
        // 7. Print the Stack.
        System.out.println("My Surname and Class is: " +surname);
    }
}
