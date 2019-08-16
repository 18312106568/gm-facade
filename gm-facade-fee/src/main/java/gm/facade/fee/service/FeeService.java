package gm.facade.fee.service;

import java.util.Date;

public interface FeeService {
    /**
     * 根据运输日期计费
     * @param transportDate
     * @Param operator
     * @return
     */
    Boolean computeFee(Date transportDate,String operator);
}
