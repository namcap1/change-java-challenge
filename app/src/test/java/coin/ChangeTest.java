/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package coin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChangeTest {
    @Test void givesCorrectChangefor1() {
        int[] coins = {4, 3, 1};
        int[] expected = {0, 0, 1};
        Change classUnderTest = new Change(1, coins);
        assertArrayEquals(classUnderTest.workoutChange(), expected);
    }
    @Test void givesCorrectChangefor5() {
        int[] coins = {4, 3, 1};
        Change classUnderTest = new Change(5, coins);
        int[] expected = {1, 0, 1};
        assertArrayEquals(classUnderTest.workoutChange(), expected);
    }
    @Test void givesCorrectChangefor6() {
        int[] coins = {4, 3, 1};
        Change classUnderTest = new Change(6, coins);
        int[] expected = {0, 2, 0};
        assertArrayEquals(classUnderTest.workoutChange(), expected);
    }
    @Test void givesCorrectChangefor12() {
        int[] coins = {4, 3, 1};
        Change classUnderTest = new Change(12, coins);
        int[] expected = {3, 0, 0};
        assertArrayEquals(classUnderTest.workoutChange(), expected);
    }
    @Test void givesCorrectChangefor17() {
        int[] coins = {4, 3, 1};
        Change classUnderTest = new Change(17, coins);
        int[] expected = {4, 0, 1};
        assertArrayEquals(classUnderTest.workoutChange(), expected);
    }
    @Test void givesCorrectChangefor75(){
        int[] coins = {25, 10, 5, 1};
        Change classUnderTest = new Change(75, coins);
        int[] expected = {3, 0, 0, 0};
        assertArrayEquals(classUnderTest.workoutChange(), expected);
    }
}
