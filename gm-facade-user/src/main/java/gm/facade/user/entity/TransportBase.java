package gm.facade.user.entity;

public class TransportBase {

    /**
     * 运输日期(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    private String transportDate;

    /**
     * 出车时段(通过WMS《签收单查询》的出车时段映射关联出来)
     */
    private String departureTime;

    /**
     * 装车单ID(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    private String loadingListId;

    /**
     * 签收单ID(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    private String receiptId;

    /**
     * 运输方式(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    private String shippingType;

    /**
     * 物流模式(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    private String logisticsMode;
    /**
     * 客户名称(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    private String customerName;
    /**
     * 客户编码(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    private String customerCode;
    /**
     * 客户ID(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    private String customerId;
    /**
     * 客户类型(映射关联出来)
     */
    private String customerType;
    /**
     * 送货地址ID(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    private String deliveryAddrId;
    /**
     * 送货地址(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    private String deliveryAddress;
    /**
     * 目的地省份(在运费核算系统中进行手工维护，再通过地址ID关联得出)
     */
    private String destinationProvinces;
    /**
     * 目的地城市(在运费核算系统中进行手工维护，再通过地址ID关联得出)
     */
    private String destinationCity;
    /**
     * 目的地送货点编码(在运费核算系统中进行手工维护，再通过地址ID关联得出)
     */
    private String DestinationCode;
    /**
     * 目的地送货分点编码(在运费核算系统中进行手工维护，再通过地址ID关联得出)
     */
    private String destinationChildCode;
    /**
     * 目的地上楼楼层(在运费核算系统中进行手工维护，再通过地址ID关联得出)
     */
    private String destinationUpstairs;
    /**
     * 源运输地址(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    private String srcTransportAddress;
    /**
     * 源运输地址ID(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    private String srcTransportAddressId;
    /**
     * 起运地省份(在运费核算系统中进行手工维护，再通过地址ID关联得出)
     */
    private String originProvinces;
    /**
     * 起运地城市(在运费核算系统中进行手工维护，再通过地址ID关联得出)
     */
    private String originCity;
    /**
     * 起运地送货点编码(在运费核算系统中进行手工维护，再通过地址ID关联得出)
     */
    private String srcShippingCode;
    /**
     * 起运地送货分点编码(在运费核算系统中进行手工维护，再通过地址ID关联得出)
     */
    private String srcChildShippingCode;
    /**
     * 起运地上楼楼层(在运费核算系统中进行手工维护，再通过地址ID关联得出)
     */
    private String srcFloorsNum;
    /**
     * 计费用省份(通过逻辑判断得出)
     */
    private String costProvinces;

    /**
     * 计费用城市(通过逻辑判断得出)
     */
    private String costCity;

    /**
     * 计费用送货点编码(通过逻辑判断得出)
     */
    private String costPointCode;
    /**
     * 计费用送货分点编码(通过逻辑判断得出)
     */
    private String costChildPointCode;
    /**
     * 计费用上楼楼层(通过逻辑判断得出)
     */
    private String costUpstairs;

    /**
     * 总箱数(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    private String totalBoxNum;
    /**
     * 计费用总箱数(通过逻辑计算得出)
     */
    private String totalChargeBoxNum;
    /**
     * 实收件数(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    private String receiptNumber;
    /**
     * 商品重量(通过逻辑计算得出)
     */
    private String commodityWeight;

    /**
     * 冷藏箱数(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    private String refrigeratedContainersNum;
    /**
     * 温控品种件数(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    private String temperatureControlNum;
    /**
     * 二次分货标志(在运费核算系统中进行手工维护，再通过地址ID关联得出)
     */
    private String secondaryDistributionFlag;
    /**
     * 透析液标志(在运费核算系统中进行手工维护，再通过地址ID关联得出)
     */
    private String dialysateMarkers;
    /**
     * 透析液自提标志(在运费核算系统中进行手工维护，再通过地址ID关联得出)
     */
    private String dialysateFlag;
    /**
     * 委外配送服务线路补贴(在运费核算系统中进行手工维护，再通过地址ID关联得出)
     */
    private String outsourcingServiceLines;

    /**
     * 货到收款金额(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    private String amount;

    /**
     * 货到收款标志(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    private String receiptFlag;

    /**
     * 专车编号(须在WMS中增加功能进行手工维护)
     */
    private String specialVehicleNum;
    /**
     * 专车车型1(须在WMS中增加功能进行手工维护)
     */
    private String specialVehicleModel1;
    /**
     * 专车车次1(须在WMS中增加功能进行手工维护)
     */
    private String SpecialTrainNum1;

    /**
     * 单程/往返1(须在WMS中增加功能进行手工维护)
     */
    private String tripType1;
    /**
     * 是否为回程车1(须在WMS中增加功能进行手工维护)
     */
    private String isReturnTrain1;
    /**
     * 专车车型2(须在WMS中增加功能进行手工维护)
     */
    private String specialVehicleType2;

    /**
     * 专车车次2(须在WMS中增加功能进行手工维护)
     */
    private String specialTrainNum2;

    /**
     * 单程/往返2(须在WMS中增加功能进行手工维护)
     */
    private String tripType2;
    /**
     * 是否为回程车2(须在WMS中增加功能进行手工维护)
     */
    private String returnTrain2;
    /**
     * 专车车型3(须在WMS中增加功能进行手工维护)
     */
    private String specialVehicleType3;
    /**
     * 专车车次3(须在WMS中增加功能进行手工维护)
     */
    private String specialTrainNum3;
    /**
     * 单程/往返3(须在WMS中增加功能进行手工维护)
     */
    private String tripType3;
    /**
     * 是否为回程车3(须在WMS中增加功能进行手工维护)
     */
    private String isReturnTrain3;
    /**
     * 专车业务类型(须在WMS中增加功能进行手工维护)
     */
    private String specialVehiclBizeType;
    /**
     * 货主(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    private String shipper;
    /**
     * 备注(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    private String remarks;
    /**
     * 制单日期(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    private String createTime;
    /**
     * 送货失败原因分类(取自WMS《送货失败数据录入》)
     */
    private String failureReson;
    /**
     * 送货失败原因详情(取自WMS《送货失败数据录入》)
     */
    private String failureDetails;
    /**
     * 线路名称(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    private String lineName;
    /**
     * 承运商(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    private String Carrier;
    /**
     * 手机送货人(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    private String delivererMobile;
    /**
     * 签收单状态(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    private String receiptStatus;
    /**
     * 签收单类型(取自WMS《签收单查询》/《签收单重派记录查询》)
     */
    private String receiptType;
    /**
     * 笼车交接总单ID(取自WMS《笼车交接单管理》)
     */
    private String cageCarId;
    /**
     * 干线线路(WMS《路线管理》中的“干线线路”字段)
     */
    private String trunkline;
    /**
     * 干线车牌号码(干线业务取自WMS《笼车交接单管理》；非干线业务取自取自WMS《装车单查询》)
     */
    private String trunnkLinePlate;
    /**
     * 干线车型(可显示8种车型。但默认“7.6米普通车”)
     */
    private String trunkModel;

    /**
     * 支线车牌号码(取自WMS《装车单查询》/《签收单领用》)
     */
    private String branchPlate;
    /**
     * 支线租车模式(设置功能维护各支线车辆对应租车模式的关系)
     */
    private String rentalModel;
    /**
     * 配送员(取自WMS《装车单查询》/《签收单领用》)
     */
    private String delivery;
    /**
     * 起运仓库(取自WMS《签收单查询》，现系统中只有仓库编号，需要把实际的仓库名称显示出来)
     */
    private String warehouse;
    /**
     * 落地配仓库(干线业务显示落地配仓库，非干线业务显示起运仓库)
     */
    private String groundDepot;
    /**
     * 笼车交接单回单确认标识(取自WMS《笼车交接单管理》)
     */
    private String cageCarConfirmationFlag;
    /**
     * 温度计回收计费标志(对于含有冷藏商品的签收单，默认“是”，其余为“否”。)
     */
    private String thermometerRecoveryChargingFlag;
    /**
     * 泡沫箱回收数量(对于含有冷藏商品的签收单，统计显示该签收单发出的泡沫箱数量)
     */
    private String foamBoxNum;
    /**
     * 货到收款服务计费标志(对于需要货到收款的签收单，该字段默认“是”，其余为“否”)
     */
    private String chargingFlag;
    /**
     * 非常规工作时段标志(该字段默认值为“无”，可选择“工作日/休息日/节假日”)
     */
    private String unconventionalWorkingFlag;
}
