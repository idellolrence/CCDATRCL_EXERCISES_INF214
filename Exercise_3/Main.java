public class Main {
    public static void main(String[] args){
        
        //Creating Stack Object
        Stack burger = new Stack(5);
        
        System.out.println("Customized your burger by stacking!\n");
        
        //Customize your burger
        burger.push("Bottom Bun");
        burger.push("Beef Patty");
        burger.push("Barbeque Sauce");
        burger.push("Caramelized Onions");
        burger.push("Top Bun");
        
        //How many layers does the burger has?
        System.out.print("\nThe burger has " +burger.size());
        System.out.println(" layers.");
        
        //What is the topmost layer of the burger?
        System.out.println("\nThe topmost layer of the burger is the " +burger.peek());
        
        //Remove the topmost layer of the burger.
        burger.pop();
        
        //Review your burger customization.
        System.out.println("\nYour customized burger stack now is:");
        burger.printStack();

    }
}
