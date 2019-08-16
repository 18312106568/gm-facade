package gm.facade.fee.service;

import gm.facade.fee.constant.FreightExpType;
import gm.facade.fee.entity.FreightConfigGroup;
import gm.facade.fee.entity.FreightMode;

import java.util.List;

/**
 * 计费分组服务
 */
public interface FreightGroupService {

    /**
     * 获取运费分组配置
     * @param freightMode
     * @param expType
     * @return
     */
    List<FreightConfigGroup> getFreightConfigGroups(
            FreightMode freightMode, FreightExpType expType);


}
