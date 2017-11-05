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
                    ResultString res = null;
                    if (head.head.actualLetter.equals(result.head.actualLetter)) {
                        String tail = result.tail;
                        Integer size = head.head.ocurrece() + result.head.ocurrece();
                        Head headS = new Head(head.head.actualLetter,Optional.of(size));
                        res =  new ResultString(tail, headS);
                    }else {
                        String tail = result.tail.concat(result.head.toString());
                        Integer size = head.head.ocurrece();
                        Head headS = new Head(head.head.actualLetter,Optional.of(size));
                        res = new ResultString(tail, headS);
                    }
                    return res;
                        });
            return a.toString();
    }

}
