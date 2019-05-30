class DBDataHandler implements RequestHandler {

    private RequestHandler nextRequestHandler;

    @Override
    public void setNextRequestHandler(RequestHandler requestHandler) {
        nextRequestHandler = requestHandler;
    }

    @Override
    public boolean process(RequestData requestData) {
        requestData.setMetDbData("Meta Data From DB Is Populated");
        return nextRequestHandler == null || nextRequestHandler.process(requestData);
    }
}
