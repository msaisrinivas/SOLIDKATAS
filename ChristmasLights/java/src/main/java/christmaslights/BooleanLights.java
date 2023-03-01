package christmaslights;

public class BooleanLights implements LightService {

    boolean lights[][];

    public BooleanLights() {
        lights = new boolean[1000][1000];
    }

    @Override
    public void on(int startX, int startY, int endX, int endY) {
        for (int i = startX; i < endX; i++) {
            for (int j = startY; j < endY; j++) {
                lights[i][j] = true;
            }
        }
    }

    @Override
    public void off(int startX, int startY, int endX, int endY) {
        for (int i = startX; i < endX; i++) {
            for (int j = startY; j < endY; j++) {
                lights[i][j] = false;
            }
        }
    }

    @Override
    public void toggle(int startX, int startY, int endX, int endY) {
        for (int i = startX; i < endX; i++) {
            for (int j = startY; j < endY; j++) {
                lights[i][j] = !lights[i][j];
            }
        }
    }

    @Override
    public int countLights() {
        int count = 0;
        for (int i = 0; i < this.lights.length; i++) {
            for (int j = 0; j < this.lights[i].length; j++) {
                count += lights[i][j] ? 1 : 0;
            }
        }

        return count;
    }

}
