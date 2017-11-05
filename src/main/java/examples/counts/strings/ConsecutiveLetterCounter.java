package examples.counts.strings;

import java.util.Arrays;
import java.util.Optional;

public class ConsecutiveLetterCounter {

    //TODO :
    public String convert(String entry) {

        StringWithConsecutive a =Arrays.stream(entry.split(""))
                .map((b)-> new StringWithConsecutive(new ResultString(b,new Head(b, Optional.of(1)))))
                .reduce(new StringWithConsecutive(new ResultString("",new Head("",Optional.empty()))),
                        (result,head) -> {

                    String tail = "";
                    Head headS = null;
                    if (head.result.head.actualLetter.equals(result.result.head.actualLetter)) {
                        tail = result.result.tail;
                        Integer size = head.result.head.ocurrece() + result.result.head.ocurrece();
                        headS = new Head(head.result.head.actualLetter,Optional.of(size));
                    }else {
                        tail = result.result.tail.concat(result.result.head.toString());
                        Integer size = head.result.head.ocurrece();
                        headS = new Head(head.result.head.actualLetter,Optional.of(size));
                    }
                    ResultString res =  new ResultString(tail, headS);
                    return new StringWithConsecutive(res);

                        });
            return a.result.toString();
    }

}
