import java.util.HashSet;
import java.util.Set;

final public class HeavenlyBody {

    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satelittes;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satelittes = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon){
        return this.satelittes.add(moon);
    }

    public Set<HeavenlyBody> getSatelittes() {
        return new HashSet<>(this.satelittes); //to avoid npe
    }
}
