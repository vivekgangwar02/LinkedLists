import java.util.Scanner;

class Node {
    int value;
    Node next;

    //Constrcutors
    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}
public class WithRecursion {
    static Scanner sc=new Scanner(System.in);
    static Node head=null;
    static int size=0;

    public static  Node insert(Node head,int data) {
        //Complete this method
        if(head==null)
            return head=new Node(data);
        else if(head.next==null)
            head.next=new Node(data);
        else
            insert(head.next,data);
        return head;
    }

    public static void removeNode(int pos){
        Node start=head;
        int i=2;
        if(pos==1)
            head=head.next;
        else
        {

            while(i++<pos) {
                start=start.next;
            }
            if(start.next!=null) {
            start.next=start.next.next;
            size--;}
            else
                System.out.println("Item doesnt exists");

        }
    }

    public static void sizeCount(){
        Node start=head;
        while(start!=null) {
            start=start.next;
            size++;
        }

    }

    public static void insertAtPos(int pos,int value) {
        Node start = head;
        int i = 2;
        boolean x=false;
        if (pos == 1) {
            Node temp = new Node(value);
            temp.next = head;
            head = temp;
        } else {
            while (i++<pos) {
                if(start.next==null) {
                    System.out.println("Can not be inserted at this postiion");
                    break;
                }
                start=start.next;
                x=true;

            }
            if(x) {
                Node a=new Node(value);
                start.next=a;
                a.next=start.next.next;
            }


        }
    }

    public static void display() {
        Node start=head;

        while(start!=null)
        {
            System.out.println(start.value);
            start=start.next;
        }
    }


    public static void main(String[] args) {

        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0) {
            int ele=sc.nextInt();
            head = insert(head,ele);
        }
        //removeNode(4);
        display();
        sizeCount();
        System.out.println(size);
        insertAtPos(5,7);
        display();
    }

    }

