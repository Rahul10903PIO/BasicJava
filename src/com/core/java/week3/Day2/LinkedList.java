package com.core.java.week3.Day2;
class Node<T> {
    public T data;
    public Node next;
    public Node(T data) {
        this.data = data;
        next=null;
    }
}
class NodeDl<T>{
    public T data;
    public NodeDl next;
    public NodeDl prev;
    public NodeDl(T data){
        this.data=data;
        next=null;
        prev=null;
    }
}
class DoublyLinkedList<T>{
    public NodeDl head;
    public NodeDl tail;

    public void addFirst(T data){
        NodeDl<T> newNode=new NodeDl<>(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }

    public void addLast(T data){
        NodeDl<T> newNode=new NodeDl<>(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
    public NodeDl removeFirst() {
        NodeDl result = null;
        if (head == null) {
            throw new NullPointerException("List Is Empty");
        } else {
            result=head;
            head=head.next;
            head.prev=null;
        }
        return result;
    }
    public NodeDl removeLast(){
        NodeDl result=null;
        if(head==null){
            throw new NullPointerException("List Is Empty");
        }else{
            result=tail;
            tail=tail.prev;
            tail.next=null;
        }
        return result;
    }
    public NodeDl removeAtPostion(int idx){
        NodeDl result=null;
        if(idx==1) return removeFirst();
        if(head==null){
            throw new NullPointerException("List Is Empty");
        }else{
            int i=1;
            NodeDl temp=head;
            while(i<idx-1&&temp!=null){
                temp=temp.next;
                i++;
            }
            if(temp==null) throw new IllegalArgumentException("Enter valid Index");
            result=temp.next;
            temp.next=temp.next.next;
            temp.next.prev=temp;
            result.next=null;
            result.prev=null;
        }
        return result;
    }
}

class SinglyLikedList<T>{

    Node head=null;
    Node tail=null;
    public void addLast(T data){
        Node<T> newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void addFirst(T data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }

    public Node removeFirst() throws  NullPointerException{
        Node temp=null;
        if(head==null){
            throw new NullPointerException("List Is Empty");
        }else{
            temp=head;
            head=head.next;
            temp.next=null;
        }
        return temp;
    }

    public Node removeLast() throws NullPointerException{
        Node temp=null;
        if(head==null){
            throw new NullPointerException("List Is Empty");
        }else{
            Node temp1=head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            temp=tail;
            temp1.next=null;
            tail=temp1;
        }
        return temp;
    }

    public Node removeAtposition(int idx) throws IllegalArgumentException {
        if(idx==0) throw new IllegalArgumentException("Enter the Correct Index");
        Node result=null;
        if(idx==1){
            return removeFirst();
        }else{
            int i=1;
            Node temp=head;
            while(i<idx-1&&temp!=null){
                temp=temp.next;
                i++;
            }
            if(temp==null) throw new IllegalArgumentException("Enter the Correct Index");
            result=temp.next;
            temp.next=temp.next.next;
            result.next=null;
        }
        return result;
    }
}

public class LinkedList {
    public static void main(String args[]){
            DoublyLinkedList<String> dll=new DoublyLinkedList<>();
            dll.addFirst("Arjun");
            dll.addFirst("rahul");
            dll.addFirst("SharmaJi");
            dll.addFirst("ritesh");
            dll.addLast("Kaliya");
            NodeDl temp=dll.head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
    }
}
