/**
 * Created by Michael on 4/18/2017.
 */
public class ProgramLoop {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        UI ui = new UI(bst);
        ui.openingMessage();
        boolean isRunning = true;
        while (isRunning) {
            ui.commandPrompt();
            switch (ui.getScanner().next().toUpperCase()) {
                case "I":
                    int dataToInsert = Integer.parseInt(ui.getScanner().next());
                    if (bst.contains(dataToInsert)) {
                        ui.existsPrompt(dataToInsert);
                    } else {
                        bst.insert(dataToInsert);
                        ui.printTraversals();
                    }
                    break;
                case "D":
                    bst.delete();
                    break;
                case "P":
                    bst.findPredecessor();
                    break;
                case "S":
                    bst.findSucessor();
                    break;
                case "E":
                    isRunning = false;
                    break;
                case "H":
                    ui.displayMenu();
                    break;
                default:
                   ui.invalidPrompt();
            }
        }
    }
}
