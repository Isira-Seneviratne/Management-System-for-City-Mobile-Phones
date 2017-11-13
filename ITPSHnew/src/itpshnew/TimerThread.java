/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew;

import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;

/**
 *
 * @author isira
 */
public class TimerThread extends Thread
{
    private JLabel time;
    private boolean running;
    private SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");

    public TimerThread(JLabel time)
    {
        this.time = time;
        running = true;
    }

    public void setRunning(boolean running)
    {
        this.running = running;
    }

    public void run()
    {
        while(running)
        {
            SwingUtilities.invokeLater(new Runnable()
            {
                public void run()
                {
                    time.setText(timeFormat.format(Calendar.getInstance().getTime()));
                }
            });
            try
            {
                sleep(1000);
            }
            catch(InterruptedException e)
            {
                JOptionPane.showMessageDialog(null, "There was an issue with the clock.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
