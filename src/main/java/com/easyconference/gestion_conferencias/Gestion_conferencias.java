/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.easyconference.gestion_conferencias;

import com.easyconference.presentation.GUIcontainer;
import com.easyconference.presentation.GUIlogin;
import com.easyconference.presentation.GUIregister;

/**
 *
 * @author Ashlee Campaz
 */
public class Gestion_conferencias {

    public static void main(String[] args) {
        GUIlogin login = new GUIlogin();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        
        //Contedor de inicio despues de iniciar sesion
        //GUIcontainer inicio = new GUIcontainer();
        //inicio.setVisible(true);
    }
}
