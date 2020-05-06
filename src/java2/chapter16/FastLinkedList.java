package java2.chapter16;
public class FastLinkedList implements List {
    private Node first = null;              // erster Knoten der Liste
    private Node last = null;               // letzter Knoten der Liste
    private int length = 0;

    /**
     * Liefert den ersten Knoten der Liste, der als Ausgangspunkt für einen Listendurchlauf dient.
     * 
     * @return
     */
    public Node getFirst() {
        return first;
    }

    /**
     * Liefert den letzten Knoten der Liste, der als Ausgangspunkt für einen umgekehrten Listendurchlauf dient.
     * 
     * @return
     */
    public Node getLast() {
        return last;
    }

    @Override
    public void insert(Node node, Node previous) {
    	if (previous == null) {             // am Beginn der Liste einfügen
            node.setNext(first);
            first = node;
        } else if (contains(previous)) {    // hinter Vorgängerknoten einfügen
            node.setNext(previous.getNext());
            previous.setNext(node);
        }
    	length++;
    }

    @Override
    public void remove(Node node) {
    	if (first == node) {                // ersten Knoten entfernen
            first = node.getNext();
        } else {                            // Vorgängerknoten suchen
            Node current = first;
            while (current != null && current.getNext() != node) {
                current = current.getNext();
            }
            current.setNext(node.getNext());// darauf folgenden Knoten entfernen
        }
        node.setNext(null);                 // entfernten Knoten zurücksetzen
        length--;
    }

    @Override
    public boolean contains(Node node) {
        if (node == null) {
            return false;
        }
        Node current = first;
        while (current != null && current != node) {
            current = current.getNext();
        }
        return current != null;
    }

    @Override
    public Node search(int value, Node start) {
    	if (start == null) {
            start = first;                  // Suche am Listenbeginn starten
        }
        Node current = start;
        while (current != null && current.getValue() != value) {
            current = current.getNext();    // Liste durchlaufen, bis Ende oder Treffer
        }
        return current;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public String toString() {
        String result = "Liste der Länge " + getLength() + ": ";
        Node current = first;
        while (current != null) {
            result += " " + current;
            current = current.getNext();
        }
        return result;
    }

    public static void main(String[] args) {
        List list = new FastLinkedList();
        System.out.println(list);
        System.out.println(list.search(1, null));
        Node one = new Node(1);
        list.insert(one, null);             // Knoten am Listenanfang einfügen -> 1
        System.out.println(list);
        System.out.println(list.search(1, null));
        Node two = new Node(2);
        list.insert(two, null);             // Knoten am Listenanfang einfügen -> 2, 1
        System.out.println(list);
        System.out.println(list.search(2, null));
        Node three = new Node(3);
        list.insert(three, two);            // Knoten hinter 2 einfügen -> 2, 3, 1
        System.out.println(list);
        System.out.println(list.search(2, three));
        list.remove(three);                 // Knoten 3 entfernen -> 2, 1
        System.out.println(list);
        System.out.println(list.search(1, two));
        list.remove(two);                   // Knoten 2 entfernen -> 1
        System.out.println(list);
        System.out.println(list.search(1, one));
        list.remove(one);                   // Knoten 1 entfernen -> leer
        System.out.println(list);
    }
}