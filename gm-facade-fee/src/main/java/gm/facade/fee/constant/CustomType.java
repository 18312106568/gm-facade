package gm.facade.fee.constant;

import com.google.gson.annotations.SerializedName;

public enum CustomType {
    /**
     * 医疗
     */
    @SerializedName("0")
    MEDICAL,

    /**
     * 商业
     */
    @SerializedName("1")
    BUSSINESS,

    /**
     * 药店
     */
    @SerializedName("2")
    DRUGSTORE
}
