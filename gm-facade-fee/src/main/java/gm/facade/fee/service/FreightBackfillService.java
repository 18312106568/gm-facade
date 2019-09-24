package gm.facade.fee.service;

import gm.facade.fee.constant.FreightExpType;
import gm.facade.fee.entity.FreightBackfillConfig;
import gm.facade.fee.entity.FreightMode;
import gm.facade.fee.entity.base.Freight;

import java.util.List;
import java.util.Map;

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


    /**
     * 生成计费单
     * @param freightMode
     * @param expType
     * @param backfillResult
     * @return
     */
    Freight generatorFreight(FreightMode freightMode, FreightExpType expType
            , Map<String,Object> backfillResult);
}
