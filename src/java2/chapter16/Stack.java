package java2.chapter16;
public class Stack {
    private Node top = null;            // oberster Knoten des Stapels

    /**
     * Fügt den neuen Wert am oberen Stackende ein.
     * 
     * @param value
     */
    public void push(int value) {
        Node node = new Node(value);
        node.setNext(top);
        top = node;                     // top ist nun der neue Knoten
    }

    /**
     * Liefert den Wert vom oberen Stackende und entfernt ihn dabei.
     * 
     * @return oberster Stackwert
     * @throws IllegalStateException wenn der Stack leer ist
     */
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Der Stack ist leer.");
        }
        Node node = top;
        top = node.getNext();           // top ist nun der nächste Knoten
        return node.getValue();
    }

    /**
     * Prüft, ob der Stack leer ist, also ob er keine Knoten enthält.
     * 
     * @return <code>true</code> gdw. der Stack leer ist
     */
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public String toString() {
        String result = "Stack (top first): ";
        Node current = top;
        while (current != null) {
            result += " " + current;
            current = current.getNext();
        }
        return result;
    }
}