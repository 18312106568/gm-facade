package gm.facade.fee.constant;

import com.google.gson.annotations.SerializedName;

/**
 * 签收单状态
 */
public enum ReceiptStatus {
    /**
     * dd.SIGNFORSTATUS.1	确认
     * dd.SIGNFORSTATUS.2	部分成功
     * dd.SIGNFORSTATUS.3	成功
     * dd.SIGNFORSTATUS.4	失败
     * dd.SIGNFORSTATUS.5	中转
     * dd.SIGNFORSTATUS.6	费用录入
     * dd.SIGNFORSTATUS.0	作废
     * dd.SIGNFORSTATUS.9	生成
     */


    @SerializedName("0")
    DISABLE,

    @SerializedName("1")
    CONFIRM(),

    @SerializedName("2")
    PART_SUCCESS,

    @SerializedName("3")
    SUCCESS,

    @SerializedName("4")
    FAIL,

    @SerializedName("5")
    TRANSFER,

    @SerializedName("6")
    COST_INPUT,

    @SerializedName("7")
    NULL,

    @SerializedName("8")
    NULL2,

    @SerializedName("9")
    PROD
}
