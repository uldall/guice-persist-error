package eu.uldall.guice_persist_error;

import com.google.inject.AbstractModule;

public class TestModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(TestService.class).to(TestServiceImpl.class);
	}

}
