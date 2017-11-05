package examples.counts.strings;

import examples.counts.letter.LetterOcurences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsecutiveLetterCounter {

    //TODO :
    public String convert(String entry) {

        StringWithConsecutive a =Arrays.stream(entry.split(""))
                .map((b)-> new StringWithConsecutive(new ResultString(b,b),b,1))
                .reduce(new StringWithConsecutive(new ResultString("",""),"",0),
                        (result,head) -> {

                    String tail = result.result.tail.concat(result.result.head);
                    Integer size = head.actualSize;
                    if (head.actualLetter.equals(result.actualLetter)) {
                        tail = result.result.tail;
                        size = head.actualSize + result.actualSize;
                    }
                    String headS = head.actualLetter.concat(size.toString());
                    ResultString res =  new ResultString(tail, headS);
                    return new StringWithConsecutive(res, head.actualLetter, size);

                        });
            return a.result.toString();
    }

}
