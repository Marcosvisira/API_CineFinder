package cinefinder.api.repository;


import cinefinder.api.entity.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FilmeRepository extends JpaRepository <Filme, Long> {

    @Query("SELECT f FROM Filme f JOIN f.cinemas c WHERE c.id = :cinemaId")
    List<Filme> getFilmeByIdCinema(@Param("cinemaId") Long cinemaId);

}
