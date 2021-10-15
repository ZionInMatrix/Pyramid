package DataStructure.LinkedList.JDKLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 456);
        Employee marySmith = new Employee("Mary", "Smith", 789);
        Employee mikeWilson = new Employee("Mike", "Wilson", 999);
        Employee billEnd = new Employee("Bill", "End", 1);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        Iterator iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.print("Null");

        list.add(billEnd);
        iter = list.iterator();
        System.out.print("\n" + "HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.print("Null");

        list.remove();
        iter = list.iterator();
        System.out.print("\n" + "HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.print("Null");

        list.removeFirst();
        iter = list.iterator();
        System.out.print("\n" + "HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.print("Null");

        list.removeLast();
        iter = list.iterator();
        System.out.print("\n" + "HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.print("Null");

//        for (Employee employee : list) {
//            System.out.println(employee);
//        }
    }
}
