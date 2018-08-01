/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.StudentBean;

import Util.ConexionBD;
import java.util.ArrayList;
import java.sql.*;

public class StudentDao {

    Connection cn = null;
    PreparedStatement pt = null;
    ResultSet rs = null;
    ArrayList<StudentBean> lista = null;
    StudentBean objAlumnoBean = null;

    public ArrayList<StudentBean> ListarAlumno() {
        try {
            cn = ConexionBD.getConexionBD();
            pt = cn.prepareStatement("select * from alumno;");
            rs = pt.executeQuery();
            lista = new ArrayList<StudentBean>();
            while (rs.next()) {
                objAlumnoBean = new StudentBean();
                objAlumnoBean.setCOD_ALU(rs.getString(1));

                objAlumnoBean.setPAS_ALU(rs.getString(2));
                objAlumnoBean.setNOMB_ALU(rs.getString(3));
                objAlumnoBean.setAPEPAT_ALU(rs.getString(4));
                objAlumnoBean.setAPEMAT_ALU(rs.getString(5));
                objAlumnoBean.setDNI_ALU(rs.getString(6));
                objAlumnoBean.setFEC_NAC_ALU(rs.getString(7));
                objAlumnoBean.setTURN_ALU(rs.getString(8));
                objAlumnoBean.setTEL_ALU(rs.getString(9));
                lista.add(objAlumnoBean);
            }

            cn.close();
            pt.close();
            rs.close();
        } catch (Exception e) {

        }
        return lista;

    }

    public int InsertarAlumno(StudentBean objAlumnoBean) {
        int estado = 0;
        try {
            cn = ConexionBD.getConexionBD();
            pt = cn.prepareStatement("INSERT INTO ALUMNO(COD_ALU,PAS_ALU,NOMB_ALU,APEPAT_ALU,APEMAT_ALU,DNI_ALU,FEC_NAC_ALU,TURN_ALU,TEL_ALU) VALUES(?,?,?,?,?,?,?,?,?);");

            pt.setString(1, objAlumnoBean.getCOD_ALU());
            pt.setString(2, objAlumnoBean.getPAS_ALU());
            pt.setString(3, objAlumnoBean.getNOMB_ALU());
            pt.setString(4, objAlumnoBean.getAPEPAT_ALU());
            pt.setString(5, objAlumnoBean.getAPEMAT_ALU());
            pt.setString(6, objAlumnoBean.getDNI_ALU());
            pt.setString(7, objAlumnoBean.getFEC_NAC_ALU());
            pt.setString(8, objAlumnoBean.getTURN_ALU());
            pt.setString(9, objAlumnoBean.getTEL_ALU());
            estado = pt.executeUpdate();
            pt.close();
            cn.close();
        } catch (Exception e) {

        }
        return estado;
    }

    public boolean ValidarUsuario(StudentBean objalumnoBean) {
        boolean val = false;
        try {
            cn = ConexionBD.getConexionBD();
            pt = cn.prepareStatement("select  * from  docente  where USU_DOC=? and PASS_DOC=?;  ");
            pt.setString(1, objalumnoBean.getCOD_ALU());
            pt.setString(2, objalumnoBean.getPAS_ALU());
            rs = pt.executeQuery();

            if (rs.next()) {
                val = true;
            }

            pt.close();
            rs.close();
            cn.close();
        } catch (Exception e) {
        }
        return val;
    }

}
