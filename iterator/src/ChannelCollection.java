interface ChannelCollection {

    void addChannel(Channel channel);

    void removeChannel(Channel channel);

    ChannelIterator iterator(ChannelType channelType);
}
