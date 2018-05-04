/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2.aplicacion.controlador.beans.form;

import Punto2.aplicacion.modelo.dominio.Registro;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@RequestScoped
public class RegistroFormBean implements Serializable{

    private Registro registro;
    
    public RegistroFormBean() {
        registro = new Registro();
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }
    
}
