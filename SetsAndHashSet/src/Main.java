import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private  static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> plantets = new HashSet<>();
    public static void main(String[] args) {

        //sets are unordered
        HeavenlyBody temp = new HeavenlyBody("Mercury",22);
        solarSystem.put(temp.getName(), temp);
        plantets.add(temp);

        temp = new HeavenlyBody("Venus",53);
        solarSystem.put(temp.getName(), temp);
        plantets.add(temp);

        temp = new HeavenlyBody("Earth",87);
        solarSystem.put(temp.getName(), temp);
        plantets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon",210);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        System.out.println("Planets ");
        for(HeavenlyBody planet: plantets){
            System.out.println("\n"+ planet.getName());
        }

        HeavenlyBody body = solarSystem.get("Earth");
        System.out.println("Moons of body "+body.getName());
        for(HeavenlyBody moons: body.getSatelittes()){
            System.out.println("\n"+moons.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet: plantets){
            moons.addAll(planet.getSatelittes());
        }
        System.out.println("All moons");
        for(HeavenlyBody moon: moons){
            System.out.println("\n"+moon.getName());
        }
    }
}