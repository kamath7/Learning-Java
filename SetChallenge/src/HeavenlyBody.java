import java.util.HashSet;
import java.util.Set;

final public class HeavenlyBody {

    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satelittes;

    private final BodyTypes bodyType;


    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }
    //alternate to above is below
//    public static final int STAR = 1;
//    public static final int PLANET = 2;
//    public static final int DWARF_PLANET = 3;
//    public static final int MOON = 4;
//    public static final int COMET = 5;
//    public static final int ASTEROID = 7;


    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satelittes = new HashSet<>();
        this.bodyType = bodyType;
    }

    public String getName() {
        return name;
    }

    public BodyTypes getBodyType() {
        return bodyType;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBody moon) {
        return this.satelittes.add(moon);
    }

    public Set<HeavenlyBody> getSatelittes() {
        return new HashSet<>(this.satelittes); //to avoid npe
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HeavenlyBody) {
            HeavenlyBody obj1 = (HeavenlyBody) obj;
            if (this.name.equals(obj1.getName())) {
                return this.bodyType == obj1.getBodyType();
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 69;
    }
}