public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(12,"oscar","123-456789",12.5f);
        System.out.println(cliente.edad+" "+cliente.nombre+" "+cliente.telefono+" "+cliente.credito);
        
        Trabajador trabajador = new Trabajador(21,"gabriel","987-654321",15.2f);
        System.out.println(trabajador.edad+" "+trabajador.nombre+" "+trabajador.telefono+" "+trabajador.salario);
    }

}

class Persona{
    int edad;
    String nombre;
    String telefono;
    public Persona(int edad, String nombre, String telefono){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

}

class Cliente extends Persona{
    float credito;
    public Cliente(int edad, String nombre, String telefono, float credito){
        super(edad,nombre,telefono);
        this.credito=credito;
    }


}

class Trabajador extends Persona{
    float salario;
    public Trabajador(int edad, String nombre, String telefono, float salario){
        super(edad,nombre,telefono);
        this.salario = salario;
    }
}