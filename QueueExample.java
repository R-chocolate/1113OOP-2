import java.util.LinkedList;

class MyQueue<T> extends LinkedList<T> {

    // enqueue: add item to the tail of queue
    public void enqueue(T item) {
        this.addLast(item);
    }

    // dequeue: remove and return the head of queue
    public T dequeue() {
        if (this.isEmpty()) return null;
        return this.removeFirst();
    }

    // isEmpty: return true if queue has no elements
    public boolean isEmpty() {
        return super.isEmpty();
    }

    // size: return number of elements in queue
    public int size() {
        return super.size();
    }
}

public class QueueExample {
    public static void main(String[] args) {
        MyQueue<Integer> intQueue = new MyQueue<>();
        //do some test if needed
    }
}


//我的Junit測試會測這個Object，這邊以下請不要修改
//---------------------------------------------------------------------------------
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
//---------------------------------------------------------------------------------