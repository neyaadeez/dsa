import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        System.out.println("-----------------------Welcome-----------------------");
        System.out.println("1. LinkedList");
        Scanner sc = new Scanner(System.in);
        int readOp = sc.nextInt();
        switch(readOp){
            case 1:
                LinkedList linkedList = new LinkedList();
                System.out.println("Operation: ");
                System.out.println("1. Insert");
                System.out.println("2. Delete");
                readOp = sc.nextInt();
                switch(readOp){
                    case 1:
                        LinkedList.Node head = linkedList.new Node();
                        linkedList.insert(head);
                        break;
                    case 2:
                        LinkedList.Node head1 = linkedList.new Node();
                        linkedList.insert(head1);
                        System.out.println("Enter the element to delete: ");
                        int val = sc.nextInt();
                        linkedList.delete(val, head1);
                        break;

                }
                break;
        }

    }
}