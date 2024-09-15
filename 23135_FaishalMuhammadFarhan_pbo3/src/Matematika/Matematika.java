
package Matematika;


public class Matematika implements InterfaceMatematika{
    protected int a;
    protected int b;
    
    public Matematika(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    @Override
    public int pertambahan(int a, int b) {
        return a+b;
    }
    
    @Override
    public int pengurangan(int a, int b) {
        return a-b;
    }

    public int perkalian(int a, int b) {
        return a*b;
    }
    
    public int pembagian(int a, int b) {
        return a/b;
    }
    
    public void tambah(){
        System.out.println("Pertambahan : " +a+ "+" +b+ " = "+ pertambahan(a, b));
    }
    
    public void kurang(){
        System.out.println("Pengurangan : " +a+ "-" +b+ " = "+ pengurangan(a,b));
    }
    
    public void kali(){
        System.out.println("Perkalian : " +a+ "*" +b+ " = "+ perkalian(a,b));
    }
    
    public void bagi(){
        System.out.println("Pembagian : " +a+ "/" +b+ " = "+ pembagian(a,b));
    }
    
   
}  
