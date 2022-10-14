public class EjercicioFunciones {
    public static void main(String[] args) {

        /*
        Crear una funcion que reciba un precio y devuelva el precio con el IVA incluido
         */

        double nuevoPrecio = precioIva(80);
        System.out.println(nuevoPrecio);

    }

    static double precioIva(double precio){
        return precio * .16 + precio;
    }
}
