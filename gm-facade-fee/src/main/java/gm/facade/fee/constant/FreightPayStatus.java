package gm.facade.fee.constant;

/**
 * 运费结算支付状态
 */
public enum FreightPayStatus {
    //0-不付
    NO_PAY,

    //1-应付
    PAYABLE,

    //2-应付不付
    PAYABLE_NO_PAY,

    //3-应付待付
    TO_BE_PAY,

    //4-已付
    BE_PAY

}
