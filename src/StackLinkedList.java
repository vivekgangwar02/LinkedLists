class Employee {
    public int empid;
    public String name;
    public int sal;

    //if make the variables private then we will require to make getters and setters method

    //here we are assigning values in Employee through reference if we made the variables
    //private then we will need to assign them individually not by reference

    Employee(int empid,String name,int sal) {
        this.empid=empid;
        this.name=name;
        this.sal=sal;
    }


    public String toString(){
        String s = "[ " + empid + " " + name + " " + sal + " ]";
        return s;
    }

}
class Snode{
    Employee data;
    private Snode next;

    Snode(Employee data) {
        this.data=data;
        this.next=null;
    }

    //getters and Setters
    public void setData(Employee data){
        this.data=data;
    }
    public void setNext(Snode next) {
        this.next=next;
    }
    public Employee getData() {
        return data;
    }
    public Snode getNext() {
        return next;
    }

}

public class StackLinkedList {

    static Snode top=null;

    static public void push(Employee data) {
        Snode a=new Snode(data);
        a.setNext(top);
        top=a;
    }

    static public Employee pop(){
        Snode temp=top;
        if(temp!=null)
        {top=top.getNext();
            return temp.getData();
        }
        else
        {
            System.out.println("Stack Empty ");
            return null;
        }

    }

    public static void main(String[] args) {
        Employee a=new Employee(1,"abc",123);
        Employee b=new Employee(2,"xyz",456);
        push(a);
        push(b);
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());

    }
}
