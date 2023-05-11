package Keg2coba;

public class FirstLastList {
    public Link first;
    public Link last;

    public FirstLastList() {
        first = null;
        last = null;
        int size = 0;
    }
    public boolean isEmpty() {
        return first == null;
    }
    public void insertLast (int dd){
        Link newLink = new Link (dd);
        if(isEmpty()){
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }
    public int deleteFirst(){
        if(isEmpty()){
            return -1;
        } else {
            int temp = first.data;
            first = first.next;
            return temp;
        }
    }
    public void displayList(){
        Link temp = first;
        while(temp!= null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public int size() {
        return 0;
    }

}
