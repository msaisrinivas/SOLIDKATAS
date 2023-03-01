package christmaslights;

import christmaslights.BooleanLights;
import christmaslights.LightService;
import christmaslights.NumberLights;

public class Main {
    public static void main(String[] args) {
        LightService santa;

        santa = new BooleanLights();
        santa.on(887, 9, 959, 629);
        santa.on(454, 398, 844, 448);

        santa.off(539, 243, 559, 965);
        santa.off(370, 819, 676, 868);
        santa.off(145, 40, 370, 997);
        santa.off(301, 3, 808, 453);

        santa.on(351, 678, 951, 908);

        santa.toggle(720, 196, 897, 994);
        santa.toggle(831, 394, 904, 860);

        System.out.println("Boolean Lights count: "+santa.countLights());

        santa = new NumberLights();
        santa.on(887, 9, 959, 629);
        santa.on(454, 398, 844, 448);

        santa.off(539, 243, 559, 965);
        santa.off(370, 819, 676, 868);
        santa.off(145, 40, 370, 997);
        santa.off(301, 3, 808, 453);

        santa.on(351, 678, 951, 908);

        santa.toggle(720, 196, 897, 994);
        santa.toggle(831, 394, 904, 860);

        System.out.println("Number Lights count: "+santa.countLights());
    }
}
