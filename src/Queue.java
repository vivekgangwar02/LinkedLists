class Employee1 {
    public int empid;
    public String name;
    public int sal;

    //if make the variables private then we will require to make getters and setters method

    //here we are assigning values in Employee1 through reference if we made the variables
    //private then we will need to assign them individually not by reference

    Employee1(int empid,String name,int sal) {
        this.empid=empid;
        this.name=name;
        this.sal=sal;
    }


    public String toString() {
        return "[ " + empid + " " + name + " " + sal + " ]";

    }

}
class Qnode{
    Employee1 data;
    private Qnode next;

    Qnode(Employee1 data) {
        this.data=data;
        this.next=null;
    }

    //getters and Setters

    public void setData(Employee1 data){
        this.data=data;
    }
    public void setNext(Qnode next) {
        this.next=next;
    }
    public Employee1 getData() {
        return data;
    }
    public Qnode getNext() {
        return next;
    }

}

public class Queue {
//INSTANCE VARAIBLES
    static Qnode front=null;
    static Qnode rear=null;

    static public void Enqueue(Employee1 data) {
        Qnode a=new Qnode(data);
        if(front==null && rear==null) {
            rear=a;
            rear.setNext(null);
            front=a;
        }
        else {
            rear.setNext(a);
            rear=a;
        }
    }

    static public Employee1 Dequeue(){
        if(front!=null)
        {
            Qnode temp=front; ///No need to declare temp as global as already 'front' is changing that is already
            //a global variable
            front=front.getNext();
            return temp.getData();
        }
        else
        {
            System.out.println("Queue Empty ");
            //System.exit(0);
            return null;
        }

    }

    static public void Display() {
        Qnode temp1=front;
        while(temp1!=null) {
            System.out.println(temp1.getData());
            temp1=temp1.getNext();
        }
    }

    public static void main(String[] args) {
        Employee1 a=new Employee1(1,"abc",123);
        Employee1 b=new Employee1(2,"xyz",456);
        Enqueue(a);
        Enqueue(b);

        //Display();

        System.out.println(Dequeue());
        System.out.println(Dequeue());
        System.out.println(Dequeue());



    }
}
