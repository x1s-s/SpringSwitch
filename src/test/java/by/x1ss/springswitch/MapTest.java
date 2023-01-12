package by.x1ss.springswitch;

import by.x1ss.springswitch.model.Client;
import by.x1ss.springswitch.service.Impl.ItCompanyImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;

@SpringBootTest
public class MapTest {
    Client[] client = {
            new Client("Ivan", "back-end"),
            new Client("Petr", "front-end"),
            new Client("Sidor", "full-stack"),
    };
    @Autowired
    ItCompanyImpl itCompany;
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new java.io.PrintStream(outContent));
    }

    @Test
    void testsBack() {
        itCompany.processClient(client[0]);
        String RightAnswer = "Processing client Ivan" + (char) 13 + "\n" +
                "Back-end developer create back-end for Ivan" + (char) 13 + "\n";
        Assertions.assertEquals(RightAnswer, outContent.toString());
        outContent.reset();
    }

    @Test
    void testFront() {
        itCompany.processClient(client[1]);
        String rightOutput = "Processing client Petr" + (char) 13 + "\n" +
                "Front-end developer create UI for Petr" + (char) 13 + "\n";
        Assertions.assertEquals(rightOutput, outContent.toString());
        outContent.reset();
    }

    @Test
    void testDefault() {
        itCompany.processClient(client[2]);
        String rightOutput = "Processing client Sidor" + (char) 13 + "\n" +
                "Default employee is processing task for client Sidor" + (char) 13 + "\n";
        Assertions.assertEquals(rightOutput, outContent.toString());
        outContent.reset();
    }

    @AfterEach
    void tearDown() {
        System.setOut(System.out);
    }
}
