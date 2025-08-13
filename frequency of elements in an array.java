import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] ar={1,4,4,3,2,8,3,3,4,8,2};
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        
        for (int e : ar) {
            hm.put(e, hm.getOrDefault(e, 0)+1);
        }
        
        System.out.println(hm);
    }
}

/*

Evaluate the key (num)

num is the element from your array.

This will be the key in the map.

Get the current count (or 0 if missing)

freqMap.getOrDefault(num, 0) looks up num in the map.

If num exists → returns its value (the current count).

If num doesn’t exist → returns 0 (does not insert anything yet).

default V getOrDefault(Object key,
 V defaultValue)
Returns the value to which the specified key is mapped, 
or defaultValue if this map contains no mapping for the key.

refer API Documentation for getOrDefault method

*/
