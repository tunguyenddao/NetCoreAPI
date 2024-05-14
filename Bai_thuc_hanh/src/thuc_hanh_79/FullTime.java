package thuc_hanh_79;

public class FullTime extends nhanvien {
       private int ngaylamthem, loaichucvu;
    public  FullTime() {
       
    }
    public  FullTime(String ten, int ngaylamthem) {
       this.ten = ten;
       this.ngaylamthem = ngaylamthem;
        
    }
    public void setloaichucvu(int loaichucvu){
        this.loaichucvu = loaichucvu;
    }
    public String loainv(){
        
        return "NhanVienFullTime";
    }
    public void tinhluong(){
        if (loaichucvu == 1) {
            luong = 20000 + ngaylamthem*800;
        }else if(loaichucvu == 2){
            luong = 10000 + ngaylamthem*800;
        }

    }
        
}
