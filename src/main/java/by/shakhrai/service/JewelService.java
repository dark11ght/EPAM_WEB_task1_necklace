package by.shakhrai.service;

import by.shakhrai.entity.JewelAbstract;
import by.shakhrai.exceptoin.ServiceException;

public interface JewelService {

    JewelAbstract getJewelByLimpidity(int minLimpidity, int maxLimpidity) throws ServiceException;
}
