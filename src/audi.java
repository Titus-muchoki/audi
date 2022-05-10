public class audi {
    int modelYear;
    String brandName;
    public audi(int year, String name) {
        modelYear = year;
        brandName = name;
    }
    public static void main(String[] args) {
        audi myCar = new audi(2022, " Q6");
        System.out.println(myCar.brandName + " " + myCar.modelYear);
    }
}
