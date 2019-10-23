package gm.facade.fee.constant;

import com.google.gson.annotations.SerializedName;

public enum WorkingFlagType {
    @SerializedName("0")
    NULL,
    @SerializedName("1")
    WORK,
    @SerializedName("2")
    REST,
    @SerializedName("3")
    HOLIDAY;
}
