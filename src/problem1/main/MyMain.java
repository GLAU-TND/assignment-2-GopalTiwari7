/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<Integer>();
        myBinarySearchTree.add(10);
        myBinarySearchTree.add(45);
        myBinarySearchTree.add(43);
        myBinarySearchTree.add(75);
        myBinarySearchTree.add(15);
        myBinarySearchTree.add(70);
        myBinarySearchTree.add(145);
        myBinarySearchTree.add(176);
        myBinarySearchTree.add(24);
        myBinarySearchTree.add(90);
        myBinarySearchTree.print();
        System.out.println("number of nodes who don't have their left child " + myBinarySearchTree.numberOfLeftChild);
    }
}
