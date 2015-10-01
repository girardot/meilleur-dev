package common;

import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public abstract class AbstractTest {

    protected final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(null);
    }

    protected String readOutputFile(String outputFilename) throws IOException {
        List<String> lines= Files.readAllLines(Paths.get(outputFilename), Charset.forName("UTF-8"));
        String result = "";
        for (String line : lines) {
            result += line;
        }
        return result;
    }

}


