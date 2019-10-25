package gm.facade.fee.service;

import gm.facade.fee.constant.CalculateType;

import java.util.Date;
import java.util.List;

public interface SpecialFeeService {

    /**
     * 根据运输日期以及物流模式计费
     * @param transportDate
     * @param operatorId
     * @param logisticMode
     * @param calculateType
     * @return
     */
    List<Long> computeFee(Date transportDate
            ,Long operatorId,Long logisticMode,CalculateType calculateType);

}
