package gm.facade.fee.entity.base;

import gm.common.base.annotation.FieldName;
import gm.facade.fee.constant.CalculateType;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Data
@MappedSuperclass
public class FreightDoc extends Freight {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name = "docid")
    @FieldName(name = "主键ID")
    private Long id;

    /**
     * 调整费用
     */
    @FieldName(name = "调整费用")
    @Column( name = "adjustment_fee")
    private Double adjustmentFee;


    /**
     * 合计应付运费1
     */
    @FieldName(name = "合计应付运费1")
    @Column( name = "total_payable_fee1")
    private Double totalPayableFee1;

    /**
     * 合计应付运费2
     */
    @FieldName(name = "合计应付运费2")
    @Column( name = "total_payable_fee2")
    private Double totalPayableFee2;

    /**
     * 合计应付不付运费
     */
    @FieldName(name = "合计应付不付运费")
    @Column( name = "total_unpaid_fee")
    private Double totalUnpaidFee;

    /**
     * 合计实付运费
     */
    @FieldName(name = "合计实付运费")
    @Column( name = "total_payment_fee")
    private Double totalPaymentFee;

    /**
     * 合计待付运费
     */
    @FieldName(name = "合计待付运费")
    @Column( name = "total_to_be_paid_fee")
    private Double totalToBePaidFee;

    /**
     * 核算单ID
     */
    @FieldName(name = "核算单ID")
    @Column(name = "ysjfsettleid")
    private Long settleId;

    /**
     * 运费结算支付标志
     */
    @FieldName(name = "运费结算支付标志")
    @Column( name = "freight_pay_flag")
    private Boolean freightPayFlag;

    /**
     * 运费付款单ID
     */
    @FieldName(name = "运费付款单ID")
    @Column( name = "freight_bill_id")
    private Long freightBillId;

    /**
     * 运费支付日期
     */
    @FieldName(name = "运费支付日期")
    @Column( name = "freight_payment_date")
    private Date freightPaymentDate;

}
