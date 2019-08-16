package gm.facade.fee.constant;

/**
 * 统计结果类型
 */
public enum StatisticType {

    Integer(java.lang.Integer.class),

    Double(java.lang.Double.class)
    ;

    private Class clazz;

    private StatisticType(Class clazz){
        this.clazz = clazz;
    }

    public Class getClazz(){
        return this.clazz;
    }
}
