import com.package1.presentacion;

public class App {
    //Método main, donde corren todos los procesos del programa
    public static void main(String[] args) throws Exception {
        System.out.println("Intentando importar la presentación");

        presentacion persona1 = new presentacion();

        persona1.nombre = "pepe";
        System.out.println(persona1);
        

    }
}
