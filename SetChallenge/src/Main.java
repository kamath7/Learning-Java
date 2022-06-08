import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {

        HeavenlyBody temp = new Planet("Earth", 90);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Mars", 200);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Venus", 910);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new DwarfPlanet("Pluto", 12);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody temp1 = new Planet("Mars",190);

        HeavenlyBody tempMoon = new Moon("Moon", 29);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellite(tempMoon);

        System.out.println("Planets ");
        for(HeavenlyBody planet: planets){
            System.out.println("\n"+ planet.getName());
        }

        HeavenlyBody body = solarSystem.get("Earth");
        System.out.println("Moons of body "+body.getName());
        for(HeavenlyBody moons: body.getSatelittes()){
            System.out.println("\n"+moons.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet: planets){
            moons.addAll(planet.getSatelittes());
        }
        System.out.println("All moons");
        for(HeavenlyBody moon: moons){
            System.out.println("\n"+moon.getName());
        }


        for(HeavenlyBody planet: planets){
//            System.out.println(planet.getName() + " -> "+planet.getOrbitalPeriod());
            System.out.println(planet);
        }

        HeavenlyBody earth1 = new Planet("Earth",21);
        HeavenlyBody earth2 = new Planet("Earth",211);
        System.out.println(earth2.equals(earth1));
        System.out.println(earth1.equals(earth2));
        System.out.println(earth1.equals(temp1));
        System.out.println(temp.equals(earth1));


    }
}