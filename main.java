import java.util.*;

public class main {
    
    static void tampilMenu(ArrayList<Perusahaan> p) {
        boolean quit = false;
        do {
            System.out.println("==== Pilih Menu ====");
            System.out.println("1. Input Perusahaan");
            System.out.println("2. Input KIP");
            System.out.println("3. Input Alamat");
            System.out.println("4. Input Badan Hukum");
            System.out.println("5. Input Status");
            System.out.println("6. Input Subsektor");
            System.out.println("7. Input Jenis Usaha Utama");
            System.out.println("8. Tampilkan");
            System.out.println("=======================");

            Scanner in = new Scanner(System.in);
            System.out.println("Pilih Menu no : ");
            String menu = in.nextLine();
        
        switch (menu) {
            case "1":
                System.out.println("Nama Perusahaan: ");
                String name = in.nextLine();
                System.out.println("No Telepon: ");
                String telp = in.nextLine();
                System.out.println("No Fax: ");
                String fax = in.nextLine();
                p.add(new Perusahaan(name, telp, fax));
                break;
            case "8":
                for (int i = 0;i<p.size();i++) {
                    System.out.println(String.format("%d. [nama: %s] [No Telpon: %s] [No fax : ]",
                                        i + 1,
                                        p.get(i).getNama(),
                                        p.get(i).getNoTelp(),
                                        p.get(i).rekapSaldoRekening()));
                }

            default:
                break;
        }

        }while (!quit);
    }      
    public static void main(String[] args) {
        tampilMenu(p);
    }
}

nsxjnajbck
