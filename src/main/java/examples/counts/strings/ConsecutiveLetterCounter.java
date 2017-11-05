package examples.counts.strings;

import java.util.Arrays;
import java.util.Optional;

public class ConsecutiveLetterCounter {

    //TODO :
    public String convert(String entry) {

        StringWithConsecutive a =Arrays.stream(entry.split(""))
                .map((b)-> new StringWithConsecutive(new ResultString(b,new Head(b, Optional.of(1))),b))
                .reduce(new StringWithConsecutive(new ResultString("",new Head("",Optional.empty())),""),
                        (result,head) -> {

                    String tail = "";
                    Integer size = 0;
                    Head headS = null;
                    if (head.actualLetter.equals(result.actualLetter)) {
                        tail = result.result.tail;
                        size = head.result.head.ocurrece() + result.result.head.ocurrece();
                        headS = new Head(head.actualLetter,Optional.of(size));
                    }else {
                        tail = result.result.tail.concat(result.result.head.toString());
                        size = head.result.head.ocurrece();
                        headS = new Head(head.actualLetter,Optional.of(size));
                    }
                    ResultString res =  new ResultString(tail, headS);
                    return new StringWithConsecutive(res, head.actualLetter);

                        });
            return a.result.toString();
    }

}
