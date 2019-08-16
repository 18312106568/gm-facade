package gm.facade.fee.entity;

import gm.facade.fee.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * 计费模式表
 */
@Data
@Entity
@Table(name = "jf_freight_mode")
public class FreightMode extends BaseEntity {


    @Column(name = "name")
    private String name;

//    /**
//     * 细单公式
//     */
//    @Column(name = "doc_exp")
//    private String docExp;
//
//    /**
//     * 总单公式
//     */
//    @Column(name = "dtl_exp")
//    private String dtlExp;

    /**
     * 运算分组配置
     */
//    @OneToMany(mappedBy = "freightMode",fetch=FetchType.EAGER)
//    private List<FreightConfigGroup> freightConfigGroups;

}
