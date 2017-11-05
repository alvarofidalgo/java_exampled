package examples.counts.strings;



import java.util.Optional;

public class Head {


    public final String actualLetter;
    public final Optional<Integer> ocurrece ;

    public Head(String actualLetter,Optional<Integer> ocurrece) {
        this.actualLetter = actualLetter;
        this.ocurrece = ocurrece;
    }


    public String toString  (){
        String strOcurrence = ocurrece.map(Object::toString).orElse("");
        return actualLetter.concat(strOcurrence);
    }
}
