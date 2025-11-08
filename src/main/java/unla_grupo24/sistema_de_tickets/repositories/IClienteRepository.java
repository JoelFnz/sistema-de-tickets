package unla_grupo24.sistema_de_tickets.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unla_grupo24.sistema_de_tickets.entities.Cliente;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Long> {
}
