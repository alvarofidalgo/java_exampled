package examples.counts.strings;

import examples.counts.strings.builder.LetterStatus;
import examples.counts.strings.model.Head;
import examples.counts.strings.model.ResultString;
import examples.counts.strings.factorys.LetterStatusFactory;

import java.util.Arrays;
import java.util.Optional;

public class ConsecutiveLetterCounter {

    //TODO :
    public String convert(String entry) {

        ResultString a =Arrays.stream(entry.split(""))
                .map((b)-> new ResultString(b,new Head(b, Optional.of(1))))
                .reduce(new ResultString("",new Head("",Optional.empty())),
                        (result,head) -> {
                    LetterStatusFactory strategy = new LetterStatusFactory(result,head);
                    LetterStatus letterStatus = strategy.selectStatus(
                            (last,actual)-> last.actualLetter.equals(actual.actualLetter));
                    return letterStatus.build(result,head);
                        });
            return a.toString();
    }

}
