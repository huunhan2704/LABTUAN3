import java.util.ArrayList;
import java.util.Scanner;
public class danhsachnhanvien{
    private ArrayList<NhanVien> ds;
    public danhsachnhanvien(){
        ds = new ArrayList<>();
    }
    public void nhapds(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong nhan vien: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            NhanVien nv = new NhanVien();
            nv.nhap();
            ds.add(nv);
        }
    }
    public void xuatds(){
        for(NhanVien nv: ds){
            nv.xuat();
            System.out.println("");
        }
    }
    public ArrayList<NhanVien> getds(){
        return ds;
    }
    public static void main(String[] args){
        danhsachnhanvien dsnv = new danhsachnhanvien();
        dsnv.nhapds();
        dsnv.xuatds();
    }
}