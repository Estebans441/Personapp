package co.edu.javeriana.personapp.model.dto;

public class TelefonoDTO {
    private String numero;
    private String operador;
    private PersonaDTO duenio;

    public TelefonoDTO(String numero, String operador, PersonaDTO duenio) {
        this.numero = numero;
        this.operador = operador;
        this.duenio = duenio;
    }

    public String getNumero() {
        return numero;
    }

    public String getOperador() {
        return operador;
    }

    public PersonaDTO getDuenio() {
        return duenio;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public void setDuenio(PersonaDTO duenio) {
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return "TelefonoDTO{" + "numero=" + numero + ", operador=" + operador + ", duenio=" + duenio + '}';
    }
    
}
