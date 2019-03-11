import java.util.Scanner;

class Dnode{
    int value;
    Dnode previous;
    Dnode next;
    Dnode(int value){
        this.value=value;
        this.next=null;
        this.previous=null;
    }
    Dnode(int value,Dnode previous){
        this.value=value;
        this.next=null;
        this.previous=previous;
    }
}

public class DoublyLinkedList {
    private static Scanner sc=new Scanner(System.in);
    private static Dnode head=null;

    private static  Dnode insert(Dnode head,int data) {
        Dnode previous;
        if(head==null)
        return new Dnode(data);
        else if(head.next==null)
        {   previous=head;
            head.next=new Dnode(data,previous);
        }
        else
            insert(head.next,data);
        return head;
    }

    private static void display() {
        Dnode temp=head;
        while(temp!=null) {
            System.out.println(temp.value);
//            System.out.println("head: "+head);
//            System.out.println("Current Object: "+temp);
//            System.out.println("Previous Object: "+temp.previous);
//            System.out.println("Next Object: "+temp.next);
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
        display();
    }

}
