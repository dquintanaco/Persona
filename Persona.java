public class Persona {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(14);
        persona.setNombre("Ramon");
        persona.setTelefono("666666666");

        System.out.printf("%s tiene %d años y su telefono es %s", persona.getNombre(), persona.getEdad(), persona.getTelefono());
    }
    
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
