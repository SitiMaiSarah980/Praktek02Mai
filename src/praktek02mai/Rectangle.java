package praktek02mai;

public class Rectangle {
    double panjang;
    double lebar;
    
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
}
