import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        System.out.println("-----------------------Welcome-----------------------");
        System.out.println("1. LinkedList");
        System.out.println("2. Arrays and Strings");
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
            case 2:
                ArraysStrings arrStrings = new ArraysStrings();
                System.out.println("1. IsUnique ");
                System.out.println("2. Permutation ");
                int op = sc.nextInt();
                switch(op){
                    case 1:
                        System.out.println("Enter a string: ");
                        String s = sc.next();
                        System.out.println("Simple Array: " + arrStrings.isUnique(s));
                        System.out.println("Using HashMap: "+ arrStrings.isUniqueHashMap(s));
                        break;
                    case 2:
                        System.out.println("Enter a string1: ");
                        String s1 = sc.next();
                        System.out.println("Enter a string2: ");
                        String s2 = sc.next();
                        System.out.println(arrStrings.permutation(s1, s2));
                        System.out.println(arrStrings.permutation1(s1, s2));
                        break;
                        

                }
                break;
        }

    }
}