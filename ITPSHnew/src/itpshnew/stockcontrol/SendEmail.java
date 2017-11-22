package itpshnew.stockcontrol;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;

public class SendEmail
{
    public static void sendEmail(String to, String name, String Brand, String Item, String qty)
    {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

        Session session = Session.getInstance(props,
          new Authenticator()
          {
            @Override
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication("citymobileofficial@gmail.com", "sonal1234");
            }
          });

        try
        {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("no-reply@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(to));
            message.setSubject("Re-Order for City Mobiles");
            message.setText("City Mobiles would like to Re-Order your Item, "+Brand+" "+Item+" for a Quantity of "+qty+". Please Confirm this order to our Hotline 011-2952177/0777303322. Thankyou");
            
            Transport.send(message);

            JOptionPane.showMessageDialog(null, "Email sent successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (MessagingException e) 
        {
            JOptionPane.showMessageDialog(null, "An error occurred while sending the email.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}