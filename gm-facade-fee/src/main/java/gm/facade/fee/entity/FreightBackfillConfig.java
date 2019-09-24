package gm.facade.fee.entity;

import gm.common.base.annotation.FieldName;
import gm.facade.fee.constant.FreightExpSourceType;
import gm.facade.fee.constant.FreightExpType;
import gm.facade.fee.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * 回填配置表
 */
@Data
@Entity
@Table(name = "jf_freight_backfill_config",catalog = "计费回填配置表")
public class FreightBackfillConfig extends BaseEntity {

    @ManyToOne(optional=false)
    @JoinColumn(name = "mode_id")
    @FieldName(name = "模式ID")
    private FreightMode freightMode;

    /**
     * 公式类型(0-细单1-总单)
     */
    @FieldName(name = "公式类型(0-细单1-总单)")
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "type")
    private FreightExpType type;

    /**
     * 属性
     */
    @FieldName(name = "属性")
    @ManyToOne(optional=false)
    @JoinColumn(name = "field_id")
    private FreightField field;

    /**
     * 回填属性
     */
    @FieldName(name = "回填属性")
    @ManyToOne(optional=false)
    @JoinColumn(name = "backfill_field_id")
    private FreightField backfillField;

    /**
     * 数据来源 （0-基础数据,1-配置表,2-统计数据）
     */
    @FieldName(name = "数据来源 （0-基础数据,1-配置表,2-统计数据）")
    @Enumerated(EnumType.ORDINAL)
    @Column( name = "source")
    private FreightExpSourceType source;

}
