package gm.facade.fee.entity.fee;

import gm.common.base.annotation.FieldName;
import gm.facade.fee.entity.base.FreightDoc;
import gm.facade.fee.entity.base.FreightDtl;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

/**
 * 租车计费细单
 */
@Data
@Entity
@Table(name = "jf_fee_car_rental_dtl",catalog = "租车计费细单")
public class CarRentalDtlFee extends FreightDtl {

    /**
     * 仓库
     */
    @FieldName(name = "仓库")
    @Column( name = "warehouse")
    private String warehouse;

    /**
     * 运输日期
     */
    @FieldName(name = "运输日期")
    @Column( name = "transport_date")
    private Date transportDate;

    /**
     * 车牌号码
     */
    @FieldName(name = "车牌号码")
    @Column( name = "license_plate")
    private String licensePlate;

    /**
     * 租车服务商
     */
    @FieldName(name = "租车服务商")
    @Column( name = "rental_servicer")
    private String rentalServicer;

    /**
     * 租车模式
     */
    @FieldName(name = "租车模式")
    @Column( name = "car_rental_model")
    private String carRentalModel;

    /**
     * 签收单数
     */
    @FieldName(name = "签收单数")
    @Column( name = "receipt_num")
    private Integer receiptNum;

    /**
     * 送货点数
     */
    @FieldName(name = "送货点数")
    @Column( name = "delivery_point_num")
    private Integer deliveryPointNum;

    /**
     * 送货分点数
     */
    @FieldName(name = "送货分点数")
    @Column( name = "child_delivery_point_num")
    private Integer childDeliveryPointNum;

    /**
     * 送货件数
     */
    @FieldName(name = "送货件数")
    @Column( name = "DELIVERY_NUM")
    private Integer deliveryNum;

    /**
     * 冷藏箱数
     */
    @FieldName(name = "冷藏箱数")
    @Column( name = "refrigerated_box_num")
    private Integer refrigeratedBoxNum;

    /**
     * 温控品种件数
     */
    @FieldName(name = "温控品种件数")
    @Column( name = "temperature_control_num")
    private Integer temperatureControlNum;

    /**
     * 路桥费
     */
    @FieldName(name = "路桥费")
    @Column( name = "road_and_bridge_fees")
    private Double roadAndBridgeFees;

    /**
     * 停车费
     */
    @FieldName(name = "停车费")
    @Column( name = "parking_rate")
    private Double parkingRate;

    /**
     * 工作日加班时长
     */
    @FieldName(name = "工作日加班时长")
    @Column( name = "weekday_overtime_hours")
    private Double weekdayOvertimeHours;

    /**
     * 休息日加班时长
     */
    @FieldName(name = "休息日加班时长")
    @Column( name = "rest_overtime_hours")
    private Double restOvertimeHours;

    /**
     * 节假日加班时长
     */
    @FieldName(name = "节假日加班时长")
    @Column( name = "holiday_overtime_hours")
    private Double holidayOvertimeHours;

    /**
     * 起始里程（KM）
     */
    @FieldName(name = "起始里程（KM）")
    @Column( name = "initial_mile")
    private Double initialMile;

    /**
     * 结束里程（KM）
     */
    @FieldName(name = "结束里程（KM）")
    @Column( name = "end_mile")
    private Double endMile;

    /**
     * 行驶里程（KM）
     */
    @FieldName(name = "行驶里程（KM）")
    @Column( name = "driving_mile")
    private Double drivingMile;

    /**
     * 附加费用
     */
    @FieldName(name = "附加费用")
    @Column( name = "additional_costs")
    private Double additionalCosts;

    /**
     * 附加费用说明
     */
    @FieldName(name = "附加费用说明")
    @Column( name = "additional_costs_remark")
    private String additionalCostsRemark;


    /**
     * 运输日期（年月）
     */
    @FieldName(name = "运输日期（年月）")
    @Transient
    private Date transportMonth;

    /**
     * 休息日加班费
     */
    @FieldName(name = "休息日加班费")
    @Transient
    private Double restOvertimePay;

    /**
     * 休息日加班费
     */
    @FieldName(name = "工作日加班费")
    @Transient
    private Double weekdayOvertimePay;

    /**
     * 节假日加班费
     */
    @FieldName(name = "节假日加班费")
    @Transient
    private Double holidayOvertimePay;

    /**
     * 休息日加班费
     */
    @FieldName(name = "休息日加班费率")
    @Transient
    private Double restOvertimeRate;

    /**
     * 休息日加班费
     */
    @FieldName(name = "工作日加班费率")
    @Transient
    private Double weekdayOvertimeRate;

    /**
     * 节假日加班费
     */
    @FieldName(name = "节假日加班费率")
    @Transient
    private Double holidayOvertimeRate;

    /**
     * 休息日加班费
     */
    @FieldName(name = "休息日加班费限额")
    @Transient
    private Double restOvertimePayLimit;

    /**
     * 节假日加班费
     */
    @FieldName(name = "节假日加班费限额")
    @Transient
    private Double holidayOvertimePayLimit;

}
