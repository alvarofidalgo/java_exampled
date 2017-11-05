package examples.counts.strings;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class ConsecutiveLetterCounterTest {

    ConsecutiveLetterCounter counter = new examples.counts.strings.ConsecutiveLetterCounter();

    @Test
    public void when_we_have_one_letter_result_should_be_this_letter_followed_by_one() {

        String entry ="a";
        String expected = "a1";
        assertThat(counter.convert(entry),is(expected));
    }


    @Test
    public void when_we_have_two_equals_letters_result_should_be_this_letters_followed_by_two(){
        String entry ="aaa";
        String expected = "a3";
        assertThat(counter.convert(entry),is(expected));
    }


    @Test
    public void when_we_have_two_equals_letters_and_and_other_result_should_be_two_letteres_followed_by_two_and_other_followed_by_one() {
            String entry ="aab";
            String expected = "a2b1";
            assertThat(counter.convert(entry),is(expected));
    }
}
