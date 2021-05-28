package JavaGUI;

import javax.swing.*;

public class Run {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Biodata Mahasiswa");
        jFrame.setContentPane(new BiodataMahasiswa().getPanel1());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(500,400);
        jFrame.setVisible(true);
    }
}
