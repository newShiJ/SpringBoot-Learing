package learning.model;

import java.io.Serializable;

public class BusinessFlow implements Serializable {
    /**
     * uuid主键
     */
    private String id;

    /**
     * 录入时间
     */
    private String createTime;

    /**
     * 是否逻辑删除
     */
    private String deleted;

    /**
     * 操作企业编号
     */
    private String opCmyCode;

    /**
     * 修改企业名称
     */
    private String opCmyName;

    /**
     * 操作时间
     */
    private String opTime;

    /**
     * 操作人编号
     */
    private String operatorCode;

    /**
     * 操作人名称
     */
    private String operatorName;

    /**
     * 预留字段1，使用后及时修改注释
     */
    private String reserved1;

    /**
     * 预留字段2，使用后及时修改注释
     */
    private String reserved2;

    /**
     * 预留字段3，使用后及时修改注释
     */
    private String reserved3;

    /**
     * 预留字段4，使用后及时修改注释
     */
    private Long reserved4;

    /**
     * 预留字段5，使用后及时修改注释
     */
    private Long reserved5;

    /**
     * 签名， 用于验证其他字段的值是否正确
     */
    private String signature;

    /**
     * 
     */
    private Integer version;

    /**
     * 涉及的银单金额
     */
    private Long amount;

    /**
     * 附件Url
     */
    private String attachMentUrl;

    /**
     * 银单编号
     */
    private String billCode;

    /**
     * 业务编号
     */
    private String businessNo;

    /**
     * 业务类型 字典值
     */
    private String businessType;

    /**
     * 子单银单编号
     */
    private String childBillCode;

    /**
     * 折扣银单编号
     */
    private String discountBillCode;

    /**
     * 下一企业是否已处理(true，false)
     */
    private String nextDealed;

    /**
     * 上一处理企业代码
     */
    private String lastCmyCode;

    /**
     * 上一处理企业名字
     */
    private String lastCmyName;

    /**
     * 上一处理时间
     */
    private String lastDealTime;

    /**
     * 上一处理人代码
     */
    private String lastOperatorCode;

    /**
     * 上一处理人名称
     */
    private String lastOperatorName;

    /**
     * 上一处理意见(备注)
     */
    private String lastRemark;

    /**
     * 上一处理结果(银单状态)
     */
    private String lastResult;

    /**
     * 下一处理企业代码
     */
    private String nextCmyCode;

    /**
     * 下一处理企业名称
     */
    private String nextCmyName;

    /**
     * 
     */
    private String businessDetailType;

    /**
     * 
     */
    private String businessResult;

    /**
     * business_flow
     */
    private static final long serialVersionUID = 1L;

    /**
     * uuid主键
     * @return id uuid主键
     */
    public String getId() {
        return id;
    }

    /**
     * uuid主键
     * @param id uuid主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 录入时间
     * @return create_time 录入时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 录入时间
     * @param createTime 录入时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * 是否逻辑删除
     * @return deleted 是否逻辑删除
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * 是否逻辑删除
     * @param deleted 是否逻辑删除
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }

    /**
     * 操作企业编号
     * @return op_cmy_code 操作企业编号
     */
    public String getOpCmyCode() {
        return opCmyCode;
    }

    /**
     * 操作企业编号
     * @param opCmyCode 操作企业编号
     */
    public void setOpCmyCode(String opCmyCode) {
        this.opCmyCode = opCmyCode == null ? null : opCmyCode.trim();
    }

    /**
     * 修改企业名称
     * @return op_cmy_name 修改企业名称
     */
    public String getOpCmyName() {
        return opCmyName;
    }

    /**
     * 修改企业名称
     * @param opCmyName 修改企业名称
     */
    public void setOpCmyName(String opCmyName) {
        this.opCmyName = opCmyName == null ? null : opCmyName.trim();
    }

    /**
     * 操作时间
     * @return op_time 操作时间
     */
    public String getOpTime() {
        return opTime;
    }

    /**
     * 操作时间
     * @param opTime 操作时间
     */
    public void setOpTime(String opTime) {
        this.opTime = opTime == null ? null : opTime.trim();
    }

    /**
     * 操作人编号
     * @return operator_code 操作人编号
     */
    public String getOperatorCode() {
        return operatorCode;
    }

    /**
     * 操作人编号
     * @param operatorCode 操作人编号
     */
    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode == null ? null : operatorCode.trim();
    }

    /**
     * 操作人名称
     * @return operator_name 操作人名称
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * 操作人名称
     * @param operatorName 操作人名称
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    /**
     * 预留字段1，使用后及时修改注释
     * @return reserved1 预留字段1，使用后及时修改注释
     */
    public String getReserved1() {
        return reserved1;
    }

    /**
     * 预留字段1，使用后及时修改注释
     * @param reserved1 预留字段1，使用后及时修改注释
     */
    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1 == null ? null : reserved1.trim();
    }

    /**
     * 预留字段2，使用后及时修改注释
     * @return reserved2 预留字段2，使用后及时修改注释
     */
    public String getReserved2() {
        return reserved2;
    }

    /**
     * 预留字段2，使用后及时修改注释
     * @param reserved2 预留字段2，使用后及时修改注释
     */
    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2 == null ? null : reserved2.trim();
    }

    /**
     * 预留字段3，使用后及时修改注释
     * @return reserved3 预留字段3，使用后及时修改注释
     */
    public String getReserved3() {
        return reserved3;
    }

    /**
     * 预留字段3，使用后及时修改注释
     * @param reserved3 预留字段3，使用后及时修改注释
     */
    public void setReserved3(String reserved3) {
        this.reserved3 = reserved3 == null ? null : reserved3.trim();
    }

    /**
     * 预留字段4，使用后及时修改注释
     * @return reserved4 预留字段4，使用后及时修改注释
     */
    public Long getReserved4() {
        return reserved4;
    }

    /**
     * 预留字段4，使用后及时修改注释
     * @param reserved4 预留字段4，使用后及时修改注释
     */
    public void setReserved4(Long reserved4) {
        this.reserved4 = reserved4;
    }

    /**
     * 预留字段5，使用后及时修改注释
     * @return reserved5 预留字段5，使用后及时修改注释
     */
    public Long getReserved5() {
        return reserved5;
    }

    /**
     * 预留字段5，使用后及时修改注释
     * @param reserved5 预留字段5，使用后及时修改注释
     */
    public void setReserved5(Long reserved5) {
        this.reserved5 = reserved5;
    }

    /**
     * 签名， 用于验证其他字段的值是否正确
     * @return signature 签名， 用于验证其他字段的值是否正确
     */
    public String getSignature() {
        return signature;
    }

    /**
     * 签名， 用于验证其他字段的值是否正确
     * @param signature 签名， 用于验证其他字段的值是否正确
     */
    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    /**
     * 
     * @return version 
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 
     * @param version 
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 涉及的银单金额
     * @return amount 涉及的银单金额
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * 涉及的银单金额
     * @param amount 涉及的银单金额
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * 附件Url
     * @return attach_ment_url 附件Url
     */
    public String getAttachMentUrl() {
        return attachMentUrl;
    }

    /**
     * 附件Url
     * @param attachMentUrl 附件Url
     */
    public void setAttachMentUrl(String attachMentUrl) {
        this.attachMentUrl = attachMentUrl == null ? null : attachMentUrl.trim();
    }

    /**
     * 银单编号
     * @return bill_code 银单编号
     */
    public String getBillCode() {
        return billCode;
    }

    /**
     * 银单编号
     * @param billCode 银单编号
     */
    public void setBillCode(String billCode) {
        this.billCode = billCode == null ? null : billCode.trim();
    }

    /**
     * 业务编号
     * @return business_no 业务编号
     */
    public String getBusinessNo() {
        return businessNo;
    }

    /**
     * 业务编号
     * @param businessNo 业务编号
     */
    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo == null ? null : businessNo.trim();
    }

    /**
     * 业务类型 字典值
     * @return business_type 业务类型 字典值
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * 业务类型 字典值
     * @param businessType 业务类型 字典值
     */
    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    /**
     * 子单银单编号
     * @return child_bill_code 子单银单编号
     */
    public String getChildBillCode() {
        return childBillCode;
    }

    /**
     * 子单银单编号
     * @param childBillCode 子单银单编号
     */
    public void setChildBillCode(String childBillCode) {
        this.childBillCode = childBillCode == null ? null : childBillCode.trim();
    }

    /**
     * 折扣银单编号
     * @return discount_bill_code 折扣银单编号
     */
    public String getDiscountBillCode() {
        return discountBillCode;
    }

    /**
     * 折扣银单编号
     * @param discountBillCode 折扣银单编号
     */
    public void setDiscountBillCode(String discountBillCode) {
        this.discountBillCode = discountBillCode == null ? null : discountBillCode.trim();
    }

    /**
     * 下一企业是否已处理(true，false)
     * @return next_dealed 下一企业是否已处理(true，false)
     */
    public String getNextDealed() {
        return nextDealed;
    }

    /**
     * 下一企业是否已处理(true，false)
     * @param nextDealed 下一企业是否已处理(true，false)
     */
    public void setNextDealed(String nextDealed) {
        this.nextDealed = nextDealed == null ? null : nextDealed.trim();
    }

    /**
     * 上一处理企业代码
     * @return last_cmy_code 上一处理企业代码
     */
    public String getLastCmyCode() {
        return lastCmyCode;
    }

    /**
     * 上一处理企业代码
     * @param lastCmyCode 上一处理企业代码
     */
    public void setLastCmyCode(String lastCmyCode) {
        this.lastCmyCode = lastCmyCode == null ? null : lastCmyCode.trim();
    }

    /**
     * 上一处理企业名字
     * @return last_cmy_name 上一处理企业名字
     */
    public String getLastCmyName() {
        return lastCmyName;
    }

    /**
     * 上一处理企业名字
     * @param lastCmyName 上一处理企业名字
     */
    public void setLastCmyName(String lastCmyName) {
        this.lastCmyName = lastCmyName == null ? null : lastCmyName.trim();
    }

    /**
     * 上一处理时间
     * @return last_deal_time 上一处理时间
     */
    public String getLastDealTime() {
        return lastDealTime;
    }

    /**
     * 上一处理时间
     * @param lastDealTime 上一处理时间
     */
    public void setLastDealTime(String lastDealTime) {
        this.lastDealTime = lastDealTime == null ? null : lastDealTime.trim();
    }

    /**
     * 上一处理人代码
     * @return last_operator_code 上一处理人代码
     */
    public String getLastOperatorCode() {
        return lastOperatorCode;
    }

    /**
     * 上一处理人代码
     * @param lastOperatorCode 上一处理人代码
     */
    public void setLastOperatorCode(String lastOperatorCode) {
        this.lastOperatorCode = lastOperatorCode == null ? null : lastOperatorCode.trim();
    }

    /**
     * 上一处理人名称
     * @return last_operator_name 上一处理人名称
     */
    public String getLastOperatorName() {
        return lastOperatorName;
    }

    /**
     * 上一处理人名称
     * @param lastOperatorName 上一处理人名称
     */
    public void setLastOperatorName(String lastOperatorName) {
        this.lastOperatorName = lastOperatorName == null ? null : lastOperatorName.trim();
    }

    /**
     * 上一处理意见(备注)
     * @return last_remark 上一处理意见(备注)
     */
    public String getLastRemark() {
        return lastRemark;
    }

    /**
     * 上一处理意见(备注)
     * @param lastRemark 上一处理意见(备注)
     */
    public void setLastRemark(String lastRemark) {
        this.lastRemark = lastRemark == null ? null : lastRemark.trim();
    }

    /**
     * 上一处理结果(银单状态)
     * @return last_result 上一处理结果(银单状态)
     */
    public String getLastResult() {
        return lastResult;
    }

    /**
     * 上一处理结果(银单状态)
     * @param lastResult 上一处理结果(银单状态)
     */
    public void setLastResult(String lastResult) {
        this.lastResult = lastResult == null ? null : lastResult.trim();
    }

    /**
     * 下一处理企业代码
     * @return next_cmy_code 下一处理企业代码
     */
    public String getNextCmyCode() {
        return nextCmyCode;
    }

    /**
     * 下一处理企业代码
     * @param nextCmyCode 下一处理企业代码
     */
    public void setNextCmyCode(String nextCmyCode) {
        this.nextCmyCode = nextCmyCode == null ? null : nextCmyCode.trim();
    }

    /**
     * 下一处理企业名称
     * @return next_cmy_name 下一处理企业名称
     */
    public String getNextCmyName() {
        return nextCmyName;
    }

    /**
     * 下一处理企业名称
     * @param nextCmyName 下一处理企业名称
     */
    public void setNextCmyName(String nextCmyName) {
        this.nextCmyName = nextCmyName == null ? null : nextCmyName.trim();
    }

    /**
     * 
     * @return business_detail_type 
     */
    public String getBusinessDetailType() {
        return businessDetailType;
    }

    /**
     * 
     * @param businessDetailType 
     */
    public void setBusinessDetailType(String businessDetailType) {
        this.businessDetailType = businessDetailType == null ? null : businessDetailType.trim();
    }

    /**
     * 
     * @return business_result 
     */
    public String getBusinessResult() {
        return businessResult;
    }

    /**
     * 
     * @param businessResult 
     */
    public void setBusinessResult(String businessResult) {
        this.businessResult = businessResult == null ? null : businessResult.trim();
    }

    /**
     *
     * @mbg.generated 2018-04-23
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BusinessFlow other = (BusinessFlow) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getOpCmyCode() == null ? other.getOpCmyCode() == null : this.getOpCmyCode().equals(other.getOpCmyCode()))
            && (this.getOpCmyName() == null ? other.getOpCmyName() == null : this.getOpCmyName().equals(other.getOpCmyName()))
            && (this.getOpTime() == null ? other.getOpTime() == null : this.getOpTime().equals(other.getOpTime()))
            && (this.getOperatorCode() == null ? other.getOperatorCode() == null : this.getOperatorCode().equals(other.getOperatorCode()))
            && (this.getOperatorName() == null ? other.getOperatorName() == null : this.getOperatorName().equals(other.getOperatorName()))
            && (this.getReserved1() == null ? other.getReserved1() == null : this.getReserved1().equals(other.getReserved1()))
            && (this.getReserved2() == null ? other.getReserved2() == null : this.getReserved2().equals(other.getReserved2()))
            && (this.getReserved3() == null ? other.getReserved3() == null : this.getReserved3().equals(other.getReserved3()))
            && (this.getReserved4() == null ? other.getReserved4() == null : this.getReserved4().equals(other.getReserved4()))
            && (this.getReserved5() == null ? other.getReserved5() == null : this.getReserved5().equals(other.getReserved5()))
            && (this.getSignature() == null ? other.getSignature() == null : this.getSignature().equals(other.getSignature()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getAttachMentUrl() == null ? other.getAttachMentUrl() == null : this.getAttachMentUrl().equals(other.getAttachMentUrl()))
            && (this.getBillCode() == null ? other.getBillCode() == null : this.getBillCode().equals(other.getBillCode()))
            && (this.getBusinessNo() == null ? other.getBusinessNo() == null : this.getBusinessNo().equals(other.getBusinessNo()))
            && (this.getBusinessType() == null ? other.getBusinessType() == null : this.getBusinessType().equals(other.getBusinessType()))
            && (this.getChildBillCode() == null ? other.getChildBillCode() == null : this.getChildBillCode().equals(other.getChildBillCode()))
            && (this.getDiscountBillCode() == null ? other.getDiscountBillCode() == null : this.getDiscountBillCode().equals(other.getDiscountBillCode()))
            && (this.getNextDealed() == null ? other.getNextDealed() == null : this.getNextDealed().equals(other.getNextDealed()))
            && (this.getLastCmyCode() == null ? other.getLastCmyCode() == null : this.getLastCmyCode().equals(other.getLastCmyCode()))
            && (this.getLastCmyName() == null ? other.getLastCmyName() == null : this.getLastCmyName().equals(other.getLastCmyName()))
            && (this.getLastDealTime() == null ? other.getLastDealTime() == null : this.getLastDealTime().equals(other.getLastDealTime()))
            && (this.getLastOperatorCode() == null ? other.getLastOperatorCode() == null : this.getLastOperatorCode().equals(other.getLastOperatorCode()))
            && (this.getLastOperatorName() == null ? other.getLastOperatorName() == null : this.getLastOperatorName().equals(other.getLastOperatorName()))
            && (this.getLastRemark() == null ? other.getLastRemark() == null : this.getLastRemark().equals(other.getLastRemark()))
            && (this.getLastResult() == null ? other.getLastResult() == null : this.getLastResult().equals(other.getLastResult()))
            && (this.getNextCmyCode() == null ? other.getNextCmyCode() == null : this.getNextCmyCode().equals(other.getNextCmyCode()))
            && (this.getNextCmyName() == null ? other.getNextCmyName() == null : this.getNextCmyName().equals(other.getNextCmyName()))
            && (this.getBusinessDetailType() == null ? other.getBusinessDetailType() == null : this.getBusinessDetailType().equals(other.getBusinessDetailType()))
            && (this.getBusinessResult() == null ? other.getBusinessResult() == null : this.getBusinessResult().equals(other.getBusinessResult()));
    }

    /**
     *
     * @mbg.generated 2018-04-23
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getOpCmyCode() == null) ? 0 : getOpCmyCode().hashCode());
        result = prime * result + ((getOpCmyName() == null) ? 0 : getOpCmyName().hashCode());
        result = prime * result + ((getOpTime() == null) ? 0 : getOpTime().hashCode());
        result = prime * result + ((getOperatorCode() == null) ? 0 : getOperatorCode().hashCode());
        result = prime * result + ((getOperatorName() == null) ? 0 : getOperatorName().hashCode());
        result = prime * result + ((getReserved1() == null) ? 0 : getReserved1().hashCode());
        result = prime * result + ((getReserved2() == null) ? 0 : getReserved2().hashCode());
        result = prime * result + ((getReserved3() == null) ? 0 : getReserved3().hashCode());
        result = prime * result + ((getReserved4() == null) ? 0 : getReserved4().hashCode());
        result = prime * result + ((getReserved5() == null) ? 0 : getReserved5().hashCode());
        result = prime * result + ((getSignature() == null) ? 0 : getSignature().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getAttachMentUrl() == null) ? 0 : getAttachMentUrl().hashCode());
        result = prime * result + ((getBillCode() == null) ? 0 : getBillCode().hashCode());
        result = prime * result + ((getBusinessNo() == null) ? 0 : getBusinessNo().hashCode());
        result = prime * result + ((getBusinessType() == null) ? 0 : getBusinessType().hashCode());
        result = prime * result + ((getChildBillCode() == null) ? 0 : getChildBillCode().hashCode());
        result = prime * result + ((getDiscountBillCode() == null) ? 0 : getDiscountBillCode().hashCode());
        result = prime * result + ((getNextDealed() == null) ? 0 : getNextDealed().hashCode());
        result = prime * result + ((getLastCmyCode() == null) ? 0 : getLastCmyCode().hashCode());
        result = prime * result + ((getLastCmyName() == null) ? 0 : getLastCmyName().hashCode());
        result = prime * result + ((getLastDealTime() == null) ? 0 : getLastDealTime().hashCode());
        result = prime * result + ((getLastOperatorCode() == null) ? 0 : getLastOperatorCode().hashCode());
        result = prime * result + ((getLastOperatorName() == null) ? 0 : getLastOperatorName().hashCode());
        result = prime * result + ((getLastRemark() == null) ? 0 : getLastRemark().hashCode());
        result = prime * result + ((getLastResult() == null) ? 0 : getLastResult().hashCode());
        result = prime * result + ((getNextCmyCode() == null) ? 0 : getNextCmyCode().hashCode());
        result = prime * result + ((getNextCmyName() == null) ? 0 : getNextCmyName().hashCode());
        result = prime * result + ((getBusinessDetailType() == null) ? 0 : getBusinessDetailType().hashCode());
        result = prime * result + ((getBusinessResult() == null) ? 0 : getBusinessResult().hashCode());
        return result;
    }

    /**
     *
     * @mbg.generated 2018-04-23
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", deleted=").append(deleted);
        sb.append(", opCmyCode=").append(opCmyCode);
        sb.append(", opCmyName=").append(opCmyName);
        sb.append(", opTime=").append(opTime);
        sb.append(", operatorCode=").append(operatorCode);
        sb.append(", operatorName=").append(operatorName);
        sb.append(", reserved1=").append(reserved1);
        sb.append(", reserved2=").append(reserved2);
        sb.append(", reserved3=").append(reserved3);
        sb.append(", reserved4=").append(reserved4);
        sb.append(", reserved5=").append(reserved5);
        sb.append(", signature=").append(signature);
        sb.append(", version=").append(version);
        sb.append(", amount=").append(amount);
        sb.append(", attachMentUrl=").append(attachMentUrl);
        sb.append(", billCode=").append(billCode);
        sb.append(", businessNo=").append(businessNo);
        sb.append(", businessType=").append(businessType);
        sb.append(", childBillCode=").append(childBillCode);
        sb.append(", discountBillCode=").append(discountBillCode);
        sb.append(", nextDealed=").append(nextDealed);
        sb.append(", lastCmyCode=").append(lastCmyCode);
        sb.append(", lastCmyName=").append(lastCmyName);
        sb.append(", lastDealTime=").append(lastDealTime);
        sb.append(", lastOperatorCode=").append(lastOperatorCode);
        sb.append(", lastOperatorName=").append(lastOperatorName);
        sb.append(", lastRemark=").append(lastRemark);
        sb.append(", lastResult=").append(lastResult);
        sb.append(", nextCmyCode=").append(nextCmyCode);
        sb.append(", nextCmyName=").append(nextCmyName);
        sb.append(", businessDetailType=").append(businessDetailType);
        sb.append(", businessResult=").append(businessResult);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}