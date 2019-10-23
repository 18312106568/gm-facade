package gm.facade.fee.constant;

import com.google.gson.annotations.SerializedName;

/**
 * 运费结算支付状态
 */
public enum FreightPayStatus {
    //0-不付
    @SerializedName("0")
    NO_PAY,

    //1-应付
    @SerializedName("1")
    PAYABLE,

    //2-应付不付
    @SerializedName("2")
    PAYABLE_NO_PAY,

    //3-应付待付
    @SerializedName("3")
    TO_BE_PAY,

    //4-已付
    @SerializedName("4")
    BE_PAY

}
