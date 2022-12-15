package MyCollections;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class TestCollections {
    public static void main(String[] args) throws Exception {
        Faker faker = new Faker();
        Random random = new Random();
        List<Person> list = new ArrayList<>();
        StackPlus<Person> stackList = new StackPlus<>();
        QueuePlus<Person> queueList = new QueuePlus<>();
        DequePlus<Person> dequeList = new DequePlus<>();
        PriorityQueuePlus<Person> priorityQueueList = new PriorityQueuePlus<>();


        for (int i = 0; i < 15; i++) {
            list.add(new Person(faker.name().lastName(), random.nextInt(1, 99)));
        }
        System.out.println(list);

        System.out.println("Is stack empty? " + stackList.isEmpty());
        System.out.println("Is queue empty? " + queueList.isEmpty());
        for (Person p : list) {
            stackList.push(p);
            queueList.add(p);
            dequeList.addLast(p);
            priorityQueueList.add(p);
        }


        System.out.println("===============Test STACK===========================");
        System.out.println("Is stack empty? " + stackList.isEmpty());
        System.out.println(stackList);
        System.out.println("Stack peek " + stackList.peek());
        System.out.println("Stack pop " + stackList.pop());
        System.out.println(stackList);
//        int size = stackList.size() + 1;
//        for (int i = 0; i < size-4; i++) {
//            System.out.println("Stack pop " + stackList.pop());
//        }
//        System.out.println(stackList);
        System.out.println(stackList.list.length);
        System.out.println("===============Test QUEUE===========================");
        System.out.println("Is queue empty? " + queueList.isEmpty());
        System.out.println(queueList);
        System.out.println("Queue peek " + queueList.peek());
        System.out.println("Queue poll " + queueList.poll());
        System.out.println(queueList);
        int size1 = queueList.size() + 1;
        for (int i = 0; i < size1 - 3; i++) {
//            System.out.println("Stack remove " + queueList.remove());
            System.out.println("Stack poll " + queueList.poll());
        }
        System.out.println(queueList);
        System.out.println(queueList.list.length);

        System.out.println("===============Test DEQUE===========================");
        System.out.println(dequeList);
        System.out.println("DEQUE peekFirst  " + dequeList.peekFirst());
        System.out.println("DEQUE peekLast el " + dequeList.peekLast());
        System.out.println("=====remove first and last====");
        System.out.println("DEQUE pollFirst " + dequeList.pollFirst());
        System.out.println("DEQUE pollLast " + dequeList.pollLast());
        System.out.println(dequeList);

//        int size = dequeList.size() + 1;
//        for (int i = 0; i < size-15; i++) {
////            System.out.println("Deque remove " + dequeList.remove());
//            System.out.println("Deque pollLast " + dequeList.pollLast());
//        }
//        System.out.println(dequeList);
        System.out.println(dequeList.list.length);

        System.out.println("===============Test PRIORITY QUEUE===========================");
        System.out.println(priorityQueueList);
        System.out.println("Priority peek  " + priorityQueueList.peek());
        System.out.println("=====remove element====");
        System.out.println("PriorityQueue " + priorityQueueList.remove());
        System.out.println(priorityQueueList);

        int size3 = dequeList.size() + 1;
        for (int i = 0; i < size3-3; i++) {
            System.out.println("PrimaryQueue remove " + priorityQueueList.remove());
        }
        System.out.println(priorityQueueList);
        System.out.println(priorityQueueList.list.length);
    }
}
