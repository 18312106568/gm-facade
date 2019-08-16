package gm.facade.fee.service;

import gm.facade.fee.constant.FreightExpType;
import gm.facade.fee.entity.FreightBackfillConfig;
import gm.facade.fee.entity.FreightMode;

import java.util.List;

/**
 * 计费回填服务
 */
public interface FreightBackfillService {
    /**
     * 获取计费回填配置表
     * @param freightMode
     * @param expType
     * @return
     */
    List<FreightBackfillConfig> getFreightBackfillConfigs(
            FreightMode freightMode, FreightExpType expType);
}
