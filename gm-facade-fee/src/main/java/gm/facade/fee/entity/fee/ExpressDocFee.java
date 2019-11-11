package gm.facade.fee.entity.fee;

import gm.common.base.annotation.FieldName;
import gm.facade.fee.entity.base.FreightDoc;
import gm.facade.fee.entity.base.FreightDtl;
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
@Table(name = "jf_fee_express_doc",catalog = "快递计费总单")
public class ExpressDocFee extends FreightDoc {
    /**
     * 承运商
     */
    @FieldName(name = "承运商")
    @Column( name = "carrier")
    private String carrier;


    /**
     * 出车时段
     */
    @FieldName(name = "出车时段")
    @Column( name = "departure_time")
    private String departureTime;

    /**
     * 签收单数
     */
    @FieldName(name = "签收单数")
    @Column( name = "receipt_num")
    private Integer receiptNum;

    /**
     * 签收单运费
     */
    @FieldName(name = "签收单运费")
    @Column( name = "receipt_fee")
    private Double receiptFee;

    /**
     * 送货件数
     */
    @FieldName(name = "送货件数")
    @Column( name = "delivery_num")
    private Integer deliveryNum;

    /**
     * 计费件数
     */
    @FieldName(name = "计费件数")
    @Column( name = "billing_piece_num")
    private Integer billingPieceNum;

    /**
     * 件数运费
     */
    @FieldName(name = "件数运费")
    @Column( name = "billing_piece_fee")
    private Double billingPieceFee;

    /**
     * 代收货款金额
     */
    @FieldName(name = "代收货款金额")
    @Column( name = "collection_amount")
    private Double collectionAmount;

    /**
     * 代收货款服务费
     */
    @FieldName(name = "代收货款服务费")
    @Column( name = "collection_fee")
    private Double collectionFee;

    /**
     * 签收单总运费
     */
    @FieldName(name = "签收单总运费")
    @Column( name = "total_receipt_fee")
    private Double totalReceiptFee;

    /**
     * 应补差额运费
     */
    @FieldName(name = "应补差额运费")
    @Column( name = "compensable_margin_fee")
    private Double compensableMarginFee;


}
