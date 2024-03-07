public class BangunDatar {
    class BangunDatar {
        double luas() {
            return 0; 
        }
    }
    
    class Lingkaran extends BangunDatar {
        double jariJari;
    
        Lingkaran(double jariJari) {
            this.jariJari = jariJari;
        }
    
        double luas() {
            return Math.PI * Math.pow(jariJari, 2);
        }
    }
    
    class Segitiga extends BangunDatar {
        double alas, tinggi;
    
        Segitiga(double alas, double tinggi) {
            this.alas = alas;
            this.tinggi = tinggi;
        }
    
        double luas() {
            return 0.5 * alas * tinggi;
        }
    }
    
    class Persegi extends BangunDatar {
        double sisi;
    
        Persegi(double sisi) {
            this.sisi = sisi;
        }
    
        double luas() {
            return Math.pow(sisi, 2);
        }
    }
    
    class SegitigaSamaKaki extends Segitiga {
        SegitigaSamaKaki(double alas, double tinggi) {
            super(alas, tinggi);
        }
    }
    
    class SegitigaSamaSisi extends Segitiga {
        SegitigaSamaSisi(double sisi) {
            super(sisi, (Math.sqrt(3)/2) * sisi);
        }
    }
    
    class SegitigaSikuSiku extends Segitiga {
        SegitigaSikuSiku(double alas, double tinggi) {
            super(alas, tinggi);
        }
    }
    
    class SegitigaSembarang extends Segitiga {
        SegitigaSembarang(double alas, double tinggi) {
            super(alas, tinggi);
        }
    
        double luas() {
            double s = (alas + tinggi + Math.sqrt(alas*alas + tinggi*tinggi)) / 2;
            return Math.sqrt(s * (s - alas) * (s - tinggi) * (s - Math.sqrt(alas*alas + tinggi*tinggi)));
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            Lingkaran lingkaran = new Lingkaran(8);
            System.out.println("Luas Lingkaran: " + lingkaran.luas());
    
            Persegi persegi = new Persegi(6);
            System.out.println("Luas Persegi: " + persegi.luas());
    
            SegitigaSamaKaki segitigaSamaKaki = new SegitigaSamaKaki(5, 7);
            System.out.println("Luas Segitiga Sama Kaki: " + segitigaSamaKaki.luas());
    
            SegitigaSamaSisi segitigaSamaSisi = new SegitigaSamaSisi(6);
            System.out.println("Luas Segitiga Sama Sisi: " + segitigaSamaSisi.luas());
    
            SegitigaSikuSiku segitigaSikuSiku = new SegitigaSikuSiku(4, 6);
            System.out.println("Luas Segitiga Siku-Siku: " + segitigaSikuSiku.luas());
    
            SegitigaSembarang segitigaSembarang = new SegitigaSembarang(5, 7);
            System.out.println("Luas Segitiga Sembarang: " + segitigaSembarang.luas());
        }
    }
}
