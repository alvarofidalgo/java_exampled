package examples.counts.strings;


public class ResultString {

    public final String tail, head;

    public ResultString(String tail,String head) {
        this.tail = tail;
        this.head = head;

    }



    public String toString() {
        return tail.concat(head);
    }
}
