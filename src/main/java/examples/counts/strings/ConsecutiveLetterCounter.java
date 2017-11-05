package examples.counts.strings;

import examples.counts.strings.builder.ChangeLetter;
import examples.counts.strings.builder.KeepLetter;
import examples.counts.strings.builder.LetterStatus;
import examples.counts.strings.model.Head;
import examples.counts.strings.model.ResultString;

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
                    LetterStatus letterStatus = null;
                    if (head.head.actualLetter.equals(result.head.actualLetter)) {
                        letterStatus = new KeepLetter();
                    }else {
                        letterStatus = new ChangeLetter();

                    }
                    return letterStatus.build(result,head);
                        });
            return a.toString();
    }

}
