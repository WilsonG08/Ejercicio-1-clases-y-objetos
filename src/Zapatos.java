public class Zapatos {
    //CREACION DEL ATRIBUTO
    String typeofShoes;
    String brand;
    String model;
    double size;
    double price;


    //METODOS
    public Zapatos(){
        typeofShoes="sneaker";
        brand ="New Balance";
        model ="505";
        size =8.5;
        price =125.50;

    }


    public void typeofShoes(){}
    public void brand(){}
    public void model(){}
    public void size(){}
    public void price(){}

    public String getTypeofShoes() {
        return typeofShoes;
    }

    public void setTypeofShoes(String typeofShoes) {
        this.typeofShoes = typeofShoes;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
