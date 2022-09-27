public class Node {
    
    //data (class properties)
    String radioClub;
    
    //pointer to children
    Node left;
    Node right;
    
    //Constructor
    public Node(String radioClub) {
        this.radioClub = radioClub;
        
        left = null;
        right = null;
        
    }
}
