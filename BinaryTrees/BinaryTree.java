package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

class Node {
  int data;
  Node left, right;
  Node(int data) {
    this.data = data;
    left=null;
    right=null;
    
  }
}


class Trees {
  static Node root;

  private Node addRecursive(Node current, int value) {
    if(current == null) {
      return new Node(value);
    }
    
    if(value < current.data){
      current.left = addRecursive(current.left, value);
    }else if(value > current.data) {
      current.right = addRecursive(current.right, value);
    }else {
      return current;
    }
    
    return current;
  }
  
  public void add(int value) {
    root = addRecursive(root, value);
}

  private boolean containsValueRecursive(Node current, int value){
    if(current == null){
      return false;
    }
    
    if(value == current.data){
      return true;
    }else {
     return value < current.data? containsValueRecursive(current.left, value):
        containsValueRecursive(current.right, value);    
    }
  }
  
  public boolean containsNode(int value){
    return containsValueRecursive(root, value);
  }

  public void traverseInOrder(Node node){
    if(node !=null){
      traverseInOrder(node.left);
      System.out.print(" "+node.data);
      traverseInOrder(node.right);
    }
  }

  public void traversePreOrder(Node node){
    if(node !=null){
      System.out.print(" "+node.data);
      traversePreOrder(node.left);
      traversePreOrder(node.right);
    }
  }

  public void traversePostOrder(Node node){
    if(node !=null){
      traversePostOrder(node.left);
      traversePostOrder(node.right);
      System.out.print(" "+node.data);
    }
  }

  public void traverseLevelOrder() {
    if(root == null){
      return;
    }

    Queue<Node> nodes = new LinkedList<>();
    nodes.add(root);
    while(!nodes.isEmpty()){
      Node node = nodes.remove();
      System.out.print(" "+node.data);

      if(node.left !=null){
        nodes.add(node.left);
      }
      if(node.right != null){
        nodes.add(node.right);
      }
    }

  }

  
  
  
  public static void main(String[] args) {

    Trees trees = new Trees();
    
    trees.add(10);
    trees.add(1);
    trees.add(11);
    trees.add(5);

    boolean contains = trees.containsNode(5);
    trees.traverseInOrder(root);
    System.out.println(contains);
    trees.traverseLevelOrder();
}
  
}
