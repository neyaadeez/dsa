import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        System.out.println("-----------------------Welcome-----------------------");
        System.out.println("1. LinkedList");
        System.out.println("2. Arrays and Strings");
        System.out.println("3. Sec/CTF");
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
                System.out.println("3. URLify");
                System.out.println("4. Permutation of Palidrome");
                System.out.println("5. OneWay");
                int op = sc.nextInt();
                switch(op){
                    case 1:
                    {
                        System.out.println("Enter a string: ");
                        String s = sc.next();
                        System.out.println("Simple Array: " + arrStrings.isUnique(s));
                        System.out.println("Using HashMap: "+ arrStrings.isUniqueHashMap(s));
                    }break;
                    case 2:
                    {   System.out.println("Enter a string1: ");
                        String s1 = sc.next();
                        System.out.println("Enter a string2: ");
                        String s2 = sc.next();
                        System.out.println(arrStrings.permutation(s1, s2));
                        System.out.println(arrStrings.permutation1(s1, s2));
                    }   break;
                    case 3:{
                        System.out.print("Enter a stream of characters: ");
                        sc.nextLine();
                        String xstring = sc.nextLine();
                        System.out.println("Enter the true length of the string: ");
                        int x = sc.nextInt();
                        System.out.println(arrStrings.URLify(xstring.toCharArray(), x));
                    }break;
                    case 4:
                    {
                        System.out.println("Enter the String: ");
                        sc.nextLine();
                        String x = sc.nextLine();
                        System.out.println(arrStrings.permutationofpalindrome(x));
                    }break;
                    case 5:
                    {
                        System.out.println("Enter String s1: ");
                        String s1= sc.next();
                        System.out.println("Enter String s2: ");
                        String s2 = sc.next();
                        System.out.println(arrStrings.oneWay(s1, s2));
                    }

                }
                break;
            case 3:
                Ctf ctf = new Ctf();
                System.out.println("1. Reverse4Characters");
                int op1 = sc.nextInt();
                switch(op1){
                    case 1: 
                        System.out.println("Enter a string: ");
                        String s1 = sc.next();
                        System.out.println(ctf.block4reverse(s1));
                        break;
                }
                break;
        }

    }
}