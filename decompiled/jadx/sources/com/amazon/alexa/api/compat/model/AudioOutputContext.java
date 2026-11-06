package com.amazon.alexa.api.compat.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AudioOutputContextBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AudioOutputContext;", "", "device", "Lcom/amazon/alexa/api/compat/model/AudioDevice;", AudioOutputContextBundleKeys.SHOULD_PLAY_OVER_SCO, "", "<init>", "(Lcom/amazon/alexa/api/compat/model/AudioDevice;Z)V", "getDevice", "()Lcom/amazon/alexa/api/compat/model/AudioDevice;", "getShouldPlayOverSco", "()Z", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AudioOutputContext {
    public static final int $stable = 0;

    @JvmField
    @NotNull
    public static final AudioOutputContext DEFAULT = new AudioOutputContext(AudioDevice.DEFAULT, false);

    @NotNull
    private final AudioDevice device;
    private final boolean shouldPlayOverSco;

    public /* synthetic */ AudioOutputContext(AudioDevice audioDevice, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AudioDevice.DEFAULT : audioDevice, (i & 2) != 0 ? false : z);
    }

    public static /* synthetic */ AudioOutputContext copy$default(AudioOutputContext audioOutputContext, AudioDevice audioDevice, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            audioDevice = audioOutputContext.device;
        }
        if ((i & 2) != 0) {
            z = audioOutputContext.shouldPlayOverSco;
        }
        return audioOutputContext.copy(audioDevice, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AudioDevice getDevice() {
        return this.device;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShouldPlayOverSco() {
        return this.shouldPlayOverSco;
    }

    @NotNull
    public final AudioOutputContext copy(@NotNull AudioDevice device, boolean shouldPlayOverSco) {
        device.getClass();
        return new AudioOutputContext(device, shouldPlayOverSco);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioOutputContext)) {
            return false;
        }
        AudioOutputContext audioOutputContext = (AudioOutputContext) other;
        return Intrinsics.areEqual(this.device, audioOutputContext.device) && this.shouldPlayOverSco == audioOutputContext.shouldPlayOverSco;
    }

    @NotNull
    public final AudioDevice getDevice() {
        return this.device;
    }

    public final boolean getShouldPlayOverSco() {
        return this.shouldPlayOverSco;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldPlayOverSco) + (this.device.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AudioOutputContext(device=" + this.device + ", shouldPlayOverSco=" + this.shouldPlayOverSco + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public AudioOutputContext(@NotNull AudioDevice audioDevice, boolean z) {
        audioDevice.getClass();
        this.device = audioDevice;
        this.shouldPlayOverSco = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioOutputContext() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }
}
