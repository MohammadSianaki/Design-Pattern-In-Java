class Channel {
    private double frequency;
    private ChannelType TYPE;

    public Channel(double frequency, ChannelType TYPE) {
        this.frequency = frequency;
        this.TYPE = TYPE;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public ChannelType getTYPE() {
        return TYPE;
    }

    public void setTYPE(ChannelType TYPE) {
        this.TYPE = TYPE;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "frequency=" + frequency +
                ", TYPE=" + TYPE +
                '}';
    }
}
