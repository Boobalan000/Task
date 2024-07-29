import java.util.stream.Stream;

class StringConverter{

    public static void main(String[] args) {
        Stream<String> stream=Stream.of("aBc","d","ef");
        stream.map(m->m.toUpperCase()).forEach(n->System.out.println(n));
    }
}