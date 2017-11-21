/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew.sales;

/**
 *
 * @author Thareendra
 */
public class bill_class {
    
    public String bill_num = "BI00000001";

    public String bill_num ()
{
        return bill_num ;
        
}
    public String bill_num_increment ()
    {
        
        String new_bill_num = "BI0000000" + (Integer.parseInt(bill_num.substring(8,bill_num.length()))+1);
        return new_bill_num;
        /*int int_bnum = Integer.parseInt(bill_num);
        int_bnum = int_bnum + 1;
        String st_bnum = Integer.toString(int_bnum);
        return st_bnum;*/
    }
    
}



