package gm.facade.fee.entity.wms;

import com.google.gson.annotations.SerializedName;
import gm.common.base.annotation.FieldName;
import gm.facade.fee.entity.base.IdEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "jf_fee_base_mapping",catalog = "计费单签收单关系表")
public class TransportBaseFeeMapping implements Serializable{


    /**
     * 联合主键ID
     */
    @EmbeddedId
    @SerializedName("ID")
    private Identity id;


    @Embeddable
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Identity implements Serializable {

        @Column(name = "id")
        @FieldName(name = "主键ID")
        private Long freightId;
        /**
         * 装车单ID(取自WMS《签收单查询》/《签收单重派记录查询》)
         */
        @FieldName(name = "装车单ID")
        @Column(name = "loading_list_id")
        @SerializedName("LOADING_LIST_ID")
        private Long loadingListId;

        /**
         * 签收单ID(取自WMS《签收单查询》/《签收单重派记录查询》)
         */
        @FieldName(name = "签收单ID")
        @Column(name = "receipt_id")
        @SerializedName("RECEIPT_ID")
        private Long receiptId;
    }
}
