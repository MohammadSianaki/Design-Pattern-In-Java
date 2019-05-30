final class President {
    private static President INSTANCE;

    private President() {
        //no instance
    }

    public static President getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (President.class) {
                INSTANCE = new President();
            }
        }
        return INSTANCE;
    }
}
