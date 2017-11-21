/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew.hr;

import java.text.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Chalani
 */
public class validation {
      
    public void isBlank(String field,JLabel jLabel){    
    if(field.isEmpty()){
    jLabel.setText("Please enter a value");
    }
    else{
    jLabel.setText("");;
    }
    }
    
    public void isContact(String field,JLabel jLabel){
    if(field.length()==10){
    jLabel.setText("");
    }
    else{
    jLabel.setText("Please enter a valid contact");;
    }  
    }
    public void isMail(String field,JLabel jLabel){
    int count = 0;
    for (int i=0; i < field.length(); i++)
    {
        if (field.charAt(i) =='@')
        {
               count++;
        }
               if (count!=1) {
                   System.out.println(count);
                   jLabel.setText("Please enter a valid mail");
               }
               else{
                jLabel.setText("");
              } 
    }
    }

    public static boolean validateapp(String DOB,String app) {
        
        SimpleDateFormat dateFormat = new SimpleDateFormat ("dd/MM/yyyy");
        Date date1;
        try {
            date1 = dateFormat.parse(DOB);
            Date date2 = dateFormat.parse(app);
             if(date2.after(date1)) {
                return false;
            }
        else {
        return true;
             }
        } catch (ParseException ex) {
            Logger.getLogger(validation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
}
  
    public boolean doublecheck(String n)  
    {
        int numcount = 0;
   
        for(int i=0;i<n.length();i++)
            {
            char num = n.charAt(i);
            
            if((Character.isDigit(num)) || (num=='.') )
            {
                numcount++;
            }
            }
            if(numcount==n.length())
                return true;
            
            return false;
    } 
    
    
}

