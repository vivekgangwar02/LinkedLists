import java.util.Scanner;

class Node2 {
    int value;
    Node2 next;
    //Constrcutors
    public Node2(int value) {
        this.value = value;
        this.next = null;
    }
}
public class ReverseLinkedList {
    static Scanner sc=new Scanner(System.in);
    static Node2 head=null;
    static int size=0;

    public static  Node2 insert(Node2 head,int data) {
        //Complete this method
        if(head==null)
            return head=new Node2(data);
        else if(head.next==null)
            head.next=new Node2(data);
        else
            insert(head.next,data);
        return head;
    }
    public static void sizeCount(){
        Node2 start=head;
        while(start!=null) {
            start=start.next;
            size++;
        }
    }

    public static void PrintReverse(){
        Node2 temp=null;
        Node2 previous=null; // points to previous node that is to be assigned
        Node2 current=head;//points to the 3rd node in the program
        int i=0;
        while(current!=null) {

            if(i==0){

                previous=current;
                current=current.next;
                head.next=null;
                i++;
            }
            else {
                temp=current;
                current=current.next;
                temp.next=previous;
                previous=temp;
                i++;
            }
        }

        while(temp!=null) {
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }

    }

    public static void main(String[] args) {

        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0) {
            int ele=sc.nextInt();
            head = insert(head,ele);
        }
        PrintReverse();

    }

}

