import processing.core.PApplet;

public class TryProcessing extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int speed =1,x=0;


    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        drawCircle(speed,HEIGHT/5);
        drawCircle(speed*2,HEIGHT*2/5);
        drawCircle(speed*3,HEIGHT*3/5);
        drawCircle(speed*4,HEIGHT*4/5);
        x++;
    }

    private void drawCircle(int speedOfBall,int position) {
        ellipse(x*speedOfBall,position,DIAMETER,DIAMETER);
    }
}
