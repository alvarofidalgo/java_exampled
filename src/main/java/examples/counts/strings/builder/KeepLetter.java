package examples.counts.strings.builder;

import examples.counts.strings.model.Head;
import examples.counts.strings.model.ResultString;

import java.util.Optional;

public class KeepLetter implements LetterStatus{

    public ResultString build(ResultString last, ResultString actual) {
        String tail = last.tail;
        Integer size = actual.head.ocurrece() + last.head.ocurrece();
        Head headS = new Head(actual.head.actualLetter, Optional.of(size));
        return new ResultString(tail, headS);
    }
}
