package JavaGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BiodataMahasiswa {
    private JTextField textNama;
    private JTextField textNIM;
    private JButton HapusButton;
    private JButton cekButton;
    private JPanel Panel1;
    private JLabel labelHasil;
    private JLabel labelHasil2;
    private JLabel labelHasil3;
    private JLabel labelHasil4;
    private JLabel labelHasil5;
    private JLabel labelHasil6;
    private JLabel labelHasil7;
    private JLabel labelHasil8;
    private JButton buttonKeluar;



    public BiodataMahasiswa() {
        cekButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textNama.getText();  //untuk ambil data dari textNama
                String nim = textNIM.getText();    //untuk ambil data daru textNIM
                mahasiswa a = new mahasiswa();
                a.setNama(nama);
                a.setNim(nim);

               labelHasil.setText("Nama                         = "+a.getNama() );
               labelHasil2.setText("NIM                            = "+a.getNim() );
                labelHasil3.setText("Jenjang Pendidikan = "+a.getJenjang() );
                labelHasil4.setText("Tahun Masuk            = "+a.getTahun() );
                labelHasil5.setText("Fakultas                    = "+a.getFakultas());
                labelHasil6.setText("Jurusan                     = "+a.getJurusan());
                labelHasil7.setText("Jenis Kelamin          = "+a.getJenisKelamin());
                labelHasil8.setText("Nomor Urut              = "+a.getNomorUrut());
            }
        });

        HapusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textNama.setText("");
                textNIM.setText("");
                labelHasil.setText("");
                labelHasil2.setText("");
                labelHasil3.setText("");
                labelHasil4.setText("");
                labelHasil5.setText("");
                labelHasil6.setText("");
                labelHasil7.setText("");
                labelHasil8.setText("");
            }
        });

        buttonKeluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });
    }
    public JPanel getPanel1(){ return Panel1;
    }
}
