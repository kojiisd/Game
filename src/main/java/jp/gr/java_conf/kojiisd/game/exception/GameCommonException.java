/**
 * 
 */
package jp.gr.java_conf.kojiisd.game.exception;

/**
 * @author kojiisd
 * 
 */
public class GameCommonException extends RuntimeException {

	/** シリアライズID */
	private static final long serialVersionUID = 1L;

	/**
	 * メッセージを例外として持つコンストラクタ。
	 * 
	 * @param message メッセージ
	 */
	public GameCommonException(String message) {
		super(message);
	}

	/**
	 * 例外をパラメータとして持つコンストラクタ。
	 * 
	 * @param th 例外
	 */
	public GameCommonException(Throwable th) {
		super(th);
	}

	/**
	 * メッセージと例外をパラメータとして持つコンストラクタ。
	 * 
	 * @param message メッセージ
	 * @param th 例外
	 */
	public GameCommonException(String message, Throwable th) {
		super(message, th);
	}
}
