package cinefinder.api.repository;

import cinefinder.api.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository <Cinema, Long> {
}
