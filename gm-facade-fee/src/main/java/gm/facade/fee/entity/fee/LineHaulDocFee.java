package gm.facade.fee.entity.fee;

import gm.facade.fee.entity.base.Freight;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 干线计费细单
 */
@Data
@Entity
@Table(name = "jf_fee_linehaul_doc")
public class LineHaulDocFee extends Freight {

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
     * 落地配仓库
     */
    @Column( name = "ground_depot")
    private String groundDepot;

    /**
     * 经停仓库
     */
    @Column( name = "stopped_warehouse")
    private String stoppedWarehouse;
}


