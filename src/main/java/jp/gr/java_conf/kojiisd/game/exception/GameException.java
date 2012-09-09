/**
 * 
 */
package jp.gr.java_conf.kojiisd.game.exception;

/**
 * @author ishida
 * 
 */
public class GameException extends RuntimeException {
	public GameException(String message) {
		super(message);
	}

	public GameException(String message, Throwable th) {
		super(message, th);
	}
}
