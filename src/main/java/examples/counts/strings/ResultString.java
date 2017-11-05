package examples.counts.strings;

import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.Function;

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
