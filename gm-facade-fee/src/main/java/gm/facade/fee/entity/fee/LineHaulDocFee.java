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
 * 干线计费总单
 */
@Data
@Entity
@Table(name = "jf_fee_linehaul_doc",catalog = "干线计费总单")
public class LineHaulDocFee extends FreightDoc {
    /**
     * 承运商
     */
    @FieldName(name = "承运商")
    @Column( name = "carrier")
    private String carrier;


    /**
     * 干线线路
     */
    @FieldName(name = "干线线路")
    @Column( name = "trunkline")
    private String trunkline;

    /**
     * 干线车牌号码
     */
    @FieldName(name = "干线车牌号码")
    @Column( name = "trunnk_line_plate")
    private String trunnkLinePlate;

    /**
     * 笼车交接总单ID
     */
    @FieldName(name = "笼车交接总单ID")
    @Column( name = "cage_car_id")
    private Long cageCarId;

    /**
     * 干线车型
     */
    @FieldName(name = "干线车型")
    @Column( name = "trunk_model")
    private String trunkModel;

    /**
     * 起运仓库
     */
    @FieldName(name = "起运仓库")
    @Column( name = "warehouse")
    private String warehouse;

    /**
     * 目的仓库
     */
    @FieldName(name = "目的仓库")
    @Column( name = "purpose_warehouse")
    private String purposeWarehouse;

    /**
     * 干线运费
     */
    @FieldName(name = "干线运费")
    @Column( name = "trunk_line_freight")
    private Double trunkLineFreight;

    /**
     * 经停仓库
     */
    @FieldName(name = "经停仓库")
    @Column( name = "stopped_warehouse")
    private String stoppedWarehouse;

    /**
     * 经停仓库数
     */
    @FieldName(name = "经停仓库数")
    @Column( name = "stopped_warehouse_number")
    private Integer stoppedWarehouseNumber;

    /**
     * 经停仓库费
     */
    @FieldName(name = "经停仓库费")
    @Column( name = "stopped_warehouse_charges")
    private Double stoppedWarehouseCharges;


    /**
     * 车型费用
     */
    @Transient
    @FieldName(name = "车型费用")
    private Double vehicleFee;
}
