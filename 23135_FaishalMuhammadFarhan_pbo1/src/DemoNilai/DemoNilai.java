
package DemoNilai;

public class DemoNilai {
    String nim ;
    String nama ;
    int absen ;
    int tugas ;
    int uts ;
    int uas ;
    int nilai() {
        int nilaiakhir = (absen * 10/100) + (tugas *20/100) + (uts *30/100) + (uas *40/100);
        return nilaiakhir;
    }
    
    void define(){
        System.out.println("Nilai Absen = 100");
        System.out.println("Nilai Tugas = 95");
        System.out.println("Nilai UTS = 90");
        System.out.println("Nilai UAS = 85\n");
    }
    void Nilai(){
        System.out.println("----Hasil Nilai 1 Semester----");
        System.out.println("NIM : " +this.nim);
        System.out.println("Nama : " +this.nama);
        System.out.println("Nilai Absen : " +this.absen * 10/100);
        System.out.println("Nilai Tugas : " +this.tugas * 20/100);
        System.out.println("Nilai UTS : " +this.uts * 30/100);
        System.out.println("Nilai UAS : " +this.uas * 40/100);
        System.out.println("Nilai Akhir : " +nilai());
        System.out.println("\nProgram ini dibuat oleh : Faishal Muhammad Farhan (2310631170135)\n");
    }
    
    
}
