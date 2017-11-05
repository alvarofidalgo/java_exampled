package examples.counts.strings;

public class Head {


    public final String actualLetter;
    public final Integer ocurrece ;

    public Head(String actualLetter,Integer ocurrece) {
        this.actualLetter = actualLetter;
        this.ocurrece = ocurrece;
    }


    public String toString  (){
        String strOcurrence = ocurrece==0?"":ocurrece.toString();
        return actualLetter.concat(strOcurrence);
    }
}
