package gm.facade.fee.entity.wms;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "SCM_ADDRESS_DOC")
public class Address {
    /**
     * 送货地址ID
     */
    @Id
    @Column(name = "ADDRESSID")
    private Long addressid;


    /**
     * 客户类型
     */
    @Column(name = "CUSTOMTYPE")
    private String customtype;


    /**
     * 省份
     */
    @Column(name = "PROVINCE")
    private String province;


    /**
     * 城市
     */
    @Column(name = "CITY")
    private String city;


    /**
     * 送货点编码
     */
    @Column(name = "POINTCODE")
    private String pointcode;


    /**
     * 送货分点编码
     */
    @Column(name = "VICEPOINTCODE")
    private String vicepointcode;


    /**
     * 二次分货标志
     */
    @Column(name = "SECSPLITFLAG")
    private Integer secsplitflag;


    /**
     * 透析液标志
     */
    @Column(name = "DIALYSATEFLAG")
    private Integer dialysateflag;


    /**
     * 透析液自提标志
     */
    @Column(name = "DIALPICKFLAG")
    private Integer dialpickflag;


    /**
     * 上楼楼层
     */
    @Column(name = "FLOOR")
    private Integer floor;


    /**
     * 委外配送服务线路补贴
     */
    @Column(name = "ALLOWANCE")
    private Integer allowance;

}
