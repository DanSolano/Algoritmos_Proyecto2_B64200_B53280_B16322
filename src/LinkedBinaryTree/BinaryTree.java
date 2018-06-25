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
public interface BinaryTree {

    public void cancel();

    public boolean isEmpty();

    public boolean exist(Object element) throws TreeException;

    public void insert(Object element) throws TreeException;

    public void delete(Object element) throws TreeException;

    public int height() throws TreeException;

    public int nodeHeight(Object element) throws TreeException;

    public int getSize() throws TreeException;

    public Object getNode(Object element)throws TreeException;

    public void swapElement(Object element1, Object element2)throws TreeException;
    
}
