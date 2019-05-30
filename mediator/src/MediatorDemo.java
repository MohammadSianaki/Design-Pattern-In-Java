class MediatorDemo {
    public static void main(String[] args) {

        ChatRoomMediator mediator = new ChatRoom();

        User user1 = new User("John", mediator);
        User user2 = new User("Jane", mediator);

        user1.sendMessage("Hi There!");
        user2.sendMessage("Hey!");
    }
}
