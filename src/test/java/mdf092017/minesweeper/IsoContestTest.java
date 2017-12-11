package mdf092017.minesweeper;

import common.AbstractTest;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.FileInputStream;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class IsoContestTest extends AbstractTest {

    @Test
    @Parameters({
            "src/test/resources/mdf092017/minesweeper/input1.txt,src/test/resources/mdf092017/minesweeper/output1.txt",
            "src/test/resources/mdf092017/minesweeper/input2.txt,src/test/resources/mdf092017/minesweeper/output2.txt",
            "src/test/resources/mdf092017/minesweeper/input3.txt,src/test/resources/mdf092017/minesweeper/output3.txt",
            "src/test/resources/mdf092017/minesweeper/input4.txt,src/test/resources/mdf092017/minesweeper/output4.txt",
            "src/test/resources/mdf092017/minesweeper/input5.txt,src/test/resources/mdf092017/minesweeper/output5.txt",
            "src/test/resources/mdf092017/minesweeper/input6.txt,src/test/resources/mdf092017/minesweeper/output6.txt"}
    )
    public void should_test_exo(String inputFileName, String outputFileName) throws Exception {
        // Given
        System.setIn(new FileInputStream(inputFileName));

        // When
        IsoContest.main(null);

        //Then
        assertThat(outContent.toString().trim()).isEqualTo(readOutputFile(outputFileName));
    }

}