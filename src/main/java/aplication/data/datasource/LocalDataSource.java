package aplication.data.datasource;

import aplication.data.entity.ParticipanteEntity;
import aplication.data.local.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("localDataSource")
public class LocalDataSource implements Datasource {

    @Autowired
    private Local participantesLocal;

    @Override
    public ParticipanteEntity obtenerPartcipante(String rut) {
        return participantesLocal.obtenerPartcipante(rut);
    }

    @Override
    public ParticipanteEntity crearPartcipante(String rut) {
        participantesLocal.crearPartcipante(rut);
        return null;
    }
}
