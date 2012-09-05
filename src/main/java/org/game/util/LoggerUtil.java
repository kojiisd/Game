/**
 * 
 */
package org.game.util;

import org.apache.log4j.Logger;

/**
 * @author ishida
 * 
 */
public class LoggerUtil extends Logger {
	protected LoggerUtil(String name) {
		super(name);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void debug(Object message) {
		if (this.isDebugEnabled()) {
			super.debug(message);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void info(Object message) {
		if (this.isInfoEnabled()) {
			super.info(message);
		}
	}

}
