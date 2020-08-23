# What is a Binary Tree?
A is a non-linear data structure where data objects are generally organized in terms of hierarchical relationship. The structure is non-linear in the sense that, unlike Arrays, Linked Lists, Stack and Queues, data in a tree is not organized linearly. A binary tree is a recursive tree data structure where each node can have 2 children at most.

Binary trees have a few interesting properties when they’re perfect:
* Property 1: The number of total nodes on each “level” doubles as you move down the tree.
* Property 2: The number of nodes on the last level is equal to the sum of the number of nodes on all other levels, plus 1

Each data element stored in a tree structure called a node. A Tree node contains the following parts:
1. Data
2. Pointer to left child
3. Pointer to the right child
In Java, we can represent a tree node using class. Below is an example of a tree node with integer data.
```
static class Node {    
    int value; 
        Node left, right; 
          
        Node(int value){ 
            this.value = value; 
            left = null; 
            right = null; 
        }
}     

```

# Depth-First Search
* Pre order traversal
* In order traversal
* Post order traversal

## Pre order traversal
In pre order traversal, we “visit” the node before we visit its children. So the order is going to be like this:

Node -> Left child -> Right child

In our example, the result of a pre order traversal is this:

```
 1 2 4 5 3 6 7

 ```


## In order traversal
As the name suggests, in order traversal is where we keep the natural order of traversal, left to right. So the order is like this:

Left child -> Node -> Right child

In our example, the result of an in order traversal is this:

```
4 2 5 1 6 3 7

```

## Post order traversal
In post order traversal, the node comes after the children. So we visit the left child first, then the right child, then the node, as follows:

Left child -> Right child -> Node

In our example, the result of a post order traversal is this:

```
4 5 2 6 7 3 1

```

# Breadth-First Search
This is another common type of traversal that visits all the nodes of a level before going to the next level.

This kind of traversal is also called level-order and visits all the levels of the tree starting from the root, and from left to right.

For the implementation, we'll use a Queue to hold the nodes from each level in order. We'll extract each node from the list, print its values, then add its children to the queue: