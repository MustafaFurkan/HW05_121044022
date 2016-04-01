import java.lang.reflect.Array;
import java.util.Stack;

/**
 * Iterative Tower Of Hanoi Game
 * Template towers must have smallest to higher
 * Created by Mustafa on 30.03.2016.
 */
public class Hanoi {
    int size;
    Tower[] towers;

    /**
     * Constructer
     * @param sticks stored pleace
     * @param sourceTower Tower of searched
     */
    Hanoi(int sticks, int sourceTower){
        size = sticks;
        towers = (Tower[]) Array.newInstance(Tower.class, 3);
        // Set towers
        for(int j=0; j<towers.length; ++j)
            towers[j] = new Tower(size);
        // Set sticks
        for(int j=sticks; j>=1; --j)
            towers[sourceTower].sticks.push(j);
    }

    /**
     * Tower class to keep sticks
     */
    class Tower{
        Stack<Integer> sticks;

        /**
         * Contructer
         * @param ignoreMe to Constructer
         */
        Tower(int ignoreMe){
            sticks = new Stack<Integer>();
        }
    }

    /**
     * Recursive game mod
     * @param diskLimit Check stack is done or not
     * @param src The object will be search
     * @param dst The destination variable
     * @param aux Buffer controll
     */
    void TowerOfHanoi(int diskLimit, Tower src, Tower dst, Tower aux){
        // Base case
        // Until tail of stack
        if(diskLimit == 1) {
            dst.sticks.push(src.sticks.pop());
        }else{
            // Call next variable in stack
            TowerOfHanoi(diskLimit-1, src, aux, dst);
            dst.sticks.push(src.sticks.pop());
            TowerOfHanoi(diskLimit-1, aux, dst, src);
        }
    }

    /**
     * Move sticks from tower to another tower
     * @param source searched stick number
     * @param buffer template place
     * @param destination target which stick will be stored
     */
    void move(int source, int buffer, int destination) {
        // Empty Tower errors
        if (towers[source].sticks.isEmpty()){
            System.out.println("Tower is empty!");
        }else {
            TowerOfHanoi(size, towers[source], towers[destination], towers[buffer]);
        }
    }
}