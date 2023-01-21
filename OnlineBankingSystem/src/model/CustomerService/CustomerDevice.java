package model.CustomerService;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;
import java.net.*;
import java.io.*;

/**
 *
 * @author gorubhambhani
 */
public class CustomerDevice implements ActionListener {

    JTextField text;
    JPanel a1;
    static Box vertical = Box.createVerticalBox();
    static JFrame f = new JFrame();
    static DataOutputStream douts;

    public CustomerDevice() {

        f.setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(7, 94, 84));
        p1.setBounds(0, 0, 450, 70);
        p1.setLayout(null);
        f.add(p1);
//        String currPath = System.getProperty("user.dir")+"/Source Packages";
//        Path userDirectory = Paths.get(currPath);
//        
//        Path filePath = Paths.get(userDirectory.toString()+"/ui/chat_icons","userIcon.png" );
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("ui/icons/3.png"));
        Image icon2 = icon1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon icon3 = new ImageIcon(icon2);
        JLabel back = new JLabel(icon3);
        back.setBounds(5, 20, 25, 25);
        p1.add(back);

        back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent ae) {
                System.exit(0);
            }
        });

        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("ui/icons/1.png"));
        Image icon5 = icon4.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon icon6 = new ImageIcon(icon5);
        JLabel profilePic = new JLabel(icon6);
        profilePic.setBounds(40, 10, 50, 50);
        p1.add(profilePic);

        JLabel name = new JLabel("Customer Support");
        name.setBounds(110, 15, 200, 18);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        p1.add(name);

        JLabel status = new JLabel("Online");
        status.setBounds(110, 35, 100, 18);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
        p1.add(status);

        a1 = new JPanel();
        a1.setBounds(5, 75, 440, 570);
        f.add(a1);

        text = new JTextField();
        text.setBounds(5, 655, 310, 40);
        text.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        f.add(text);

        JButton send = new JButton("Send");
        send.setBounds(320, 655, 123, 40);
        send.setBackground(new Color(7, 94, 84));
        send.setForeground(Color.BLACK);
        send.addActionListener(this);
        send.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        send.setOpaque(true);
        f.add(send);

        f.setSize(450, 700);
        f.setLocation(200, 50);
        f.setUndecorated(true);
        f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        try {
            String out = text.getText();

            Color c2 = new Color(37, 211, 102);
            JPanel p2 = formatLabel(out, c2);

            a1.setLayout(new BorderLayout());

            JPanel right = new JPanel(new BorderLayout());
            right.add(p2, BorderLayout.LINE_END);
            vertical.add(right);
            vertical.add(Box.createVerticalStrut(15));

            a1.add(vertical, BorderLayout.PAGE_START);

            douts.writeUTF(out);

            text.setText("");

            f.repaint();
            f.invalidate();
            f.validate();

        } catch (IOException e) {
        }
    }

    public static JPanel formatLabel(String out, Color color) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel output = new JLabel("<html><p style=\"width: 150px\">" + out + "</p></html>");
        output.setFont(new Font("Tahoma", Font.PLAIN, 16));
        output.setBackground(color);
        output.setOpaque(true);
        output.setBorder(new EmptyBorder(15, 15, 15, 50));

        panel.add(output);

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

        JLabel time = new JLabel();
        time.setText(sdf.format(cal.getTime()));

        panel.add(time);

        return panel;
    }

    public static void main(String[] args) throws EOFException {

        new CustomerDevice();
//        new CompanyDevice();

        try {
            ServerSocket skt = new ServerSocket(6001);
            
            while (true) {
                Socket s = skt.accept();
                DataInputStream dins = new DataInputStream(s.getInputStream());
                douts = new DataOutputStream(s.getOutputStream());

                while (true) {
                    String msg = dins.readUTF();
                    Color c = new Color(53, 183, 241);
                    JPanel panel = formatLabel(msg, c);

                    JPanel left = new JPanel(new BorderLayout());
                    left.add(panel, BorderLayout.LINE_START);
                    vertical.add(left);
                    f.validate();
                }
            }

        } catch (IOException e) {
        }
    }
}
