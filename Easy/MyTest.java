import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class MyTest {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(1, 2);
        int x = 1 ^ 2 ^ 3 ^ 4 ^ 5;
        System.out.println(x);
    }

    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}