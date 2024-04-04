package co.com.bancolombia.r2dbc.config.estudiante;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EstudianteDataRepository extends ReactiveCrudRepository<EstudianteData, Long>,
        ReactiveQueryByExampleExecutor<EstudianteData> {
}
