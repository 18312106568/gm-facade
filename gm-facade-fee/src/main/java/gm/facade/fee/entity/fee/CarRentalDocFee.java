package gm.facade.fee.entity.fee;

import gm.common.base.annotation.FieldName;
import gm.facade.fee.entity.base.FreightDoc;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 租车计费总单
 */
@Data
@Entity
@Table(name = "jf_fee_car_rental_doc",catalog = "租车计费总单")
public class CarRentalDocFee extends FreightDoc {
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
     * 加班费
     */
    @FieldName(name = "加班费")
    @Column( name = "overtime_pay")
    private Double overtimePay;

    /**
     * 服务费
     */
    @FieldName(name = "服务费")
    @Column( name = "service_charge")
    private Double serviceCharge;

    /**
     * 超公里数服务费
     */
    @FieldName(name = "超公里数服务费")
    @Column( name = "over_kilometre_fee")
    private Double overKilometreFee;

}
