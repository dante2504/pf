
package DAO;
  import Bean.PersonaBean;
  import java.util.ArrayList;
 import Util.ConexionBD;
  import java.sql.*;

public class PersonaDAO
{
    Connection cn=null;
    PreparedStatement    pt=null;
    ResultSet            rs=null;
    
    PersonaBean  objPersoBean=null;
    
    ArrayList<PersonaBean> lista=new ArrayList<PersonaBean>();
    
   public ArrayList<PersonaBean>  ListarPersonas()
   {
       try 
       {
       ConexionBD   objc=new ConexionBD();
       cn=objc.getConexionBD();// aqui me conecto BD
       
       pt=cn.prepareStatement("select *  from persona ;");
       rs=pt.executeQuery();
       while(rs.next())
       {
        objPersoBean=new PersonaBean();
        objPersoBean.setCodigo(rs.getInt("CODPERSO"));
        objPersoBean.setNombre(rs.getString("NOMBPERSO"));
        objPersoBean.setApellido(rs.getString("APELLIPERSO"));
        lista.add(objPersoBean);           
       }    
        pt.close();
        rs.close();
        cn.close();          
       } 
       catch (Exception e) 
       {           
       }      
      return lista;
   }
   
   public void EliminarPersona(PersonaBean obj){
        try{
            ConexionBD objc=new ConexionBD();
            cn=objc.getConexionBD();
            pt=cn.prepareStatement("delete from persona where codperso=? ;");
            pt.setInt(1,obj.getCodigo());
            pt.executeUpdate();
            pt.close();
            cn.close();
        }catch(Exception e){
            
        }      
   } 
   public void GrabarPersona(PersonaBean obj){
       try {
          ConexionBD objc=new ConexionBD();
            cn=objc.getConexionBD();
            pt=cn.prepareStatement("insert into persona values(?,?,?) ;");
            pt.setInt(1,obj.getCodigo());
            pt.setString(2,obj.getNombre());
            pt.setString(3,obj.getApellido());
            pt.executeUpdate();
            pt.close();
            cn.close(); 
       } catch (Exception e) {
       }
   }
}
