package com.core.java.week3.Day5;


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
class Deque<T>{
    public NodeDl head;
    public NodeDl tail;

    public void addFirst(T data) {
        NodeDl<T> newNode=new NodeDl<>(data);
        if (head == null) {
            head=newNode;
            tail=newNode;
        } else {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }

    public void addLast(T data) {
        NodeDl<T> newNode=new NodeDl<>(data);
        if ( head == null ) {
            head=newNode;
            tail=newNode;
        } else {
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
    public NodeDl removeLast() {
        NodeDl result=null;
        if ( head == null ) {
            throw new NullPointerException("List Is Empty");
        } else {
            result=tail;
            tail=tail.prev;
            tail.next=null;
        }
        return result;
    }
    public NodeDl getFirst() {
        return head;
    }
    public NodeDl getLast() {
        return tail;
    }
    public void printLine() {
        StringBuilder sb=new StringBuilder();
        NodeDl temp=head;
        while ( temp != null ) {
            sb.append(temp.data);
            temp=temp.next;
        }
        System.out.println(sb.toString());
    }
    public void addLineBreak() {
        NodeDl newNode=new NodeDl("\n");
        if ( head == null ) {
            head=newNode;
            tail=newNode;
        } else {
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
}

public class DequeDemo {

    public static void main(String[] args){
        Deque<String> textCont=new Deque<>();
        textCont.addFirst("Hello");
        textCont.addLast("World");
        textCont.addLineBreak();
        textCont.addLast("I am");
        textCont.addLast("Basic");
        textCont.addLast("Java");
        textCont.addLast("Program");
        textCont.printLine();
     }

}
