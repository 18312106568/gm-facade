package gm.facade.fee.service;

import gm.facade.fee.constant.CalculateType;

import java.util.Date;
import java.util.List;

public interface FeeService {
    /**
     * 根据运输日期计费
     * @param transportDate
     * @Param operator
     * @return
     */
//    Boolean computeFee(Date transportDate,String operator);


    /**
     * 根据运输日期计费
     * @param transportDate
     * @param operatorId
     * @param calculateType
     * @return
     */
    List<Long> computeFee(Date transportDate, Long operatorId, CalculateType calculateType);

    /**
     * 根据运输日期以及物流模式计费
     * @param transportDate
     * @param operatorId
     * @param logisticMode
     * @param calculateType
     * @return
     */
    List<Long> computeFee(Date transportDate,Long operatorId,Long logisticMode,CalculateType calculateType);

    /**
     * 按时间维度计算签收单
     * @param startDate
     * @param endDate
     * @param operatorId
     * @param calculateType
     * @return
     */
    List<Long> computeFee(Date startDate,Date endDate, Long operatorId, CalculateType calculateType);

    /**
     * 时间范围加物流模式
     * @param startDate
     * @param endDate
     * @param operatorId
     * @param logisticMode
     * @param calculateType
     * @return
     */
    List<Long> computeFee(Date startDate,Date endDate, Long operatorId,Long logisticMode, CalculateType calculateType);
    /**
     * 生成实付单
     * @param docId
     * @param modeId
     * @return
     */
    List<Long> computePayment(Long docId,Long modeId,Long operatorId);
}
