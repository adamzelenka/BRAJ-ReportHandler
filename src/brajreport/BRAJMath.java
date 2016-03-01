package brajreport;
import java.util.ArrayList;
/**
 * BRAJMath.java
 *
 * Handles aggregate computations on database of user reports
 *
 * @author Robert Schofield
 * @author James McCray
 * @author Adam Zelenka
 * @author Brady Reisch
 * @version February 27, 2016: pre-alpha
 */
public class BRAJMath {
    
    private double[] waitTimeData; //the values of wait times
    private double[] trafficData;  //the values of traffic
    private double[] timeOfDayData; //values of the time of day
    private ArrayList<Report> reportList; //the reports
    
    
    
    /**
     * Constructor for BRAJMath object. Instantiates the report list and 
     * parses data 
     * @param reportList the list of reports, taken from report handler
     */
    public BRAJMath(ArrayList<Report> reportList)
    {
        this.reportList = reportList;
        int size = this.reportList.size();
        this.waitTimeData = new double[size];
        this.trafficData = new double[size];
        this.timeOfDayData = new double[size];
        for (int i = 0; i < size; i++)
        {
            this.waitTimeData[i] = (double)this.reportList.get(i).getWaitTime();
            this.trafficData[i] = (double)this.reportList.get(i).getTraffic();
            this.timeOfDayData[i] = this.reportList.get(i).getTimeOfDay();
        }
    }
    
    /**
     * Gives an estimated wait time for the eatery based on the current number
     * of people in the dining hall
     * @param traffic the number of people in the dining hall
     * @param time the time of day, number of hours since midnight
     * @return the estimated wait time
     */
    public double getEstimate(int traffic, double time)
    {
        
        return findCoef()[0] + traffic * findCoef()[1] + time * findCoef()[2];
    }
    /**
     * Computes a slope of a linear regression of wait times scattered 
     * against dining hall traffic data
     * @return the slope of the linear regression
     */
    private double[] findCoef()
    {
        double[] x1 = this.trafficData;
        double[] x2 = this.timeOfDayData;
        double[] y = this.waitTimeData;
        double[] slopes = new double[3];
        double num1 = (dotProduct(x2, x2) * dotProduct(x1, y)) - 
                (dotProduct(x1, x2) * dotProduct(x2, y));
        double den1 = (dotProduct(x1, x1) * dotProduct(x2, x2)) - 
                (dotProduct(x1, x2) * dotProduct(x1, x2));
        slopes[1] = num1 / den1;
        double num2 = (dotProduct(x1, x1) * dotProduct(x2, y)) - 
                (dotProduct(x1, x2) * dotProduct(x1, y));
        slopes[2] = num2 / den1;
        slopes[0] = computeMean(y) - slopes[1] * computeMean(x1) - 
                slopes[2] * computeMean(x2);
        return slopes;
    }
    
    /**
     * Computes the dot product of two arrays of doubles
     * 
     * pre: arrays are of the same length
     * @param x the first array
     * @param y the second array
     * @return the dot product
     */
    private double dotProduct(double[] x, double[] y)
    {
        double sum = 0;
        for (int i = 0; i < x.length; i++)
        {
            sum += (x[i] * y[i]);
        }
        return sum;
    }
    
    /**
     * Compute the mean of an array of doubles
     * @param x the input array
     * @return the mean of values in the array
     */
    private double computeMean(double[] x)
    {
        double sum = 0;
        int i = 0;
        if ( x.length == 0)
        {
            return 0;
        }
        else
        {
            for (i = 0; i < x.length; i++)
            {
                sum += x[i];
            }
            return sum / i;
        }
        
    }
    
    
    
}
