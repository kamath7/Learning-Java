import java.io.*;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new LinkedHashMap<Integer, Location>();

    public static void main(String[] args) throws IOException {

        try(RandomAccessFile raf = new RandomAccessFile("locations_rand.dat","rwd")){
            raf.writeInt(locations.size());
            int indexSize = locations.size() * 3 * Integer.BYTES;
            int locationStart = (int) (indexSize + raf.getFilePointer() + Integer.BYTES);
            raf.writeInt(locationStart);

        }
    }

    static {
        try (ObjectInputStream locFile = new ObjectInputStream(new BufferedInputStream(new FileInputStream("locations.dat")))) {
            boolean endOfile = false;

            while (!endOfile) {
                try {
                    Location location = (Location) locFile.readObject();
                    System.out.println("Location " + location.getLocationID() + " " + location.getDescription());
                    System.out.println("Found " + location.getExits().size() + " exits");
                    locations.put(location.getLocationID(), location);
                } catch (EOFException e) {
                    endOfile = true;
                }
            }
        } catch (InvalidClassException e1) {
            e1.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (ClassNotFoundException e3) {
            e3.printStackTrace();
        }
//
//            while (!endOfile) {
//                try {
//                    Map<String, Integer> exits = new LinkedHashMap<>();
//                    int locId = locFile.readInt();
//                    String description = locFile.readUTF();
//                    int numExits = locFile.readInt();
//                    System.out.println(" Read Location " + locId + " : " + description);
//                    System.out.println("Found " + numExits);
//                    for (int i = 0; i < numExits; i++) {
//                        String direction = locFile.readUTF();
//                        int destination = locFile.readInt();
//                        exits.put(direction, destination);
//                        System.out.println("\t" + direction + "," + destination);
//                    }
//                    locations.put(locId, new Location(locId, description, exits));
//                } catch (EOFException e) {
//                    endOfile = true;
//                }
//
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("locations_big.txt")))) {
//            scanner.useDelimiter(",");
//            while (scanner.hasNextLine()) {
//                int loc = scanner.nextInt();
//                scanner.skip(scanner.delimiter());
//                String desc = scanner.nextLine();
//                System.out.println("Got " + loc + " description " + desc);
//                Map<String, Integer> tempExits = new HashMap<>();
//                locations.put(loc, new Location(loc, desc, tempExits));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try (BufferedReader dirfile = new BufferedReader(new FileReader("directions_big.txt"))) {
//            String input;
//
//            while ((input = dirfile.readLine()) != null) {
//                String[] data = input.split(",");
//                int loc = Integer.parseInt(data[0]);
//                String direc = data[1];
//                int destination = Integer.parseInt(data[2]);
//                System.out.println(loc + ": " + direc + " : " + destination);
//                Location location = locations.get(loc);
//                location.addExit(direc, destination);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
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
