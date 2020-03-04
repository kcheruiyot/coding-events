package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.EventCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by kipngetich
 */
@Repository
public interface EventCategoryRepository  extends CrudRepository<EventCategory,Integer> {
}
