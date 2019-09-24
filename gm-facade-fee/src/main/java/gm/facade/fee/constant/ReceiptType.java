package gm.facade.fee.constant;

import com.google.gson.annotations.SerializedName;

public enum ReceiptType {
    /**
     * 类型
     * dd.SIGNFORTYPE.1	中转签收单
     * dd.SIGNFORTYPE.2	客户签收单
     * dd.SIGNFORTYPE.3	提货签收单
     */
    @SerializedName("0")
    NULL,

    @SerializedName("1")
    TRANSFER,

    @SerializedName("2")
    CUSTOMER,

    @SerializedName("3")
    TAKER
}
