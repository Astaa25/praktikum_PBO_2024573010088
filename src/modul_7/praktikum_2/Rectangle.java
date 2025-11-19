package modul_7.praktikum_2;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Menggambar Persegi Panjang dengan warna : " + color + ", Lebar : " + width + ", dan Tinggi : " + height);
    }

    @Override
    public double calculateArea() {
        double area = width * height;
        System.out.println("Luas Persegi Panjang : " + area);
        return area;
    }

    @Override
    public void displayInfo() {
        System.out.println("Persegi Panjang - Warna : " + color + ", Lebar : " + width + ", dan Tinggi : " + height);
    }
}
