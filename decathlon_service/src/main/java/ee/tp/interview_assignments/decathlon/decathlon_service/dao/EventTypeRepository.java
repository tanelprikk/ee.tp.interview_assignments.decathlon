package ee.tp.interview_assignments.decathlon.decathlon_service.dao;

import ee.tp.interview_assignments.decathlon.decathlon_service.dao.model.EventType;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface EventTypeRepository extends Repository<EventType, String> {
    EventType findByName(String name);
    List<EventType> findAll();
}
