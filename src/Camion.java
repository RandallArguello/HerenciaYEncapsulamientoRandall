public class Camion extends VehiculoCarga {
    private int numEjes;

    // constructor
    public Camion(String marca, String modelo, int año, int kilometraje, int capacidadCarga, int numEjes) {
        super(marca, modelo, año, kilometraje, capacidadCarga);
        this.numEjes = numEjes;
    }

    // Getter y Setter para tipoCombustible
    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    // Sobreescribir el metodo mostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de Ejes: " + numEjes);
    }

     


    // Sobreescribir el metodo realizarMantenimiento()
    @Override
    public void realizarMantenimiento() {
        super.realizarMantenimiento();
        System.out.println("Camión: ");
        System.out.println("1. Cambiar aceite ");
        System.out.println("2. Verificar frenos ");
        System.out.println("3. Revisar Neumáticos ");
        System.out.println("4. Cambiar luces ");
        System.out.println("5. Verificar el nivel de refrigerante ");
        System.out.println("6. Verificación del sistema de suspensión ");
        System.out.println("7. Inspección del sistema de dirección ");
        System.out.println("8. Inspección del vagón de carga ");

    }
}
