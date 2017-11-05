package examples.counts.strings;


public class ResultString {

    public final String tail;
    public final Head head;

    public ResultString(String tail,Head head) {
        this.tail = tail;
        this.head = head;

    }



    public String toString() {
        return tail.concat(head.toString());
    }
}
