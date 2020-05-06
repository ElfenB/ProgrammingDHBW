package java2.chapter16.exercises;
public class ArrayStack {
    private int[] values = new int[16];     // zugrundeliegendes Feld
    private int size = 0;                   // aktuelle Stapelgröße

    /**
     * Fügt den neuen Wert am oberen Stackende ein.
     * 
     * @param value
     */
    public void push(int value) {
        // TODO
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
        // TODO
        return 0;
    }

    /**
     * Prüft, ob der Stack leer ist, also ob er keine Knoten enthält.
     * 
     * @return <code>true</code> gdw. der Stack leer ist
     */
    public boolean isEmpty() {
        // TODO
        return false;
    }

    @Override
    public String toString() {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        System.out.println(stack);
        stack.push(1);
        stack.push(3);
        stack.push(2);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        stack.push(5);
        stack.push(4);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
        stack.pop();                        // Stack leer -> Exception
        // TODO
    }
}