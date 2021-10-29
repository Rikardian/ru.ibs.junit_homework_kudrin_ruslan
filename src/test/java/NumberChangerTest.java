import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberChangerTest {
    private Solution solution;
    @BeforeEach
    void init(){
        solution = new Solution();
    }

    @Test
    public void testNumberChanger(){
        List<String> test1 = new ArrayList<>();
        test1.add("1");
        test1.add("Fizz");
        test1.add("Buzz");
        test1.add("8");
        test1.add("FizzBuzz");

        List<String> test2 = new ArrayList<>();
        test2.add("1");
        test2.add("3");
        test2.add("5");
        test2.add("8");
        test2.add("15");

        assertEquals(test1, solution.numberChanger(test2));
    }

}