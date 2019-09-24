package gm.facade.fee.entity;

import gm.common.base.annotation.FieldName;
import gm.facade.fee.constant.FreightConfigType;
import gm.facade.fee.constant.FreightExpType;
import gm.facade.fee.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * 运费分组配置
 */
@Data
@Entity
@Table(name = "jf_freight_config_group",catalog = "计费分组配置")
public class FreightConfigGroup extends BaseEntity {

    /**
     * 运费模式
     */
    @FieldName(name = "模式ID")
    @ManyToOne(optional=false)
    @JoinColumn(name = "mode_id")
    private FreightMode freightMode;

    /**
     * 公式类型(0-DTL-细单 1-DOC-总单)
     */
    @FieldName(name = "公式类型(0-DTL-细单 1-DOC-总单)")
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
     * 特殊分组ID 默认为0
     */
    @FieldName(name = "特殊分组ID 默认为0")
    @Column(name = "special_id")
    private Long specialId;

    /**
     * 配置类型 0-通用 1-CONF-只用于配置，2-GROUP-只用于分组
     */
    @FieldName(name = "配置类型 0-通用 1-CONF-只用于配置，2-GROUP-只用于分组")
    @Enumerated(EnumType.ORDINAL)
    @Column( name = "config_type")
    private FreightConfigType configType;

    /**
     * 运价属性
     */
    @FieldName(name = "运价属性ID")
    @ManyToOne(optional=false)
    @JoinColumn(name = "config_field_id")
    private FreightField configField;

}
