class Editor {
    private String content = "";

    public String type(String words) {
        return content += words;
    }

    public String getContent() {
        return content;
    }

    public EditorMemento save() {
        return new EditorMemento(this.content);
    }

    public void restore(EditorMemento memento) {
        this.content = memento.getContent();
    }
}
