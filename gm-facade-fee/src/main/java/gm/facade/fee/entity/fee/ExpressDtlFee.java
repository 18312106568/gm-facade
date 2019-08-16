package gm.facade.fee.entity.fee;

import gm.facade.fee.entity.base.Freight;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 快递计费总单
 */
@Data
@Entity
@Table(name = "jf_fee_express_dtl")
public class ExpressDtlFee extends Freight {
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
     * 签收单数
     */
    @Column( name = "singular_number_of_signatures_and_receipts")
    private Integer singularNumberOfSignaturesAndReceipts;

    /**
     * 签收单运费
     */
    @Column( name = "bill_of_lading_freight")
    private Double billOfLadingFreight;

    /**
     * 送货件数
     */
    @Column( name = "number_of_deliveries")
    private Integer numberOfDeliveries;

    /**
     * 计费件数
     */
    @Column( name = "number_of_billing_parts")
    private Integer numberOfBillingParts;

    /**
     * 件数运费
     */
    @Column( name = "number_of_parts_freight")
    private Double numberOfPartsFreight;

    /**
     * 代收货款金额
     */
    @Column( name = "amount_of_collection")
    private String amountOfCollection;

    /**
     * 代收货款服务费
     */
    @Column( name = "collection_service_fee")
    private Double collectionServiceFee;

    /**
     * 签收单总运费
     */
    @Column( name = "total_freight_charges_on_receipt")
    private Double totalFreightChargesOnReceipt;

    /**
     * 应补差额运费
     */
    @Column( name = "compensable_margin_freight")
    private Double compensableMarginFreight;

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
