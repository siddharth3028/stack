/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicetest;

class stack
        {
    int stck[]=new int[10];
    int tos;
    //constructor
    stack()
    {tos=-1;}
    //push item into stack
    void push(int item)
    {
        if (tos==9)
            System.out.println("Stack is full !");
        else
            stck[++tos]=item;
    }
    //pop the item from stack and return to user 
    int pop()
    {
        if(tos<0){
            System.out.println("Stack is underflow!");
            return 0;
        }
        else
            return stck[tos--];
            
    }
}
//main class to call child class
public class siddharth {
    public static void main(String[] args)
    {
        stack mystack1=new stack();
        stack mystack2=new stack();
        
        //push some numbers into stack 
        for (int i=0;i<10;i++) mystack1.push(i);
        for(int i=10;i<20;i++) mystack2.push(i);
        
        //pop the those numbers oss the stack
        System.out.println("Stack in mystack 1");
        for (int i=0;i<10;i++) System.out.println(mystack1.pop());
        System.out.println("Stack in mystack 2");
        for (int i=0;i<10;i++) System.out.println(mystack2.pop());
        
    
    }
    
}
