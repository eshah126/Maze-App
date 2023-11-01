public class StackTest(){
    StackADT stack = new StackADT();
    T newT = new T();
    T newT2 = new T();
    stack.push(newT);
    stack.push(newT2);
    stack.pop();
    System.out.println(stack.empty());
    System.out.println(stack.size());
    
    



}