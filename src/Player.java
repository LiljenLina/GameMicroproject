import java.util.ArrayList;

public class Player extends Character {

    public Player(int x, int y){
        super(x, y, 'P');
    }

    public void moveUp(ArrayList<Gameobject> objs) {
        move(0, -1, objs);
    }

    public void moveDown(ArrayList<Gameobject> objs) {
        move(0, 1, objs);
    }

    public void moveRight(ArrayList<Gameobject> objs) {
        move(1, 0, objs);
    }

    public void moveLeft(ArrayList<Gameobject> objs) {
        move(-1, 0, objs);
    }

    @Override
    protected boolean onCollide(Object obj) {
        if (obj.getClass() == Monster.class) {
            alive = false;
            return true;
        }
        return false;
    }
}
