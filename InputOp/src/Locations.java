import java.io.*;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) throws IOException {

        try (FileWriter local = new FileWriter("locs.txt")) {
            FileWriter directions = new FileWriter("direction.txt");

            for (Location location : locations.values()) {
                local.write(location.getLocationID() + " -- " + location.getDescription() + "\n");

                for (String direction : location.getExits().keySet()) {
                    directions.write(location.getLocationID() + " -- " + location.getExits().get(direction) + "\n");
                }
            }
        }
    }

    static {
        try (Scanner scanner = new Scanner(new FileReader("locations_big.txt"))) {
            scanner.useDelimiter(",");
            while (scanner.hasNextLine()) {
                int loc = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String desc = scanner.nextLine();
                System.out.println("Got " + loc + " description " + desc);
                Map<String, Integer> tempExits = new HashMap<>();
                locations.put(loc, new Location(loc, desc, tempExits));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader dirfile = new BufferedReader(new FileReader("directions_big.txt"))) {
            String input;

            while ((input = dirfile.readLine()) != null) {
                String[] data = input.split(",");
                int loc = Integer.parseInt(data[0]);
                String direc = data[1];
                int destination = Integer.parseInt(data[2]);
                System.out.println(loc + ": " + direc + " : " + destination);
                Location location = locations.get(loc);
                location.addExit(direc, destination);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Location getOrDefault(Object key, Location defaultValue) {
        return Map.super.getOrDefault(key, defaultValue);
    }

    @Override
    public void forEach(BiConsumer<? super Integer, ? super Location> action) {
        Map.super.forEach(action);
    }

    @Override
    public void replaceAll(BiFunction<? super Integer, ? super Location, ? extends Location> function) {
        Map.super.replaceAll(function);
    }

    @Override
    public Location putIfAbsent(Integer key, Location value) {
        return Map.super.putIfAbsent(key, value);
    }

    @Override
    public boolean remove(Object key, Object value) {
        return Map.super.remove(key, value);
    }

    @Override
    public boolean replace(Integer key, Location oldValue, Location newValue) {
        return Map.super.replace(key, oldValue, newValue);
    }

    @Override
    public Location replace(Integer key, Location value) {
        return Map.super.replace(key, value);
    }

    @Override
    public Location computeIfAbsent(Integer key, Function<? super Integer, ? extends Location> mappingFunction) {
        return Map.super.computeIfAbsent(key, mappingFunction);
    }

    @Override
    public Location computeIfPresent(Integer key, BiFunction<? super Integer, ? super Location, ? extends Location> remappingFunction) {
        return Map.super.computeIfPresent(key, remappingFunction);
    }

    @Override
    public Location compute(Integer key, BiFunction<? super Integer, ? super Location, ? extends Location> remappingFunction) {
        return Map.super.compute(key, remappingFunction);
    }

    @Override
    public Location merge(Integer key, Location value, BiFunction<? super Location, ? super Location, ? extends Location> remappingFunction) {
        return Map.super.merge(key, value, remappingFunction);
    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
