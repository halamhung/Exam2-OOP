public class Item {
    private String name;
    private int sucManh;
    private double heSo;
    private int vangQuyDoi;
    public Item(String name, int sucManh, double heSo, int vangQuyDoi) {
        this.name = name;
        this.sucManh = sucManh;
        this.heSo = heSo;
        this.vangQuyDoi = vangQuyDoi;
    }
    public Item(){
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSucManh() {
        return sucManh;
    }

    public void setSucManh(int sucManh) {
        this.sucManh = sucManh;
    }

    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(double heSo) {
        this.heSo = heSo;
    }

    public int getVangQuyDoi() {
        return vangQuyDoi;
    }

    public void setVangQuyDoi(int vangQuyDoi) {
        this.vangQuyDoi = vangQuyDoi;
    }
    public double sucCongPha(){
        return sucManh * heSo;
    }
    public double tongVangDeMua(){
        return sucCongPha() * vangQuyDoi;
    }

    @Override
    public String toString() {
        return "Vật phẩm: "+ name + " ,Súc mạnh: " + sucManh +" ,Hệ số sức mạnh: " + heSo + " ,Vàng quy đổi: " + vangQuyDoi + " ,Sức công phá: "
                + sucCongPha() +" ,vàng để mua được: " + tongVangDeMua();
    }
}
