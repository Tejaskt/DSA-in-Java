package ds;
import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        System.out.println("welcome to queues");
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int[] queue = new int[size];
        int front = 0 , rear = 0;
        while(true) {
            System.out.println("1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Traverse");
            System.out.println("4.Exit \n");

            System.out.println("enter your choice: ");
            int ch = sc.nextInt();

            if(ch==1) {
                if(rear == size) {
                    System.out.println(".....queue is full.....");
                }else {
                    System.out.print("enter element: ");
                    int ele = sc.nextInt();
                    queue[rear] = ele;
                    rear++;
                    System.out.println("element inserted !!!");
                }
            }else if(ch==2) {
                if(rear == 0) {
                    System.out.println(".....Queue is Empty.....");
                }else {
                    for(int i=0;i<=rear-2;i++) {
                        queue[i] = queue[i+1];
                    }
                    rear--;
                }

            }else if(ch==3) {
                if(rear == 0) {
                    System.out.println(".....Queue is Empty.....");
                }else {
                    System.out.println("Queue Elements Are: ");
                    for(int i=0;i<=rear-1;i++) {
                        System.out.print(queue[i] + " ");
                    }
                }
            }else if(ch==4) {
                System.out.println("end");
                break;
            }else {
                System.out.println("invalid choice");
            }

        }
    }
}
