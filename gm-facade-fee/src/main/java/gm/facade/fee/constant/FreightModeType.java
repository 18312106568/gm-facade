package gm.facade.fee.constant;

public enum FreightModeType {
    NULL,
    //点件
    POINTPARTS,

    //件数
    PIECE,

    //重量
    WEIGHT,

    //专车
    SPECIAL,

    //快递
    EXPRESS,

    //委外配送
    OUTDELIVERY,

    //干线
    LINEHAUL,

    //租车
    CARRENTAL
    ;

    public static FreightModeType getFreightType(Long modeId){
        if(modeId>8L || modeId<0L) {
            return null;
        }
        return FreightModeType.values()[modeId.intValue()];
    }
}
