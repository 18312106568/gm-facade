package gm.facade.fee.entity;

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
@Table(name = "jf_freight_backfill_config")
public class FreightBackfillConfig extends BaseEntity {

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
     * 数据来源 （0-基础数据,1-配置表,2-统计数据）
     */
    @Enumerated(EnumType.ORDINAL)
    @Column( name = "source")
    private FreightExpSourceType source;

}
