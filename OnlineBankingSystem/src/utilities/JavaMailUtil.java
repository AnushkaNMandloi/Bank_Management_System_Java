/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import model.Customer.CustomerForm;

/**
 *
 * @author dattvi
 */
public class JavaMailUtil {
    
    public static boolean sendMail(CustomerForm form,String mailType) {
          System.out.println("Preparing Mail ");
          try{
        Properties prop =new Properties();
        prop.put("mail.smtp.auth","true");
        prop.put("mail.smtp.starttls.enable","true");
        prop.put("mail.smtp.host","smtp.gmail.com");
        prop.put("mail.smtp.port","587");
        
        String fromEmail="aedbnkadmn@gmail.com";
        String password = "iifymizvftfdvxox";
      
        Session session = Session.getInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail,password); 
            }
            
        });
        
        Message message = prepareMessage(session,fromEmail,form,mailType);
        Transport.send(message);
        System.out.println("Mail sent successfully");
        return true;
       }catch(Exception e){
             e.getMessage();
             e.printStackTrace();
             return false;
         }
       
        
    }
    
    private static Message prepareMessage(Session session,String fromEmail,CustomerForm form,String mailType){
        try {
            Message msg =new MimeMessage(session);
            msg.setFrom(new InternetAddress(fromEmail));
            msg.setRecipient(Message.RecipientType.TO, new InternetAddress(form.getEmailId()));
           
            if(mailType.equals("REGISTER")){
                msg.setSubject("DAG Int Fintech Account Login credentials");
                msg.setText("Hello "+form.getName()+",\n Here is your login id and passsword\n LOGIN ID: CT"+form.getId()+"\n PASSWORD: password");
            }else if(mailType.equals("CARDAPPLY")){
                 msg.setSubject("DAG Int Fintech Card application update ");
                msg.setText("Hello "+form.getName()+",\n Your card application has been successfully approved");
            }
            return msg;
            
        } catch (Exception ex) {
            Logger.getLogger(JavaMailUtil.class.getName()).log(Level.SEVERE, null, ex);
             return null;
        }
       
    }
}
