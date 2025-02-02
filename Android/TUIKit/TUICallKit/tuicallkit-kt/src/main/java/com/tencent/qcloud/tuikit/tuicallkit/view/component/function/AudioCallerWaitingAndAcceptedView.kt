package com.tencent.qcloud.tuikit.tuicallkit.view.component.function

import android.content.Context
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.tencent.qcloud.tuikit.TUICommonDefine
import com.tencent.qcloud.tuikit.tuicallengine.impl.base.Observer
import com.tencent.qcloud.tuikit.tuicallkit.R
import com.tencent.qcloud.tuikit.tuicallkit.view.root.BaseCallView
import com.tencent.qcloud.tuikit.tuicallkit.viewmodel.component.function.AudioCallerWaitingAndAcceptedViewModel

class AudioCallerWaitingAndAcceptedView(context: Context) : BaseCallView(context) {
    private var layoutMute: LinearLayout? = null
    private var layoutHangup: LinearLayout? = null
    private var layoutHandsFree: LinearLayout? = null
    private var imageMute: ImageView? = null
    private var imageHandsFree: ImageView? = null
    private var textMic: TextView? = null
    private var textAudioDevice: TextView? = null

    private var viewModel = AudioCallerWaitingAndAcceptedViewModel()

    private var isMicMuteObserver = Observer<Boolean> {
        imageMute?.isActivated = it
    }

    private var isSpeakerObserver = Observer<Boolean> {
        imageHandsFree?.isActivated = it
    }

    init {
        initView()

        addObserver()
    }

    override fun clear() {
        removeObserver()
        viewModel?.removeObserver()
    }

    private fun addObserver() {
        viewModel?.isMicMute?.observe(isMicMuteObserver)
        viewModel?.isSpeaker?.observe(isSpeakerObserver)
    }

    private fun removeObserver() {
        viewModel?.isMicMute?.removeObserver(isMicMuteObserver)
        viewModel?.isSpeaker?.removeObserver(isSpeakerObserver)
    }

    private fun initView() {
        LayoutInflater.from(context).inflate(R.layout.tuicallkit_function_view_audio, this)
        layoutMute = findViewById(R.id.ll_mute)
        imageMute = findViewById(R.id.img_mute)
        layoutHangup = findViewById(R.id.ll_hangup)
        layoutHandsFree = findViewById(R.id.ll_handsfree)
        imageHandsFree = findViewById(R.id.img_handsfree)
        textMic = findViewById(R.id.tv_mic)
        textAudioDevice = findViewById(R.id.tv_audio_device)

        imageMute?.isActivated = viewModel?.isMicMute?.get() == true
        imageHandsFree?.isActivated = viewModel?.isSpeaker?.get() == true
        initViewListener()
    }

    private fun initViewListener() {
        layoutMute?.setOnClickListener {
            val resId = if (viewModel?.isMicMute?.get() == true) {
                viewModel?.openMicrophone()
                R.string.tuicallkit_toast_disable_mute
            } else {
                viewModel?.closeMicrophone()
                R.string.tuicallkit_toast_enable_mute
            }
            textMic?.setText(context.getString(resId))

        }
        layoutHangup?.setOnClickListener { viewModel?.hangup() }
        layoutHandsFree?.setOnClickListener {
            val resId = if (viewModel?.isSpeaker?.get() == true) {
                viewModel?.selectAudioPlaybackDevice(TUICommonDefine.AudioPlaybackDevice.Earpiece)
                R.string.tuicallkit_toast_use_handset
            } else {
                viewModel?.selectAudioPlaybackDevice(TUICommonDefine.AudioPlaybackDevice.Speakerphone)
                R.string.tuicallkit_toast_speaker
            }
            textAudioDevice?.setText(context.getString(resId))
        }
    }

}