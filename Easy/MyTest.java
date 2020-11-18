import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class MyTest {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(1, 2);
        StringBuilder path  = new StringBuilder();
        path.append('a');
        path.append('b');
        System.out.println(path.length());
    }
}