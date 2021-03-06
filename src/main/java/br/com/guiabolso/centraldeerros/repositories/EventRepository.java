package br.com.guiabolso.centraldeerros.repositories;

import br.com.guiabolso.centraldeerros.dto.EventDTO;
import br.com.guiabolso.centraldeerros.entity.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

	Page<EventDTO> findAll(Specification<Event> spec, Pageable pageable);
}
