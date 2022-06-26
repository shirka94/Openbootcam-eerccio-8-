public class Main {
    public static void main(String[] args) {
        Persona ejemplo = new Persona();
        ejemplo.setEdad(32);
        ejemplo.setNombre("Jennifer");
        ejemplo.setTelefono(900000000);
        System.out.println("Nuestra persona contiene los siguientes atributos");
        System.out.println("Edad:"+ejemplo.getEdad());
        System.out.println("Nombre:"+ejemplo.getNombre());
        System.out.println("Telefono:"+ejemplo.getTelefono());

    }
}
