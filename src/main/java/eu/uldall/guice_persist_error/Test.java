package eu.uldall.guice_persist_error;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;

public class Test {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new TestModule(), new JpaPersistModule("postgresPersistenceUnit"));

		PersistService persistService = injector.getInstance(PersistService.class);
		persistService.start();
				
		TestService serviceToTest = injector.getInstance(TestService.class);
		
		Long id = serviceToTest.createEvent("test");
		
		System.out.println("Id: " + id);
	}

}
