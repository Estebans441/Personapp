package co.edu.javeriana.personapp.model.dao.impl;

import co.edu.javeriana.personapp.controller.PersonaBO;
import co.edu.javeriana.personapp.model.dao.TelefonoDAO;
import co.edu.javeriana.personapp.model.dto.TelefonoDTO;
import co.edu.javeriana.personapp.util.MySQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelefonoDAOImpl implements TelefonoDAO {

    private final MySQL mysql;
    
    public TelefonoDAOImpl() {
        this.mysql = new MySQL();
    }
   
    @Override
    public TelefonoDTO create(TelefonoDTO telefono) {
        try{
            this.mysql.conectar();
            String query = "INSERT INTO telefono(numero, operador, duenio) VALUES("+ 
                    "'" + telefono.getNumero() + "'," +
                    "'" + telefono.getOperador() + "'," +
                    "'" + telefono.getDuenio().getCedula() + "'" +
                    ");";
            System.out.println(query);

            Statement stmt = this.mysql.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.mysql.desconectar();
            
            switch (code) {
                case 1:
                    System.out.println("Se creo el telefono");
                    return findById(telefono.getNumero());
                default:
                    return null;
            }
            
        } catch (SQLException ex){
            Logger.getLogger(TelefonoDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    @Override
    public TelefonoDTO edit(String numero, TelefonoDTO telefono) {
        try{
            this.mysql.conectar();
            String query = "UPDATE telefono SET "+ 
                    "operador = '" + telefono.getOperador()+ "'," +
                    "duenio = '" + telefono.getDuenio().getCedula() + "'" +
                    " WHERE numero = '" + numero + "';";
            System.out.println(query);
            
            Statement stmt = this.mysql.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.mysql.desconectar();
            
            switch (code) {
                case 1:
                    System.out.println("Se edito el telefono");
                    return findById(telefono.getNumero());
                default:
                    return null;
            }
            
        } catch (SQLException ex){
            Logger.getLogger(TelefonoDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    @Override
    public Boolean delete(String numero) {
        try{
            String query = "DELETE FROM telefono WHERE numero = '" + numero + "';";
            System.out.println(query);
            
            TelefonoDTO telefono = findById(numero);
            System.out.println("Eliminando: " + telefono);
            
            this.mysql.conectar();
            Statement stmt = this.mysql.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.mysql.desconectar();
            
            switch (code) {
                case 1:
                    System.out.println("Se elimino el telefono");
                    return true;
                default:
                    return false;
            }
            
        } catch (SQLException ex){
            Logger.getLogger(TelefonoDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    @Override
    public TelefonoDTO findById(String numero) {
        try{
            this.mysql.conectar();
            String query = "SELECT * FROM telefono WHERE numero = '"+ numero +"';";
            System.out.println(query);

            Statement stmt = this.mysql.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(query);
            if(rs.first())
            {
                PersonaBO perBO = new PersonaBO();
                TelefonoDTO telefono = new TelefonoDTO(rs.getString("numero"), rs.getString("operador"), perBO.findById((long) Integer.parseInt(rs.getString("duenio"))));
                rs.close();
                stmt.close();
                this.mysql.desconectar();
                
                return telefono;
            } 
            else 
            {
                rs.close();
                stmt.close();
                this.mysql.desconectar();
                
                return null;
            }        
            
        } catch (SQLException ex){
            Logger.getLogger(TelefonoDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    @Override
    public List<TelefonoDTO> findByDuenio(Long cedulaDuenio) {
        try{    
            List<TelefonoDTO> telefonos = new ArrayList<>();
            
            this.mysql.conectar();
            String query = "SELECT * FROM telefono WHERE duenio = "+ cedulaDuenio +";";
            System.out.println(query);
            Statement stmt = this.mysql.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(query);
            if(!rs.next()) return null;
            rs.previous();
            do
            {
                rs.next();
                PersonaBO perBO = new PersonaBO();
                TelefonoDTO telefono = new TelefonoDTO(rs.getString("numero"), rs.getString("operador"), perBO.findById(cedulaDuenio));
                telefonos.add(telefono);
            }
            while(!rs.isLast());
            
            rs.close();
            stmt.close();
            this.mysql.desconectar();
            
            return telefonos;
            
        } catch (SQLException ex){
            Logger.getLogger(TelefonoDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    @Override
    public List<TelefonoDTO> findAll() {
        try{
            
            List<TelefonoDTO> telefonos = new ArrayList<>();
            
            this.mysql.conectar();
            String query = "SELECT * FROM telefono;";
            System.out.println(query);
            Statement stmt = this.mysql.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(query);
            if(!rs.next()) return null;
            rs.previous();
            do
            {
                rs.next();
                PersonaBO perBO = new PersonaBO();
                TelefonoDTO telefono = new TelefonoDTO(rs.getString("numero"), rs.getString("operador"), perBO.findById((long) Integer.parseInt(rs.getString("duenio"))));
                telefonos.add(telefono);
            }
            while(!rs.isLast());
            
            rs.close();
            stmt.close();
            this.mysql.desconectar();
            
            return telefonos;
            
        } catch (SQLException ex){
            Logger.getLogger(TelefonoDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    @Override
    public Integer count() {
        try{
            
            Integer n = 0;
            
            this.mysql.conectar();
            String query = "SELECT * FROM telefono;";
            System.out.println(query);
            Statement stmt = this.mysql.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(query);
            do
            {
                rs.next();
                n++;
            }
            while(!rs.isLast());
            
            rs.close();
            stmt.close();
            this.mysql.desconectar();
            
            return n;
            
        } catch (SQLException ex){
            Logger.getLogger(TelefonoDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }
    
}
