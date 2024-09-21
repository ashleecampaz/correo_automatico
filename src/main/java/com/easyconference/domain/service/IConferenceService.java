package com.easyconference.domain.service;

import java.util.List;
import com.easyconference.gestion_conferencias.Gestion_conferencias;

public interface IConferenceService {
    public boolean almacenarConferencia(Gestion_conferencias objConferencia);
    public List<Gestion_conferencias> listarConferencias();
}
