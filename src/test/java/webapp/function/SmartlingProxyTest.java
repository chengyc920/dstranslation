package webapp.function;


import com.derbysoft.dhplatform.dhtranslation.proxy.impl.SmartlingProxyImpl;
import org.apache.http.HttpResponse;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class SmartlingProxyTest {
    private SmartlingProxyImpl smartlingProxy;

    @Before
    public void setup() {
        smartlingProxy = new SmartlingProxyImpl();
    }

    @Test
    public void testAuthenticate() throws IOException {
        String httpResponse = smartlingProxy.authenticate();
        System.out.print(httpResponse);
    }

    @Test
    public void testGetProject() {
        System.out.print(smartlingProxy.getProject("6a67d138c"));
    }
}
