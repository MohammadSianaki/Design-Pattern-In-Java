class MementoDemo {
    public static void main(String[] args) {

        Editor editor = new Editor();
        editor.type("First Statement");
        editor.type("Second Statement");

        EditorMemento memento = editor.save();

        editor.type("Third Statement");
        System.out.println(editor.getContent());

        editor.restore(memento);

        System.out.println(editor.getContent());
    }
}
