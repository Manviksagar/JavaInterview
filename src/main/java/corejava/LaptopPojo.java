package corejava;

public class LaptopPojo implements Comparable<LaptopPojo>{

    private int id;
    private String brand;
    private int ram;

    public LaptopPojo(int id, String brand, int ram) {
        this.id = id;
        this.brand = brand;
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "LaptopPojo{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", ram=" + ram +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

@Override
    public int compareTo(LaptopPojo l) {
        if(this.getRam()<l.getRam()) {
            return 1;
        }
            else{
                return -1;
            }
        }


}

