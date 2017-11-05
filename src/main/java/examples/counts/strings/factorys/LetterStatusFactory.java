package examples.counts.strings.factorys;

import examples.counts.strings.builder.ChangeLetter;
import examples.counts.strings.builder.KeepLetter;
import examples.counts.strings.builder.LetterStatus;
import examples.counts.strings.model.Head;
import examples.counts.strings.model.ResultString;

import java.util.function.BiFunction;

public class LetterStatusFactory {

    private final ResultString last, actual;

    public LetterStatusFactory(ResultString last, ResultString actual){

        this.last = last;
        this.actual = actual;
    }

    public LetterStatus selectStatus(BiFunction<Head,Head,Boolean> condition) {
        if (condition.apply(last.head,actual.head)) {
            return new KeepLetter();

        }else {
            return new ChangeLetter();

        }
    }
}
