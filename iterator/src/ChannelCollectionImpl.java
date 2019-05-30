import java.util.ArrayList;
import java.util.List;

class ChannelCollectionImpl implements ChannelCollection {
    private List<Channel> channelList = new ArrayList<>();


    @Override
    public void addChannel(Channel channel) {
        channelList.add(channel);
    }

    @Override
    public void removeChannel(Channel channel) {
        channelList.remove(channel);
    }

    @Override
    public ChannelIterator iterator(ChannelType channelType) {
        return new ChannelIteratorImpl(channelType, channelList);
    }

    private class ChannelIteratorImpl implements ChannelIterator {

        private ChannelType type;
        private List<Channel> channelList;
        private int position;

        public ChannelIteratorImpl(ChannelType type, List<Channel> channelsList) {
            this.type = type;
            this.channelList = channelsList;
        }

        @Override
        public boolean hasNext() {
            while (position < channelList.size()) {
                Channel c = channelList.get(position);
                if (c.getTYPE().equals(type) || type.equals(ChannelType.ALL)) {
                    return true;
                } else
                    position++;
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel ch = channelList.get(position);
            position++;
            return ch;
        }
    }

}
