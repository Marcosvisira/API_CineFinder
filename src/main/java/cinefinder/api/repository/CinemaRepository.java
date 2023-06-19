package cinefinder.api.repository;

import cinefinder.api.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CinemaRepository extends JpaRepository <Cinema, Long> {
    @Query("select c from Cinema c where id in :idCinema")
     List<Cinema> findAllByID(@Param("idCinema") List<Long> idCinema);
}
