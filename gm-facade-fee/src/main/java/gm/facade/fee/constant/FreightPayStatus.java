package gm.facade.fee.constant;

/**
 * 运费结算支付状态
 */
public enum FreightPayStatus {
    //不付
    NO_PAY,

    //应付
    PAYABLE,

    //应付不付
    PAYABLE_NO_PAY,

    //应付待付
    TO_BE_PAY,

    //已付
    BE_PAY

}
