

import java.util.ArrayList;

public class MyTree {

    Node root;

    public MyTree() {
        Node n3, n9, n8, n16, n7, n2, n6, n5, n10;
//        n16 = new Node(16);
//        n6 = new Node(6);
//        n5 = new Node(5);
//        n10 = new Node(10);
//        n7 = new Node(7, n6, n5);
//        n2 = new Node(2, n10, null);
//        n9 = new Node(9, n16, n7);
//        n8 = new Node(8, null, n2);
//        n3 = new Node(3, n9, n8);
//        root = n3;
        
        Node n17, n20;
        n2 = new Node(2);
        n9 = new Node(9);
        n17 = new Node(17);
        n8 = new Node(8, n2, n9);
        n20 = new Node(20, n17, null);
        n10 = new Node(10, n8, n20);
        root = n10;
    }

    void Max (){
        
        if (root == null) return;
        MyQueue t  = new MyQueue();
        int max = Integer.MIN_VALUE;
        t.enQueue(root);
        while(!t.isEmpty()){
            Node p =(Node) t.deQueue();
            if (p.info > max) max = p.info;
            if (p.left != null) t.enQueue(p.left);
            if (p.right != null) t.enQueue(p.right);
        }
        System.out.println("Max: "+max);
    }
    
    void CountNode (){
        
        if (root == null) return;
        MyQueue t  = new MyQueue();
        int count = 0;
        t.enQueue(root);
        while(!t.isEmpty()){
            Node p =(Node) t.deQueue();
            if (p.left != null) t.enQueue(p.left);
            if (p.right != null) t.enQueue(p.right);
            count++;
        }
        System.out.println("The tree has "+ count+" nodes.");
    }
        
    void show() {
        System.out.println("Root: " + root.info);
        System.out.println("Left root: " + root.left.info);
        
    }
void rightMost(){
    Node rightMost = root;
        while (rightMost.right != null) {
            rightMost = rightMost.right;
        }
        System.out.println("Right most: " + rightMost.info);
}
    void grandChildRootV2(){
       
        if (root == null) return;
        int count = 0;
        ArrayList t = new ArrayList();
        Node[] child = {root.left, root.right};
        for (Node ch : child) {
            if (ch != null){
                Node[] grandChild = {ch.left, ch.right};
                for (Node grC : grandChild){
                    if(grC!=null){
                    t.add(grC.info);
                    count++;   
                    }
                }
            }
        }
        System.out.println("Root co: " + count + " chau" + " " + t);
    }
    void grandChildRoot() {
        Node leftRoot = root.left;
        Node rightRoot = root.right;
        int count = 0;
        ArrayList t = new ArrayList();
        if (leftRoot.left != null) {
            t.add(leftRoot.left.info);
            count++;
        }
        if (leftRoot.right != null) {
            t.add(leftRoot.right.info);
            count++;
        }
        if (rightRoot.left != null) {
            t.add(rightRoot.left.info);
            count++;
        }
        if (rightRoot.right != null) {
            t.add(rightRoot.right.info);
            count++;
        }
        System.out.println("Root co: " + count + " chau" + " " + t);
    }

    void preOrder (Node v){
        if (v==null) return;
        System.out.print(v.info +" ");
        preOrder(v.left);
        preOrder(v.right);
    }
    
    void desRoot() {
        if (root == null) return;
        int count = 0;
        ArrayList<Integer> t = new ArrayList();
        Node[] child = {root.left, root.right};
        for (Node ch : child){
            if (ch != null){
                Node[] grandChild = {ch.left, ch.right};
                for (Node gc : grandChild){
                    if (gc!=null){
                        Node[] desRoot = {gc.left, gc.right};
                        for (Node des : desRoot){
                            if (des!=null){
                                t.add(des.info);
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Root co: " + count + " chat" + " " + t);
    }
       
        

}
