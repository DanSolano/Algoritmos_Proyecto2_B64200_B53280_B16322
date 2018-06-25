/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedBinaryTree;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author daniel
 */
public class LinkedBinaryTree implements BinaryTree {

    private BinaryNode root;
    ArrayList<Object> binaryList = new ArrayList<>();
    int c;
//    int altura;

    public LinkedBinaryTree() {
        this.root = null;
    }

    @Override
    public void cancel() {
        this.root = null;
    }

    @Override
    public boolean isEmpty() {
        return this.root == null;
    }

    @Override
    public boolean exist(Object element) throws TreeException {
        if (isEmpty()) {
            throw new TreeException("El arbol binario no existe");
        } else {
            return exist(this.root, element);

        }
    }

    private boolean exist(BinaryNode root, Object element) {

        if (root == null) {
            return false;
        } else if (root.element.equals(element)) {
            return true;

        } else {
            return exist(root.left, element) || exist(root.right, element);
        }

    }

    @Override
    public void insert(Object element) throws TreeException {
        this.root = insert(this.root, element);
    }

    private BinaryNode insert(BinaryNode node, Object element) {
        if (node == null) {
            node = new BinaryNode(element);
        } else {

            if (node.left == null) {
                node.left = insert(node.left, element);
            } else {
                if (node.right == null) {
                    node.right = insert(node.right, element);
                } else {
                    Random seed = new Random();
                    int randomValue = seed.nextInt(2);
                    if (randomValue == 1) {
                        node.left = insert(node.left, element);
                    } else {
                        node.right = insert(node.right, element);
                    }

                }
            }
        }
        return node;
    }

    @Override
    public void delete(Object element) throws TreeException {
        if (isEmpty()) {
            throw new TreeException("El arbol binario no existe");
        } else {
            this.root = delete(this.root, element);

        }
    }

    private BinaryNode delete(BinaryNode node, Object element) throws TreeException {
        if (node != null) {
            if (node.element.equals(element)) {
                if (node.left == null && node.right == null) {
                    return node = null;
                } else {
                    if (node.left != null && node.right == null) {
                        return node = node.left;
                    } else if (node.left == null && node.right != null) {
                        return node = node.right;
                        //Cuando se tiene hijos a ambos lados, es necesario
                        //seleccionar y reacomodar
                    } else {
                        if (node.left != null && node.right != null) {
                            Object tempElement = minimum(node.right);
                            node.element = tempElement;
                            node.right = delete(node.right, tempElement);
                        }

                    }
                }
            }
            node.left = delete(node.left, element);
            node.right = delete(node.right, element);
        }//main if
        return node;
    }

    private Object minimum(BinaryNode node) {

        //Cuando no tiene ningún hijo-------------------
        if (node.left != null && node.right != null) {

            if (getType(node) == 1) { //Cuando los valores a comparar son numéricos

                return Math.min(Integer.parseInt(node.element.toString()),
                        Math.min(Integer.parseInt(minimum(node.left).toString()),
                                Integer.parseInt(minimum(node.right).toString())));

            } else if (getType(node) == 2) {

                return minString(node.element.toString(),
                        minString(minimum(node.left).toString(), minimum(node.right).toString()));

            }

        }//---------------------------------------------

        //Cuando hay un hijo izquierdo-------------------
        if (node.left != null && node.right == null) {

            if (getType(node) == 1) {

                return Math.min(Integer.parseInt(node.element.toString()),
                        Integer.parseInt(minimum(node.left).toString()));

            } else if (getType(node.element) == 2) {

                return minString(node.element.toString(), minimum(node.left).toString());

            }

        }//---------------------------------------------

        //Cuando hay un hijo izquierdo-------------------
        if (node.left == null && node.right != null) {

            if (getType(node) == 1) {

                return Math.min(Integer.parseInt(node.element.toString()),
                        Integer.parseInt(minimum(node.right).toString()));

            } else if (getType(node.element) == 2) {

                return minString(node.element.toString(), minimum(node.right).toString());

            }

        }//---------------------------------------------

        return node.element; //No alcanzó ninguna de las condiciones

    }

    private int getType(Object element) {
        if (element instanceof Integer) {
            return 1;
        }
        if (element instanceof String) {
            return 2;
        } else {
            return -1;
        }

    }

    private String minString(String element1, String element2) {
        if (element1.compareTo(element2) < 0) {
            return element1;
        } else {
            return element2;
        }

    }

    @Override
    public int height() throws TreeException {
        if (isEmpty()) {
            throw new TreeException("El arbol no existe");
        }
        return height(this.root);
    }

    private int height(BinaryNode node) {
        if (node == null) {
            return 0;
        } else {
            return Math.max(height(node.left), height(node.right) + 1);
        }
    }

    @Override
    public int nodeHeight(Object element) throws TreeException {
        if (isEmpty()) {
            throw new TreeException("El arbol no existe");
        } else {
            return nodeHeight(this.root, element, 0);
        }

    }

    private int nodeHeight(BinaryNode node, Object element, int counter) {
        if (node == null) {
            return 0;
        } else {
            if (node.element.equals(element)) {
                return counter;
            } else {
                return Math.max(nodeHeight(node.left, element, counter++), nodeHeight(node.left, element, counter));
            }
        }

    }

    @Override
    public int getSize() throws TreeException {
        if (isEmpty()) {
            throw new TreeException("El arbol binario no existe");
        } else {
            return getSize(root);

        }
    }

    private int getSize(BinaryNode node) {
        if (node == null) {
            return 0;
        } else {
            return getSize(node.left) + 1 + getSize(node.right);
        }

    }

    @Override
    public String toString() {
        String output = "RECORRIDOS DISPONIBLES:\n";
        output += "PREORDEN" + preOrder(this.root) + "\n";
        output += "POSTORDEN" + postOrder(this.root) + "\n";
        output += "INORDEN:\n" + inOrder(this.root) + "\n";
        return output;

    }

    public String preOrder() {
        String output = "";
        output += "PREORDEN" + preOrder(this.root) + "\n";
        return output;

    }

    private String preOrder(BinaryNode node) {
        String temp = "";

        if (node != null) {
            temp = node.element + " - ";
            temp += preOrder(node.left);
            temp += preOrder(node.right);
        }
        return temp;

    }

    public String inOrder() {
        String output = "";
        output += "\n" + inOrder(this.root) + "\n";
        return output;
    }

    private String inOrder(BinaryNode node) {
        String temp = "";

        if (node != null) {
            temp = inOrder(node.left);
            temp += node.element + " - ";
            temp += inOrder(node.right);
        }
        return temp;

    }

    public String postOrder() {
        String output = "";
        output += "POSTORDEN" + postOrder(this.root) + "\n";
        return output;

    }

    private String postOrder(BinaryNode node) {
        String temp = "";

        if (node != null) {
            temp = postOrder(node.left);
            temp += postOrder(node.right);
            temp += node.element + " - ";
        }
        return temp;

    }

    @Override
    public Object getNode(Object element) throws TreeException {
        if (isEmpty()) {
            throw new TreeException("El arbol binario simple no existe");
        }
        return getNodoBinario(root, element);
    }

    private BinaryNode getNodoBinario(BinaryNode nodo, Object element) {
        if (nodo == null) {
            return null;
        } else if (nodo.element.equals(element)) {
            return nodo;
        }
        return getNodoBinario(nodo.left, element) != null
                ? getNodoBinario(nodo.left, element) : getNodoBinario(nodo.right, element);
    }

    @Override
    public void swapElement(Object element1, Object element2) throws TreeException {
        if (isEmpty()) {
            throw new TreeException("El arbol binario simple no existe");
        }
        root = swap(root, element1, element2);
    }

    private BinaryNode swap(BinaryNode node, Object element1, Object newElement) {
        if (node == null) {
            return null;
        } else if (node.element.equals(element1)) {
            node.element = newElement; //el nuevo objeto
            return node;
        }//if
        node.left = swap(node.left, element1, newElement);
        node.right = swap(node.right, element1, newElement);
        return node;
    }//fin de modificar

//    public Object getBinaryNode(int posicion) throws TreeException {
//        if (isEmpty()) {
//            throw new TreeException("El arbol binario simple no existe");
//        }
//        return getBynaryNodeByPos(root, posicion);
//    }
//
//    private Object getBynaryNodeByPos(BinaryNode node, int count) throws TreeException {
//        if (node == null) {
//            return null;
//        } else if (node.counter == count) //ya lo encontro
//        {
//            return node.element;
//        }
//        return getBynaryNodeByPos(node.left, count) != null ? getBynaryNodeByPos(node.left, count) : getBynaryNodeByPos(node.right, count);
//    }
    public ArrayList<Object> lista() throws TreeException {
        if (isEmpty()) {
            throw new TreeException("El arbol esta vacio");
        }//la binaryList no esta vacia
        return lista(this.root);
    }

    private ArrayList<Object> lista(BinaryNode node) {

        if (node != null) {
            binaryList = lista(node.left);
            binaryList.add(node.element);
            binaryList = lista(node.right);

        }
        return binaryList;
    }

    public ArrayList<Object> nodeOnLevel(int nivelSearched) {
        nodeOnLevel(this.root, 1, nivelSearched);
        return binaryList;
    }

    private void nodeOnLevel(BinaryNode binaryNode, int nivel, int nivelSearched) {
        if (binaryNode != null) {

            nodeOnLevel(binaryNode.left, nivel + 1, nivelSearched);
            if (nivel == nivelSearched) {
                binaryList.add(binaryNode.left.element);
            }
            nodeOnLevel(binaryNode.right, nivel + 1, nivelSearched);
            if (nivel == nivelSearched) {
                binaryList.add(binaryNode.right.element);
            }
            if (0 == nivelSearched) {
                binaryList.add(root.element);
            }
        }
    }

    public ArrayList<Object> limit() {
        limit(this.root, 1);
        return binaryList;
    }

    private void limit(BinaryNode binaryNode, int nivel) {
        if (binaryNode != null) {

            limit(binaryNode.left, nivel + 1);
            if (nivel < height(root)&& binaryNode.left.right == null && binaryNode.left.left == null) {
                binaryList.add(binaryNode.left.element);
            }
            limit(binaryNode.right, nivel + 1);
            if (nivel < height(root) && binaryNode.right.right == null && binaryNode.right.left == null) {
                binaryList.add(binaryNode.right.element);
            }

        }
    }

}
