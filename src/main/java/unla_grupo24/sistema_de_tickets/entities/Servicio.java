package unla_grupo24.sistema_de_tickets.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Servicio {
    @Id
    @Setter(AccessLevel.PROTECTED)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    @NotBlank
    @Column(unique = true)
    private String titulo;

    @NotBlank
    private String descripcion;

    @ManyToMany(mappedBy = "servicios")
    private Set<Empleado> empleados;

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;
}
