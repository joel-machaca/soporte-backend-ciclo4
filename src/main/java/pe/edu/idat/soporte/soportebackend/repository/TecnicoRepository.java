package pe.edu.idat.soporte.soportebackend.repository;

import org.springframework.stereotype.Repository;
import pe.edu.idat.soporte.soportebackend.model.Cliente;
import pe.edu.idat.soporte.soportebackend.model.Tecnico;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class TecnicoRepository implements ITecnicoRepository{
    private final List<Tecnico> bdTecnico=new ArrayList<>();
    public TecnicoRepository() {
        bdTecnico.add(new Tecnico(1,"87984637","Daniela","Cruz","juan01@gmail.com","987654321","hardware"));
        bdTecnico.add(new Tecnico(2,"87945447","Maria","paredes","laura02@gmail.com","975846123","software"));
        bdTecnico.add(new Tecnico(3,"87985471","Fernando","Vega","fernando03@gmail.com","936152874","redes"));
    }

    @Override
    public Optional<Tecnico> findById(Integer id) {
        return bdTecnico.stream()
                .filter(tecnico -> tecnico.getId()== id)
                .findFirst();
    }

}
