package com.ex.smartcamp.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "sys_camp_info")
public class SysCampInfo {
    /**
     * 编号
     */
    @Id
    private String id;

    /**
     * 营地名称
     */
    private String name;

    /**
     * 营地管理员
     */
    @Column(name = "admin_user_id")
    private Integer adminUserId;

    /**
     * 营地相册
     */
    private String album;

    /**
     * 营业执照
     */
    private String license;

    /**
     * 信用注册号
     */
    @Column(name = "licenseCode")
    private String licensecode;

    /**
     * 开放时间
     */
    @Column(name = "openTime")
    private String opentime;

    /**
     * 开放对象
     */
    @Column(name = "openObject")
    private String openobject;

    /**
     * 营地区位
     */
    @Column(name = "campLocation")
    private String camplocation;

    /**
     * 盈利性质
     */
    private String profit;

    /**
     * 营地特色
     */
    private String features;

    /**
     * 营地容量
     */
    private Integer capacity;

    /**
     * 是否广告
     */
    @Column(name = "isAdvertisement")
    private Byte isadvertisement;

    /**
     * 是否推荐
     */
    @Column(name = "isRecommend")
    private Byte isrecommend;

    /**
     * 创建人
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新人
     */
    @Column(name = "last_update_by")
    private String lastUpdateBy;

    /**
     * 更新时间
     */
    @Column(name = "last_update_time")
    private Date lastUpdateTime;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public String getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取营地名称
     *
     * @return name - 营地名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置营地名称
     *
     * @param name 营地名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取营地管理员
     *
     * @return admin_user_id - 营地管理员
     */
    public Integer getAdminUserId() {
        return adminUserId;
    }

    /**
     * 设置营地管理员
     *
     * @param adminUserId 营地管理员
     */
    public void setAdminUserId(Integer adminUserId) {
        this.adminUserId = adminUserId;
    }

    /**
     * 获取营地相册
     *
     * @return album - 营地相册
     */
    public String getAlbum() {
        return album;
    }

    /**
     * 设置营地相册
     *
     * @param album 营地相册
     */
    public void setAlbum(String album) {
        this.album = album;
    }

    /**
     * 获取营业执照
     *
     * @return license - 营业执照
     */
    public String getLicense() {
        return license;
    }

    /**
     * 设置营业执照
     *
     * @param license 营业执照
     */
    public void setLicense(String license) {
        this.license = license;
    }

    /**
     * 获取信用注册号
     *
     * @return licenseCode - 信用注册号
     */
    public String getLicensecode() {
        return licensecode;
    }

    /**
     * 设置信用注册号
     *
     * @param licensecode 信用注册号
     */
    public void setLicensecode(String licensecode) {
        this.licensecode = licensecode;
    }

    /**
     * 获取开放时间
     *
     * @return openTime - 开放时间
     */
    public String getOpentime() {
        return opentime;
    }

    /**
     * 设置开放时间
     *
     * @param opentime 开放时间
     */
    public void setOpentime(String opentime) {
        this.opentime = opentime;
    }

    /**
     * 获取开放对象
     *
     * @return openObject - 开放对象
     */
    public String getOpenobject() {
        return openobject;
    }

    /**
     * 设置开放对象
     *
     * @param openobject 开放对象
     */
    public void setOpenobject(String openobject) {
        this.openobject = openobject;
    }

    /**
     * 获取营地区位
     *
     * @return campLocation - 营地区位
     */
    public String getCamplocation() {
        return camplocation;
    }

    /**
     * 设置营地区位
     *
     * @param camplocation 营地区位
     */
    public void setCamplocation(String camplocation) {
        this.camplocation = camplocation;
    }

    /**
     * 获取盈利性质
     *
     * @return profit - 盈利性质
     */
    public String getProfit() {
        return profit;
    }

    /**
     * 设置盈利性质
     *
     * @param profit 盈利性质
     */
    public void setProfit(String profit) {
        this.profit = profit;
    }

    /**
     * 获取营地特色
     *
     * @return features - 营地特色
     */
    public String getFeatures() {
        return features;
    }

    /**
     * 设置营地特色
     *
     * @param features 营地特色
     */
    public void setFeatures(String features) {
        this.features = features;
    }

    /**
     * 获取营地容量
     *
     * @return capacity - 营地容量
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * 设置营地容量
     *
     * @param capacity 营地容量
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    /**
     * 获取是否广告
     *
     * @return isAdvertisement - 是否广告
     */
    public Byte getIsadvertisement() {
        return isadvertisement;
    }

    /**
     * 设置是否广告
     *
     * @param isadvertisement 是否广告
     */
    public void setIsadvertisement(Byte isadvertisement) {
        this.isadvertisement = isadvertisement;
    }

    /**
     * 获取是否推荐
     *
     * @return isRecommend - 是否推荐
     */
    public Byte getIsrecommend() {
        return isrecommend;
    }

    /**
     * 设置是否推荐
     *
     * @param isrecommend 是否推荐
     */
    public void setIsrecommend(Byte isrecommend) {
        this.isrecommend = isrecommend;
    }

    /**
     * 获取创建人
     *
     * @return create_by - 创建人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新人
     *
     * @return last_update_by - 更新人
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * 设置更新人
     *
     * @param lastUpdateBy 更新人
     */
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    /**
     * 获取更新时间
     *
     * @return last_update_time - 更新时间
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 设置更新时间
     *
     * @param lastUpdateTime 更新时间
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}