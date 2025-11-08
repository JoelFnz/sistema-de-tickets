package unla_grupo24.sistema_de_tickets.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Domicilio {
    @Id
    @Setter(AccessLevel.PROTECTED)
    protected long id;

    @NotBlank
    private String calle;

    @NotBlank
    private String localidad;

    @OneToOne(optional = false, orphanRemoval = true)
    @MapsId
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
