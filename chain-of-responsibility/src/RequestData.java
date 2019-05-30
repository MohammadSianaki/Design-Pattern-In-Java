class RequestData {
    private String metDbData;
    private String metaFileData;
    private String metaCloudData;

    public String getMetDbData() {
        return metDbData;
    }

    public void setMetDbData(String metDbData) {
        this.metDbData = metDbData;
    }

    public String getMetaFileData() {
        return metaFileData;
    }

    public void setMetaFileData(String metaFileData) {
        this.metaFileData = metaFileData;
    }

    public String getMetaCloudData() {
        return metaCloudData;
    }

    public void setMetaCloudData(String metaCloudData) {
        this.metaCloudData = metaCloudData;
    }

    @Override
    public String toString() {
        return "RequestData [" +
                "metDbData='" + metDbData + ",\n" +
                "metaFileData='" + metaFileData + ",\n" +
                "metaCloudData='" + metaCloudData + ",\n" +
                ']';
    }
}
