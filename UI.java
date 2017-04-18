import java.util.Scanner;

/**
 * Created by Michael on 4/17/2017.
 */
public class UI {
    private BST<Integer> bst;
    private Scanner scan;
    public UI(BST<Integer> bst) {
        this.bst = bst;
        scan = new Scanner(System.in);

    }

    public void openingMessage() {
        System.out.print("Please enter a sequence of values: ");
        String initialSequence = scan.nextLine();
        takeInput(initialSequence);
        printTraversals();
    }

    public void printTraversals() {
        System.out.print("Pre-Order: ");
        bst.preorderTraverse(bst.getRoot());

        System.out.println("\n");

        System.out.print("In-Order: ");
        bst.inorderTraverse(bst.getRoot());

        System.out.println("\n");

        System.out.print("Post-Order: ");
        bst.postorderTraverse(bst.getRoot());

        System.out.println("\n");


    }

    private void takeInput(String initialSequence) {
        String[] strTokens = initialSequence.split(" ");
        int[] intTokens = new int[strTokens.length];
        for (int index = 0; index < intTokens.length; index++) {
            intTokens[index] = Integer.parseInt(strTokens[index]);
        }
        for (int index = 0; index < intTokens.length; index++) {
            bst.insert(intTokens[index]);
        }
    }

    public void commandPrompt(){
        System.out.print("Command?: ");
    }

    public Scanner getScanner(){
        return scan;
    }

    public void displayMenu() {
        System.out.println(" I Insert a value\n" +
                " D Delete a value\n" +
                " P Find predecessor\n" +
                " S Find successor\n" +
                " E Exit the program\n" +
                " H Display this message\n");
    }

    public void invalidPrompt() {
        System.out.println("Invalid Command, type \"H\" for list of commands.");
    }

    public void existsPrompt(int dataToInsert) {
        System.out.println(dataToInsert +" already exists, ignored.");
    }
}
