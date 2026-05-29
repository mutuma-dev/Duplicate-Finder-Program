import com.duplicate.DuplicateFinder;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

//uses Junit to do the tests

public class DuplicateFinderTest {

    //Method tests the behavior of our program when it receives an array with duplicates as input.
    @Test
    void testDuplicatesExist() {

        int[] numbers = {1,2,3,4,2,5,1}; //an array with duplicates integers

        List<Integer> expected = List.of(1, 2);  //list that is the expected result

        assertEquals(expected,
                DuplicateFinder.findDuplicates(numbers));   //check if result matches the expected result
    }

    //Method tests the behavior of our program when it receives an array with duplicates as input.
    @Test
    void testNoDuplicates() {

        int[] numbers = {1,2,3,4};   //declare an array with no duplicates

        List<Integer> expected = List.of(); //list that is expected result

        assertEquals(expected,
                DuplicateFinder.findDuplicates(numbers)); //check if result matches the expected result
    }
}