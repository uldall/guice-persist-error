package eu.uldall.guice_persist_error;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

public class TestServiceImpl implements TestService {

	@Inject
	private Provider<EntityManager> entityManager;

	@Override
	@Transactional
	public Long createEvent(String name) {
		Event event = new Event(name);
		
		System.out.println("Is transaction active? " + entityManager.get().getTransaction().isActive() );
		
		entityManager.get().persist(event);
		
		return event.getId();
	}

}
