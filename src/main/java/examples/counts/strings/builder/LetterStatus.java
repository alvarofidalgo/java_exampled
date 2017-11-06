package examples.counts.strings.builder;

import examples.counts.strings.model.ResultString;

public interface LetterStatus {

    public ResultString build(ResultString last, ResultString actual);
}
