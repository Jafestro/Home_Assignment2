import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class ArrayEqualityTest {

    @Test
    public void testSingleDimensionalArrayEquality() {
        int[] a1 = { 2, 3, 5, 7 };
        int[] a2 = { 2, 3, 5, 8 }; // Changed last element to make arrays not equal
        assertArrayEquals(a1, a2, "Should be equal");
    }

    @Test
    public void testMultiDimensionalArrayEquality() {
        int[][] a11 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        int[][] a12 = { { 2, 3 }, { 5, 7 }, { 11, 14 } }; // Changed last element to make arrays not equal
        assertArrayEquals(a11, a12, "Should be equal");
    }
    
    @Test
    public void testDifferentTypesArrayEquality() {
        // Test for String arrays
        String[] s1 = { "apple", "banana", "cherry" };
        String[] s2 = { "apple", "banana", "cherry" };
        assertArrayEquals(s1, s2, "String arrays should be equal");

        // Test for double arrays
        double[] d1 = { 1.1, 2.2, 3.3 };
        double[] d2 = { 1.1, 2.2, 3.3 };
        assertArrayEquals(d1, d2, "Double arrays should be equal");
    }
}