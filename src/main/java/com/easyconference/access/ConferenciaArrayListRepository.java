package com.easyconference.access;

import com.easyconference.domain.service.IConferenceService;
import com.easyconference.domain.entities.Conference;
import com.easyconference.domain.entities.User;
import com.easyconference.domain.service.IUserService;
import java.util.ArrayList;
import java.util.List;


public class ConferenciaArrayListRepository implements IConferenceService, IUserService{

    private ArrayList<Conference> listConference;
    private ArrayList<User> listUser;
    public ConferenciaArrayListRepository()
    {
        this.listConference= new ArrayList();
        this.listUser = new ArrayList();
    }

    @Override
    public boolean storeConference(Conference objConference) {
        boolean bandera=this.listConference.add(objConference);
        return bandera;
    }

    @Override
    public List<Conference> listConference() {
        return this.listConference;
    }

    @Override
    public boolean login(String correo, String contrasenia) {
       for (User u: listUser ){
            if(u.getCorreo().equals(correo)){
                if(u.getContrasenia().equals(contrasenia)){
                    return true; 
                }
                break;
            }
       }
       return false; 
    }
    
}
