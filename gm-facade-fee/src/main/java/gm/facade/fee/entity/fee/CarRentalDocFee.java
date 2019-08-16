package gm.facade.fee.entity.fee;

import gm.facade.fee.entity.base.Freight;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 租车计费细单
 */
@Data
@Entity
@Table(name = "jf_fee_car_rental_doc")
public class CarRentalDocFee extends Freight {

    /**
     * 仓库
     */
    @Column( name = "warehouse")
    private String warehouse;

    /**
     * 运输日期
     */
    @Column( name = "transport_date")
    private Date transportDate;

    /**
     * 车牌号码
     */
    @Column( name = "license_plate")
    private String licensePlate;

    /**
     * 租车服务商
     */
    @Column( name = "rental_servicer")
    private String rentalServicer;

    /**
     * 租车模式
     */
    @Column( name = "car_rental_model")
    private String carRentalModel;

    /**
     * 签收单数
     */
    @Column( name = "singular_number_of_signatures_and_receipts")
    private Integer singularNumberOfSignaturesAndReceipts;

    /**
     * 送货点数
     */
    @Column( name = "delivery_points_num")
    private Integer deliveryPointsNum;

    /**
     * 送货分点数
     */
    @Column( name = "child_delivery_points_num")
    private Integer childDeliveryPointsNum;

    /**
     * 总箱数
     */
    @Column( name = "total_box_num")
    private Integer totalBoxNum;

    /**
     * 冷藏箱数
     */
    @Column( name = "refrigerated_containers_num")
    private Integer refrigeratedContainersNum;

    /**
     * 温控品种件数
     */
    @Column( name = "temperature_control_num")
    private Integer temperatureControlNum;

    /**
     * 路桥费
     */
    @Column( name = "road_and_bridge_fees")
    private Double roadAndBridgeFees;

    /**
     * 停车费
     */
    @Column( name = "parking_rate")
    private Double parkingRate;

    /**
     * 工作日加班时长
     */
    @Column( name = "overtime_hours_on_weekdays")
    private String overtimeHoursOnWeekdays;

    /**
     * 休息日加班时长
     */
    @Column( name = "overtime_hours_on_rest_days")
    private String overtimeHoursOnRestDays;

    /**
     * 节假日加班时长
     */
    @Column( name = "overtime_hours_on_holidays")
    private String overtimeHoursOnHolidays;

    /**
     * 起始里程（KM）
     */
    @Column( name = "initial_mile")
    private Double initialMile;

    /**
     * 结束里程（KM）
     */
    @Column( name = "end_mile")
    private Double endMile;

    /**
     * 行驶里程（KM）
     */
    @Column( name = "driving_mile")
    private Double drivingMile;

    /**
     * 附加费用
     */
    @Column( name = "additional_costs")
    private Double additionalCosts;

    /**
     * 附加费用说明
     */
    @Column( name = "additional_costs_remark")
    private String additionalCostsRemark;

}
