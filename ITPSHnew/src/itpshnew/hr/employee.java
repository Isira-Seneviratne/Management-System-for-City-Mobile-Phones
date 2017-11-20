/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew.hr;

/**
 *
 * @author yesilmalaka
 */
public class employee {
    
    
  
        private String empid;
        private String empname;
        private String dob;
        private String empaddress;
        private String empemail;
        private int empphone;
        private String jobid;
        private String jobDate;
        private double bSal;
        private double otrate;
        
        public employee(String empid,String empname,String dob,String empaddress,String empemail,int empphone,String jobid,String jobDate,double bSal,double otrate){
       
       this.empid=empid;
       this.empname=empname;
       this.dob=dob;
       this.empaddress=empaddress;
       this.empemail=empemail;
       this.empphone=empphone;
       this.jobid=jobid;
       this.jobDate=jobDate;
       this.bSal=bSal;
       this.otrate=otrate;       
    }
         public String getempid(){
             return empid;
            }
         public String getempname(){
            return empname;
    }
         public String getdob(){
             return dob;
         }
         public String getempaddress(){
             return empaddress;
         }
         public String getempemail(){
             return empemail;
         }
        
         public int getempphone(){
             return empphone;
         }
         
         public String getjobid(){
             return jobid;
            }
         
         public String getjobDate(){
             return jobDate;
         }
         
         public double getbSal(){
             return bSal;
         }
         
          public double getotrate(){
             return otrate;
         }
}



