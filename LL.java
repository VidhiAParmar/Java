import java.util.*;
class Node{
    int data;
    Node next;
}
public class LL {
public static void main(String[] args)
{
    Node head=new Node();
    head.data=12;
    head.next=null;
    Node tail =head;
    Scanner sc = new Scanner(System.in);
    boolean f= true;
    while(f)
    {
        System.out.println("1.inser at beginning\n2.insert at middle\n3.insert at last\n4.Delete at first\n5.Delete at middle\n6.Delete at last\n7.display\n8.exit");
        int a= sc.nextInt();
        switch(a)
        {
            case 1:
            {
                System.out.print("enter data:");
                int data=sc.nextInt();
                Node nn=creatNode(data);
                nn.next=head;
                head=nn;
                tail=UpdateHead(head);
            }
            break;
            case 2:
            {
                System.out.print("enter data:");
                int data=sc.nextInt();
                Node nn=creatNode(data);
                Node temp=head;
                while(12!=temp.data)
                {
                    temp=temp.next;
                }
                nn.next=temp.next;
                temp.next=nn;
                tail=UpdateHead(head);
                
            }
            break;
            case 3:
            {
                System.out.print("enter data:");
                int data=sc.nextInt();
                Node nn=creatNode(data);
                Node temp=head;
                Node t= new Node();
                while(temp!=null)
                {
                    t=temp;
                    temp=temp.next;
                }
                t.next=nn;
                tail=UpdateHead(head);
            }
            break;
            case 4:
            {
                Node temp=head.next;
                head=temp;

            }
            break;
            case 5:
            {
                System.out.print("enter number that you want to delete:");
                int d = sc.nextInt();
                Node temp=head;
                Node g=head.next;
                while(d!=(temp.next).data)
                {
                    temp=temp.next;
                    g=g.next;
                }
                temp.next=g.next;
                tail=UpdateHead(head);
            }
            break;
            case 6:
            {
                Node temp=head;
                while((temp.next).next!=tail)
                {
                    temp=temp.next;
                }
                tail=temp.next;

            }
            break;
            case 8:
            f=false;
            break;
            case 7:
            {
                System.out.println("element in linkedlist is:");
                Node g=head;
                while(g!=tail)
                {
                    System.out.print(g.data+"\t");
                    g=g.next;
                }
                System.out.println();
            }
        }
    
    }
    sc.close();
}
static Node creatNode(int data)
{
    Node temp=new Node();
    temp.data=data;
    temp.next=null;
    return temp;
}
static Node UpdateHead(Node head)
{
    Node tail=head;
    while(tail!=null)
    {
        tail=tail.next;
    }
    return tail;
}
}
