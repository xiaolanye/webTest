package com.web.entity;

import java.util.List;

public class SzMtptDetailRes {

    private SzMtptDetailStatus status;
    private List<SzMtptDetail> custom;

    public SzMtptDetailStatus getStatus() {
        return status;
    }

    public void setStatus(SzMtptDetailStatus status) {
        this.status = status;
    }

    public List<SzMtptDetail> getCustom() {
        return custom;
    }

    public void setCustom(List<SzMtptDetail> custom) {
        this.custom = custom;
    }
}
