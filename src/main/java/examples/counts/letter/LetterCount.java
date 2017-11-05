package examples.counts.letter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final public class LetterCount {
    public LetterCount() {
    }

    private List<LetterOcurences> init () {
         return new ArrayList<>();
    }

    public final  List<LetterOcurences> count(String entry) {
        return Arrays.stream(entry.split(""))
                .map((letter)-> new LetterOcurences(letter,1))
                .reduce(init(),
                        (result, head) -> {
                            result.add(head);
                            ListOperations<LetterOcurences> opList = new ListOperations<>(result);
                            List<LetterOcurences> newList = opList.remove((a) -> !a.letter.equals(head.letter));
                            LetterOcurences ocurrences = opList.remove((oc) -> oc.letter.equals(head.letter))
                                    .stream()
                                    .reduce((a,b)->
                                            new LetterOcurences(a.letter, a.ocurence + b.ocurence)
                                    ).get();
                            newList.add(ocurrences);
                            return newList;
                        },
                        (a, b) -> a);

    }
}
