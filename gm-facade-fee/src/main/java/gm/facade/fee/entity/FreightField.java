package gm.facade.fee.entity;

import gm.facade.fee.constant.FieldType;
import gm.facade.fee.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "jf_freight_field")
public class FreightField extends BaseEntity {

    /**
     * 属性中文名
     */
    @Column(name = "name")
    private String name;

    /**
     * 属性代码
     */
    @Column(name = "code")
    private String code;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private FieldType type;

    @Column(name = "method_name")
    private String methodName;


    @Column(name = "remarks")
    private String remarks;


}
