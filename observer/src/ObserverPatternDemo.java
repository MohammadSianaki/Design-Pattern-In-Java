class ObserverPatternDemo {
    public static void main(String[] args) {

        Topic topic = new Topic();

        Observer observer1 = new TopicSubscriber("observer1");
        Observer observer2 = new TopicSubscriber("observer2");
        Observer observer3 = new TopicSubscriber("observer3");

        topic.register(observer1);
        topic.register(observer2);
        topic.register(observer3);

        observer1.setSubject(topic);
        observer2.setSubject(topic);
        observer3.setSubject(topic);

        //check if any update is available
        observer1.update();

        //send message to all observers
        topic.postMessage("New Message");
    }
}
