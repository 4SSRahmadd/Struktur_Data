package Keg2coba;

public class LinkQueue {
    public FirstLastList theList;

    public LinkQueue() {
        theList = new FirstLastList();
    }
    public boolean isEmpty() {
        return  theList.isEmpty();
    }
    public int size() {
        return theList.size();
    }
    public void enqueue(int i) {
        theList.insertLast(i);
    }
    public long dequeue() {
        return theList.deleteFirst();
    }
    public void displayQueue(){
        System.out.println("Queue (Head-->Tail)");
    }
}
