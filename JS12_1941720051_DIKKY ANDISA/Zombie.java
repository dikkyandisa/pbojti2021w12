public class Zombie implements Destroyable {
    protected int health;
    protected int level;
    public void heal() {
    }

    public void destroyed() {
    }

    public String getZombieInfo() {
        return "Health = " + this.health + "\n"
                + "Level = " + this.level + "\n";
    }
    

}