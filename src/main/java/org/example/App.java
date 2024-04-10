package org.example;

/**
 * Starting the game.
 */
public final class App {
    /** Warrior health point. */
    private static final int WARRIOR_HEALTH = 100;
    /** Warrior damage */
    private static final int WARRIOR_DAMAGE = 15;
    /**  Mage health point. */
    private static final int MAGE_HEALTH = 80;
    /** Mage damage */
    private static final int MAGE_DAMAGE = 20;
    /** Archer Health point. */
    private static final int ARCHER_HEALTH = 90;
    /** Archer damage  */
    private static final int ARCHER_DAMAGE = 18;

    private App() {
        throw new AssertionError("Cannot instantiate utility class");
    }


    public static void main(final String[] args) {
        runGame();
    }

    private static void runGame() {
        final Game game = new Game();
        game.addCharacter(new Warrior("Conan", WARRIOR_HEALTH, WARRIOR_DAMAGE));
        game.addCharacter(new Mage("Merlin", MAGE_HEALTH, MAGE_DAMAGE));
        game.addCharacter(new Archer("Legolas", ARCHER_HEALTH, ARCHER_DAMAGE));

        game.startGame();
    }
}