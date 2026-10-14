//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Contacto contacto1 = new Contacto("María Pérez", "+549261456789", "maria.perez@email.com");
    System.out.println(contacto1.obtenerDatosFormateados());
    System.out.println();
    
    System.out.println("--- Intentando actualizar con datos incorrectos ---");
    contacto1.setTelefono("549261ABCD");
    contacto1.setCorreoElectronico("mariaperez.com");
    System.out.println();

    System.out.println("--- Actualizando con datos correctos ---");
    contacto1.setTelefono("2615551234");
    contacto1.setCorreoElectronico("maria.nueva@dominio.com");
    System.out.println();


    System.out.println(contacto1.obtenerDatosFormateados());
}