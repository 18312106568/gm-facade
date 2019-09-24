package gm.facade.fee.entity;

import gm.common.base.annotation.FieldName;
import gm.facade.fee.constant.FieldType;
import gm.facade.fee.constant.FreightExpSourceType;
import gm.facade.fee.constant.FreightExpType;
import gm.facade.fee.entity.base.IdEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * 计费公式属性来源
 */
@Data
@Entity
@Table(name = "jf_freight_exp_source",catalog = "计费公式属性来源")
public class FreightExpSource extends IdEntity {

    @FieldName(name = "模式ID")
    @ManyToOne(optional=false)
    @JoinColumn(name = "mode_id")
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
     * 数据来源 （0-基础数据,1-配置表,2-统计数据）
     */
    @FieldName(name = "数据来源 （0-基础数据,1-配置表,2-统计数据）")
    @Enumerated(EnumType.ORDINAL)
    @Column( name = "source")
    private FreightExpSourceType source;

}
