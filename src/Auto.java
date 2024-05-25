public class Auto extends VehiculoPasajeros {
    private String tipoCombustible;

    // constructor
    public Auto(String marca, String modelo, int año, int kilometraje, int numPasajeros, String tipoCombustible) {
        super(marca, modelo, año, kilometraje, numPasajeros);
        this.tipoCombustible = tipoCombustible;
    }

    // Getter y Setter para tipoCombustible
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }


    // Sobreescribir el metodo mostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de Combustible: " + tipoCombustible);

    }



    // Metodo calcularCostoMantenimiento
    public double calcularCostoMantenimiento(double costoPorKm, int kilometrosRecorridos) {
        double costoTotal = 0;
        costoTotal = costoPorKm * kilometrosRecorridos;
        System.out.println("Costo de Mantenimiento: $ " + costoTotal);
        return costoTotal;
    }
    
    // Sobreescribir el metodo realizarMantenimiento()
    @Override
    public void realizarMantenimiento() {
        super.realizarMantenimiento();
        System.out.println("Auto: ");
        System.out.println("1. Cambio de aceite ");
        System.out.println("2. Verificar liquido de frenos ");
        System.out.println("3. Revisar aire de los neumáticos ");
        System.out.println("4. Cambiar luces ");
        System.out.println("5. Verificar el nivel de refrigerante ");
        System.out.println("6. Cambio de Batería ");
        System.out.println("7. Cambio de filtro de combustible ");
        System.out.println("8. Revisión de la carrocería ");
    }

}
