package praktek02mai;

public class Rectangle {
    double panjang;
    double lebar;

    public Rectangle() {
    panjang=5;
    lebar=2;
    }

    public Rectangle(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    
    void cetakInfo(){
        System.out.println("===================");
        System.out.println("Panjang : "+panjang);
        System.out.println("lebar :   "+lebar);
        System.out.println("===================");
    }
    
    double hitungluas(){
        double luas;
        luas=panjang*lebar;
        return luas;
    }
    
    void cetakLuas(){
        System.out.println("Luas adalah: "+hitungluas());
    }
}
