/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedBinaryTree;

/**
 *
 * @author daniel
 */
public class BinaryNode {

    public Object element;
    public BinaryNode left, right;
    public int counter;

    public BinaryNode(Object element) {
        this.element = element;
        this.left = this.right = null;
        this.counter++;
    }

}
