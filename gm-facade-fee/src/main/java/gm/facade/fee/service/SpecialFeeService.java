package gm.facade.fee.service;

import gm.facade.fee.constant.CalculateType;
import gm.facade.fee.entity.FreightMode;
import gm.facade.fee.entity.base.Freight;
import gm.facade.fee.entity.wms.TransportBaseV;

import java.util.Date;
import java.util.List;

public interface SpecialFeeService {

//    /**
//     * 根据运输日期以及物流模式计费
//     * @param transportDate
//     * @param operatorId
//     * @param logisticMode
//     * @param calculateType
//     * @return
//     */
//    List<Long> computeFee(Date transportDate
//            ,Long operatorId,Long logisticMode,CalculateType calculateType);
//
//    /**
//     * 根据运输日期范围以及物流模式计费
//     * @param startDate
//     * @param endDate
//     * @param operatorId
//     * @param logisticMode
//     * @param calculateType
//     * @return
//     */
//    List<Long> computeFee(Date startDate, Date endDate
//            , Long operatorId, Long logisticMode, CalculateType calculateType);

    /**
     * 专车计费模式
     * @param freightMode
     * @param transportBaseVList
     * @param operatorId
     * @param calculateType
     * @param isSave
     * @return
     */
    List<Freight> compute(FreightMode freightMode, List<TransportBaseV> transportBaseVList
            , Long operatorId, CalculateType calculateType, Boolean isSave) ;

}
