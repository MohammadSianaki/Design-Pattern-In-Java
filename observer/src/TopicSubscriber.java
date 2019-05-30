class TopicSubscriber implements Observer {
    private String name;
    private Subject subject;

    public TopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) subject.getUpdate(this);
        if (msg == null) {
            System.out.println(name + ":: No new message");
        } else {
            System.out.println(name + ":: Consuming message::" + msg);
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
