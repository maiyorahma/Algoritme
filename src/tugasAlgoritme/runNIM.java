package tugasAlgoritme;

import java.util.Scanner;

public class runNIM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nim = input.nextLine();
        NIM objNim = new NIM();
        objNim.setNim(nim);

        System.out.println("Jenjang Pendidikan = "+objNim.getJenjang());
        System.out.println("Tahun Masuk        = "+objNim.getTahun());
        System.out.println("Fakultas           = "+objNim.getFakultas());
        System.out.println("Jurusan            = "+objNim.getJurusan());
        System.out.println("Jenis kelamin      = "+objNim.getJenisKelamin());
        System.out.println("Nomor Urut Mahasiswa "+objNim.getNomorUrut());
    }
}
