import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class MyTest {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(1, 2);
        HashMap<Integer,Integer> map2 = (HashMap<Integer,Integer>)map.clone();
        map2.put(2,3);
        System.out.println(map);
        System.out.println(map2);

        Queue<Integer> path = new LinkedList<Integer>()
    }
}