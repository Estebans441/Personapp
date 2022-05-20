package co.edu.javeriana.personapp.controller;

import co.edu.javeriana.personapp.model.dao.TelefonoDAO;
import co.edu.javeriana.personapp.model.dto.TelefonoDTO;
import co.edu.javeriana.personapp.model.dao.impl.TelefonoDAOImpl;
import java.util.List;

public class TelefonoBO {
    private TelefonoDAO tdao;
    
    public Boolean crear(TelefonoDTO telefono)
    {
        this.tdao = new TelefonoDAOImpl();
        TelefonoDTO p = this.tdao.create(telefono);
        return p != null;
    }
    
    public TelefonoDTO editar(String numero, TelefonoDTO telefono)
    {
        this.tdao = new TelefonoDAOImpl();
        TelefonoDTO t = this.tdao.findById(numero);
        if(t == null) return null;
        else
        {
            if(telefono.getOperador().equals("")) telefono.setOperador(t.getOperador());
            return this.tdao.edit(numero, telefono);
        }
    }
    
    public Boolean eliminar(String numero)
    {
        this.tdao = new TelefonoDAOImpl();
        return this.tdao.delete(numero);
    }
    
    public TelefonoDTO findById(String numero)
    {
        this.tdao = new TelefonoDAOImpl();
        TelefonoDTO t = this.tdao.findById(numero);
        if(t != null) return t;
        else return null;
    }
    
    public List<TelefonoDTO> findAll()
    {
        this.tdao = new TelefonoDAOImpl();
        List<TelefonoDTO> t = this.tdao.findAll();
        return t;
    }
    
    public List<TelefonoDTO> findByDuenio(Long cedulaDuenio)
    {
        this.tdao = new TelefonoDAOImpl();
        List<TelefonoDTO> t = this.tdao.findByDuenio(cedulaDuenio);
        return t;
    }
    
    public Integer contar()
    {
        this.tdao = new TelefonoDAOImpl();
        Integer n = this.tdao.count();
        return n;
    }
}
