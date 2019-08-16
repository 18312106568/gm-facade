package gm.facade.fee.constant;

public enum FieldType {

    Boolean(java.lang.Boolean.class),

    Integer(java.lang.Integer.class),

    Double(java.lang.Double.class),

    Long(java.lang.Long.class),

    Date(java.util.Date.class),

    String(java.lang.String.class)

            ;

    private Class clazz;

    private FieldType(Class clazz){
        this.clazz = clazz;
    }

    public Class getClazz(){
        return this.clazz;
    }

}
