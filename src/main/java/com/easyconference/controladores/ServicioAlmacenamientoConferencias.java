package com.easyconference.controladores;
import java.util.List;
import com.easyconference.accesoADatos.InterfaceRepositorioConferencia;
import com.easyconference.gestion_conferencias.Gestion_conferencias;


public class ServicioAlmacenamientoConferencias {
    
    private InterfaceRepositorioConferencia referenciaRepositorioConferencias;
    
    //puedo enviar objetos que pertenecen a clases que implementan la interface
    public ServicioAlmacenamientoConferencias(InterfaceRepositorioConferencia referenciaRepositorioConferencias)
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
