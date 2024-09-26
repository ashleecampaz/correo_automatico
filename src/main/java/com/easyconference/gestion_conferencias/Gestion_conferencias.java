/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.easyconference.gestion_conferencias;

import com.easyconference.access.Factory;
import com.easyconference.domain.service.UserService;
import com.easyconference.presentation.GUIcontainer;
import com.easyconference.presentation.GUIlogin;
import com.easyconference.presentation.GUIregister;
import com.easyconference.access.IUserService;
import com.easyconference.plugin.manager.EmailPluginManager;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ashlee Campaz
 */
public class Gestion_conferencias {

    public static void main(String[] args) {
        IUserService repoPro = (IUserService) Factory.getInstance().getRepository("default");
        
        String basePath = getBaseFilePath();
        try {
            EmailPluginManager.init(basePath);

            UserService userService = new UserService((IUserService) repoPro);
            GUIlogin login = new GUIlogin(userService);
            login.setLocationRelativeTo(null);
            login.setVisible(true);

        } catch (Exception ex) {
            Logger.getLogger("Gestion_conferencias").log(Level.SEVERE, "Error al ejecutar la aplicación", ex);
        }
        
        
        //Contedor de inicio despues de iniciar sesion
        //GUIcontainer inicio = new GUIcontainer();
        //inicio.setVisible(true);
    }
    
    private static String getBaseFilePath() {
        try {
            String path = Gestion_conferencias.class.getProtectionDomain().getCodeSource().getLocation().getPath();
            path = URLDecoder.decode(path, "UTF-8"); //This should solve the problem with spaces and special characters.
            File pathFile = new File(path);
            if (pathFile.isFile()) {
                path = pathFile.getParent();
                
                if (!path.endsWith(File.separator)) {
                    path += File.separator;
                }
                
            }

            return path;
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Gestion_conferencias.class.getName()).log(Level.SEVERE, "Error al eliminar espacios en la ruta del archivo", ex);
            return null;
        }
    }
}
