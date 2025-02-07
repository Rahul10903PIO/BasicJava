package com.core.java.week3.Assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class NodeSl{
    int data;
    NodeSl next;
    public NodeSl(int data) {
        this.data=data;
    }
}
class LinkedList{
    NodeSl head;
    NodeSl tail;

    public void addFirst(int data){
        NodeSl newNode=new NodeSl(data);
        if(head == null){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }

    public void addLast(int data) throws EmptyPlaylist{
        NodeSl newNode=new NodeSl(data);
        if(head == null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    public NodeSl removeFirst() throws EmptyPlaylist {
        NodeSl result;
        if(head == null) {
            throw new EmptyPlaylist();
        } else {
            result=head;
            head=head.next;
        }
        return result;
    }

    public NodeSl removeLast() throws EmptyPlaylist {
        NodeSl result;
        if(head == null) {
            throw new EmptyPlaylist();
        } else {
            result=tail;
            NodeSl temp=head;
            while(temp.next!=tail){
                temp=temp.next;
            }
        }
        return result;
    }

    public NodeSl removeAtposition(int idx) throws EmptyPlaylist {
        NodeSl result;
        if(head == null){
            throw new EmptyPlaylist();
        }else{
            int i=1;
            NodeSl temp=head;
            while(i<idx-1&&temp!=null) {
                temp=temp.next;
                i++;
            }
            if(temp==null) throw new IllegalArgumentException("Enter Valid Index");
            result=temp.next;
            temp=temp.next;
        }
        return result;
    }
    public NodeSl arrayListToLinkedList(List<Integer> list) {
        NodeSl head1=null;
        NodeSl temp=null;

        for(int i=0;i<list.size();i++) {
            NodeSl newNode=new NodeSl(list.get(i));
            if(i==0) {
                head=newNode;
                temp=head;
            }else{
                temp.next=newNode;
                temp=newNode;
            }
        }
        return head;
    }
}
public class Question4Int {
    public static void main(String[] args) {

        LinkedList ll=new LinkedList();
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        NodeSl head=ll.arrayListToLinkedList(list);
        NodeSl temp=head;

        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
}
