package ch.nextcarwash.backend.tagservice.repo;

import ch.nextcarwash.backend.tagservice.model.TagEntity;
import org.springframework.data.repository.Repository;

/**
 * Datenbank-Zugriff auf die Tags
 */
public interface TagRepository extends Repository<TagEntity, Long> {
}