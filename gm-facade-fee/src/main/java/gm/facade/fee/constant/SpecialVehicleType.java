package gm.facade.fee.constant;

import com.google.gson.annotations.SerializedName;

/**
 * 专车类型
 */
public enum SpecialVehicleType {
    /**
     * 普通专车
     */
    //0
    @SerializedName("0")
    NORMAL4_3,

    //1
    @SerializedName("1")
    NORMAL7_6,

    //2
    @SerializedName("2")
    NORMAL9_6,

    //3
    @SerializedName("3")
    NORMAL12_6,

    //4
    @SerializedName("4")
    NORMAL16_5,

    /**
     * 冷藏专车 >=5
     */
    @SerializedName("5")
    COLD4_3,

    @SerializedName("6")
    COLD7_6,

    @SerializedName("7")
    COLD9_6,

    @SerializedName("8")
    COLD12_6;
}
