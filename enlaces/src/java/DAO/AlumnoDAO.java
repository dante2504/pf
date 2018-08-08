
package DAO;

import Bean.AlumnoBean;
import Util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class AlumnoDAO {
   Connection cn=null;     //variable inicializada
PreparedStatement pt=null; //variable para realiza operaciones en la bsdts
ResultSet rs=null;   //sirve para analizar linea por liena las consultas a la base de batos
AlumnoBean objAlumBean=null;  // se crea el objeto  para  llamar variables de dicha clase
ArrayList<AlumnoBean> lista=new ArrayList<AlumnoBean>(); //se  crea el arraylist

public ArrayList<AlumnoBean> ListarAlumnos() //la clase tipo arraylist
{
    try{
        ConexionBD objc=new ConexionBD(); //se crea el objeto para llamar a la clase conexion
        cn=objc.getConexionBD(); //se iguala la variabe al valor de la funcion de la clase connection
        
        pt=cn.prepareStatement("select * from alumno ;"); // realiza operaciones y se almacenaran en pt
        rs=pt.executeQuery(); //el resulset analizara linea por linea
        while(rs.next()){ //mientras se pueda continuar con el resulset
            objAlumBean =new AlumnoBean();  //objeto nuevo de la clase persona bean
            objAlumBean.setCodAlum(rs.getInt("CodAlum"));//se llenara la variable de persona bean con el de la bsdts
            objAlumBean.setNomAlum(rs.getString("NomAlum"));//igual
            objAlumBean.setApelliAlum(rs.getString("ApelliAlum"));//igual
            objAlumBean.setDniAlum(rs.getInt("DniAlum"));
            objAlumBean.setTelefAlum(rs.getInt("TelefAlum"));
            objAlumBean.setDirecAlum(rs.getString("DirecAlum"));
            objAlumBean.setCorreoAlum(rs.getString("CorreoAlum"));
            objAlumBean.setEdadAlum(rs.getInt("EdadAlum"));
            objAlumBean.setPswAlum(rs.getString("PswAlum"));
            objAlumBean.setCodApod1(rs.getInt("CodApod"));
            objAlumBean.setCodMod1(rs.getInt("CodMod"));
            lista.add(objAlumBean); //aaqui se guardaran los datos almacenados por grupos
        }
        pt.close(); //se cierran todo lo usado despues que se detuvo el while
        rs.close(); //igual
        cn.close(); //igual
    }
    catch(Exception e){ //para evitar el colapso del programa
        
    }
    return lista; // es una funcion de tipo arraylist y lista es su variable con valores
}

public void EliminarPersona(AlumnoBean obj){
    try{
    ConexionBD objc= new ConexionBD();
    cn=objc.getConexionBD();
    pt=cn.prepareStatement("delete from Alumno where CodAlum=? ");
    pt.setInt(1,obj.getCodAlum());
    pt.executeUpdate();
    pt.close();
    cn.close();
    }
    catch(Exception e){
        
    }
   
}

    
  public void GrabarAlumno(AlumnoBean obj){
    try{
    ConexionBD objc= new ConexionBD();
    cn=objc.getConexionBD();
    pt=cn.prepareStatement("insert into Alumno values(?,?,?,?,?,?,?,?,?,?,?) ");
    pt.setInt(1,obj.getCodAlum());
    pt.setString(2,obj.getNomAlum());
    pt.setString(3,obj.getApelliAlum());
    pt.setInt(4,obj.getDniAlum());
    pt.setInt(5,obj.getTelefAlum());
    pt.setString(6,obj.getDirecAlum());
    pt.setString(7,obj.getCorreoAlum());
    pt.setInt(8,obj.getEdadAlum());
    pt.setString(9,obj.getPswAlum());
    pt.setInt(10,obj.getCodApod1());
    pt.setInt(11,obj.getCodMod1());
    pt.executeUpdate();
    pt.close();
    cn.close();
    }
    catch(Exception e){
        String datos;
    }
   
}
 
}
