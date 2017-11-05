package examples.counts.letters;

import examples.counts.letter.LetterCount;
import examples.counts.letter.LetterOcurences;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;
import static  org.hamcrest.Matchers.is;

public class LetterCountTest {


    private LetterCount letterCount = new LetterCount();
    int first = 0;
    int second = 1;


    private List<LetterOcurences> generateList(LetterOcurences... elements) {
        List<LetterOcurences> ocuurence = new ArrayList<>();
        ocuurence.addAll(Arrays.asList(elements));
        return ocuurence;
    }

    @Test
    public void when_have_only_one_resul_should_be_one_this_letter(){
        String entry = "a";
        List<LetterOcurences> expected = generateList(new LetterOcurences("a",1));
        List<LetterOcurences> result = letterCount.count(entry);
        assertThat(result.get(first).letter,is(expected.get(first).letter));
        assertThat(result.get(first).ocurence,is(expected.get(first).ocurence));
    }

    @Test
    public void when_have_only_two_resul_should_be_two_this_letter(){
        String entry = "aa";
        List<LetterOcurences> expected = generateList(new LetterOcurences("a",2));
        List<LetterOcurences> result = letterCount.count(entry);
        assertThat(result.get(first).letter,is(expected.get(first).letter));
        assertThat(result.get(first).ocurence,is(expected.get(first).ocurence));
    }

    @Test
    public void when_have_two_diferents_letters_result_should_be_count_both(){
        String entry = "aba";
        List<LetterOcurences> expected = generateList(new LetterOcurences("a",2),new LetterOcurences("b",1));
        List<LetterOcurences> result = letterCount.count(entry);
        assertThat(result.get(second).letter,is(expected.get(first).letter));
        assertThat(result.get(second).ocurence,is(expected.get(first).ocurence));
        assertThat(result.get(first).letter,is(expected.get(second).letter));
        assertThat(result.get(first).ocurence,is(expected.get(second).ocurence));
    }
}
