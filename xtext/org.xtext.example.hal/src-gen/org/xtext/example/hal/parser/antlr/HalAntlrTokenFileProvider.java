/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.hal.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class HalAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/example/hal/parser/antlr/internal/InternalHal.tokens");
	}
}
