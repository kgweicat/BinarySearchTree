/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

/**
 *
 * @author Che-Wei Chou
 */
public class BinarySearchTree{

    Node root;
    
    public BinarySearchTree(){
        root = null;
    }
    
    //resursionnnnnnnnnnnnnnnnnnnnnn
    private Node add(Node r, int val){
        //empty tree
        
        if (r==null){
            r = new Node(val);
        } else if (val < r.getData()){
            //add to left
            r.setLeft(add(r.getLeft(), val));
        } else {
            //add to right
            r.setRight(add(r.getRight(), val));
        }
        
        return r;
    }
    
    public boolean contains(Node r, int val){
        if (r == null){
            //empty tree
            return false;
        } else if (val == r.getData()){
            return true;
        } else if (val < r.getData()){
            //search the left subtree
            return contains(r.getLeft(), val);
        } else {
            //search the right subtree
            return contains(r.getRight(), val);
        }
    }
    
    private Node deleteNode(Node r, Node n){
        //base case
        if (r == null){
            return r;
        }
        if (n.getData() < r.getData()){
            //the node is in the left tree
            r.setLeft(deleteNode(r.getLeft(), n));
        } else if (n.getData() > r.getData()){
            //the node is in the right tree
            r.setRight(deleteNode(r.getRight(), n));
        } else {
            //data in r equals data in n
            
            //if n has only one child, return the child
            if (r.getLeft() == null){
                return r.getRight();
            }
            if (r.getRight() == null){
                return r.getLeft();
            }
            
            //if n has two child
            r.setData(successor(r.getRight()));
            deleteNode(r.getRight(), n);
        }
        
        return r;
    }
    
    public int successor(Node r){
        int result = r.getData();
        while (r.getLeft() != null){
            r = r.getLeft();
            result = r.getData();
        }
        return result;
    }
    
    public void inorder(Node r){
        if (r != null){
            inorder(r.getLeft());
            System.out.println(r.getData());
            inorder(r.getRight());
        }
    }
    
}
