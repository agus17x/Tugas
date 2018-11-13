//class
 class Smartphone_class {
    String warna;
    int tahun;
    String merek;
}

class object {
    public static void main(String[]args) {
        //object
        Smartphone_class S8 = new Smartphone_class();
        Smartphone_class ZMax = new Smartphone_class();
        //pemberian nilai
        S8.warna = "Hitam";
        S8.tahun = 2018;
        S8.merek = "Samsung";
        ZMax.warna = "Hitam";
        ZMax.tahun = 2018;
        ZMax.merek = "Asus";
        //menampilkan
        System.out.println("S8");
        System.out.println("warna    :" +S8.warna);
        System.out.println("tahun    :" +S8.tahun);
        System.out.println("merek    :" +S8.merek);
        System.out.println("");
        System.out.println("ZMax");
        System.out.println("warna    :" +ZMax.warna);
        System.out.println("tahun    :" +ZMax.tahun);
        System.out.println("merek    :" +ZMax.merek);
    }
}