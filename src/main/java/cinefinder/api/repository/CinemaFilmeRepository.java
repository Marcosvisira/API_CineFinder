package cinefinder.api.repository;


import cinefinder.api.entity.CinemaFilme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaFilmeRepository  extends JpaRepository<CinemaFilme, Long> {
}
