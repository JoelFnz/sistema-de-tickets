package unla_grupo24.sistema_de_tickets.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Cliente extends Usuario {
    @NotBlank
    @Column(unique = true)
    private String nroCliente;
}
