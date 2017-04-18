public class BST<T extends Comparable<? super T>> {
    private TreeNode<T> root;

    public BST (){
        root = null;
    }

    public void insert(T data) {
        if (isEmpty()) {
            setRootNode(new TreeNode<>(data));
        } else {
            insert(getRoot(), data);
        }
    }

    private void insert(TreeNode<T> rootNode,T data){
        int compareToResult = data.compareTo(rootNode.getData());

        if (compareToResult < 0){ // data is less than Root's data.
            if(rootNode.hasLeftChild()){
                insert(rootNode.getLeftChild(),data);
            } else{
                rootNode.setLeftChild(new TreeNode<>(data));
            }
        }
        else if(compareToResult > 0) { // data is greater than Root's data.
            if (rootNode.hasRightChild()){
                insert(rootNode.getRightChild(),data);
            }
            else {
                rootNode.setRightChild(new TreeNode<>(data));
            }
        }

    }

    public boolean isEmpty() {
        return root == null;
    }

    public void setRootNode(TreeNode<T> rootNode) {
        root = rootNode;
    }


    public TreeNode<T> getRoot() {
        return root;
    }

    public void preorderTraverse(TreeNode<T> rootNode) {
        if (rootNode != null){
            System.out.print(rootNode.getData()+" ");
            preorderTraverse(rootNode.getLeftChild());
            preorderTraverse(rootNode.getRightChild());
        }
    }

    public void postorderTraverse(TreeNode<T> rootNode) {
        if (rootNode != null){
            preorderTraverse(rootNode.getLeftChild());
            preorderTraverse(rootNode.getRightChild());
            System.out.print(rootNode.getData()+" ");
        }
    }

    public void inorderTraverse(TreeNode<T> rootNode) {
        if (rootNode != null){
            preorderTraverse(rootNode.getLeftChild());
            System.out.print(rootNode.getData()+" ");
            preorderTraverse(rootNode.getRightChild());
        }
    }

    public void delete() {
        
        
    }

    public void findPredecessor() {
    }

    public void findSucessor() {
    }

    public boolean contains(T dataToInsert) {
        return false;
    }

    public boolean contains(TreeNode<T> rootNode, T data){
        if (rootNode != null){
            contains(rootNode.getLeftChild(),data);
            if(rootNode.getData().compareTo(data) == 0){
                return true;
            }
            contains(rootNode.getRightChild(),data);
        }
    }
}
