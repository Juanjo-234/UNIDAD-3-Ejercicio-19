public class Contacto {
    private String nombre;
    private String Telefono;
    private String correoElectronico;

    public Contacto(String nombre, String Telefono, String correoElectronico){
        this.nombre = nombre;
        this.Telefono = Telefono;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        if (telefono != null && !contieneLetras(telefono)) {
            this.Telefono = telefono;
        } else {
            System.out.println("Error: El teléfono '" + telefono + "' contiene letras o es inválido.");
        }
    }


    public void setCorreoElectronico(String correoElectronico) {
        if (correoElectronico != null && correoElectronico.contains("@")) {
            this.correoElectronico = correoElectronico;
        } else {
            System.out.println("Error: El correo '" + correoElectronico + "' no es válido (debe contener '@').");
        }
    }
    private boolean contieneLetras(String cadena) {
        for (char c : cadena.toCharArray()) {
            if (Character.isLetter(c)) {
                return true;
            }
        }
        return false;
    }

    public String obtenerDatosFormateados() {
        return "--- Ficha de Contacto ---\n" +
                "Nombre  : " + (nombre != null ? nombre : "No especificado") + "\n" +
                "Teléfono: " + (Telefono != null ? Telefono : "No asignado") + "\n" +
                "Correo  : " + (correoElectronico != null ? correoElectronico : "No asignado");
    }

}

