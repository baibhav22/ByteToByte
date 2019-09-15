package Byte;

public class LinkedListPushFromEnd {

    Node head;
    public void push(int data){

        Node n=head;
        Node node=new Node();

        node.data=data;
        node.next=null;

        if(head==null){

            head=node;
            System.out.println(head.data);
        }

        else{

            while(n.next!=null){

                n=n.next;

            }
            n.next=node;
        }


    }

    public void show(){

        Node n=head;
        while(n.next!=null){

            n=n.next;
            System.out.println(n.data);
        }



    }


}
