
import java.util.LinkedList;

class MyQueue<T> extends LinkedList<T> {
    public void enqueue(T item) {
        this.addLast(item);
    }

    public T dequeue() {
        if (!isEmpty()) {
            return this.removeFirst();
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int size() {
        return super.size();
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class QueueExample {
    public static void main(String[] args) {
        MyQueue<Integer> intQueue = new MyQueue<>();
    }
}
