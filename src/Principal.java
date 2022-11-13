public class Principal {

    public static void main(String[] args) {

        Zapatos z= new Zapatos();

        System.out.println("=======[  SHOES  ]=======\n");
        System.out.println("- Tipo de Zapato: "+z.getTypeofShoes());
        System.out.println("- Marca: "+z.getBrand());
        System.out.println("- Modelo: "+z.getModel());
        System.out.println("- Talla: "+z.getSize());
        System.out.println("- Precio: "+z.getPrice());
        System.out.println("\n=======[ FIN ]=======");


        System.out.println("\n======= [ NEW INFORMATION ]=======\n");
        z.setTypeofShoes("Tenis");
        z.setBrand("Vans");
        z.setModel("Classic");
        z.setSize(8.5);
        z.setPrice(90.00);
        System.out.println("- Tipo de Zapato: "+z.getTypeofShoes());
        System.out.println("- Marca: "+z.getBrand());
        System.out.println("- Modelo: "+z.getModel());
        System.out.println("- Talla: "+z.getSize());
        System.out.println("- Precio: "+z.getPrice());
        System.out.println("\n=======[ END ]=======");



    }


}
