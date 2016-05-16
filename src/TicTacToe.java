/**
 * Created by Frank Hall on 5/15/2016.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TicTacToe extends JFrame implements ActionListener // begin class
{
    private JLabel title; // variable decleration and swing object creation
    private JLabel header;
    public JButton button1;
    public JButton button2;
    public JButton button3;
    public JButton button4;
    public JButton button5;
    public JButton button6;
    public JButton button7;
    public JButton button8;
    public JButton button9;
    private boolean isDone = false;
    private boolean playersTurn = true;


    public TicTacToe(){ // constructor
        super("Tic Tac Toe");
        JPanel panel = new JPanel();
        setVisible(true);
        setSize(450, 450);
        panel.setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(panel);
        title = new JLabel("Tic Tac Toe");  // creates labels and buttons needed for program. also sets the objects where needed and sets font type and size.
        title.setBounds(150, -10, 150, 150);
        title.setFont(new Font("Arial", Font.BOLD, 26));
        header = new JLabel("Choose One Button");
        header.setBounds(140, 30, 175, 150);
        header.setFont(new Font("Arial", Font.PLAIN, 18));
        button1 = new JButton();
        button1.setBounds(130, 130, 50, 50);
        button1.setFont(new Font("Arial", Font.PLAIN, 26));
        button2 = new JButton();
        button2.setBounds(195, 130, 50, 50);
        button2.setFont(new Font("Arial", Font.PLAIN, 26));
        button3 = new JButton();
        button3.setBounds(260, 130, 50, 50);
        button3.setFont(new Font("Arial", Font.PLAIN, 26));
        button4 = new JButton();
        button4.setBounds(130, 190, 50, 50);
        button4.setFont(new Font("Arial", Font.PLAIN, 26));
        button5 = new JButton();
        button5.setBounds(195, 190, 50, 50);
        button5.setFont(new Font("Arial", Font.PLAIN, 26));
        button6 = new JButton();
        button6.setBounds(260, 190, 50, 50);
        button6.setFont(new Font("Arial", Font.PLAIN, 26));
        button7 = new JButton();
        button7.setBounds(130, 250, 50, 50);
        button7.setFont(new Font("Arial", Font.PLAIN, 26));
        button8 = new JButton();
        button8.setBounds(195, 250, 50, 50);
        button8.setFont(new Font("Arial", Font.PLAIN, 26));
        button9 = new JButton();
        button9.setBounds(260, 250, 50, 50);
        button9.setFont(new Font("Arial", Font.PLAIN, 26));
        panel.add(title); // adds the objects to the frame
        panel.add(header);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        button1.setEnabled(true);//  sets all buttons to enabled
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        button1.addActionListener(this);// adds action listeners for all buttons
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
    }
    public static void main(String[] args){
        new TicTacToe(); // creates a new constrctor object?
        JOptionPane.showMessageDialog(null,"Player will Start.\n" + "Player will have X's and Computer will O's.\n");// starting instructions
    }

    //ActionListener
    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if(isDone == false){ //if statements to see if there was a winner or not yet and to do all the code below.

            if (playersTurn == true)// handles players turn
            {
                if(source == button1)
                {
                    button1.setEnabled(false);
                    button1.setText("x");
                    playersTurn = false;
                }

                if(source == button2)
                {
                    button2.setEnabled(false);
                    button2.setText("x");
                    playersTurn = false;
                }

                if(source == button3){
                    button3.setEnabled(false);
                    button3.setText("x");
                    playersTurn = false;
                }

                if(source == button4){
                    button4.setEnabled(false);
                    button4.setText("x");
                    playersTurn = false;
                }

                if(source == button5){
                    button5.setEnabled(false);
                    button5.setText("x");
                    playersTurn = false;
                }

                if(source == button6){
                    button6.setEnabled(false);
                    button6.setText("x");
                    playersTurn = false;
                }

                if(source == button7){
                    button7.setEnabled(false);
                    button7.setText("x");
                    playersTurn = false;
                }

                if(source == button8){
                    button8.setEnabled(false);
                    button8.setText("x");
                    playersTurn = false;

                }

                if(source == button9){
                    button9.setEnabled(false);
                    button9.setText("x");
                    playersTurn = false;
                }
                do { // handles computers turn
                    int randNum = (int) ((Math.random()  *100 ) %9 + 1);
                    switch (randNum)
                    {
                        case 1:
                            if (button1.isEnabled() == true)
                            {
                                button1.setText("o");
                                playersTurn = true;
                                button1.setEnabled(false);
                            }
                            break;
                        case 2:
                            if (button2.isEnabled() == true)
                            {
                                button2.setText("o");
                                playersTurn = true;
                                button2.setEnabled(false);
                            }
                            break;
                        case 3:
                            if (button3.isEnabled() == true)
                            {
                                button3.setText("o");
                                playersTurn = true;
                                button3.setEnabled(false);
                            }
                            break;
                        case 4:
                            if (button4.isEnabled() == true)
                            {
                                button4.setText("o");
                                playersTurn = true;
                                button4.setEnabled(false);
                            }
                            break;
                        case 5:
                            if (button5.isEnabled() == true)
                            {
                                button5.setText("o");
                                playersTurn = true;
                                button5.setEnabled(false);
                            }
                            break;
                        case 6:
                            if (button6.isEnabled() == true)
                            {
                                button6.setText("o");
                                playersTurn = true;
                                button6.setEnabled(false);
                            }
                            break;
                        case 7:
                            if (button7.isEnabled() == true)
                            {
                                button7.setText("o");
                                playersTurn = true;
                                button7.setEnabled(false);
                            }
                            break;
                        case 8:
                            if (button8.isEnabled() == true)
                            {
                                button8.setText("o");
                                playersTurn = true;
                                button8.setEnabled(false);
                            }
                            break;
                        case 9:
                            if (button9.isEnabled() == true)
                            {
                                button9.setText("o");
                                playersTurn = true;
                                button9.setEnabled(false);
                            }
                            break;
                    }
                } while (playersTurn == false);
            }
            else{
                JOptionPane.showMessageDialog(null, "We have a winner");
            }
        }
        // if statment to check for a winner
        if(button1.getText().equals("x") && button2.getText().equals("x") && button3.getText().equals("x")){
            isDone = true;
            JOptionPane.showMessageDialog(null, "Player Wins!!");
        }
        else if(button1.getText().equals("o") && button2.getText().equals("o") && button3.getText().equals("o")){
            isDone = true;
            JOptionPane.showMessageDialog(null, "Computer Wins!!");
        }
        else if(button4.getText().equals("x") && button5.getText().equals("x") && button6.getText().equals("x")){
            isDone = true;
            JOptionPane.showMessageDialog(null, "Player Wins!!");
        }
        else if(button4.getText().equals("o") && button5.getText().equals("o") && button6.getText().equals("o")){
            isDone = true;
            JOptionPane.showMessageDialog(null, "Computer Wins!!");
        }
        else if(button7.getText().equals("x") && button8.getText().equals("x") && button9.getText().equals("x")){
            isDone = true;
            JOptionPane.showMessageDialog(null, "Player Wins!!");
        }
        else if(button7.getText().equals("o") && button8.getText().equals("o") && button9.getText().equals("o")){
            isDone = true;
            JOptionPane.showMessageDialog(null, "Computer Wins!!");
        }
        else if(button1.getText().equals("x") && button4.getText().equals("x") && button7.getText().equals("x")){
            isDone = true;
            JOptionPane.showMessageDialog(null, "Player Wins!!");
        }
        else if(button1.getText().equals("o") && button4.getText().equals("o") && button7.getText().equals("o")){
            isDone = true;
            JOptionPane.showMessageDialog(null, "Computer Wins!!");
        }
        else if(button2.getText().equals("x") && button5.getText().equals("x") && button8.getText().equals("x")){
            isDone = true;
            JOptionPane.showMessageDialog(null, "Player Wins!!");
        }
        else if(button2.getText().equals("o") && button5.getText().equals("o") && button8.getText().equals("o")){
            isDone = true;
            JOptionPane.showMessageDialog(null, "Computer Wins!!");
        }
        else if(button3.getText().equals("x") && button6.getText().equals("x") && button9.getText().equals("x")){
            isDone = true;
            JOptionPane.showMessageDialog(null, "Player Wins!!");
        }
        else if(button3.getText().equals("o") && button6.getText().equals("o") && button9.getText().equals("o")){
            isDone = true;
            JOptionPane.showMessageDialog(null, "Computer Wins!!");
        }
        else if(button1.getText().equals("x") && button5.getText().equals("x") && button9.getText().equals("x")){
            isDone = true;
            JOptionPane.showMessageDialog(null, "Player Wins!!");
        }
        else if(button1.getText().equals("o") && button5.getText().equals("o") && button9.getText().equals("o")){
            isDone = true;
            JOptionPane.showMessageDialog(null, "Computer Wins!!");
        }
        else if(button3.getText().equals("x") && button5.getText().equals("x") && button7.getText().equals("x")){
            isDone = true;
            JOptionPane.showMessageDialog(null, "Player Wins!!");
        }
        else if(button3.getText().equals("o") && button5.getText().equals("o") && button7.getText().equals("o")){
            isDone = true;
            JOptionPane.showMessageDialog(null, "Computer Wins!!");
        }
        else
        {
            if (playersTurn == true)
                JOptionPane.showMessageDialog(null, "Please choose a Button for your Token");
        }

    }
}
