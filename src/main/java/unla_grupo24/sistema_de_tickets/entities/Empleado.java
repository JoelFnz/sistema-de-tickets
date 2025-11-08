package unla_grupo24.sistema_de_tickets.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Empleado extends Usuario {
    @NotBlank
    @Column(unique = true)
    private String nroEmpleado;

    @PastOrPresent
    private LocalDate fechaIngreso;

    @ManyToMany
    @JoinTable(
            joinColumns = @JoinColumn(referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(referencedColumnName = "id")
    )
    private Set<Servicio> servicios;
}
