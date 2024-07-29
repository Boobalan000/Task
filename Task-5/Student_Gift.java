import java.util.List;
import java.util.Arrays;

class Student_Gift{
public static void main(String args [])
{
 List<String> list=Arrays.asList("Aravindh G","Aravindh N","Ashok kumar S","BavinKumar R","Bharathiraj S","Boopathi S","Balakrishnan R","Deepa R","Deepa G","Dhanush R");
        list.stream().filter(m->m.startsWith("A")).forEach(System.out::println);
}
}