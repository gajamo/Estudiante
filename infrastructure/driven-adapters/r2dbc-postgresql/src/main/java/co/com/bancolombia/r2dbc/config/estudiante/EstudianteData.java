package co.com.bancolombia.r2dbc.config.estudiante;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Table("sources")
public class EstudianteData {
    @Id
    Long id;

    @Column("nombre")
    Long nombre;

    @Column("apellido")
    String apellido;

    @Column("telefono")
    String description;

    @Column("edad")
    Integer edad;

    @Column("signo")
    String signo;
}
