/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales_package;

/**
 *
 * @author Thareendra
 */
public class customer_class {
    
    public String bill_num = "CI00000001";

    public String cus_num ()
    {
        return bill_num ;    
    }
    
    public String cus_num_increment ()
    {
        
        return "BI0000000" + (Integer.parseInt(bill_num.substring(8,bill_num.length()))+1);
        /*int int_bnum = Integer.parseInt(bill_num);
        int_bnum = int_bnum + 1;
        String st_bnum = Integer.toString(int_bnum);
        return st_bnum;*/
    }
    
}