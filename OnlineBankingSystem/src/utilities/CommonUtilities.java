/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author dattvi
 */
public class CommonUtilities {
    
    static public String currDatetime(){
        Format f = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = f.format(new Date());
        return strDate;
    }
}
