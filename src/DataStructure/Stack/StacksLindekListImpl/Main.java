package DataStructure.Stack.StacksLindekListImpl;

public class Main {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 1);
        Employee mikeBones = new Employee("Mike", "Bones", 2);
        Employee marksEngels = new Employee("Marks", "Engels", 3);
        Employee vladimirPutin = new Employee("Vladimir", "Putin", 4);
        Employee milosZeman = new Employee("Milos", "Zeman", 4);

        LinkedStack stack = new LinkedStack();

        stack.push(janeJones);
        stack.push(mikeBones);
        stack.push(marksEngels);
        stack.push(vladimirPutin);
        stack.push(milosZeman);

//        stack.printStack();

//        System.out.println(stack.peek());
//        stack.printStack();

        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());
    }
}
