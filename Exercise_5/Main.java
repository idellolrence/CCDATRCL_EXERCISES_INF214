public class Main
{
	public static void main(String[] args) throws Exception {
		
		Node President = new Node("Pres. Idel Lawrence Aranilla"); //A
		Node VicePresident = new Node("VP Rica Garcia"); //a.B
		Node Secretary = new Node("Sec. JC Tevez"); //a.C
		Node Treasurer = new Node("Tres. Gino Quillamor"); //b.D
		Node Auditor = new Node("Aud. Inka Magnaye"); //b.E
        Node AssistantSec = new Node("Asst Sec. Chico Garcia"); //c.F
        Node PRO = new Node("PRO Ayn Bernos"); //f.G

        //Direct Communication with the President (VP and Sec)
        President.left = VicePresident;
        President.right = Secretary;
        
        //Direct Communication with the Vice President (Trea and Aud)
        VicePresident.left = Treasurer;
        VicePresident.right = Auditor;
        
        //Direct Communication with the Secretary (Asst. Sec)
        Secretary.left = AssistantSec;
        
        //Direct Communication with the Assistant Secretary (PRO)
        AssistantSec.left = PRO;

        System.out.println("\nPre-order Traversal: ");
        traversePreOrder(President);
        
        System.out.print("\n");
        System.out.println("\nIn-order Traversal: ");
        traverseInOrder(President);
        
        System.out.print("\n");
        System.out.println("\nPost-order Traversal: ");
        traversePostOrder(President);
	}
	
    // Traverse Preorder method
    static void traversePreOrder(Node element) {
        if (element != null) {
            System.out.print(element.radioClub+ ", ");
            traversePreOrder(element.left);
            traversePreOrder(element.right);
        }
    }
    
    // Traverse Inorder Method
    static void traverseInOrder(Node element) {
        if (element != null) {
            traverseInOrder(element.left);
            System.out.print(element.radioClub+ ", ");
            traverseInOrder(element.right);
        }
    }

    // Traverse Postorder method
    static void traversePostOrder(Node element) {
        if (element != null) {
            traversePostOrder(element.left);
            traversePostOrder(element.right);
            System.out.print(element.radioClub+ ", ");
        }
    }
    
}
