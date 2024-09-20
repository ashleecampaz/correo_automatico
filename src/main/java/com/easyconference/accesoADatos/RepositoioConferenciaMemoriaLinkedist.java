package com.easyconference.accesoADatos;

import java.util.LinkedList;
import java.util.List;
import com.easyconference.gestion_conferencias.Gestion_conferencias;

/**
 *
 * @author HSVSTT2
 */
public class RepositoioConferenciaMemoriaLinkedist implements InterfaceRepositorioConferencia
{
    private LinkedList<Gestion_conferencias> listaConferencias;
    
    public RepositoioConferenciaMemoriaLinkedist()
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
