package Arrays;
import java.util.*;

public class HouseAllotment {
    public static int homeless(int house[], int people[]){
        HashMap<Integer, Boolean> map = new HashMap<>();
        int count = 0;

        // Initialize the map with houses as unoccupied
        for (int i = 0; i < house.length; i++) {
            map.put(house[i], false);
        }

        for (int i = 0; i < people.length; i++) {
            boolean allocated = false;
            for (int j = 0; j < house.length; j++) {
                if (!map.get(house[j]) && house[j] >= people[i]) {
                    map.put(house[j], true); // Allocate house
                    allocated = true;
                    break;
                }
            }
            if (!allocated) {
                count++; // If not allocated, increase homeless count
            }
        }
        return count;
    }

    public static void main(String[] args){
        int house[] = {1, 9, 4};
        int people[] = {3, 8, 5};
        int res = homeless(house, people);
        System.out.print(res);
    }
}
