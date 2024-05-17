import java.util.HashSet;
import java.util.Set;
public class hashing {
    public static void main(String[] args){
        Set<Integer> Hash = new HashSet<>();
        for(int i = 0; i<5; i++) {
            Hash.add(i);
        }
        System.out.println("The HashSet Contains: " + Hash);
        if(Hash.contains(4)) {
            System.out.println("Yes");
        }
        Hash.toArray();
        System.out.println(Hash);
        }
    }

