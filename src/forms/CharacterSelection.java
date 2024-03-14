package forms;

import javax.swing.*;

public class CharacterSelection {
    private JPanel charaacterPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JLabel Player1;
    private JLabel Player2;
    private JLabel Player3;
    private JLabel Player4;
    private JButton startButton;


    public CharacterSelection(int selectedNumber) {
        JFrame frame = new JFrame("Character Panel");
        frame.setContentPane(this.charaacterPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

