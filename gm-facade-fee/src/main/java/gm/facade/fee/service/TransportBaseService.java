package gm.facade.fee.service;

import gm.common.base.sql.SimpleCondition;
import gm.facade.fee.constant.CustomType;
import gm.facade.fee.entity.FreightGroupDj;
import gm.facade.fee.entity.wms.TransportAddress;
import gm.facade.fee.entity.wms.TransportBase;
import gm.facade.fee.entity.wms.TransportBaseV;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 签收单服务
 */
public interface TransportBaseService {



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
     * 根据日期、物流模式Ids获取签收单
     * @param transportDate
     * @param logisticModes
     * @return
     */
    List<TransportBaseV> findTransportBaseV(Date transportDate, List<Long> logisticModes);

    /**
     * 根据日期、承运商、物流模式获取签收单
     * @param transportDate
     * @param carrier
     * @param logisticMode
     * @return
     */
    List<TransportBaseV> findTransportBaseV(
            Date transportDate,String carrier,Long logisticMode);

    /**
     * 按时间维度获取签收单
     * @param startDate
     * @param endDate
     * @param isHangUp
     * @return
     */
    List<TransportBaseV> findTransportBaseV(Date startDate,Date endDate,Boolean isHangUp);

    /**
     * 按时间维度物流模式获取签收单
     * @param startDate
     * @param endDate
     * @param isHangUp
     * @param logisticsMode
     * @return
     */
    List<TransportBaseV> findTransportBaseV(Date startDate, Date endDate, Boolean isHangUp,Long logisticsMode);

    /**'
     * 按时间维度物流模式承运商获取签收单
     * @param startDate
     * @param endDate
     * @param carrier
     * @param isHangUp
     * @param logisticsMode
     * @return
     */
    List<TransportBaseV> findTransportBaseV(Date startDate
            , Date endDate,String carrier, Boolean isHangUp,Long logisticsMode);

    /**
     * 按时间维度物流模式承运商获取签收单
     * @param startDate
     * @param endDate
     * @param carrier
     * @param isHangUp
     * @param logisticsModeIds
     * @return
     */
    List<TransportBaseV> findTransportBaseV(Date startDate
            , Date endDate, Boolean isHangUp,List<Long> logisticsModeIds);

    /**
     * 根据关系键id获取签收单
     * @param mappingIds
     * @return
     */
    List<TransportBaseV> findTransportBaseV(List<Long> mappingIds);


    /**
     * 获取签收单
     * @param identity
     * @return
     */
    TransportBase getTransportBase(TransportBase.Identity identity);

    /**
     * 添加计费额外数据
     * @param transportBaseVList
     * @return
     */
    List<TransportBaseV> additionalData(List<TransportBaseV> transportBaseVList);

    /**
     * 设置点件计费模式客户类型
     */
    void setDjGroupCache(FreightGroupDj freightGroupDj);

    /**
     * 设置点件计费模式客户类型
     * @param freightGroupDjId
     */
    void setDjGroupCache(Long freightGroupDjId);

    /**
     * 获取点件计费模式客户类型
     * @param transportBaseV
     * @return
     */
    CustomType getDjGroupCache(TransportBaseV transportBaseV);


    /**
     * 查询签收单
     * @param mainAndCondition
     * @param mainOrCondition
     * @return
     */
    List<TransportBaseV>  search(Collection<SimpleCondition> mainAndCondition
            , Collection<SimpleCondition> mainOrCondition);


}
