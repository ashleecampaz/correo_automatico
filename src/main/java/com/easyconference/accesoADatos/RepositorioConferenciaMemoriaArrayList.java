package com.easyconference.accesoADatos;

import java.util.ArrayList;
import java.util.List;
import com.easyconference.gestion_conferencias.Gestion_conferencias;


public class RepositorioConferenciaMemoriaArrayList implements InterfaceRepositorioConferencia{

    private ArrayList<Gestion_conferencias> listaConferencias;
    
    public RepositorioConferenciaMemoriaArrayList()
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
