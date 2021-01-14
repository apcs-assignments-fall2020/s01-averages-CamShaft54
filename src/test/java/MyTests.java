import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {

    @Test
    public void testMean() {
        double[][] m1 = {
            {1,  2,  4,  6},
            {7,  9,  10, 12},
            {14, 15, 17, 18},
            {22, 23, 27, 30}
        };

        double[][] m2 = { {1,  2,  4,  5,  6},
                          {7,  9,  10, 12, 13},
                          {14, 15, 17, 18, 20},
                          {22, 23, 27, 30, 32},
                          {33, 37, 38, 42, 44} };

        assertEquals(13.5625, MyMain.mean(m1), 0.1, "The expected output for the mean of double[][] \nm1 = { {1,  2,  4,  6}, \n       {7,  9,  10, 12},\n       {14, 15, 17, 18},\n       {22, 23, 27, 30} }; should be: " + 13.5625);
        assertEquals(19.24, MyMain.mean(m2), 0.1, "The expected output for the mean of double[][] \nm2 = { {1,  2,  4,  5,  6}, \n       {7,  9,  10, 12, 13},\n       {14, 15, 17, 18, 20},\n       {22, 23, 27, 30, 32},\n       {33, 37, 38, 42, 44} }; should be: " + 19.24);
    }

    @Test
    public void testMedian() {
        double[][] m1 = {
            {1,  2,  4,  6},
            {7,  9,  10, 12},
            {14, 15, 17, 18},
            {22, 23, 27, 30}
        };

        double[][] m2 = { {1,  2,  4,  5,  6},
                          {7,  9,  10, 12, 13},
                          {14, 15, 17, 18, 20},
                          {22, 23, 27, 30, 32},
                          {33, 37, 38, 42, 44} };

        double[][] m3 = { {1,  3,  4,  5},
                          {7,  9,  10, 12},
                          {14, 15, 17, 18} };

        assertEquals(13.0, MyMain.median(m1), 0.1, "The expected output for the median of double[][] \nm1 = { {1,  2,  4,  6}, \n       {7,  9,  10, 12},\n       {14, 15, 17, 18},\n       {22, 23, 27, 30} }; should be: " + 13.0);
        assertEquals(17.0, MyMain.median(m2), 0.1, "The expected output for the median of double[][] \nm2 = { {1,  2,  4,  5,  6}, \n       {7,  9,  10, 12, 13},\n       {14, 15, 17, 18, 20},\n       {22, 23, 27, 30, 32},\n       {33, 37, 38, 42, 44} }; should be: " + 17.0);
        assertEquals(9.5, MyMain.median(m3), 0.1, "The expected output for the median of double[][] \nm3 = { {1,  3,  4,  5}, \n       {7,  9,  10, 12},\n       {14, 15, 17, 18} }; should be: " + 9.5);
    }

    @Test
    public void testMode() {
        double[][] m4 = { {1,  2,  2,  2,  6},
                          {7,  9,  10, 11, 11},
                          {11, 11, 17, 18, 20} };

        assertEquals(11.0, MyMain.mode(m4), 0.1, "The expected output for the mode of double[][] \nm4 = { {1,  2,  2,  2,  6}, \n       {7,  9,  10, 11, 11},\n       {11, 11, 17, 18, 20} }; should be: " + 11.0);
        
        double[][] m5 = { {1,  1,  1,  1,  1} };
        assertEquals(1.0, MyMain.mode(m5), 0.1, "The expected output for the mode of double[][] m5 = { {1,  1,  1,  1,  1} }; should be: " + 1.0);
    }
}
