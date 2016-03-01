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
    private ArrayList<Report> reportList;
       
    /**
     * Empty constructor for the ReportHandler object
     */
    public ReportHandler()
    {
        reportList = new ArrayList<Report>();
    }
    
    /**
     * Gives the report at a given index
     * @param i the given index
     * @return the report located at the given index
     */
    public Report getReportAt(int i)
    {
        if ( !reportList.isEmpty() && i >= 0 && i < reportList.size())
        {
            return reportList.get(i);
        }
        else
        {
            return null;
        }
    }
    
    /**
     * Adds a given report to the report list
     * @param report a Report object
     */
    public void addReport(Report report)
    {
        reportList.add(report);
        if ( reportList.size() == 500 )
        {
            reportList.remove(0);
        }
    }
    
    /**
     * Removes a specific report from the list of reports
     * @param report the target report for removal
     * @return whether the report was removed successfully
     */
    public boolean removeReport(Report report)
    {
        if ( !reportList.isEmpty())
        {
            reportList.remove(report);
            return true;
        }
        return false;
    }
    
    /**
     * Clears all reports from the list
     */
    public void clear()
    {
        reportList.clear();
    }
    
    /**
     * Gives an up-to-date estimate of wait time for the eatery based on the 
     * latest traffic report.
     * @param currentTraffic - the traffic as last relayed from CNS
     * @param currentTime - the time of day, hours since midnight
     * @return the estimated wait time for the eatery
     */
    public double calculateWait(int currentTraffic, double currentTime)
    {
        BRAJMath doMath = new BRAJMath(reportList);
        double estimWait = doMath.getEstimate(currentTraffic, currentTime);
        return estimWait;
    }
    
    /**
     * Gives the number of reports in the handler
     * @return the number of reports in the handler
     */
    public int size()
    {
        return reportList.size();
    }
    
    /**
     * Gives a String representation of the report handler
     * @return the String representation of the report handler
     */
    public String toString()
    {
        String result = "";
        if ( !reportList.isEmpty())
        {
             for (Report rep : reportList)
            {
                result += rep.toString() + "\n";
            }
        }
        result += "----------\n";
        return result;
    }
}
