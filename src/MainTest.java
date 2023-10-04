import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void findMin() {

        assertEquals(3.0, Main.findMin(3, 4, 5));
        assertEquals(3.0, Main.findMin(5, 4, 3));
        assertEquals(0.1, Main.findMin(1, 2.2, 0.1));
    }
}