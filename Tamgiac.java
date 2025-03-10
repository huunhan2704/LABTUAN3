public class Tamgiac {
    private int canh1,canh2,canh3;
    //pt khoi tao
    public Tamgiac(int canh1,int canh2,int canh3){
        this.canh1=canh1;
        this.canh2=canh2;
        this.canh3=canh3;
    }
    //pt tinh chu vi
    public int tinhchuvi(){
        return canh1+canh2+canh3;
    }
    //pt tinh dien tich
    public double tinhdientich(){
        double p = (canh1+canh2+canh3)/2;
        return Math.sqrt(p*(p-canh1)*(p-canh2)*(p-canh3));
    }
    //pt xac dinh loai tam giac
    public String loaiTamgiac() {
        if (canh1 == canh2 && canh2 == canh3) {
            return "Tam giac deu";
        } 
        else if (canh1 == canh2 || canh2 == canh3 || canh1 == canh3) {
            return "Tam giac can";
        } 
        else if (canh1 * canh1 + canh2 * canh2 == canh3 * canh3 ||canh2 * canh2 + canh3 * canh3 == canh1 * canh1 || canh1 * canh1 + canh3 * canh3 == canh2 * canh2){
            return "Tam giac vuong";
        } 
        else {
            return "Tam giac thuong";
        }
}}