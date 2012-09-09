/**
 * 
 */
package jp.gr.java_conf.kojiisd.game.model;

import java.util.Map;

/**
 * キャラクタDtoを示すクラス。
 * 
 * @author kojiisd
 * 
 */
public class CharacterDto {

	/** キャラクタID */
	private int id_;
	
	/** 名前 */
	private String name_;
	
	/** 最大HP */
	private int maxHp_;
	
	/** 最大MP */
	private int maxMp_;

	/** HP */
	private int hp_;

	/** MP */
	private int mp_;

	/** 攻撃力 */
	private int attack_;

	/** 守備力 */
	private int defence_;

	/** すばやさ */
	private int speed_;

	/** 運のよさ */
	private int luck_;

	/** 魔法耐性 */
	private Map<Integer, Integer> magicDefenceMap_;

	/** 属性 */
	private int attribute_;

	/**
	 * @return the id
	 */
	public int getId() {
		return id_;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		id_ = id;
	}

	/**
	 * @return the maxHp
	 */
	public int getMaxHp() {
		return maxHp_;
	}

	/**
	 * @param maxHp the maxHp to set
	 */
	public void setMaxHp(int maxHp) {
		maxHp_ = maxHp;
	}

	/**
	 * @return the maxMp
	 */
	public int getMaxMp() {
		return maxMp_;
	}

	/**
	 * @param maxMp the maxMp to set
	 */
	public void setMaxMp(int maxMp) {
		maxMp_ = maxMp;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name_;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		name_ = name;
	}

	/**
	 * @return the hp
	 */
	public int getHp() {
		return hp_;
	}

	/**
	 * @param hp the hp to set
	 */
	public void setHp(int hp) {
		hp_ = hp;
	}

	/**
	 * @return the mp
	 */
	public int getMp() {
		return mp_;
	}

	/**
	 * @param mp the mp to set
	 */
	public void setMp(int mp) {
		mp_ = mp;
	}

	/**
	 * @return the attack
	 */
	public int getAttack() {
		return attack_;
	}

	/**
	 * @param attack the attack to set
	 */
	public void setAttack(int attack) {
		attack_ = attack;
	}

	/**
	 * @return the defence
	 */
	public int getDefence() {
		return defence_;
	}

	/**
	 * @param defence the defence to set
	 */
	public void setDefence(int defence) {
		defence_ = defence;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed_;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		speed_ = speed;
	}

	/**
	 * @return the luck
	 */
	public int getLuck() {
		return luck_;
	}

	/**
	 * @param luck the luck to set
	 */
	public void setLuck(int luck) {
		luck_ = luck;
	}

	/**
	 * @return the magicDefenceMap
	 */
	public Map<Integer, Integer> getMagicDefenceMap() {
		return magicDefenceMap_;
	}

	/**
	 * @param magicDefenceMap the magicDefenceMap to set
	 */
	public void setMagicDefenceMap(Map<Integer, Integer> magicDefenceMap) {
		magicDefenceMap_ = magicDefenceMap;
	}

	/**
	 * @return the attribute
	 */
	public int getAttribute() {
		return attribute_;
	}

	/**
	 * @param attribute the attribute to set
	 */
	public void setAttribute(int attribute) {
		attribute_ = attribute;
	}
}
