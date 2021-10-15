package DataStructure.Queues.QueuesArrayImpl;

public class Main {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 456);
        Employee marySmith = new Employee("Mary", "Smith", 789);
        Employee mikeWilson = new Employee("Mike", "Wilson", 999);

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
//        queue.printQueue();

//        System.out.println("\n");

        queue.remove();
        queue.remove();
        queue.remove();
//        queue.printQueue();

        queue.add(janeJones);

//        System.out.println(queue.peek());
        queue.printQueue();

    }
}
