package com.easyconference.accesoADatos;

import java.util.List;
import com.easyconference.gestion_conferencias.Gestion_conferencias;

public interface InterfaceRepositorioConferencia {
    public boolean almacenarConferencia(Gestion_conferencias objConferencia);
    public List<Gestion_conferencias> listarConferencias();
}
