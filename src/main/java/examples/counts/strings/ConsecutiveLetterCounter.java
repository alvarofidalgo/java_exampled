package examples.counts.strings;

import java.util.Arrays;
import java.util.Optional;

public class ConsecutiveLetterCounter {

    //TODO :
    public String convert(String entry) {

        ResultString a =Arrays.stream(entry.split(""))
                .map((b)-> new ResultString(b,new Head(b, Optional.of(1))))
                .reduce(new ResultString("",new Head("",Optional.empty())),
                        (result,head) -> {

                    String tail = "";
                    Head headS = null;
                    if (head.head.actualLetter.equals(result.head.actualLetter)) {
                        tail = result.tail;
                        Integer size = head.head.ocurrece() + result.head.ocurrece();
                        headS = new Head(head.head.actualLetter,Optional.of(size));
                    }else {
                        tail = result.tail.concat(result.head.toString());
                        Integer size = head.head.ocurrece();
                        headS = new Head(head.head.actualLetter,Optional.of(size));
                    }
                    ResultString res =  new ResultString(tail, headS);
                    return res;

                        });
            return a.toString();
    }

}
