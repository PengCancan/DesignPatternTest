package com.ican.algorithm;

/**
 * Created by flingcoder
 * Date:4/5/2016
 * Description:
 */
public class BiTree {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);

        a.next = b;
        b.next = c;

        while(a != null){
            System.out.println(a.data);
            a = a.next;
        }
    }
}

class Node{
    int data;
    Node pre;
    Node next;
    public Node(int data){
        this.data = data;
    }
}
