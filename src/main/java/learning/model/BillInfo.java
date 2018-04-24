package learning.model;

import java.io.Serializable;

public class BillInfo implements Serializable {
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
     * 承兑企业代码:第二还款企业，开单企业的核心企业，若开单企业即为核心企业，则承兑企业填自己
     */
    private String acceptCmyCode;

    /**
     * 承兑企业名称
     */
    private String acceptCmyName;

    /**
     * 申请开单企业代码(原始持单企业)
     */
    private String applyIssueCmyCode;

    /**
     * 申请开单企业名称(原始持单企业)
     */
    private String applyIssueCmyName;

    /**
     * 申请开单日期:时间戳
     */
    private String applyIssueDate;

    /**
     * 资产包附件名称
     */
    private String assetsAttachmentName;

    /**
     * 资产包附件Url
     */
    private String assetsAttachmentUrl;

    /**
     * 银单原始金额:(金额精确到分)
     */
    private Long billAmount;

    /**
     * 实际系统银单编号:所有银单的操作以billCode为准
     */
    private String billCode;

    /**
     * 银单类型:查看字典表
     */
    private String billType;

    /**
     * 银单业务来源编号
     */
    private String businessNo;

    /**
     * 银单当前金额:(金额精确到分)
     */
    private Long currentAmount;

    /**
     * 银单到期日期:时间精确到秒,当天23:59:59秒后算逾期
     */
    private String expireDate;

    /**
     * 保理商企业代码
     */
    private String factorCmyCode;

    /**
     * 保理商企业名称
     */
    private String factorCmyName;

    /**
     * 即将持有企业代码
     */
    private String financialCmyCode;

    /**
     * 即将持有企业代码
     */
    private String financialCmyName;

    /**
     * 是否冻结:字典值
     */
    private String frozen;

    /**
     * 保证方企业代码 :第三还款企业，贴现时选择
     */
    private String guaranteeCmyCode;

    /**
     * 保证方企业名称
     */
    private String guaranteeCmyName;

    /**
     * 保函文件 URL
     */
    private String guaranteeLetterUrl;

    /**
     * 加保状态:字典值
     */
    private String guaranteeStatus;

    /**
     * 现在持单企业代码:（同企业表一致）
     */
    private String holdCmyCode;

    /**
     * 现在持单企业名称
     */
    private String holdCmyName;

    /**
     * 开单企业代码:第一还款企业
     */
    private String issueCmyCode;

    /**
     * 开单企业名称
     */
    private String issueCmyName;

    /**
     * 上手持单企业代码
     */
    private String lastHolderCmyCode;

    /**
     * 上手持单企业名称
     */
    private String lastHolderCmyName;

    /**
     * 母单编号:(若无母单，则填自己的编号billCode@billInfo)
     */
    private String parentBillCode;

    /**
     * 保理商承诺预付款时间
     */
    private String promiseDate;

    /**
     * 银单备注信息
     */
    private String remark;

    /**
     * 根单编号:若自身就是根单，则填自己的银单编号
     */
    private String rootBillCode;

    /**
     * 银单来源（银单轨迹使用）：0开单/1转让/2保理预付款
     */
    private String sourceType;

    /**
     * 持单企业开始持有日期
     */
    private String startHoldDate;

    /**
     * 银单状态:字典值
     */
    private String status;

    /**
     * 汇总表名称
     */
    private String summaryName;

    /**
     * 汇总表Excel Url(原始母单才有)
     */
    private String summaryUrl;

    /**
     * 保函文件 URL
     */
    private String guaranteeLetterName;

    /**
     * 开单签收:时间戳
     */
    private String issueDate;

    /**
     * bill_info
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
     * 承兑企业代码:第二还款企业，开单企业的核心企业，若开单企业即为核心企业，则承兑企业填自己
     * @return accept_cmy_code 承兑企业代码:第二还款企业，开单企业的核心企业，若开单企业即为核心企业，则承兑企业填自己
     */
    public String getAcceptCmyCode() {
        return acceptCmyCode;
    }

    /**
     * 承兑企业代码:第二还款企业，开单企业的核心企业，若开单企业即为核心企业，则承兑企业填自己
     * @param acceptCmyCode 承兑企业代码:第二还款企业，开单企业的核心企业，若开单企业即为核心企业，则承兑企业填自己
     */
    public void setAcceptCmyCode(String acceptCmyCode) {
        this.acceptCmyCode = acceptCmyCode == null ? null : acceptCmyCode.trim();
    }

    /**
     * 承兑企业名称
     * @return accept_cmy_name 承兑企业名称
     */
    public String getAcceptCmyName() {
        return acceptCmyName;
    }

    /**
     * 承兑企业名称
     * @param acceptCmyName 承兑企业名称
     */
    public void setAcceptCmyName(String acceptCmyName) {
        this.acceptCmyName = acceptCmyName == null ? null : acceptCmyName.trim();
    }

    /**
     * 申请开单企业代码(原始持单企业)
     * @return apply_issue_cmy_code 申请开单企业代码(原始持单企业)
     */
    public String getApplyIssueCmyCode() {
        return applyIssueCmyCode;
    }

    /**
     * 申请开单企业代码(原始持单企业)
     * @param applyIssueCmyCode 申请开单企业代码(原始持单企业)
     */
    public void setApplyIssueCmyCode(String applyIssueCmyCode) {
        this.applyIssueCmyCode = applyIssueCmyCode == null ? null : applyIssueCmyCode.trim();
    }

    /**
     * 申请开单企业名称(原始持单企业)
     * @return apply_issue_cmy_name 申请开单企业名称(原始持单企业)
     */
    public String getApplyIssueCmyName() {
        return applyIssueCmyName;
    }

    /**
     * 申请开单企业名称(原始持单企业)
     * @param applyIssueCmyName 申请开单企业名称(原始持单企业)
     */
    public void setApplyIssueCmyName(String applyIssueCmyName) {
        this.applyIssueCmyName = applyIssueCmyName == null ? null : applyIssueCmyName.trim();
    }

    /**
     * 申请开单日期:时间戳
     * @return apply_issue_date 申请开单日期:时间戳
     */
    public String getApplyIssueDate() {
        return applyIssueDate;
    }

    /**
     * 申请开单日期:时间戳
     * @param applyIssueDate 申请开单日期:时间戳
     */
    public void setApplyIssueDate(String applyIssueDate) {
        this.applyIssueDate = applyIssueDate == null ? null : applyIssueDate.trim();
    }

    /**
     * 资产包附件名称
     * @return assets_attachment_name 资产包附件名称
     */
    public String getAssetsAttachmentName() {
        return assetsAttachmentName;
    }

    /**
     * 资产包附件名称
     * @param assetsAttachmentName 资产包附件名称
     */
    public void setAssetsAttachmentName(String assetsAttachmentName) {
        this.assetsAttachmentName = assetsAttachmentName == null ? null : assetsAttachmentName.trim();
    }

    /**
     * 资产包附件Url
     * @return assets_attachment_url 资产包附件Url
     */
    public String getAssetsAttachmentUrl() {
        return assetsAttachmentUrl;
    }

    /**
     * 资产包附件Url
     * @param assetsAttachmentUrl 资产包附件Url
     */
    public void setAssetsAttachmentUrl(String assetsAttachmentUrl) {
        this.assetsAttachmentUrl = assetsAttachmentUrl == null ? null : assetsAttachmentUrl.trim();
    }

    /**
     * 银单原始金额:(金额精确到分)
     * @return bill_amount 银单原始金额:(金额精确到分)
     */
    public Long getBillAmount() {
        return billAmount;
    }

    /**
     * 银单原始金额:(金额精确到分)
     * @param billAmount 银单原始金额:(金额精确到分)
     */
    public void setBillAmount(Long billAmount) {
        this.billAmount = billAmount;
    }

    /**
     * 实际系统银单编号:所有银单的操作以billCode为准
     * @return bill_code 实际系统银单编号:所有银单的操作以billCode为准
     */
    public String getBillCode() {
        return billCode;
    }

    /**
     * 实际系统银单编号:所有银单的操作以billCode为准
     * @param billCode 实际系统银单编号:所有银单的操作以billCode为准
     */
    public void setBillCode(String billCode) {
        this.billCode = billCode == null ? null : billCode.trim();
    }

    /**
     * 银单类型:查看字典表
     * @return bill_type 银单类型:查看字典表
     */
    public String getBillType() {
        return billType;
    }

    /**
     * 银单类型:查看字典表
     * @param billType 银单类型:查看字典表
     */
    public void setBillType(String billType) {
        this.billType = billType == null ? null : billType.trim();
    }

    /**
     * 银单业务来源编号
     * @return business_no 银单业务来源编号
     */
    public String getBusinessNo() {
        return businessNo;
    }

    /**
     * 银单业务来源编号
     * @param businessNo 银单业务来源编号
     */
    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo == null ? null : businessNo.trim();
    }

    /**
     * 银单当前金额:(金额精确到分)
     * @return current_amount 银单当前金额:(金额精确到分)
     */
    public Long getCurrentAmount() {
        return currentAmount;
    }

    /**
     * 银单当前金额:(金额精确到分)
     * @param currentAmount 银单当前金额:(金额精确到分)
     */
    public void setCurrentAmount(Long currentAmount) {
        this.currentAmount = currentAmount;
    }

    /**
     * 银单到期日期:时间精确到秒,当天23:59:59秒后算逾期
     * @return expire_date 银单到期日期:时间精确到秒,当天23:59:59秒后算逾期
     */
    public String getExpireDate() {
        return expireDate;
    }

    /**
     * 银单到期日期:时间精确到秒,当天23:59:59秒后算逾期
     * @param expireDate 银单到期日期:时间精确到秒,当天23:59:59秒后算逾期
     */
    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate == null ? null : expireDate.trim();
    }

    /**
     * 保理商企业代码
     * @return factor_cmy_code 保理商企业代码
     */
    public String getFactorCmyCode() {
        return factorCmyCode;
    }

    /**
     * 保理商企业代码
     * @param factorCmyCode 保理商企业代码
     */
    public void setFactorCmyCode(String factorCmyCode) {
        this.factorCmyCode = factorCmyCode == null ? null : factorCmyCode.trim();
    }

    /**
     * 保理商企业名称
     * @return factor_cmy_name 保理商企业名称
     */
    public String getFactorCmyName() {
        return factorCmyName;
    }

    /**
     * 保理商企业名称
     * @param factorCmyName 保理商企业名称
     */
    public void setFactorCmyName(String factorCmyName) {
        this.factorCmyName = factorCmyName == null ? null : factorCmyName.trim();
    }

    /**
     * 即将持有企业代码
     * @return financial_cmy_code 即将持有企业代码
     */
    public String getFinancialCmyCode() {
        return financialCmyCode;
    }

    /**
     * 即将持有企业代码
     * @param financialCmyCode 即将持有企业代码
     */
    public void setFinancialCmyCode(String financialCmyCode) {
        this.financialCmyCode = financialCmyCode == null ? null : financialCmyCode.trim();
    }

    /**
     * 即将持有企业代码
     * @return financial_cmy_name 即将持有企业代码
     */
    public String getFinancialCmyName() {
        return financialCmyName;
    }

    /**
     * 即将持有企业代码
     * @param financialCmyName 即将持有企业代码
     */
    public void setFinancialCmyName(String financialCmyName) {
        this.financialCmyName = financialCmyName == null ? null : financialCmyName.trim();
    }

    /**
     * 是否冻结:字典值
     * @return frozen 是否冻结:字典值
     */
    public String getFrozen() {
        return frozen;
    }

    /**
     * 是否冻结:字典值
     * @param frozen 是否冻结:字典值
     */
    public void setFrozen(String frozen) {
        this.frozen = frozen == null ? null : frozen.trim();
    }

    /**
     * 保证方企业代码 :第三还款企业，贴现时选择
     * @return guarantee_cmy_code 保证方企业代码 :第三还款企业，贴现时选择
     */
    public String getGuaranteeCmyCode() {
        return guaranteeCmyCode;
    }

    /**
     * 保证方企业代码 :第三还款企业，贴现时选择
     * @param guaranteeCmyCode 保证方企业代码 :第三还款企业，贴现时选择
     */
    public void setGuaranteeCmyCode(String guaranteeCmyCode) {
        this.guaranteeCmyCode = guaranteeCmyCode == null ? null : guaranteeCmyCode.trim();
    }

    /**
     * 保证方企业名称
     * @return guarantee_cmy_name 保证方企业名称
     */
    public String getGuaranteeCmyName() {
        return guaranteeCmyName;
    }

    /**
     * 保证方企业名称
     * @param guaranteeCmyName 保证方企业名称
     */
    public void setGuaranteeCmyName(String guaranteeCmyName) {
        this.guaranteeCmyName = guaranteeCmyName == null ? null : guaranteeCmyName.trim();
    }

    /**
     * 保函文件 URL
     * @return guarantee_letter_url 保函文件 URL
     */
    public String getGuaranteeLetterUrl() {
        return guaranteeLetterUrl;
    }

    /**
     * 保函文件 URL
     * @param guaranteeLetterUrl 保函文件 URL
     */
    public void setGuaranteeLetterUrl(String guaranteeLetterUrl) {
        this.guaranteeLetterUrl = guaranteeLetterUrl == null ? null : guaranteeLetterUrl.trim();
    }

    /**
     * 加保状态:字典值
     * @return guarantee_status 加保状态:字典值
     */
    public String getGuaranteeStatus() {
        return guaranteeStatus;
    }

    /**
     * 加保状态:字典值
     * @param guaranteeStatus 加保状态:字典值
     */
    public void setGuaranteeStatus(String guaranteeStatus) {
        this.guaranteeStatus = guaranteeStatus == null ? null : guaranteeStatus.trim();
    }

    /**
     * 现在持单企业代码:（同企业表一致）
     * @return hold_cmy_code 现在持单企业代码:（同企业表一致）
     */
    public String getHoldCmyCode() {
        return holdCmyCode;
    }

    /**
     * 现在持单企业代码:（同企业表一致）
     * @param holdCmyCode 现在持单企业代码:（同企业表一致）
     */
    public void setHoldCmyCode(String holdCmyCode) {
        this.holdCmyCode = holdCmyCode == null ? null : holdCmyCode.trim();
    }

    /**
     * 现在持单企业名称
     * @return hold_cmy_name 现在持单企业名称
     */
    public String getHoldCmyName() {
        return holdCmyName;
    }

    /**
     * 现在持单企业名称
     * @param holdCmyName 现在持单企业名称
     */
    public void setHoldCmyName(String holdCmyName) {
        this.holdCmyName = holdCmyName == null ? null : holdCmyName.trim();
    }

    /**
     * 开单企业代码:第一还款企业
     * @return issue_cmy_code 开单企业代码:第一还款企业
     */
    public String getIssueCmyCode() {
        return issueCmyCode;
    }

    /**
     * 开单企业代码:第一还款企业
     * @param issueCmyCode 开单企业代码:第一还款企业
     */
    public void setIssueCmyCode(String issueCmyCode) {
        this.issueCmyCode = issueCmyCode == null ? null : issueCmyCode.trim();
    }

    /**
     * 开单企业名称
     * @return issue_cmy_name 开单企业名称
     */
    public String getIssueCmyName() {
        return issueCmyName;
    }

    /**
     * 开单企业名称
     * @param issueCmyName 开单企业名称
     */
    public void setIssueCmyName(String issueCmyName) {
        this.issueCmyName = issueCmyName == null ? null : issueCmyName.trim();
    }

    /**
     * 上手持单企业代码
     * @return last_holder_cmy_code 上手持单企业代码
     */
    public String getLastHolderCmyCode() {
        return lastHolderCmyCode;
    }

    /**
     * 上手持单企业代码
     * @param lastHolderCmyCode 上手持单企业代码
     */
    public void setLastHolderCmyCode(String lastHolderCmyCode) {
        this.lastHolderCmyCode = lastHolderCmyCode == null ? null : lastHolderCmyCode.trim();
    }

    /**
     * 上手持单企业名称
     * @return last_holder_cmy_name 上手持单企业名称
     */
    public String getLastHolderCmyName() {
        return lastHolderCmyName;
    }

    /**
     * 上手持单企业名称
     * @param lastHolderCmyName 上手持单企业名称
     */
    public void setLastHolderCmyName(String lastHolderCmyName) {
        this.lastHolderCmyName = lastHolderCmyName == null ? null : lastHolderCmyName.trim();
    }

    /**
     * 母单编号:(若无母单，则填自己的编号billCode@billInfo)
     * @return parent_bill_code 母单编号:(若无母单，则填自己的编号billCode@billInfo)
     */
    public String getParentBillCode() {
        return parentBillCode;
    }

    /**
     * 母单编号:(若无母单，则填自己的编号billCode@billInfo)
     * @param parentBillCode 母单编号:(若无母单，则填自己的编号billCode@billInfo)
     */
    public void setParentBillCode(String parentBillCode) {
        this.parentBillCode = parentBillCode == null ? null : parentBillCode.trim();
    }

    /**
     * 保理商承诺预付款时间
     * @return promise_date 保理商承诺预付款时间
     */
    public String getPromiseDate() {
        return promiseDate;
    }

    /**
     * 保理商承诺预付款时间
     * @param promiseDate 保理商承诺预付款时间
     */
    public void setPromiseDate(String promiseDate) {
        this.promiseDate = promiseDate == null ? null : promiseDate.trim();
    }

    /**
     * 银单备注信息
     * @return remark 银单备注信息
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 银单备注信息
     * @param remark 银单备注信息
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 根单编号:若自身就是根单，则填自己的银单编号
     * @return root_bill_code 根单编号:若自身就是根单，则填自己的银单编号
     */
    public String getRootBillCode() {
        return rootBillCode;
    }

    /**
     * 根单编号:若自身就是根单，则填自己的银单编号
     * @param rootBillCode 根单编号:若自身就是根单，则填自己的银单编号
     */
    public void setRootBillCode(String rootBillCode) {
        this.rootBillCode = rootBillCode == null ? null : rootBillCode.trim();
    }

    /**
     * 银单来源（银单轨迹使用）：0开单/1转让/2保理预付款
     * @return source_type 银单来源（银单轨迹使用）：0开单/1转让/2保理预付款
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * 银单来源（银单轨迹使用）：0开单/1转让/2保理预付款
     * @param sourceType 银单来源（银单轨迹使用）：0开单/1转让/2保理预付款
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType == null ? null : sourceType.trim();
    }

    /**
     * 持单企业开始持有日期
     * @return start_hold_date 持单企业开始持有日期
     */
    public String getStartHoldDate() {
        return startHoldDate;
    }

    /**
     * 持单企业开始持有日期
     * @param startHoldDate 持单企业开始持有日期
     */
    public void setStartHoldDate(String startHoldDate) {
        this.startHoldDate = startHoldDate == null ? null : startHoldDate.trim();
    }

    /**
     * 银单状态:字典值
     * @return status 银单状态:字典值
     */
    public String getStatus() {
        return status;
    }

    /**
     * 银单状态:字典值
     * @param status 银单状态:字典值
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 汇总表名称
     * @return summary_name 汇总表名称
     */
    public String getSummaryName() {
        return summaryName;
    }

    /**
     * 汇总表名称
     * @param summaryName 汇总表名称
     */
    public void setSummaryName(String summaryName) {
        this.summaryName = summaryName == null ? null : summaryName.trim();
    }

    /**
     * 汇总表Excel Url(原始母单才有)
     * @return summary_url 汇总表Excel Url(原始母单才有)
     */
    public String getSummaryUrl() {
        return summaryUrl;
    }

    /**
     * 汇总表Excel Url(原始母单才有)
     * @param summaryUrl 汇总表Excel Url(原始母单才有)
     */
    public void setSummaryUrl(String summaryUrl) {
        this.summaryUrl = summaryUrl == null ? null : summaryUrl.trim();
    }

    /**
     * 保函文件 URL
     * @return guarantee_letter_name 保函文件 URL
     */
    public String getGuaranteeLetterName() {
        return guaranteeLetterName;
    }

    /**
     * 保函文件 URL
     * @param guaranteeLetterName 保函文件 URL
     */
    public void setGuaranteeLetterName(String guaranteeLetterName) {
        this.guaranteeLetterName = guaranteeLetterName == null ? null : guaranteeLetterName.trim();
    }

    /**
     * 开单签收:时间戳
     * @return issue_date 开单签收:时间戳
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * 开单签收:时间戳
     * @param issueDate 开单签收:时间戳
     */
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate == null ? null : issueDate.trim();
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
        BillInfo other = (BillInfo) that;
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
            && (this.getAcceptCmyCode() == null ? other.getAcceptCmyCode() == null : this.getAcceptCmyCode().equals(other.getAcceptCmyCode()))
            && (this.getAcceptCmyName() == null ? other.getAcceptCmyName() == null : this.getAcceptCmyName().equals(other.getAcceptCmyName()))
            && (this.getApplyIssueCmyCode() == null ? other.getApplyIssueCmyCode() == null : this.getApplyIssueCmyCode().equals(other.getApplyIssueCmyCode()))
            && (this.getApplyIssueCmyName() == null ? other.getApplyIssueCmyName() == null : this.getApplyIssueCmyName().equals(other.getApplyIssueCmyName()))
            && (this.getApplyIssueDate() == null ? other.getApplyIssueDate() == null : this.getApplyIssueDate().equals(other.getApplyIssueDate()))
            && (this.getAssetsAttachmentName() == null ? other.getAssetsAttachmentName() == null : this.getAssetsAttachmentName().equals(other.getAssetsAttachmentName()))
            && (this.getAssetsAttachmentUrl() == null ? other.getAssetsAttachmentUrl() == null : this.getAssetsAttachmentUrl().equals(other.getAssetsAttachmentUrl()))
            && (this.getBillAmount() == null ? other.getBillAmount() == null : this.getBillAmount().equals(other.getBillAmount()))
            && (this.getBillCode() == null ? other.getBillCode() == null : this.getBillCode().equals(other.getBillCode()))
            && (this.getBillType() == null ? other.getBillType() == null : this.getBillType().equals(other.getBillType()))
            && (this.getBusinessNo() == null ? other.getBusinessNo() == null : this.getBusinessNo().equals(other.getBusinessNo()))
            && (this.getCurrentAmount() == null ? other.getCurrentAmount() == null : this.getCurrentAmount().equals(other.getCurrentAmount()))
            && (this.getExpireDate() == null ? other.getExpireDate() == null : this.getExpireDate().equals(other.getExpireDate()))
            && (this.getFactorCmyCode() == null ? other.getFactorCmyCode() == null : this.getFactorCmyCode().equals(other.getFactorCmyCode()))
            && (this.getFactorCmyName() == null ? other.getFactorCmyName() == null : this.getFactorCmyName().equals(other.getFactorCmyName()))
            && (this.getFinancialCmyCode() == null ? other.getFinancialCmyCode() == null : this.getFinancialCmyCode().equals(other.getFinancialCmyCode()))
            && (this.getFinancialCmyName() == null ? other.getFinancialCmyName() == null : this.getFinancialCmyName().equals(other.getFinancialCmyName()))
            && (this.getFrozen() == null ? other.getFrozen() == null : this.getFrozen().equals(other.getFrozen()))
            && (this.getGuaranteeCmyCode() == null ? other.getGuaranteeCmyCode() == null : this.getGuaranteeCmyCode().equals(other.getGuaranteeCmyCode()))
            && (this.getGuaranteeCmyName() == null ? other.getGuaranteeCmyName() == null : this.getGuaranteeCmyName().equals(other.getGuaranteeCmyName()))
            && (this.getGuaranteeLetterUrl() == null ? other.getGuaranteeLetterUrl() == null : this.getGuaranteeLetterUrl().equals(other.getGuaranteeLetterUrl()))
            && (this.getGuaranteeStatus() == null ? other.getGuaranteeStatus() == null : this.getGuaranteeStatus().equals(other.getGuaranteeStatus()))
            && (this.getHoldCmyCode() == null ? other.getHoldCmyCode() == null : this.getHoldCmyCode().equals(other.getHoldCmyCode()))
            && (this.getHoldCmyName() == null ? other.getHoldCmyName() == null : this.getHoldCmyName().equals(other.getHoldCmyName()))
            && (this.getIssueCmyCode() == null ? other.getIssueCmyCode() == null : this.getIssueCmyCode().equals(other.getIssueCmyCode()))
            && (this.getIssueCmyName() == null ? other.getIssueCmyName() == null : this.getIssueCmyName().equals(other.getIssueCmyName()))
            && (this.getLastHolderCmyCode() == null ? other.getLastHolderCmyCode() == null : this.getLastHolderCmyCode().equals(other.getLastHolderCmyCode()))
            && (this.getLastHolderCmyName() == null ? other.getLastHolderCmyName() == null : this.getLastHolderCmyName().equals(other.getLastHolderCmyName()))
            && (this.getParentBillCode() == null ? other.getParentBillCode() == null : this.getParentBillCode().equals(other.getParentBillCode()))
            && (this.getPromiseDate() == null ? other.getPromiseDate() == null : this.getPromiseDate().equals(other.getPromiseDate()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getRootBillCode() == null ? other.getRootBillCode() == null : this.getRootBillCode().equals(other.getRootBillCode()))
            && (this.getSourceType() == null ? other.getSourceType() == null : this.getSourceType().equals(other.getSourceType()))
            && (this.getStartHoldDate() == null ? other.getStartHoldDate() == null : this.getStartHoldDate().equals(other.getStartHoldDate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSummaryName() == null ? other.getSummaryName() == null : this.getSummaryName().equals(other.getSummaryName()))
            && (this.getSummaryUrl() == null ? other.getSummaryUrl() == null : this.getSummaryUrl().equals(other.getSummaryUrl()))
            && (this.getGuaranteeLetterName() == null ? other.getGuaranteeLetterName() == null : this.getGuaranteeLetterName().equals(other.getGuaranteeLetterName()))
            && (this.getIssueDate() == null ? other.getIssueDate() == null : this.getIssueDate().equals(other.getIssueDate()));
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
        result = prime * result + ((getAcceptCmyCode() == null) ? 0 : getAcceptCmyCode().hashCode());
        result = prime * result + ((getAcceptCmyName() == null) ? 0 : getAcceptCmyName().hashCode());
        result = prime * result + ((getApplyIssueCmyCode() == null) ? 0 : getApplyIssueCmyCode().hashCode());
        result = prime * result + ((getApplyIssueCmyName() == null) ? 0 : getApplyIssueCmyName().hashCode());
        result = prime * result + ((getApplyIssueDate() == null) ? 0 : getApplyIssueDate().hashCode());
        result = prime * result + ((getAssetsAttachmentName() == null) ? 0 : getAssetsAttachmentName().hashCode());
        result = prime * result + ((getAssetsAttachmentUrl() == null) ? 0 : getAssetsAttachmentUrl().hashCode());
        result = prime * result + ((getBillAmount() == null) ? 0 : getBillAmount().hashCode());
        result = prime * result + ((getBillCode() == null) ? 0 : getBillCode().hashCode());
        result = prime * result + ((getBillType() == null) ? 0 : getBillType().hashCode());
        result = prime * result + ((getBusinessNo() == null) ? 0 : getBusinessNo().hashCode());
        result = prime * result + ((getCurrentAmount() == null) ? 0 : getCurrentAmount().hashCode());
        result = prime * result + ((getExpireDate() == null) ? 0 : getExpireDate().hashCode());
        result = prime * result + ((getFactorCmyCode() == null) ? 0 : getFactorCmyCode().hashCode());
        result = prime * result + ((getFactorCmyName() == null) ? 0 : getFactorCmyName().hashCode());
        result = prime * result + ((getFinancialCmyCode() == null) ? 0 : getFinancialCmyCode().hashCode());
        result = prime * result + ((getFinancialCmyName() == null) ? 0 : getFinancialCmyName().hashCode());
        result = prime * result + ((getFrozen() == null) ? 0 : getFrozen().hashCode());
        result = prime * result + ((getGuaranteeCmyCode() == null) ? 0 : getGuaranteeCmyCode().hashCode());
        result = prime * result + ((getGuaranteeCmyName() == null) ? 0 : getGuaranteeCmyName().hashCode());
        result = prime * result + ((getGuaranteeLetterUrl() == null) ? 0 : getGuaranteeLetterUrl().hashCode());
        result = prime * result + ((getGuaranteeStatus() == null) ? 0 : getGuaranteeStatus().hashCode());
        result = prime * result + ((getHoldCmyCode() == null) ? 0 : getHoldCmyCode().hashCode());
        result = prime * result + ((getHoldCmyName() == null) ? 0 : getHoldCmyName().hashCode());
        result = prime * result + ((getIssueCmyCode() == null) ? 0 : getIssueCmyCode().hashCode());
        result = prime * result + ((getIssueCmyName() == null) ? 0 : getIssueCmyName().hashCode());
        result = prime * result + ((getLastHolderCmyCode() == null) ? 0 : getLastHolderCmyCode().hashCode());
        result = prime * result + ((getLastHolderCmyName() == null) ? 0 : getLastHolderCmyName().hashCode());
        result = prime * result + ((getParentBillCode() == null) ? 0 : getParentBillCode().hashCode());
        result = prime * result + ((getPromiseDate() == null) ? 0 : getPromiseDate().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getRootBillCode() == null) ? 0 : getRootBillCode().hashCode());
        result = prime * result + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        result = prime * result + ((getStartHoldDate() == null) ? 0 : getStartHoldDate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSummaryName() == null) ? 0 : getSummaryName().hashCode());
        result = prime * result + ((getSummaryUrl() == null) ? 0 : getSummaryUrl().hashCode());
        result = prime * result + ((getGuaranteeLetterName() == null) ? 0 : getGuaranteeLetterName().hashCode());
        result = prime * result + ((getIssueDate() == null) ? 0 : getIssueDate().hashCode());
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
        sb.append(", acceptCmyCode=").append(acceptCmyCode);
        sb.append(", acceptCmyName=").append(acceptCmyName);
        sb.append(", applyIssueCmyCode=").append(applyIssueCmyCode);
        sb.append(", applyIssueCmyName=").append(applyIssueCmyName);
        sb.append(", applyIssueDate=").append(applyIssueDate);
        sb.append(", assetsAttachmentName=").append(assetsAttachmentName);
        sb.append(", assetsAttachmentUrl=").append(assetsAttachmentUrl);
        sb.append(", billAmount=").append(billAmount);
        sb.append(", billCode=").append(billCode);
        sb.append(", billType=").append(billType);
        sb.append(", businessNo=").append(businessNo);
        sb.append(", currentAmount=").append(currentAmount);
        sb.append(", expireDate=").append(expireDate);
        sb.append(", factorCmyCode=").append(factorCmyCode);
        sb.append(", factorCmyName=").append(factorCmyName);
        sb.append(", financialCmyCode=").append(financialCmyCode);
        sb.append(", financialCmyName=").append(financialCmyName);
        sb.append(", frozen=").append(frozen);
        sb.append(", guaranteeCmyCode=").append(guaranteeCmyCode);
        sb.append(", guaranteeCmyName=").append(guaranteeCmyName);
        sb.append(", guaranteeLetterUrl=").append(guaranteeLetterUrl);
        sb.append(", guaranteeStatus=").append(guaranteeStatus);
        sb.append(", holdCmyCode=").append(holdCmyCode);
        sb.append(", holdCmyName=").append(holdCmyName);
        sb.append(", issueCmyCode=").append(issueCmyCode);
        sb.append(", issueCmyName=").append(issueCmyName);
        sb.append(", lastHolderCmyCode=").append(lastHolderCmyCode);
        sb.append(", lastHolderCmyName=").append(lastHolderCmyName);
        sb.append(", parentBillCode=").append(parentBillCode);
        sb.append(", promiseDate=").append(promiseDate);
        sb.append(", remark=").append(remark);
        sb.append(", rootBillCode=").append(rootBillCode);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", startHoldDate=").append(startHoldDate);
        sb.append(", status=").append(status);
        sb.append(", summaryName=").append(summaryName);
        sb.append(", summaryUrl=").append(summaryUrl);
        sb.append(", guaranteeLetterName=").append(guaranteeLetterName);
        sb.append(", issueDate=").append(issueDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}