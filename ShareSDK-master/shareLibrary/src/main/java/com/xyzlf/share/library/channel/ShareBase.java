package com.xyzlf.share.library.channel;

import android.content.Context;

import com.xyzlf.share.library.interfaces.IShareBase;

/**
 * @author: sq
 * @date: 2017/9/13
 * @corporation: 深圳市思迪信息技术股份有限公司
 * @description: 分享基类
 */
public abstract class ShareBase implements IShareBase {

    Context context;

    public ShareBase(Context context) {
        this.context = context;
    }

}
