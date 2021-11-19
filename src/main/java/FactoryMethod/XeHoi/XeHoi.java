package FactoryMethod.XeHoi;

public abstract class XeHoi {
    public abstract String getThongTinXe();

    public abstract String getCauHinhXe();

    public abstract String getNhaSanXuat();

    @Override
    public String toString() {
        return "Thông tin xe: " + this.getThongTinXe() + ", Cấu hình xe: "
                + this.getCauHinhXe() + " ,Nhà sản xuất:" + this.getNhaSanXuat();
    }
}
