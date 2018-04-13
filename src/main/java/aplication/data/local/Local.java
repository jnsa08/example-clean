package aplication.data.local;

import aplication.data.entity.ParticipanteEntity;

import java.util.List;

public interface Local {
    ParticipanteEntity obtenerPartcipante(String rut);
    boolean ingresarPartcipante(String rut, ParticipanteEntity nombre);
    List<ParticipanteEntity> obtenerPartcipantes();
}
