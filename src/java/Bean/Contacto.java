/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author Desktop
 */
@ManagedBean
@SessionScoped
public class Contacto {
    
    private String nombre;
    private String apellido;
    private String email;
    private Date fdate;
    private String telefono = "+34 999 999 999";
    private String mensaje;

    public String enviar() {
    
     FacesMessage mensajeResultado = new FacesMessage("La information Esta valida");
     String salida = "resultado";
     FacesContext.getCurrentInstance().addMessage(null, mensajeResultado);
     return salida;
  }
    public void validarEmail(FacesContext context, UIComponent toValidate, Object value) throws ValidatorException {
     String correo = (String) value;
     if(!correo.toLowerCase().matches( "^[a-z0-9]+([_\\.-][a-z0-9]+)*@([a-z0-9]+([\\.-][a-z0-9]+)*)+\\.[a-z]{2,}" ) ) {
        FacesMessage message = new FacesMessage("La dirección de email, no es correcta");
        throw new ValidatorException(message);
     }
  }
    
    //Aqui va los Getters U Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFdate() {
        return fdate;
    }

    public void setFdate(Date fdate) {
        this.fdate = fdate;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    
    

}
