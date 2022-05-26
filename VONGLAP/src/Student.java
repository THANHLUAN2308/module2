public class ParaConst {
    public static void main(String[] args) {

    }
    // Thuộc tính
    int id;
    String name;

    // Constructor có tham số
    public ParaConst(int i, String n) {
        this.id = i;
        this.name = n;
    }

    // Phương thức
    public String toString() {
        return this.id + "  " + this.name;
    }
}

