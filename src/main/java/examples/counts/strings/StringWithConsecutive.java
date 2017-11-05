package examples.counts.strings;

public class StringWithConsecutive {

    public final String actualLetter;
    public final Integer actualSize;
    public final ResultString result;

    public StringWithConsecutive(ResultString result,String actualLetter,Integer actualSize) {
        this.result = result;
        this.actualSize = actualSize;
        this.actualLetter = actualLetter;
    }
}
