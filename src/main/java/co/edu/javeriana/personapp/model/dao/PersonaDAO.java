/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.personapp.model.dao;

import co.edu.javeriana.personapp.model.dto.PersonaDTO;
import java.util.List;

/**
 *
 * @author esteb
 */
public interface PersonaDAO {
    
    public PersonaDTO create(PersonaDTO persona);
    
    public PersonaDTO edit(Long cedula, PersonaDTO persona);
    
    public Boolean delete(Long cedula);
    
    public PersonaDTO findById(Long cedula);
    
    public List<PersonaDTO> findAll();
    
    public Integer count();
}
