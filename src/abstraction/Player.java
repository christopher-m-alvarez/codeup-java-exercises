package abstraction;

public class Player {
    private String characterName;
    private Weapon currentWeapon;


    public static void main(String[] args) {
        Player bob = new Player();

        bob.setCurrentWeapon(new Sword());
        bob.useWeapon();


        bob.setCurrentWeapon(new Club());
        bob.useWeapon();
    }

    private void useWeapon() {
        System.out.println(getCharacterName() + "attacks with their weapon and it does " + this.getCurrentWeapon().getDamage() + " damage");
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }
    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}
