package by.shakhrai.service.impl;

import by.shakhrai.entity.impl.JewelAbstract;
import by.shakhrai.exceptoin.ServiceException;
import by.shakhrai.factory.DAOFactory;
import by.shakhrai.factory.JewelRepositoryFactory;
import by.shakhrai.factory.ServiceFactory;
import by.shakhrai.repository.JewelRepository;
import by.shakhrai.repository.specification.impl.JewelSpecificationByLimpidity;
import by.shakhrai.service.JewelService;

public class JewelServiceImpl implements JewelService {
    private DAOFactory daoFactory = DAOFactory.getInstance();
    private ServiceFactory serviceFactory = ServiceFactory.getInstance();
    private JewelRepositoryFactory jewelRepositoryFactory = JewelRepositoryFactory.getInstance();
    private JewelRepository jewelRepository;


    @Override
    public JewelAbstract getJewelByLimpidity(int minLimpidity, int maxLimpidity) throws ServiceException {
        return null;
    }
}
