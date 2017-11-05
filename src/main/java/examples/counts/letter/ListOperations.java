package examples.counts.letter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOperations<T>{

    private List<T> list;

    public ListOperations(List<T> list) {
         this.list = list;
    }

    public List<T> remove(Predicate<? super T> predicate){
        return list.stream()
                .filter(predicate)
                .collect(Collectors.toCollection(ArrayList::new));
    }



}
