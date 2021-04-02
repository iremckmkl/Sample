import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class HelloWorldTest {
    @Test
    void printhelloworldtest() {

        String expectedstring = "Hello World";

        assertEquals(expectedstring, HelloWorld.printhelloworld());

    }

}