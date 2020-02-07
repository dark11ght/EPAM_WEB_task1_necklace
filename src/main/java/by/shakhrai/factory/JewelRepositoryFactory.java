package by.shakhrai.factory;

public final class JewelRepositoryFactory {
    private static final JewelRepositoryFactory instance = new JewelRepositoryFactory();

    private JewelRepositoryFactory(){

    }

    public static JewelRepositoryFactory getInstance(){
        return instance;
    }
}
