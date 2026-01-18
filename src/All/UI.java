package All;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Consumer;

public class UI {
    JFrame window;
    Container con;
    JPanel titleNamePanel, subTitlePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel,endPanel,endButtonPanel;
    JLabel titleNameLabel, subTitleLabel, hpLabel, hpLabelNumber;
    Font titleFont = new Font("SansSerif", Font.PLAIN, 65);
    Font subtitleFont = new Font("DialogInput", Font.ITALIC, 30);
    Font normalFont = new Font("SansSerif", Font.PLAIN, 28);
    JButton startButton, choice1, choice2, choice3, choice4,endButton1,endButton2;
    JTextArea mainTextArea, endTextArea;

    public void createUI(Game.ChoiceHandler cHandler){

        //WINDOW
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);


        con = window.getContentPane();

        //TITLE SCREEN
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(50, 150, 700, 80);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("GIKINOO'AMAADIWIN");
        titleNameLabel.setForeground(Color.WHITE);
        titleNamePanel.add(titleNameLabel);


        subTitlePanel = new JPanel();
        subTitlePanel.setBounds(300, 230, 200, 50);
        subTitlePanel.setBackground(Color.black);
        subTitleLabel = new JLabel("to Learn");
        subTitleLabel.setForeground(Color.WHITE);
        subTitlePanel.add(subTitleLabel);


        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.black);


        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);
        startButton.setFocusPainted(false);
        startButton.addActionListener(cHandler);
        startButton.setActionCommand("start");



        titleNameLabel.setFont(titleFont);
        subTitleLabel.setFont(subtitleFont);
        startButtonPanel.add(startButton);


        con.add(titleNamePanel);
        con.add(subTitlePanel);
        con.add(startButtonPanel);

        //GAME SCREEN
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.black);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea();
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(200, 350, 400, 150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4, 1));
        con.add(choiceButtonPanel);

        choice1 = new JButton();
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(normalFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(cHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);
        choice2 = new JButton();
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(cHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);
        choice3 = new JButton();
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(normalFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(cHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);
        choice4 = new JButton();
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(normalFont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(cHandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);

        playerPanel = new JPanel();
        playerPanel.setBounds(100, 15, 300, 50);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(1, 2));
        con.add(playerPanel);
        hpLabel = new JLabel("HP: ");
        hpLabel.setFont(normalFont);
        hpLabel.setForeground(Color.white);
        playerPanel.add(hpLabel);
        hpLabelNumber = new JLabel();
        hpLabelNumber.setFont(normalFont);
        hpLabelNumber.setForeground(Color.white);
        playerPanel.add(hpLabelNumber);


        //end
        endPanel = new JPanel();
        endPanel.setBounds(50, 50, 600, 450);
        endPanel.setBackground(Color.black);

        endTextArea = new JTextArea();
        endTextArea.setBounds(50, 50, 600, 450);

        endTextArea.setBackground(Color.black);
        endTextArea.setForeground(Color.white);
        endTextArea.setFont(normalFont);
        endTextArea.setLineWrap(true);
        endPanel.add(endTextArea);

        con.add(endPanel);


        endButtonPanel = new JPanel();
        endButtonPanel.setBounds(200, 500, 400, 40);
        endButtonPanel.setBackground(Color.black);
        endButtonPanel.setLayout(new GridLayout(1, 2));
        con.add(endButtonPanel);

        endButton1 = new JButton();
        endButton1.setBackground(Color.black);
        endButton1.setForeground(Color.white);
        endButton1.setFont(normalFont);
        endButton1.setFocusPainted(false);
        endButton1.addActionListener(cHandler);
        endButton1.setActionCommand("end1");
        endButtonPanel.add(endButton1);

        endButton2 = new JButton();
        endButton2.setBackground(Color.black);
        endButton2.setForeground(Color.white);
        endButton2.setFont(normalFont);
        endButton2.setFocusPainted(false);
        endButton2.addActionListener(cHandler);
        endButton2.setActionCommand("end2");
        endButtonPanel.add(endButton2);









        window.setVisible(true);


    }

}


