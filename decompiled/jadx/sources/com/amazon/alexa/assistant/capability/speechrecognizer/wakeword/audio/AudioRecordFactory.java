package com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.audio;

import android.media.AudioRecord;
import androidx.annotation.RequiresPermission;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AudioMetadataBundleKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H'J \u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/audio/AudioRecordFactory;", "", "createAudioRecord", "Landroid/media/AudioRecord;", "audioSource", "", "sampleRateInHz", "channelConfig", AudioMetadataBundleKeys.AUDIO_FORMAT, "bufferSizeInBytes", "getMinBufferSize", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface AudioRecordFactory {
    @RequiresPermission("android.permission.RECORD_AUDIO")
    @NotNull
    AudioRecord createAudioRecord(int audioSource, int sampleRateInHz, int channelConfig, int audioFormat, int bufferSizeInBytes);

    int getMinBufferSize(int sampleRateInHz, int channelConfig, int audioFormat);
}
