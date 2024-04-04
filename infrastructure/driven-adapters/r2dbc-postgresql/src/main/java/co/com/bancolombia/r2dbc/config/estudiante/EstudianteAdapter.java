package co.com.bancolombia.r2dbc.config.estudiante;


import co.com.bancolombia.model.estudiante.gateways.EstudianteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class EstudianteAdapter implements EstudianteRepository {
}
