package gm.facade.fee.entity;

import gm.facade.fee.constant.FreightExpType;
import gm.facade.fee.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "jf_freight_statistic")
public class FreightStatistic extends BaseEntity {

    @ManyToOne(optional=false)
    @JoinColumn(name = "mode_id")
    private FreightMode freightMode;

    /**
     * 公式类型(0-细单1-总单)
     */
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "type")
    private FreightExpType type;

    /**
     * 属性
     */
    @ManyToOne(optional=false)
    @JoinColumn(name = "field_id")
    private FreightField field;

    /**
     * 统计的属性
     */
    @ManyToOne(optional=false)
    @JoinColumn(name = "stat_field_id")
    private FreightField statField;
}
