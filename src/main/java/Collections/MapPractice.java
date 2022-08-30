package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        Stack stack = new Stack();
        for(Object key : map.keySet()){
            if(map.get(key)==value){
                stack.push(key);
            }
        }
        return stack.toArray();
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        if(size<1){
            return map;
        }
        map.put(1,1);
        if(size<2){
            return map;
        }
        map.put(2,1);
        for(int i=3;i<=size;i++){
            map.put(i,map.get(i-1)+ map.get(i-2));
        }
        return map;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        if(size<1){
            return map;
        }
        map.put(1,first);
        if(size<2){
            return map;
        }
        map.put(2,second);
        for(int i=3;i<=size;i++){
            map.put(i,map.get(i-1)+ map.get(i-2));
        }
        return map;
    }
}
