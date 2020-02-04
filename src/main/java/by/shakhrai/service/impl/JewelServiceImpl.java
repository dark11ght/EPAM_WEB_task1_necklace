package by.shakhrai.service.impl;

import by.shakhrai.factory.DAOFactory;
import by.shakhrai.factory.ServiceFactory;
import by.shakhrai.service.JewelService;

public class JewelServiceImpl implements JewelService {
    private DAOFactory daoFactory = DAOFactory.getInstance();
    private ServiceFactory serviceFactory = ServiceFactory.getInstance();
}
