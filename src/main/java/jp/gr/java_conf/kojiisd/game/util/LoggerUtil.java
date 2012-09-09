/**
 * 
 */
package jp.gr.java_conf.kojiisd.game.util;

import org.apache.log4j.Logger;

/**
 * ログに関するユーティリティクラス。
 * 
 * @author kojiisd
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
