package com.easyconference.domain.service;
import java.util.List;
import com.easyconference.gestion_conferencias.Gestion_conferencias;
import com.easyconference.domain.service.IConferenceService;


public class ConferenceService {
    
    private IConferenceService referenciaRepositorioConferencias;
    
    //puedo enviar objetos que pertenecen a clases que implementan la interface
    public ConferenceService(IConferenceService referenciaRepositorioConferencias)
    {
        this.referenciaRepositorioConferencias=referenciaRepositorioConferencias;
    }
    
    public boolean almacenarConferencia(Gestion_conferencias objConfererencia) {
        boolean bandera=this.referenciaRepositorioConferencias.almacenarConferencia(objConfererencia);
        return bandera;
    }

    public List<Gestion_conferencias> listarConferencias() {
        return this.referenciaRepositorioConferencias.listarConferencias();
    }
}
