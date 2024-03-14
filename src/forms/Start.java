package forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Start {

    private JPanel startPanel;
    private JComboBox noOfPlayers;
    private JButton btnStart;


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

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));


                int selectedNumber = Character.getNumericValue((Character) noOfPlayers.getSelectedItem());
                System.out.println("Selected: " + selectedNumber);

                CharacterSelection cs = new CharacterSelection(selectedNumber);

            }
        });



    }



}