package gm.facade.fee.entity.fee;

import com.google.gson.annotations.SerializedName;
import gm.common.base.annotation.FieldName;
import gm.facade.fee.entity.base.FreightDtl;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 租车模式手工录入表
 */
@Data
@Entity
@Table(name = "jf_fee_car_rental_manual",catalog = "租车模式手工录入表")
public class CarRentalManual implements Serializable {

    @Id
    @Column(name = "docid")
    @FieldName(name = "主键ID")
    private Long id;

    /**
     * 运输日期
     */
    @FieldName(name = "运输日期")
    @Column(name = "transport_date")
    private Date transportDate;

    /**
     * 仓库
     */
    @FieldName(name = "仓库")
    @Column( name = "warehouse")
    private String warehouse;


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

}
