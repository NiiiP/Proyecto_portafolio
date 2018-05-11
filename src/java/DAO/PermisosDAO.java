/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Conexion;
import Modelo.Permiso;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author basti
 */
public class PermisosDAO {
    
    public ArrayList<Permiso> getPermisos(){
    ArrayList<Permiso> permisos = new ArrayList();
    
        String sql = "select * from tipo_permiso ";
        try {
            PreparedStatement ps = Conexion.getCon().prepareStatement(sql);
           
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Permiso per = new Permiso();
                
                per.setCod(rs.getInt("cod_tpermiso"));
                per.setNombre(rs.getString("nombre_permiso"));
              
                        
                permisos.add(per);
            }
         rs.close();
         
 
        }
        catch(SQLException ex){
            
        }
            
         
       return permisos;
    
}
    public void generarPermiso1(int cod_permiso,int dias_solicitados, String fecha_inicio, String fecha_termino, String motivo_solicitud, String personal_rut, int tipo_permiso){
      
        
        try {
            String query = "insert into soli_permiso values(2,1,1,1,1,1,1)";
           PreparedStatement ps = Conexion.getCon().prepareStatement(query);
           
           ps.executeQuery();
       
        } catch (SQLException ex) {
            
        }
        
  
    }
    
    
    
      public int SelectMaxCodPermiso() {
        
        int cod_permiso = 0;
        try{
            String query = "select max(cod_permiso) as max from soli_permiso";
            PreparedStatement ps = Conexion.getCon().prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
           
            while(rs.next()){
            cod_permiso = rs.getInt("max");
            }
            
           cod_permiso += 1;
       
        
        }
        
        catch(SQLException ex){
        
        }
        
        return cod_permiso;
    }
    
    
}
