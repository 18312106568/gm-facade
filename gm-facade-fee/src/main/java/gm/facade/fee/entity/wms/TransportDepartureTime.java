package gm.facade.fee.entity.wms;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 出车时段映射
 */
@Data
@Entity
@Table(name = "scm_ccsd_doc")
public class TransportDepartureTime implements Serializable {
    /**
     * 送货地址ID
     */
    @Id
    @Column(name = "ccsdid")
    private Long id;

    /**
     * 出车时段
     */
    @Column(name = "driveperiod")
    private String drivePeriod;

    /**
     * 计费出车时段
     */
    @Column(name = "jfdriveperiod")
    private String costDrivePeriod;
}
