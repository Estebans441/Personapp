package co.edu.javeriana.personapp.model.dao.impl;

import co.edu.javeriana.personapp.model.dao.PersonaDAO;
import co.edu.javeriana.personapp.model.dto.PersonaDTO;
import co.edu.javeriana.personapp.util.MySQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.concurrent.locks.StampedLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonaDAOImpl implements PersonaDAO {
    
    private final MySQL mysql;
    
    public PersonaDAOImpl() {
        this.mysql = new MySQL();
    }
    
    
    @Override
    public PersonaDTO create(PersonaDTO persona) {
        try{
            this.mysql.conectar();
            String query = "INSERT INTO persona(cedula, nombre, apellido, edad, genero) VALUES("+ 
                    "'" + persona.getCedula() + "'," +
                    "'" + persona.getNombre() + "'," +
                    "'" + persona.getApellido() + "'," +
                    "'" + persona.getEdad() + "'," +
                    "'" + persona.getGenero() + "'" +
                    ");";
            System.out.println(query);

            Statement stmt = this.mysql.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.mysql.desconectar();
            
            switch (code) {
                case 1:
                    System.out.println("Se creo la persona");
                    return findById(persona.getCedula());
                default:
                    return null;
            }
            
        } catch (SQLException ex){
            Logger.getLogger(PersonaDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    @Override
    public PersonaDTO edit(Long cedula, PersonaDTO persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean delete(Long cedula) {
        try{
            String query = "DELETE FROM persona WHERE cedula = '" + cedula + "';";
            System.out.println(query);
            
            PersonaDTO persona = findById(cedula);
            System.out.println("Eliminando: " + persona);
            
            this.mysql.conectar();
            Statement stmt = this.mysql.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.mysql.desconectar();
            
            switch (code) {
                case 1:
                    System.out.println("Se elimino la persona");
                    return true;
                default:
                    return false;
            }
            
        } catch (SQLException ex){
            Logger.getLogger(PersonaDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    @Override
    public PersonaDTO findById(Long cedula) {
        try{
            this.mysql.conectar();
            String query = "SELECT * FROM persona WHERE cedula = '"+ cedula +"';";
            System.out.println(query);

            Statement stmt = this.mysql.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(query);
            if(rs.first())
            {
                PersonaDTO persona = new PersonaDTO(rs.getLong("cedula"), rs.getString("nombre"), rs.getString("apellido"), rs.getShort("edad"), rs.getString("genero").charAt(0));
                
                rs.close();
                stmt.close();
                this.mysql.desconectar();
                
                return persona;
            } 
            else 
            {
                rs.close();
                stmt.close();
                this.mysql.desconectar();
                
                return null;
            }        
            
        } catch (SQLException ex){
            Logger.getLogger(PersonaDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    @Override
    public List<PersonaDTO> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer count() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
