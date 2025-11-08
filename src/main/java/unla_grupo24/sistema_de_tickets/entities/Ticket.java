package unla_grupo24.sistema_de_tickets.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import unla_grupo24.sistema_de_tickets.entities.constants.EstadoDeTicket;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Ticket {
    @Id
    @Setter(AccessLevel.PROTECTED)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    @NotBlank
    @Column(unique = true)
    private String nroTicket;

    @NotNull
    @Enumerated(EnumType.ORDINAL)
    private EstadoDeTicket estado;

    @CreationTimestamp
    @PastOrPresent
    @NotNull
    private LocalDateTime fechaYHoraCreacion;

    @NotNull
    private LocalDateTime fechaYHoraCaducidad;

    @ManyToOne(optional = false)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne(optional = false)
    @JoinColumn(name = "servicio_id")
    private Servicio servicioSolicitado;
}
