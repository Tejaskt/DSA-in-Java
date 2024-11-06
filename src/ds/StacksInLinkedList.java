package ds;

import java.util.Scanner;

public class StacksInLinkedList {
    static Node top = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("1.PUSH");
            System.out.println("2.POP");
            System.out.println("3.TRAVERSE");
            System.out.println("4.EXIT");

            System.out.println("Enter your choice :");
            int ch = sc.nextInt();
            if(ch==1) {
                //PUSH
                System.out.println("enter element to push :");
                int ele = sc.nextInt();
                push(ele);
            }else if(ch==2) {
                pop();
            }else if(ch==3) {
                display();
            }else if(ch==4) {
                //EXIT
                System.out.println("Exit");
                break;
            }else {
                System.out.println("Invalid Operation !!!");
            }
        }
    }

    static void display() {
        if(top == null) {
            System.out.println("Stack is Empty");
        }else {
            Node temp = top;
            while(temp!=null) {
                System.out.println(temp.data);
                temp = temp.link;		//move to the next node
            }
        }
    }

    static void pop() {
        if(top == null) {
            System.out.println("Stack is Empty");
        }else {
            System.out.println("element poped successfully :"+top.data);
            top = top.link;
        }
    }

    static void push(int ele) {
        Node temp = new Node();
        temp.data = ele;
        temp.link = top;
        top = temp;
        System.out.println("Element pushed Successfully !!!");
    }
}
class Node{
    int data;
    Node link;
}