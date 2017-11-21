/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew.hr;

/**
 *
 * @author Chalani
 */
public class attendance
{    
    private String empid, dob;
    private double otHours, WorkingHours;

    public attendance(String empid,String dob,double otHours,double WorkingHours)
    {
        this.empid=empid;
        this.dob=dob;
        this.otHours=otHours;
        this.WorkingHours=WorkingHours;
    }
        
    public String getempid()
    {
        return empid;
    }
    
    public String getdob()
    {
        return dob;
    }
    
    public double getotHours(){
        return otHours;
    }

    public double getWorkingHours()
    {
        return WorkingHours;
    }
}
