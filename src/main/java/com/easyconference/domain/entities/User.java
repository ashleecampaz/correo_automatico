/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.easyconference.domain.entities;

import java.util.ArrayList;

/**
 *
 * @author Ashlee Campaz
 */
public class User {
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasenia;
    private ArrayList<String> campos_inventigacion; 
    
    public User(){}

    public String getCorreo() {
        return correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }
    
    
}
