/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Node {
    int info;
    Node left, right;
    public Node (int x){
        info = x;
        left = right =null;
    }
    public Node (int x, Node lef, Node rig){
        info = x;
        left = lef;
        right = rig;
    }
          
}
