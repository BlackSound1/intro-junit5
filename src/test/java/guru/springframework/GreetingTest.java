package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {
    private Greeting greeting;

    @BeforeAll
    static void beforeAll() {
        // Runs before anything in the Test class
        // Needs to be static
        System.out.println("Before all. Only called once!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In before each...");
        // Sets up a new Greeting object BeforeEach Test
        // So we don't need to write it each time
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("dude"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In after each...");
    }

    @AfterAll
    static void afterAll() {
        // Runs after everything in the Test class
        // Needs to be static
        System.out.println("After all. Only called once!");
    }
}