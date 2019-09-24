package gm.facade.fee.entity.wms;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "jf_transport_settle")
public class TransportSettle  {
    /**
     * 运费计算单ID
     */
    @Id
    @Column(name = "YSJFSETTLEID")
    private Long ysjfsettleid;


    /**
     * 运费时间段
     */
    @Column(name = "YSJFPERIOD")
    private String ysjfperiod;


    /**
     * 计费模式
     */
    @Column(name = "COSTMODE")
    private Long costmode;


    /**
     * 承运商/租车服务商/配送服务商
     */
    @Column(name = "TRANSITNAME")
    private String transitname;


    /**
     * 仓库
     */
    @Column(name = "WAREHOUSENAME")
    private String warehousename;


    /**
     * 应付运费1
     */
    @Column(name = "DUEPAY1")
    private Double duepay1;


    /**
     * 应付不符运费
     */
    @Column(name = "DUEPAYUNPAID")
    private Double duepayunpaId;


    /**
     * 应付运费2
     */
    @Column(name = "DUEPAY2")
    private Double duepay2;


    /**
     * 应付待付运费
     */
    @Column(name = "DUEPAYWAIT")
    private Double duepaywait;


    /**
     * 实付运费
     */
    @Column(name = "REALPAY")
    private Double realpay;


    /**
     * 创建日期
     */
    @Column(name = "CREDATE")
    private Date credate;
}
