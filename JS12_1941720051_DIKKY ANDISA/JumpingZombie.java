public class JumpingZombie extends Zombie {
    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
        }
        public void heal() {
        switch (this.level) {
            case 1:
                 this.health += (30 / 100 * this.health);
                 break;
            case 2:
                this.health += (40 / 100 * this.health);
                 break;
            case 3:
              this.health += (50 / 100 * this.health);
                 break;
              }
    }

    public void destroyed() {
    this.health -= (10 * this.health / 100);
    }
    
    public String getZombieInfo() {
    String info = super.getZombieInfo();
    return "Jumping Zombie Data = \n"
    + info;
    }
    
}