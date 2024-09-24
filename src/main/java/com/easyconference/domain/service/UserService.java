/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.easyconference.domain.service;

/**
 *
 * @author Ashlee Campaz
 */
public class UserService {
    
    IUserService userService; 
    
    public UserService (IUserService IuserService){
        this.userService = IuserService;
    }
   public boolean login(String correo, String contrasenia){
   
       return userService.login(correo, contrasenia); 
   } 
   
}
