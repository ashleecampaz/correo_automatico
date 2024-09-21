package com.easyconference.domain.service;
import java.util.List;
import com.easyconference.access.IConferenceRepository;
import com.easyconference.domain.entities.Conference;


public class ConferenceService {
    
    private IConferenceRepository referenceRepositoryConferency;
    
    //puedo enviar objetos que pertenecen a clases que implementan la interface
    public ConferenceService(IConferenceRepository referenciaRepositorioConferencias)
    {
        this.referenceRepositoryConferency=referenceRepositoryConferency;
    }
    
    public boolean almacenarConferencia(Conference objConfererence) {
        boolean bandera=this.referenceRepositoryConferency.storeConference(objConfererence);
        return bandera;
    }

    public List<Conference> listarConferencias() {
        return this.referenceRepositoryConferency.listConference();
    }
}
