package gm.facade.fee.constant;

import com.google.gson.annotations.SerializedName;

public enum FieldType {

    @SerializedName("0")
    Boolean(java.lang.Boolean.class),

    @SerializedName("1")
    Integer(java.lang.Integer.class),

    @SerializedName("2")
    Double(java.lang.Double.class),

    @SerializedName("3")
    Long(java.lang.Long.class),

    @SerializedName("4")
    Date(java.util.Date.class),

    @SerializedName("5")
    String(java.lang.String.class),

    @SerializedName("6")
    Enum(java.lang.Enum.class)

            ;

    private Class clazz;

    private FieldType(Class clazz){
        this.clazz = clazz;
    }

    public Class getClazz(){
        return this.clazz;
    }

}
