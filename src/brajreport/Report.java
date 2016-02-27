package brajreport;

/**
 * Report.java
 *
 * This class holds all raw data for a user report. A report is submitted from
 * the app user's phone to the database, which performs all aggregate 
 * computations.
 *
 * @author Robert Schofield
 * @author James McCray
 * @author Adam Zelenka
 * @author Brady Reisch
 * @version February 27, 2016: pre-alpha
 */
public class Report {
    
    private String eatery; //the eatery for which the user stood in line
    private String diningHall; //the dining hall at which the eatery is located
    private int traffic;   //the number of people in the dining hall, taken from 
                           //the most recent CNS report
    private double timeOfDay; //hours since midnight of the current day
    private int waitTime;  //the number of minutes spent waiting in line
    
    /**
     * Constructor for Report object
     * @param eatery the eatery for which the user stood in line
     * @param diningHall the dining hall at which the eatery is located
     * @param traffic the number of people in the dining hall
     * @param waitTime hours since midnight of the current day
     * @param timeOfDay number of minutes spent waiting in line
     */
    public Report(String eatery, String diningHall, int traffic, int waitTime, 
            double timeOfDay)
    {
        this.eatery = eatery;
        this.diningHall = diningHall;
        this.traffic = traffic;
        this.waitTime = waitTime;
        this.timeOfDay = timeOfDay; 
    }
    
    /**
     * Default constructor for the Report object
     */
    public Report()
    {
        this.eatery = "";
        this.diningHall = "";
        this.traffic = 0;
        this.waitTime = 0;
        this.timeOfDay = 0.0;
    }
    
    /**
     * Gets the eatery
     * @return eatery the eatery for which the user stood in line
     */
    public String getEatery()
    {
        return eatery;
    }
    
    /**
     * Gets the dining hall
     * @return the dining hall at which the eatery is located
     */
    public String getDiningHall()
    {
        return diningHall;
    }
    
    /**
     * Gets the number of people in the dining hall
     * @return traffic the number of people in the dining hall
     */
    public int getTraffic()
    {
        return traffic;
    }
    
    /**
     * Gets the wait time
     * @return waitTime the time the user spent waiting in line
     */
    public int getWaitTime()
    {
        return waitTime;
    }
    
    /**
     * Gets the time of day
     * @return timeOfDay the number of hours since midnight of the current day
     */
    public double getTimeOfDay()
    {
        return timeOfDay;
    }
    
    /**
     * Sets the eatery to a given name
     * @param eat the name of the eatery
     */
    public void setEatery(String eat)
    {
        this.eatery = eat;
    }
    
    /**
     * Sets the dining hall to a given name
     * @param dining the dining hall at which the eatery is located
     */
    public void setDiningHall(String dining)
    {
        this.diningHall = dining;
    }
    
    /**
     * Sets the traffic to a given value
     * @param traf the number of people in the dining hall
     */
    public void setTraffic(int traf)
    {
        this.traffic = traf;
    }
    
    /**
     * Sets the wait time to a given value
     * @param wait the time spent waiting in line
     */
    public void setWaitTime(int wait)
    {
        this.waitTime = wait;
    }
    
    /**
     * Sets the time of day to a given value
     * @param time the hours since midnight of the current day
     */
    public void setTimeOfDay(double time)
    {
        this.timeOfDay = time;
    }
    
    /**
     * Determines if the Report object is equal to another object
     * @param o the other object
     * @return true if the reports are equal, false if otherwise
     */
    @Override
    public boolean equals(Object o)
    {
        if (o == null) { return false; }
        else if (o instanceof Report)
        {
            if (this.diningHall.equals(((Report)o).getDiningHall()) && 
                    this.eatery.equals(((Report)o).getEatery()) && 
                    this.traffic == ((Report)o).getTraffic() && 
                    this.waitTime == ((Report)o).getWaitTime() &&
                    this.timeOfDay == ((Report)o).getTimeOfDay())
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else { return false; }
    }
    
    /**
     * Creates a String representation of the Report object
     * @return the String representation of the Report object
     */
    @Override
    public String toString()
    {
        return "Dining Hall: " + this.diningHall + "\nEatery: " + this.eatery + 
                "\nTime: [" + this.timeOfDay + "]\nPeople in the dining hall: " 
                + this.traffic + "\nWait time: " + this.waitTime + "minutes\n";
    }
    
    
}
