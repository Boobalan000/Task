import java.util.List;
import java.util.Arrays;

class EmptyChecker{
    public static void main(String[] args) {
        
        List<String> list=Arrays.asList("abc","","bc","efg","abcd","","jkl");
        list.stream().filter(m->!m.isEmpty()).forEach(n->System.out.println(n));
    }
}