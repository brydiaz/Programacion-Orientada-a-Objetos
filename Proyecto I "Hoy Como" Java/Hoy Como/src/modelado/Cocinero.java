/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelado;

/**
 *
 * @author bryan
 */
public class Cocinero extends Usuario{
    
    public Cocinero(String nombreDeUsuario, String password, String nombre) {
        super(nombreDeUsuario, password, nombre);
        this.setTipo("Cocinero");
    }
    
    
}
