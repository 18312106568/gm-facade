package gm.facade.fee.entity.fee;

import gm.facade.fee.entity.base.Freight;
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
@Table(name = "jf_fee_car_rental_dtl")
public class CarRentalDtlFee extends Freight {
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
     * 加班费
     */
    @Column( name = "overtime_pay")
    private Double overtimePay;

    /**
     * 服务费
     */
    @Column( name = "service_charge")
    private Double serviceCharge;

    /**
     * 超公里数服务费
     */
    @Column( name = "over_kilometre_service_charge")
    private Double overKilometreServiceCharge;

    /**
     * 调整费用
     */
    @Column( name = "adjustment_costs")
    private String adjustmentCosts;

    /**
     * 合计应付运费1
     */
    @Column( name = "total_freight_payable1")
    private Double totalFreightPayable1;

    /**
     * 合计应付运费2
     */
    @Column( name = "total_freight_payable2")
    private Double totalFreightPayable2;

    /**
     * 合计应付不付运费
     */
    @Column( name = "total_unpaid_freight_payable")
    private Double totalUnpaidFreightPayable;

    /**
     * 合计实付运费
     */
    @Column( name = "total_payment_of_freight")
    private Double totalPaymentOfFreight;

    /**
     * 合计待付运费
     */
    @Column( name = "total_freight_to_be_paid")
    private Double totalFreightToBePaid;

    /**
     * 运费结算支付标志
     */
    @Column( name = "freight_pay_flag")
    private Boolean freightPayMark;

    /**
     * 运费付款单ID
     */
    @Column( name = "freight_bill_id")
    private Long freightBillId;

    /**
     * 运费支付日期
     */
    @Column( name = "freight_payment_date")
    private Date freightPaymentDate;
}
