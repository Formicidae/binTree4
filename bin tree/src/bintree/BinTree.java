/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintree;

/**
 *
 * @author Eddie
 */
public class BinTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinaryTree tree = new BinaryTree(new Node(20));
        tree.insert(new Node(5));
        tree.insert(new Node(32));
        tree.insert(new Node(15));
        tree.insert(new Node(43));
        tree.insert(new Node(44));
        tree.insert(new Node(16));
        tree.insert(new Node(46));
        tree.insert(new Node(45));
        tree.insert(new Node(1));
        tree.insert(new Node(2));
        
        System.out.println(tree.getRoot().getNum());
        System.out.println(tree.getRoot().getLeft().getNum());
        System.out.println(tree.getRoot().getLeft().getLeft().getNum());
        
        BinaryTree fett = tree.clone(tree.getRoot(),null);
        
        System.out.println(fett.getRoot().getNum());
        System.out.println(fett.getRoot().getLeft().getNum());
        System.out.println(fett.getRoot().getLeft().getLeft().getNum());
    }
    
}
