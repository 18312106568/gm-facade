package gm.facade.fee.service;

import gm.facade.fee.entity.wms.TransportBase;

public interface TransportBaseHangUpService {

    /**
     * 校验签收单是否挂起
     * @param transportBase
     */
    void hangUpTransportBase(TransportBase transportBase);

    /**
     * 校验签收单是否挂起
     * @param loadingListId
     * @param receiptId
     */
    void hangUpTransportBase(Long loadingListId,Long receiptId);
}
