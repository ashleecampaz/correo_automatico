package com.easyconference.access;

import com.easyconference.domain.entities.Conference;
import java.util.ArrayList;
import java.util.List;


public class ConferenciaArrayListRepository implements IConferenceRepository{

    private ArrayList<Conference> listConference;
    
    public ConferenciaArrayListRepository()
    {
        this.listConference= new ArrayList();
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
    
}
