package com.easyconference.access;

import java.util.ArrayList;
import java.util.List;
import com.easyconference.gestion_conferencias.Gestion_conferencias;
import com.easyconference.domain.service.IConferenceService;


public class ConferenciaArrayListRepository implements IConferenceService{

    private ArrayList<Gestion_conferencias> listaConferencias;
    
    public ConferenciaArrayListRepository()
    {
        this.listaConferencias= new ArrayList();
    }
    
    @Override
    public boolean almacenarConferencia(Gestion_conferencias objConfererencia) {
        boolean bandera=this.listaConferencias.add(objConfererencia);
        return bandera;
    }

    @Override
    public List<Gestion_conferencias> listarConferencias() {
        return this.listaConferencias;
    }
    
}
