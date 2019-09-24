package gm.facade.fee.service;

import gm.facade.fee.constant.FreightConfigType;
import gm.facade.fee.constant.FreightExpType;
import gm.facade.fee.entity.FreightConfigGroup;
import gm.facade.fee.entity.FreightExp;
import gm.facade.fee.entity.FreightMode;
import gm.facade.fee.entity.base.Freight;
import gm.facade.fee.entity.wms.TransportBase;
import gm.facade.fee.entity.wms.TransportBaseV;

import java.util.List;
import java.util.Map;

/**
 * 计费分组服务
 */
public interface FreightGroupService {

    /**
     * 获取分组配置
     * @param freightMode
     * @return
     */
//    Map<FreightExpType,FreightConfigGroup> getFreightConfigGroups(FreightMode freightMode);

    /**
     * 获取分组配置
     * @param freightMode
     * @param configType
     * @param freightExpType
     * @param specialId
     * @return
     */
    List<FreightConfigGroup> getFreightConfigGroups(FreightMode freightMode
            ,FreightConfigType configType
            ,FreightExpType freightExpType
            ,Long specialId);

    /**
     * 特殊签收单过滤
     * @param transportBaseVList
     */
    void specialConfigFilter(List<TransportBaseV> transportBaseVList);

    /**
     * 按模式生成计费批次号
     * @param freightMode
     * @param key
     * @return
     */
    Long genetatorBatchNo(FreightMode freightMode,String key);

    /**
     * 签收单分组
     * @param freight
     * @param groupConfigs
     * @return
     */
    String fetchGroupKey(Freight freight, List<FreightConfigGroup> groupConfigs);
}
