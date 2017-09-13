package com.xyzlf.share.library.bean;

/**
 * @author: sq
 * @date: 2017/9/13
 * @corporation: 深圳市思迪信息技术股份有限公司
 * @description: 渠道实体
 */
public class ChannelEntity {
    
    private int channel;
    private int icon;
    private String name;

    public ChannelEntity(int channel, int icon, String name) {
        this.channel = channel;
        this.icon = icon;
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getchannel() {
        return channel;
    }

    public void setchannel(int channel) {
        this.channel = channel;
    }
}
