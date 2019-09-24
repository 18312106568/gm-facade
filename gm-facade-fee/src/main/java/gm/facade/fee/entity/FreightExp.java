package gm.facade.fee.entity;

import gm.common.base.annotation.FieldName;
import gm.facade.fee.constant.FreightExpType;
import gm.facade.fee.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * 计费公式属性来源
 */
@Data
@Entity
@Table(name = "jf_freight_exp",catalog = "计费公式")
public class FreightExp extends BaseEntity implements Comparable<FreightExp>{

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
     * 属性方法名
     */
    @FieldName(name = "属性方法名")
    @Column(name = "cal_exp")
    private String calExp;

    /**
     * 优先级
     */
    @FieldName(name = "优先级")
    @Column(name = "priority")
    private Integer priority;


    @Override
    public int compareTo(FreightExp o) {
        if(this.priority==null){
            return -1;
        }
        if(o.priority==null){
            return 1;
        }
        return (this.priority<o.priority?-1:(this.priority==o.priority)?0:1);
    }
}
