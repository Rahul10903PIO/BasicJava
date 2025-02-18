package com.core.java.week3.Day5;

class StackUnderFlowError extends Exception{
    public  StackUnderFlowError() {
        super(" Stack s Empty ");
    }
}
public class StackDemo {
    int[] stack=new int[5];
    int idx=-1;
    public void push(int val) throws StackOverflowError {
        idx++;
        if ( idx == 5 ) {
            throw new StackOverflowError();
        } else {
            stack[idx]=val;
        }
    }
    public int pop() throws StackUnderFlowError {
        int res=0;
        if ( idx == -1 ) {
            throw new StackOverflowError();
        } else {
            res=stack[idx];
            idx--;
        }
        return res;
    }
    public boolean isEmpty(){
        if ( idx == -1 ) return true;
        return false;
    }

    public int peek() {
        return stack[idx];
    }
    public static void main(String[] args) {
        StackDemo st=new StackDemo();
        try {
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);
            st.push(5);

            while (!st.isEmpty()) {
                System.out.println(st.pop());
            }


        } catch ( StackOverflowError | StackUnderFlowError e) {
            System.out.println(e);
        }
    }

}
