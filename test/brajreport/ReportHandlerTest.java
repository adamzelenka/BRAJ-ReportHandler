package brajreport;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * ReportHandlerTest.java
 *
 * JUnit test suite for ReportHandler class
 *
 * @author Robert Schofield
 * @author James McCray
 * @author Adam Zelenka
 * @author Brady Reisch
 * @version February 27, 2016: pre-alpha
 */
public class ReportHandlerTest {
    
    public ReportHandlerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addReport method, of class ReportHandler.
     */
    @Test
    public void testAddReport() {
        System.out.println("addReport");
        Report report = null;
        ReportHandler instance = new ReportHandler();
        instance.addReport(report);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeReport method, of class ReportHandler.
     */
    @Test
    public void testRemoveReport() {
        System.out.println("removeReport");
        Report report = null;
        ReportHandler instance = new ReportHandler();
        boolean expResult = false;
        boolean result = instance.removeReport(report);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class ReportHandler.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        ReportHandler instance = new ReportHandler();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeSomeRoom method, of class ReportHandler.
     */
    @Test
    public void testMakeSomeRoom() {
        System.out.println("makeSomeRoom");
        ReportHandler instance = new ReportHandler();
        ArrayList<Report> expResult = null;
        ArrayList<Report> result = instance.makeSomeRoom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
