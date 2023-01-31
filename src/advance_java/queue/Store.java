package advance_java.queue;

import java.util.LinkedList;

public class Store {
    public static void main(String[] args) {

        LinkedList<Customer> queue = new LinkedList();
        queue.add(new Customer("Ernest"));
        queue.add(new Customer("Emmanuel"));
        queue.add(new Customer("Samuel"));
        queue.add(new Customer("Utibe"));
        System.out.println(queue);
        serveCustomer(queue);
        System.out.println(queue);
    }

    static void serveCustomer(LinkedList<Customer> queue) {
        Customer customer = queue.poll();
        customer.serve();
    }
}
