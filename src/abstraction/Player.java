package abstraction;

public class Player {
    // character name must be between 4 and 100 characters in length
    private String characterName;
    private int health;

    // this is a problem. consider if we had 50 different types of weapons
    // and the player can only ever use one of them at a time
//    private Sword currentSword;
//    private Club currentClub;
//    private Dagger currentDagger;
//    private Wand currentWWand;
//    private Bow currentBow;

    private Weapon currentWeapon;

    public Player(String characterName) {
        if(characterName.length() > 100 || characterName.length() < 4) {
            throw new IllegalArgumentException("Character name must be between 4 and 100 characters");
        }

        this.characterName = characterName;
        health = 100;
    }

    public static void main(String[] args) {
        Player currentPlayer = new Player("Bobby");
        currentPlayer.setCurrentWeapon(new Sword());

        currentPlayer.useWeapon();

        // bobby switches to a club
        currentPlayer.setCurrentWeapon(new Club());
        currentPlayer.useWeapon();

        currentPlayer.setCurrentWeapon(new Bow());
        currentPlayer.useWeapon();
    }

    private void useWeapon() {
        System.out.println(getCharacterName() + " attacks with his/her weapon and it does " + this.getCurrentWeapon().getDamage() + " damage");
    }

    // accessors

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }
}