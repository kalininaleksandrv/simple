import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class HelloWorldTest {

    @Mock
    HelloWorld helloWorld = new HelloWorld();

    @Test
    void hello() {
        String result  = helloWorld.hello();
        assertEquals("hello", result);
    }
}