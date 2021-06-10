package Jtable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class contohJtable {
    private JTextField textangka;
    private JButton buttonsort;
    private JTable tablehasil;
    private JPanel Panel1;
    private JTextField textangka2;
    private DefaultTableModel tableModel;
    private boolean added = false;

    public JPanel getPanel1(){
        return Panel1;
    }
    public contohJtable(){
        this.initComponents();
        buttonsort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) tablehasil.getModel();

                int jumlah = Integer.parseInt(textangka.getText());
                String angka = textangka2.getText();
                String[] pnj = angka.split(",");

                if (angka.isBlank() ) {
                    JOptionPane.showMessageDialog(Panel1,
                            "Angka belum diinput",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }
                if (!added) {
                    for (int i = 0; i < jumlah; i++) {
                        model.addRow(new Object[]{});
                    }
                    added = true;
                }
                int a = 0;
                for (int i : sorting.getascen(angka, jumlah)){
                    model.setValueAt(i, a, 0);
                    a++;
                }
                int b = 0;
                for (int i : sorting.getdescen(angka, jumlah)){
                    model.setValueAt(i, b, 1);
                    b++;
                }
        }
        });
    }

    private void initComponents(){
        Object[] tableColom={
                "Ascending",
                "Descending"
        };
        Object[][] initData = {

        };
        tableModel = new  DefaultTableModel(initData,tableColom);
        //set table model
        tablehasil.setModel(tableModel);
        //menampilkan sorting di setiap kolom
        tablehasil.setAutoCreateRowSorter(true);
        //hidupkan single selection
        tablehasil.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}
