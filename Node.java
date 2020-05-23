package binarysearchtree;

/**
 *
 * @author Che-Wei (Joanne) Chou
 */
public class Node{
    private int data;
    private Node left;
    private Node right;
    
    protected Node(int object){
        data = object;
    }
    
    protected int getData(){
        return data;
    }
    
    protected void setData(int num){
        data = num;
    }
    
    protected void setLeft(Node n){
        left = n;
    }
    
    protected void setRight(Node n){
        right = n;
    }
    
    protected Node getLeft(){
        return left;
    }
    
    protected Node getRight(){
        return right;
    }
}
