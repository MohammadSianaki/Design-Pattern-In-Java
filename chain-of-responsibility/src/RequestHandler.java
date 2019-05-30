interface RequestHandler {
    void setNextRequestHandler(RequestHandler requestHandler);

    boolean process(RequestData requestData);
}
