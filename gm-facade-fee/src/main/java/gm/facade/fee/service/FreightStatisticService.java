package gm.facade.fee.service;

import gm.facade.fee.constant.FreightExpType;
import gm.facade.fee.entity.FreightMode;
import gm.facade.fee.entity.FreightStatistic;

import java.util.List;

/**
 * 计费统计服务
 */
public interface FreightStatisticService {

    /**
     * 获取汇总统计配置
     * @param freightMode
     * @param expType
     * @return
     */
    List<FreightStatistic> getFreightStatistics(FreightMode freightMode
            , FreightExpType expType);
}
