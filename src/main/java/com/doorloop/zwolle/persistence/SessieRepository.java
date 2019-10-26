package com.doorloop.zwolle.persistence;


        import com.doorloop.zwolle.domain.Sessie;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Component;

@Component
public interface SessieRepository extends CrudRepository<Sessie, Long> {
}
