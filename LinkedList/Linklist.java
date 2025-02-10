import java.util.LinkedList;
import java.util.*;
public class Linklist{

    Node head;
    private int size;
    Linklist(){                   //constructor
        this.size=0;
    }


    class Node{
        String data;             // data
        Node next;        // Address of next node

        Node(String data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
    }

   

    

    // Insert at beginning

    public void insBeg(String data)
    {
        Node newNode = new Node(data);
        
        if(head==null)
        {
            head=newNode;
            return;
        }
        
        newNode.next=head;
        head=newNode;

    }


    //Insert at End

    public void insEnd(String data)
    {
        
        Node newNode = new Node(data);
        
        if(head==null)
        {
            head=newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null)
        {
           currNode=currNode.next;

        } 
        currNode.next=newNode;

    }


    // printing the list

    public void printList()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
        }

        Node currNode = head;
        while(currNode != null)
        {
            System.out.print(currNode.data + "->");
           currNode=currNode.next;

        } 
        System.out.println("NULL");

    }


    // Delete at begin

    public void delBeg()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;

        }
        size--;
        head=head.next;
        
    }

    // Delete at End

    public void  delEnd()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;

        }
        size--;
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node secondLast = head;
        Node lastNode=head.next;
        while(lastNode.next!=null)
        {
            lastNode=lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next=null;  

    }
    

    public int getSize()
    {
        return size;
    }


    public void reverseIterate()
    {

        if(head==null || head.next==null)
        {
            return;
        }
       Node prevNode=head;
       Node currNode=head.next;
       
       while(currNode!=null)
       {
            Node nextNode= currNode.next;

            currNode.next= prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;
       }
       head.next=null;
       head=prevNode;

    }




    public static void main(String[] args)
    {

        Linklist li = new Linklist();

        li.insBeg("a");
        li.insBeg("b");
        li.insBeg("c");
        li.insBeg("d");

        li.printList();

        li.insEnd("hii");

        li.printList();

        li.delBeg();

        li.printList();

        li.delEnd();

        li.printList();

 
        System.out.println(li.getSize());

        li.reverseIterate();

        li.printList();



  
    }



}