package com.isograd.exercice;

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
            "src/test/resources/com/isograd/exercice/input1.txt,src/test/resources/com/isograd/exercice/output1.txt",
            "src/test/resources/com/isograd/exercice/input2.txt,src/test/resources/com/isograd/exercice/output2.txt",
            "src/test/resources/com/isograd/exercice/input3.txt,src/test/resources/com/isograd/exercice/output3.txt",
            "src/test/resources/com/isograd/exercice/input4.txt,src/test/resources/com/isograd/exercice/output4.txt",
            "src/test/resources/com/isograd/exercice/input5.txt,src/test/resources/com/isograd/exercice/output5.txt",
            "src/test/resources/com/isograd/exercice/input6.txt,src/test/resources/com/isograd/exercice/output6.txt"
    })
    public void should_test_exo(String inputFileName, String outputFileName) throws Exception {
        // Given
        System.setIn(new FileInputStream(inputFileName));

        // When
        com.isograd.exercice.IsoContest.main(null);

        //Then
        assertThat(outContent.toString().trim()).isEqualTo(readOutputFile(outputFileName));
    }

}