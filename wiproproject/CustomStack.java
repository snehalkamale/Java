package wiproproject;
import java.util.ArrayList;

import java.util.List; 


public class CustomStack <Integer> {
 List<Integer> stack;

public CustomStack() {
stack = new ArrayList<>(); }
public void push (Integer element) { stack.add(element); }
public void pop() {

if(!stack.isEmpty()) {
stack.remove(stack.size()-1);

}else 
{

System.out.println("No element in stack"); }

}

public int peek() {
if(isEmpty()) 
{

System.out.println("No element in stack");

}
return (int) stack.get(stack.size()-1);

}
public boolean isEmpty() {
return stack.isEmpty();
}
public static void main(String[] args) {
	CustomStack<Object> st = new CustomStack<>();
st.push(2);
st.push(4);
st.push(6);

System.out.println(st.peek());
st.pop();
st.pop();
st.pop();

boolean f=st.isEmpty();
System.out.println(f);

}
}
