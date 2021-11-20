/*
 * generated by Xtext 2.25.0
 */
package fr.irisa.ui;

import com.google.inject.Injector;
import fr.irisa.dslcsv.ui.internal.DslcsvActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DslCsvExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(DslcsvActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		DslcsvActivator activator = DslcsvActivator.getInstance();
		return activator != null ? activator.getInjector(DslcsvActivator.FR_IRISA_DSLCSV) : null;
	}

}