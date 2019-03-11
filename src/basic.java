import java.util.Scanner;

class Node1{

     int value;
     Node1 next;
    //Constrcutors
    public Node1(int value){
        this.value=value;
        this.next=null;
    }
    public Node1(int value,Node1 nextNode){

        this.value=value;
        this.next=nextNode;
    }

    //Accessor and Mutators

    void setValue(int value)
    {
        this.value=value;
    }
    void setNext(Node1 nextNode){
        this.next=nextNode;
    }
    int getValue(){
        return value;
    }
    Node1 getNext(){
    return next;
    }

}

public class basic {

    static Scanner sc=new Scanner(System.in);
    static Node1 head=null;

    public static void display(Node1 head) {
        Node1 start=head;

        while(start!=null)
        {
            System.out.println(start.value);
            start=start.next;
        }

    }

    public static void main(String[] args) {
        Node1 a=new Node1(5);
        Node1 b=new Node1(7,a);
        head=b;
      display(head);
    }
}

