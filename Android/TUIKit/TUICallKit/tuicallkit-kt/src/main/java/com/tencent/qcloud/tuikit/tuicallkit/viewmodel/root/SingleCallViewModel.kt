package com.tencent.qcloud.tuikit.tuicallkit.viewmodel.root

import com.tencent.qcloud.tuikit.tuicallengine.TUICallDefine
import com.tencent.qcloud.tuikit.tuicallengine.impl.base.LiveData
import com.tencent.qcloud.tuikit.tuicallkit.state.TUICallState

class SingleCallViewModel {
    public var callStatus = LiveData<TUICallDefine.Status>()
    public var callRole = LiveData<TUICallDefine.Role>()
    public var mediaType = LiveData<TUICallDefine.MediaType>()
    public var isShowFullScreen = LiveData<Boolean>()

    init {
        callStatus = TUICallState.instance.selfUser.get().callStatus
        callRole = TUICallState.instance.selfUser.get().callRole
        mediaType = TUICallState.instance.mediaType
        isShowFullScreen = TUICallState.instance.isShowFullScreen
    }
}