package by.shakhrai.factory;

import by.shakhrai.service.JewelService;
import by.shakhrai.service.NecklaceService;
import by.shakhrai.service.impl.JewelServiceImpl;
import by.shakhrai.service.impl.NecklaceServiceImpl;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final JewelService jewelServiceImpl = new JewelServiceImpl();
    private final NecklaceService necklaceServiceImpl = new NecklaceServiceImpl();

    private ServiceFactory() {

    }

    public static ServiceFactory getInstance() {
        return instance;
    }


    public JewelService getJewelServiceImpl() {
        return jewelServiceImpl;
    }

    public NecklaceService getNecklaceServiceImpl() {
        return necklaceServiceImpl;
    }
}
