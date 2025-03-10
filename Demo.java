public class Demo {
    public static void main(String[] args) {
        Tamgiac tg1 = new Tamgiac(3, 4, 5);
        System.out.println("Tam giac 1:");
        System.out.println("Chu vi: " + tg1.tinhchuvi());
        System.out.println("Dien tich: " + tg1.tinhdientich());
        System.out.println("Loai tam giac: " + tg1.loaiTamgiac());
        Tamgiac tg2 = new Tamgiac(5, 5, 5);
        System.out.println("Tam giac 2:");
        System.out.println("Chu vi: " + tg2.tinhchuvi());
        System.out.println("Dien tich: " + tg2.tinhdientich());
        System.out.println("Loai tam giac: " + tg2.loaiTamgiac());
        Tamgiac tg3 = new Tamgiac(6, 8, 10);
        System.out.println("Tam giac 3:");
        System.out.println("Chu vi: " + tg3.tinhchuvi());
        System.out.println("Dien tich: " + tg3.tinhdientich());
        System.out.println("Loai tam giac: " + tg3.loaiTamgiac());
    }
}