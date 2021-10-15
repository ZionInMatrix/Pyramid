package DataStructure.Stack.StacksArrayImpl;

public class Main {
    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Jane", "Jones", 1));
        stack.push(new Employee("Mike", "Bones", 2));
        stack.push(new Employee("Marks", "Engels", 3));
        stack.push(new Employee("Vladimir", "Putin", 4));
        stack.push(new Employee("Milos", "Zeman", 4));

//        stack.printStack();

        System.out.println(stack.peek());
//        stack.printStack();

        System.out.println("Popped " + stack.pop());
        System.out.println(stack.peek());
    }
}
