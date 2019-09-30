package gm.facade.fee.service;

import gm.facade.fee.entity.wms.TransportAddress;
import gm.facade.fee.entity.wms.TransportBase;
import gm.facade.fee.entity.wms.TransportBaseV;

import java.util.Date;
import java.util.List;
import java.util.Map;

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
    void addTransportBase(TransportBase transportBase);

    /**
     * 新增送货地址
     * @param transportAddress
     */
    void addAddress(TransportAddress transportAddress);

    /**
     * 获取非挂起签收单,按物流模式Id分组
     * @param transportDate
     * @return
     */
//    Map<Long, List<TransportBase>> findTransportBase(Date transportDate);

    /**
     * 获取非挂起签收单
     * @param transportDate
     * @return
     */
    List<TransportBaseV> findTransportBaseV(Date transportDate);

    /**
     * 根据日期、物流模式获取签收单
     * @param transportDate
     * @param logisticMode
     * @return
     */
    List<TransportBaseV> findTransportBaseV(Date transportDate,Long logisticMode);

    /**
     * 按时间维度获取签收单
     * @param startDate
     * @param endDate
     * @param isHangUp
     * @return
     */
    List<TransportBaseV> findTransportBaseV(Date startDate,Date endDate,Boolean isHangUp);

    /**
     * 根据关系键id获取签收单
     * @param mappingIds
     * @return
     */
    List<TransportBaseV> findTransportBaseV(List<Long> mappingIds);
}
