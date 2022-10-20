import static org.junit.Assert.assertEquals;
 
import java.io.IOException;
 
import org.junit.Test;
 
public class DocSearchTest {
 
    @Test
    public void test1() throws IOException {
 
        Handler m = new Handler("/directory");
        assertEquals("Don't know how to handle that path!", m.handleRequest(null));
    }
 
}
