package examples.counts.strings;

public class StringOperations {

    public final String str;

    public StringOperations(String str){
        this.str = str;
    }

    public Boolean lastLetterEquaslTo(String letter) {
        return str.substring(str.length() - 1).equals(letter);
    }
}
