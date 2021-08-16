package abstraction;

// what all concrete weapons have in common
public abstract class Weapon {
    protected int damage;
    protected String damageType;

    // accessor

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }
}
