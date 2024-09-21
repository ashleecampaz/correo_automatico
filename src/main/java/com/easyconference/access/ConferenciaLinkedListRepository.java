package com.easyconference.access;

import java.util.LinkedList;
import java.util.List;
import com.easyconference.gestion_conferencias.Gestion_conferencias;
import com.easyconference.domain.service.IConferenceService;

/**
 *
 * @author HSVSTT2
 */
public class ConferenciaLinkedListRepository implements IConferenceService
{
    private LinkedList<Gestion_conferencias> listaConferencias;
    
    public ConferenciaLinkedListRepository()
    {
        this.listaConferencias= new LinkedList();
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
