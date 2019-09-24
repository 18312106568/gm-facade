package gm.facade.fee.entity;

import gm.common.base.annotation.FieldName;
import gm.facade.fee.constant.FreightExpType;
import gm.facade.fee.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "jf_freight_statistic",catalog = "计费汇总统计")
public class FreightStatistic extends BaseEntity {



    /**
     * 计费模式
     */
    @ManyToOne(optional=false)
    @JoinColumn(name = "mode_id")
    @FieldName(name = "计费模式")
    private FreightMode freightMode;

    /**
     * 公式类型(0-细单1-总单)
     */
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "type")
    @FieldName(name = "公式类型")
    private FreightExpType type;

    /**
     * 属性
     */
    @FieldName(name = "属性")
    @ManyToOne(optional=false)
    @JoinColumn(name = "field_id")
    private FreightField field;

    /**
     * 统计的属性
     */
    @FieldName(name = "统计的属性")
    @ManyToOne(optional=false)
    @JoinColumn(name = "stat_field_id")
    private FreightField statField;

    /**
     * 统计方法名
     */
    @FieldName(name = "统计方法名")
    @Column(name = "statistic_method")
    private String statisticMethod;
}
