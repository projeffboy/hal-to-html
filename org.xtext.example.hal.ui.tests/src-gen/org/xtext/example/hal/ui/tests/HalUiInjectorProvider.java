/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.hal.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.hal.ui.internal.HalActivator;

public class HalUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return HalActivator.getInstance().getInjector("org.xtext.example.hal.Hal");
	}

}
