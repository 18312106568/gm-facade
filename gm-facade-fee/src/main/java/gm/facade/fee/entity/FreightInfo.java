package gm.facade.fee.entity;

import gm.facade.fee.constant.FreightExpType;
import gm.facade.fee.entity.base.*;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.Map;

/**
 * 计费信息表（细单）
 */
@Data
@Entity
@Table(name = "jf_freight_info")
@ToString(exclude = {"freightMode"})
public class FreightInfo  extends BaseEntity
        implements Statisticable, Configable, Parametable, BackFillable {
    //主键ID 计费模式ID 有效性 运费 计费时间 计费模式信息

    @ManyToOne(optional=false)
    @JoinColumn(name = "mode_id")
    private FreightMode freightMode;

    /**
     * 有效性
     */
    @Column(name = "status")
    private Boolean status;

    /**
     * 运单时间
     */
    @Column(name = "transport_date")
    private Date transportDate;

    /**
     * 各计费模式详情,json
     */
    @Column(name = "details")
    private String details;

    @Transient
    Map<String,Object> expResultMap;

    /**
     * 公式类型(0-细单1-总单)
     */
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "type")
    private FreightExpType type;

    /**
     * 总单ID
     */
    @Column(name = "dtl_id")
    private Long dtlId;

    /**
     * 运费
     */
    @Column(name = "amount")
    private Double amount;


}
