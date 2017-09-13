package com.xyzlf.share.library.interfaces;

import com.xyzlf.share.library.bean.ShareEntity;


public interface IShareBase {
    /**
     * @param data {@link ShareEntity}
     * @param listener {@link OnShareListener}
     */
    void share(ShareEntity data, OnShareListener listener);
}
