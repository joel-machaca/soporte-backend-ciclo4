package pe.edu.idat.soporte.soportebackend.repository;

import org.springframework.stereotype.Repository;
import pe.edu.idat.soporte.soportebackend.model.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepository implements IClienteRepository{
    private final List<Cliente> bdCliente=new ArrayList<>();

    public ClienteRepository() {
        bdCliente.add(new Cliente(1,"12345678","juan","sanchez","juan01@gmail.com","987654321"));
        bdCliente.add(new Cliente(2,"87654321","laura","perez","laura01@gmail.com","975846123"));
    }
    @Override
    public Optional<Cliente> findById(Integer id) {
        return bdCliente.stream()
                .filter(cliente -> cliente.getId()== id)
                .findFirst();
    }
}
