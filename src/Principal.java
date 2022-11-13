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

    }


}
