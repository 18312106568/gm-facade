package gm.facade.fee.service;

import gm.facade.fee.entity.FreightMode;

import java.util.List;

public interface FreightModeService {
    /**
     * 通过物流模式ID获取有效计费模式
     * @param logisticId
     * @return
     */
    List<FreightMode> getModeByLogistic(Long logisticId);
}
