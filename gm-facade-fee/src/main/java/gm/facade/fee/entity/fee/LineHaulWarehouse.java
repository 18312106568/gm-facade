package gm.facade.fee.entity.fee;

import com.google.gson.annotations.SerializedName;
import gm.common.base.annotation.FieldName;
import gm.facade.fee.constant.SpecialVehicleType;
import gm.facade.fee.entity.base.FreightDtl;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 干线计费细单
 */
@Data
@Entity
@Table(name = "jf_fee_linehaul_warehouse",catalog = "干线计费仓库表")
public class LineHaulWarehouse implements Serializable {


    @Id
    @Column(name = "docid")
    @FieldName(name = "总单ID")
    private Long docId;

    /**
     * 干线线路
     */
    @FieldName(name = "干线线路")
    @Column( name = "trunkline")
    private String trunkline;

    /**
     * 到达仓库
     */
    @FieldName(name = "到达仓库")
    @Column(name = "arrive_war_name")
    private String arriveWarName;

    /**
     * 到达仓库数
     */
    @FieldName(name = "到达仓库数")
    @Column(name = "arrive_war_num")
    private Integer arriveWarNum;

    /**
     * 起运仓库(取自WMS《签收单查询》，现系统中只有仓库编号，需要把实际的仓库名称显示出来)
     */
    @FieldName(name = "起运仓库")
    @Column(name = "warehouse")
    @SerializedName("WAREHOUSE")
    private String warehouse;

    /**
     * 落地配仓库(干线业务显示落地配仓库，非干线业务显示起运仓库)
     */
    @FieldName(name = "目的仓库")
    @Column(name = "purpose_warehouse")
    private String groundDepot;

    /**
     * 经停仓库
     */
    @FieldName(name = "经停仓库")
    @Column( name = "stopped_warehouse")
    private String stoppedWarehouse;
}


