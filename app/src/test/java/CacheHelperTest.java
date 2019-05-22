import com.limelight.utils.CacheHelper;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class CacheHelperTest {

    @Mock
    private CacheHelper cacheHelper;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    private String testSentence = "This is a test for the moonlight application";


    @Test
    public void retrieveStringsFromBytes() {
        InputStream inputStream = new ByteArrayInputStream(testSentence.getBytes(Charset.forName("UTF-8")));
//            String result = cacheHelper.readInputStreamToString(inputStream);
    }
}
