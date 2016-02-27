package brajreport;
import java.util.ArrayList;
/**
 * ReportHandler.java
 *
 * Class manages a list of Reports to send and receive from the server
 * database.
 * 
 * @author Robert Schofield
 * @author James McCray
 * @author Adam Zelenka
 * @author Brady Reisch
 * @version February 27, 2016: pre-alpha
 */
public class ReportHandler {
    
    //the list of Report objects
    private ArrayList<Report> reportList = new ArrayList<Report>();
    
    /**
     * Empty constructor for the ReportHandler object
     */
    public ReportHandler()
    {
        //This is an empty constructor
    }
    
    /**
     * Adds a given report to the report list
     * @param report a Report object
     */
    public void addReport(Report report)
    {
        reportList.add(report);
    }
    
    /**
     * 
     * @param report
     * @return 
     */
    public boolean removeReport(Report report)
    {
        return reportList.remove(report);
        
    }
    
    public void clear()
    {
        reportList.clear();
    }
    
    public ArrayList<Report> makeSomeRoom()
    {
        ArrayList<Report> removed = new ArrayList<Report>();
        for ( int i = 0; i < 20; i++)
        {
            removed.add(reportList.remove(i));
        }
        return removed;
    }
    
    
}
