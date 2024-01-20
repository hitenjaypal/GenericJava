import java.util.*;

public class one {

    public static void main(String[] args) {
        // generic provide type safe
        // this code is type safe because isme <> generic mai integer put krdia hai so
        // only integer will run
        List<Integer> list = new ArrayList<>();
        // list.add("LCWD");
        list.add(123);

        // Below code Type safe nai hai toh run time mai error hoskta hai
        List anotherList = new ArrayList();
        anotherList.add("LCWD");
        anotherList.add(12);
        anotherList.add(12.12);

        System.out.println(list);
        System.out.println(anotherList);

    } 
}
