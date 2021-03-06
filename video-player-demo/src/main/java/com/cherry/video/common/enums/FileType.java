package com.cherry.video.common.enums;

/**
 * @Author: Cherry
 * @Date: 2020/12/28
 * @Desc: FileType
 */
public enum FileType {

    DIR("dir"),
    FILE("file");

    private String type;

    FileType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
