package examples.counts.strings.model;



import java.util.Optional;

public class Head {


    public final String actualLetter;
    private  final Optional<Integer> ocurrece ;

    public Head(String actualLetter,Optional<Integer> ocurrece) {
        this.actualLetter = actualLetter;
        this.ocurrece = ocurrece;
    }


    public Integer ocurrece() {
      return  ocurrece.orElse(0);
    }


    public String toString  (){
        String strOcurrence = ocurrece.map(Object::toString).orElse("");
        return actualLetter.concat(strOcurrence);
    }
}
