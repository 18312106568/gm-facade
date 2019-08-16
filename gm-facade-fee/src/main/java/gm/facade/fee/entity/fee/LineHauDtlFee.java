package gm.facade.fee.entity.fee;

import gm.facade.fee.entity.base.Freight;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 干线计费总单
 */
@Data
@Entity
@Table(name = "jf_fee_linehaul_doc")
public class LineHauDtlFee extends Freight{
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
     * 干线线路
     */
    @Column( name = "trunkline")
    private String trunkline;

    /**
     * 干线车牌号码
     */
    @Column( name = "trunnk_line_plate")
    private String trunnkLinePlate;

    /**
     * 笼车交接总单ID
     */
    @Column( name = "cage_car_id")
    private Long cageCarId;

    /**
     * 干线车型
     */
    @Column( name = "trunk_model")
    private String trunkModel;

    /**
     * 起运仓库
     */
    @Column( name = "warehouse")
    private String warehouse;

    /**
     * 目的仓库
     */
    @Column( name = "purpose_warehouse")
    private String purposeWarehouse;

    /**
     * 干线运费
     */
    @Column( name = "trunk_line_freight")
    private Double trunkLineFreight;

    /**
     * 经停仓库
     */
    @Column( name = "stopped_warehouse")
    private String stoppedWarehouse;

    /**
     * 经停仓库数
     */
    @Column( name = "stopped_warehouse_number")
    private Integer stoppedWarehouseNumber;

    /**
     * 经停仓库费
     */
    @Column( name = "stopped_warehouse_charges")
    private Double stoppedWarehouseCharges;

    /**
     * 调整费用
     */
    @Column( name = "adjustment_costs")
    private Double adjustmentCosts;

    /**
     * 合计应付运费1
     */
    @Column( name = "total_freight_payable1")
    private Double totalFreightPayable1;

    /**
     * 合计应付运费2
     */
    @Column( name = "total_freight_payable2")
    private Double totalFreightPayable2;

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
