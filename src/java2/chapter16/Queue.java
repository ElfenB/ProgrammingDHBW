package java2.chapter16;
public class Queue {
    private Node head = null;           // Anfang der Schlange
    private Node tail = null;           // Ende der Schlange

    /**
     * Fügt den neuen Wert am Schlangenende ein.
     * 
     * @param value
     */
    public void put(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = node;                // bei leerer Schlange auch head anpassen
        } else {
            tail.setNext(node);
        }
        tail = node;                    // tail ist nun der neue Knoten
    }

    /**
     * Liefert den Wert vom Schlangenanfang und entfernt ihn dabei.
     * 
     * @return Wert vom Anfang der Schlange
     * @throws IllegalStateException wenn die Schlange leer ist
     */
    public int get() {
        if (isEmpty()) {
            throw new IllegalStateException("Die Schlange ist leer.");
        }
        Node node = head;
        head = node.getNext();          // head ist nun der nächste Knoten
        if (head == null) {
            tail = null;                // bei leerer Schlange auch tail anpassen
        }
        return node.getValue();
    }

    /**
     * Prüft, ob die Schlange leer ist, also ob sie keine Knoten enthält.
     * 
     * @return <code>true</code> gdw. die Schlange leer ist
     */
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String toString() {
        String result = "Schlange: ";
        Node current = head;
        while (current != null) {
            result += " " + current;
            current = current.getNext();
        }
        return result;
    }
}