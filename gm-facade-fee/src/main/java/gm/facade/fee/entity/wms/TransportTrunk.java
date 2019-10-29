package gm.facade.fee.entity.wms;

import com.google.gson.annotations.SerializedName;
import gm.common.base.annotation.FieldName;
import gm.facade.fee.constant.CustomType;
import gm.facade.fee.constant.SpecialVehicleType;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "JF_TRUNK")
public class TransportTrunk implements Serializable {

    /**
     * 主键ID
     */
    @Id
    @Column(name = "docid")
    private Long id;

    @FieldName(name = "干线车牌号码")
    @Column(name = "trunnk_line_plate")
    private String trunnkLinePlate;

    /**
     * 干线车型(可显示8种车型。但默认“7.6米普通车”)
     */
    @FieldName(name = "干线车型")
    @Column(name = "trunk_model")
    private SpecialVehicleType trunkModel;
}
