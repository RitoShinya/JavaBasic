package practice13.common;

public class SuperHero extends Hero{

	public SuperHero() {
		super();

	}
	private practice13.common.Item equipment;
	Item power;
    Item additionalDamage;
	public Item getEquipment() {
		return this.equipment;
	}

	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}


	void attack(int power, int additionalDamage) {
        power += additionalDamage;
   }
}
