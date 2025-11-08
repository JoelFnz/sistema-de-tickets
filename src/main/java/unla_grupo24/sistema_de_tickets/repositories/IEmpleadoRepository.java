package unla_grupo24.sistema_de_tickets.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unla_grupo24.sistema_de_tickets.entities.Empleado;

@Repository
public interface IEmpleadoRepository extends JpaRepository<Empleado, Long> {
}
