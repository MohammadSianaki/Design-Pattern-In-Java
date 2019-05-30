class User {
    private String name;
    private ChatRoomMediator mediator;

    public User(String name, ChatRoomMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String msg) {
        this.mediator.showMessage(this, msg);
    }
}
