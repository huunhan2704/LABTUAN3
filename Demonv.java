import java.util.Scanner;
public class Demonv{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien("NV01", "Nguyen Van A", 1000, 2.5, 0);
        NhanVien nv3 = new NhanVien(nv2);
        System.out.println("Nhap thong tin nhan vien 1: ");
        nv1.nhap();
        System.out.println("Nhap thong tin nhan vien 2: ");
        nv2.xuat();
        System.out.println("Nhap thong tin nhan vien 3: ");
        nv3.xuat();
        System.out.println("Thong tin nhan vien 1: ");
        nv1.xuat();
        System.out.println("Thong tin nhan vien 2: ");
        nv2.xuat();
        System.out.println("Thong tin nhan vien 3: ");
        nv3.xuat();
        System.out.println("thay doi ho ten nhan vien 1: ");
        nv1.sethoten("Nguyen Van B");
        System.out.println("Thay doi ho ten nhan vien 2: ");
        nv2.sethoten("Nguyen Van C");
        System.out.println("Thay doi ho ten nhan vien 3: ");
        nv3.sethoten("Nguyen Van D");
        NhanVien maxhesoluong = nv1;
        if(nv2.gethesoluong()>maxhesoluong.gethesoluong()){
            maxhesoluong=nv2;
        }
        if(nv3.gethesoluong()>maxhesoluong.gethesoluong()){
            maxhesoluong=nv3;
        }
        danhsachnhanvien dsnv = new danhsachnhanvien();
        dsnv.nhapds();
        dsnv.xuatds();
        for (NhanVien nv: dsnv.getds()){
            if(nv.gethesoluong()>maxhesoluong.gethesoluong()){
                maxhesoluong=nv;
            }
        }
    }
}