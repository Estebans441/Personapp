package co.edu.javeriana.personapp.model.dto;

import java.util.Objects;

public class PersonaDTO {
    private Long cedula;
    private String nombre;
    private String apellido;
    private Short edad;
    private char genero;

    public PersonaDTO(Long cedula, String nombre, String apellido, char genero) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
    }

    public PersonaDTO(Long cedula, String nombre, String apellido, Short edad, char genero) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
    }

    public Long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Short getEdad() {
        return edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(Short edad) {
        this.edad = edad;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.cedula);
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + Objects.hashCode(this.apellido);
        hash = 23 * hash + Objects.hashCode(this.edad);
        hash = 23 * hash + this.genero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PersonaDTO other = (PersonaDTO) obj;
        if (this.genero != other.genero) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return Objects.equals(this.edad, other.edad);
    }

    @Override
    public String toString() {
        return "PersonaDTO{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", genero=" + genero + '}';
    }    
}
