package skeleton;

public class Character {
    private int health = 100;
    private String state = "alive";
    private String transformation = "mode 1";

    public void attackWithCommonAttack(){
        attackWhithAPowerOf((30));

    }

    public void attackWhithAPowerOf(int power){
        if ( health>= power){
            health-= power;
        }
        else
            health = 0;
            state = "dead";
    }

    public int getHealth(){
        return health;
    }

    public boolean isDead (){
        return state.equals("dead");
    }

    public void transform(){
        if (transformation.equals("mode 1"))
            transformation = "mode 2";
        else
            transformation = "mode 3";
    }

    public String getTransformation(){
        return transformation;
    }
}
