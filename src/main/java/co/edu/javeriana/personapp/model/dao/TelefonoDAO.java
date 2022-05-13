package co.edu.javeriana.personapp.model.dao;

import co.edu.javeriana.personapp.model.dto.TelefonoDTO;
import java.util.List;

public interface TelefonoDAO {
    
    public TelefonoDTO create(TelefonoDTO telefono);
    
    public TelefonoDTO edit(String numero, TelefonoDTO telefono);
    
    public Boolean delete(String numero);
    
    public TelefonoDTO findById(String numero);
    
    public List<TelefonoDTO> findByDuenio(Long cedulaDuenio);
    
    public List<TelefonoDTO> findAll();
    
    public Integer count();
}
