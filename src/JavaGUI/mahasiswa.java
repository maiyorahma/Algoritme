package JavaGUI;

public class mahasiswa {
    private String nama;
    private String nim;

    public mahasiswa(){
    }
    public mahasiswa(String Nama,String Nim){
        this.nama= Nama;
        this.nim = Nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJenjang() {
        char kodejenjang = nim.charAt(0);
        if (kodejenjang == '1') {
            return "S1 (Sarjana)";
        } else if (kodejenjang == '2') {
            return "S2 (Magister)";
        } else if (kodejenjang == '3') {
            return "S3 (Doktor)";
        }
        return "tidak diketahui";
    }

    public String getTahun(){
        char kodetahun = nim.charAt(1);
        char kodetahun2 = nim.charAt(2);
        return "20"+kodetahun+kodetahun2;
    }
    public String getFakultas() {
        char kodefkt = nim.charAt(3);
        if (kodefkt == '1'){
            return "Tarbiyah dan Keguruan";
        }else if (kodefkt == '2'){
            return "Syari'ah dan Hukum";
        }else if (kodefkt == '3'){
            return "Ushuluddin";
        }else if (kodefkt == '4'){
            return "Dakwah dan Komunikasi";
        }else if (kodefkt == '5'){
            return "Sains dan Teknologi";
        }else if (kodefkt == '6'){
            return "Psikologi";
        }else if(kodefkt == '7'){
            return "Ekonomi dan Ilmu Sosial";
        }else if (kodefkt == '8'){
            return "Pertanian dan Peternakan";
        }
        return "tidak diketahui";
    }
    public String getJurusan() {
        char kodeJur = nim.charAt(5);
        if (kodeJur == '1'){
            return "Teknik Informatika";
        }else if (kodeJur == '2'){
            return "Teknik Industri";
        }else if (kodeJur == '3'){
            return "Sistem Informasi";
        }else if (kodeJur == '4'){
            return "Matematika";
        }else if (kodeJur == '5') {
            return "Teknik Elektro";
        }
        return "Tidak Diketahui";
    }
    public String getJenisKelamin(){
        char kodeJk = nim.charAt(6);
        if(kodeJk == '1'){
            return "Laki-Laki";
        }else if(kodeJk == '2'){
            return "Perempuan";
        }
        return "Tidak Diketahui";
    }
    public String getNomorUrut(){
        char kodeUrut1= nim.charAt(7);
        char kodeUrut2= nim.charAt(8);
        char kodeUrut3= nim.charAt(9);
        char kodeUrut4= nim.charAt(10);
        return ""+ kodeUrut1+kodeUrut2+kodeUrut3+kodeUrut4;
    }

    }


