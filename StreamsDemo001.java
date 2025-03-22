import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo001 {
public static void main(String[] args) {
    List<String> words = Arrays.asList("apple", "children","banana", "cherry");    
    words.stream().filter(word -> word.length()>5).map(word-> word.toUpperCase()).sorted().collect(Collectors.toList()).forEach(System.out::println);
    
    
}
}
