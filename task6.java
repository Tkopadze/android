import java.util.HashMap;
import java.util.LinkedList;
class O1RemovalDataStructure<T> {
    private final HashMap<T, Integer> keyToIndex; 
    private final LinkedList<T> list; 

    public O1RemovalDataStructure() {
        keyToIndex = new HashMap<>();
        list = new LinkedList<>();
    }

    public void add(T element) {
        if (!keyToIndex.containsKey(element)) {
            keyToIndex.put(element, list.size());
            list.addLast(element);
        }
    }

    public void remove(T element) {
        if (keyToIndex.containsKey(element)) {
            int index = keyToIndex.get(element);
            T lastElement = list.getLast();

      
            list.set(index, lastElement);
            keyToIndex.put(lastElement, index);

           
            list.removeLast();
            keyToIndex.remove(element);
        }
    }

    public T getRandomElement() {
        if (!list.isEmpty()) {
            int randomIndex = (int) (Math.random() * list.size());
            return list.get(randomIndex);
        }
        return null;
    }

    public static void main(String[] args) {
        O1RemovalDataStructure<Integer> dataStructure = new O1RemovalDataStructure<>();

       
        dataStructure.add(1);
        dataStructure.add(2);
        dataStructure.add(3);

    
        dataStructure.remove(2);

       
        Integer randomElement = dataStructure.getRandomElement();
        System.out.println("Random Element: " + randomElement);
    }
}
