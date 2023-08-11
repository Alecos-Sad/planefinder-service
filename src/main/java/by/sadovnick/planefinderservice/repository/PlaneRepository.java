package by.sadovnick.planefinderservice.repository;

import by.sadovnick.planefinderservice.model.Aircraft;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaneRepository extends CrudRepository<Aircraft, Long> {
}
