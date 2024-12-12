/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EjercicioPractico2.demo.dao;

import EjercicioPractico2.demo.domain.Usuario;

/**
 *
 * @author rdcd2
 */
public interface UsuarioDao {

    public Usuario findByUsername(String username);
    
}
