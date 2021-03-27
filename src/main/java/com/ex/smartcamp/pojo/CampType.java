package com.ex.smartcamp.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "camp_type")
public class CampType {
    /**
     * 营地类别Id
     */
    @Id
    private String id;

    /**
     * 营地类别父Id
     */
    @Column(name = "parent_id")
    private String parentId;

    /**
     * 营地名称
     */
    @Column(name = "type_name")
    private String typeName;

    /**
     * 获取营地类别Id
     *
     * @return id - 营地类别Id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置营地类别Id
     *
     * @param id 营地类别Id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取营地类别父Id
     *
     * @return parent_id - 营地类别父Id
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置营地类别父Id
     *
     * @param parentId 营地类别父Id
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取营地名称
     *
     * @return type_name - 营地名称
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 设置营地名称
     *
     * @param typeName 营地名称
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}