package gm.facade.fee.entity;

import gm.common.base.annotation.FieldName;
import gm.facade.fee.constant.FieldDomainType;
import gm.facade.fee.constant.FieldType;
import gm.facade.fee.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "jf_freight_field",catalog = "计费基础属性")
public class FreightField extends BaseEntity {

    /**
     * 表名
     */
    @FieldName(name = "表名")
    @Column(name = "table_name")
    private String tableName;

    /**
     * 表中文名
     */
    @FieldName(name = "表中文名")
    @Column(name = "table_name_cn")
    private String tableNameCn;

    /**
     * 列名
     */
    @FieldName(name = "列名")
    @Column(name = "column_name")
    private String columnName;


    /**
     * 列中文名
     */
    @FieldName(name = "列中文名")
    @Column(name = "column_name_cn")
    private String columnNameCn;

    /**
     * 作用范围
     */
    @FieldName(name = "作用范围 0-基础数据 1-运价表")
    @Column(name = "domain")
    private FieldDomainType domain;

    /**
     * 属性类型
     */
    @FieldName(name = "属性类型")
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "field_type")
    private FieldType fieldType;


    /**
     * 计费模式ID
     */
    @FieldName(name = "计费模式ID")
    @ManyToOne(optional=true)
    @JoinColumn(name = "mode_id")
    private FreightMode freightMode;
}
