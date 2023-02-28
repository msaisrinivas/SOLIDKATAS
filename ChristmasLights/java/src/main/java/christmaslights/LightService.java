package christmaslights;

public interface LightService {
    void on(int startX,int startY, int endX,int endY);
    void off(int startX,int startY, int endX,int endY);
    void toggle(int startX,int startY, int endX,int endY);
    int countLights();
}
