/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.AdministradorBean;
import Util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Dante Quispe
 */
public class AdministradorDao {
     Connection                      cn = null;
    PreparedStatement               pt = null;
    ResultSet                       rs = null;
    ArrayList<AdministradorBean>   listadoUsuario = null;
    AdministradorBean              objAdmiBean = null;
    public boolean ValidarUsuario(AdministradorBean objAdmiBean)
    {
        boolean val=false;
        try {
            cn=ConexionBD.getConexionBD();
            pt=cn.prepareStatement("select  * from  administrador  where Id_admi=? and Pass_admi=?;  ");
            pt.setString(1, objAdmiBean.getCOD_DIR());
            pt.setString(2, objAdmiBean.getPAS_DIR());
            rs=pt.executeQuery();
            
            if(rs.next())
            { val=true;
            }
            
            pt.close();
            rs.close();
            cn.close();
        } catch (Exception e) {
        }
        return val;
    } 
    
}
