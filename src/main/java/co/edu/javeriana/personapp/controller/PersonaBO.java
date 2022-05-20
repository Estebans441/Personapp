package co.edu.javeriana.personapp.controller;

import co.edu.javeriana.personapp.model.dao.PersonaDAO;
import co.edu.javeriana.personapp.model.dao.impl.PersonaDAOImpl;
import co.edu.javeriana.personapp.model.dto.PersonaDTO;
import java.util.List;

public class PersonaBO {
    private PersonaDAO pdao;
    
    public Boolean crear(PersonaDTO persona)
    {
        this.pdao = new PersonaDAOImpl();
        PersonaDTO p = this.pdao.create(persona);
        if(p != null) return true;
        else return false;
    }
    
    public PersonaDTO editar(Long cedula, PersonaDTO persona)
    {
        this.pdao = new PersonaDAOImpl();
        PersonaDTO p = this.pdao.findById(cedula);
        if(p == null) return null;
        else
        {
            if(persona.getNombre().equals("")) persona.setNombre(p.getNombre());
            if(persona.getApellido().equals("")) persona.setApellido(p.getApellido());
            if(persona.getEdad() == null) persona.setEdad(p.getEdad());
            if(persona.getGenero() == ' ') persona.setGenero(p.getGenero());
            return this.pdao.edit(cedula, persona);
        }
    }
    
    public Boolean eliminar(Long cedula)
    {
        this.pdao = new PersonaDAOImpl();
        Boolean eliminado = this.pdao.delete(cedula);
        if(eliminado) return true;
        else return false;
    }
    
    public PersonaDTO findById(Long cedula)
    {
        this.pdao = new PersonaDAOImpl();
        PersonaDTO p = this.pdao.findById(cedula);
        if(p != null) return p;
        else return null;
    }
    
    public List<PersonaDTO> findAll()
    {
        this.pdao = new PersonaDAOImpl();
        List<PersonaDTO> p = this.pdao.findAll();
        if(p != null) return p;
        else return null;
    }
    
    public Integer contar()
    {
        this.pdao = new PersonaDAOImpl();
        Integer n = this.pdao.count();
        if(n != null) return n;
        else return null;
    }
}
