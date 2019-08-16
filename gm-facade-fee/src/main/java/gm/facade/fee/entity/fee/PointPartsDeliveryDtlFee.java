package gm.facade.fee.entity.fee;

import gm.facade.fee.entity.base.Freight;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 点件配送总单
 */
@Data
@Entity
@Table(name = "jf_fee_pointparts_dtl")
public class PointPartsDeliveryDtlFee extends Freight {

    /**
     * 承运商
     */
    @Column( name = "carrier")
    private String carrier;

    /**
     * 运输日期
     */
    @Column( name = "transport_date")
    private Date transportDate;

    /**
     * 出车时段
     */
    @Column( name = "departure_time")
    private String departureTime;

    /**
     * 省份
     */
    @Column( name = "province")
    private String province;

    /**
     * 城市
     */
    @Column( name = "city")
    private String city;

    /**
     * 客户类型
     */
    @Column( name = "customer_type")
    private String customerType;

    /**
     * 送货点数
     */
    @Column( name = "delivery_points_num")
    private Integer deliveryPointsNum;

    /**
     * 送货点运费
     */
    @Column( name = "delivery_point_freight")
    private Double deliveryPointFreight;

    /**
     * 送货分点数
     */
    @Column( name = "child_delivery_points_num")
    private Integer childDeliveryPointsNum;

    /**
     * 送货分点运费
     */
    @Column( name = "child_delivery_point_freight")
    private Double childDeliveryPointFreight;

    /**
     * 送货件数
     */
    @Column( name = "number_of_deliveries")
    private Integer numberOfDeliveries;

    /**
     * 送货件运费
     */
    @Column( name = "delivery_freight")
    private Double deliveryFreight;

    /**
     * 点件总运费
     */
    @Column( name = "total_point_freight")
    private Double totalPointFreight;

    /**
     * 出车费
     */
    @Column( name = "exit_fare")
    private Double exitFare;

    /**
     * 调整费用
     */
    @Column( name = "adjustment_costs")
    private String adjustmentCosts;

    /**
     * 合计应付运费1
     */
    @Column( name = "total_freight_payable1")
    private Double totalFreightPayable1;

    /**
     * 合计应付运费2
     */
    @Column( name = "total_freight_payable2")
    private Double totalFreightPayable2;

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
