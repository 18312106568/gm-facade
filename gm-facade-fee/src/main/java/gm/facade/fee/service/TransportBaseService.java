package gm.facade.fee.service;

import gm.facade.fee.entity.wms.Address;
import gm.facade.fee.entity.wms.TransportBase;

/**
 * 签收单服务
 */
public interface TransportBaseService {

    /**
     * 挂起符合条件的签收单
     * @param transportBase
     * @return
     */
    void hangUpTransportBase(TransportBase transportBase);


    /**
     * 新增签收单
     * @param transportBase
     * @return
     */
    Boolean addTransportBase(TransportBase transportBase);

    /**
     * 新增送货地址
     * @param address
     */
    void addAddress(Address address);
}
