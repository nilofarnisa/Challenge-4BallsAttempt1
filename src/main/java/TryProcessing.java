import processing.core.PApplet;

public class TryProcessing extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int x=0,y=0,z=0,w=0;

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
       // paintWhite();
        drawCircle();
        drawCircle2();
        drawCircle3();
        drawCircle4();
    }

    private void drawCircle4() {
        ellipse(w,(HEIGHT*4)/5, DIAMETER, DIAMETER);
        w=w+4;
    }

    private void drawCircle3() {
        ellipse(z,(HEIGHT*3)/5, DIAMETER, DIAMETER);
        z=z+3;
    }

    private void drawCircle2() {
        ellipse(y,(HEIGHT*2)/5, DIAMETER, DIAMETER);
        y=y+2;
    }

    private void drawCircle() {
        ellipse(x,HEIGHT/5, DIAMETER, DIAMETER);
        x++;
    }

    private void paintWhite() {
        background(255);
    }
}
