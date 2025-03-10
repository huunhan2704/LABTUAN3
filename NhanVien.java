import java.util.Scanner;
public class NhanVien {
    private String maso;
    private String hoten;
    private double luongcoban;
    private double hesoluong;
    private double soluongnv;
    // pt khoi tao
    public NhanVien(){
        this.maso="";
        this.hoten="";
        this.luongcoban=0.0;
        this.hesoluong=0.0;
        this.soluongnv=0.0;
    }
    public NhanVien(String maso, String hoten, double luongcoban, double hesoluong, double soluongnv){
        this.maso=maso;
        this.hoten=hoten;
        this.luongcoban=luongcoban;
        this.hesoluong=hesoluong;
        this.soluongnv=tinhluong();
    }
    // pt sao chep
    public NhanVien(NhanVien nv){
        this.maso=nv.maso;
        this.hoten=nv.hoten;
        this.luongcoban=nv.luongcoban;
        this.hesoluong=nv.hesoluong;
        this.soluongnv=nv.soluongnv;
    }
    public String getmaso(){
        return maso;
    }
    public void setmaso(String maso){
        this.maso=maso;
    }
    public String gethoten(){
        return hoten;
    }
    public void sethoten(String hoten){
        this.hoten=hoten;
    }
    public double gethesoluong(){
        return hesoluong;
    }
    public void sethesoluong(double hesoluong){
        this.hesoluong=hesoluong;
    }
    public  void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma so: ");
        maso=sc.nextLine();
        System.out.println("Nhap ho ten: ");
        hoten=sc.nextLine();
        System.out.println("Nhap luong co ban: ");
        luongcoban=sc.nextDouble();
        System.out.println("Nhap he so luong: ");
        hesoluong=sc.nextDouble();
        soluongnv=tinhluong();
    }
    public void xuat(){
        System.out.println("Ma so: "+maso);
        System.out.println("Ho ten: "+hoten);
        System.out.println("Luong co ban: "+luongcoban);
        System.out.println("He so luong: "+hesoluong);
        System.out.println("Luong: "+soluongnv);
    }
    public double tinhluong(){
        return luongcoban*hesoluong;
    }
    public void insoluongnv(){
        System.out.println("So luong nhan vien: "+soluongnv);
    }

}