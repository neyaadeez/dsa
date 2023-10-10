import java.util.Scanner;

public class LinkedList {
    public class Node{
        int data;
        Node next;
    }
    public void insert(Node head){
        char y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Element: ");
        int x = sc.nextInt();
        head.data = x;
        head.next = null;
        Node curr = head;
        System.out.println("Add more?(y/n): ");
        y = sc.next().charAt(0);
        while(y=='y'){
            System.out.println("Element: ");
            x = sc.nextInt();
            Node insert = new Node();
            insert.data = x;
            insert.next = null;
            curr.next = insert;
            curr = curr.next;
            System.out.println("Add more?(y/n): ");
            y = sc.next().charAt(0);
        }
        traversal(head);
    }
    void traversal(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    void delete(int x, Node head){
        if(head.next == null){
            if(head.data == x){
                head = null;
                System.out.println("No elements");
                return;
            }
        }
        Node prev = head;
        Node temp = head.next;
        loop1: 
        while(temp!=null){
            if(temp.data == x){
                prev.next = temp.next;
                break loop1;
            }
            prev = temp;
            temp = temp.next;
        }
        traversal(head);
    }
}
