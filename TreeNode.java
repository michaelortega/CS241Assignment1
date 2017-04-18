/**
 * Created by Michael on 4/17/2017.
 */
public class TreeNode<T> {
    private TreeNode rightChild;
    private TreeNode leftChild;
    private T data;

    public TreeNode(T data) {
        this.data = data;
        rightChild = null;
        leftChild = null;
    }

    public T getData(){
        return data;
    }

    public TreeNode<T> getRightChild(){
        return rightChild;
    }
    public TreeNode<T> getLeftChild(){
        return leftChild;
    }

    public void setRightChild(TreeNode<T> rightChild){
        this.rightChild = rightChild;
    }

    public void setLeftChild(TreeNode<T> leftChild){
        this.leftChild = leftChild;
    }

    public boolean hasLeftChild(){
        return leftChild != null;
    }

    public boolean hasRightChild(){
        return rightChild != null;
    }
}

