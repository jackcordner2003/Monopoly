package forms;

import javax.swing.*;

public class Start {

    private JPanel startPanel;
    private JComboBox noOfPlayers;
    private JButton startButton;
    private JLabel title;


    public Start() {
        noOfPlayers.addItem('1');
        noOfPlayers.addItem('2');
        noOfPlayers.addItem('3');
        noOfPlayers.addItem('4');

        JFrame frame = new JFrame("StartForm");
        frame.setContentPane(this.startPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}