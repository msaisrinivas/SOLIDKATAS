package christmaslights;

public class NumberLights implements LightService {
    int lights[][];

    public NumberLights() {
        lights = new int[1000][1000];
    }

    @Override
    public void on(int startX, int startY, int endX, int endY) {
        for (int i = startX; i < endX; i++) {
            for (int j = startY; j < endY; j++) {
                lights[i][j] += 1;
            }
        }
    }

    @Override
    public void off(int startX, int startY, int endX, int endY) {
        for (int i = startX; i < endX; i++) {
            for (int j = startY; j < endY; j++) {
                lights[i][j] -= 1;
            }
        }
    }

    @Override
    public void toggle(int startX, int startY, int endX, int endY) {
        for (int i = startX; i < endX; i++) {
            for (int j = startY; j < endY; j++) {
                lights[i][j] += 2;
            }
        }
    }

    @Override
    public int countLights() {
        int count = 0;
        for (int i = 0; i < this.lights.length; i++) {
            for (int j = 0; j < this.lights[i].length; j++) {
                count += lights[i][j];
            }
        }

        return count;
    }

}
