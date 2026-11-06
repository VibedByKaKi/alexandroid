package com.amazon.comms.calling.domain.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0012\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/amazon/comms/calling/domain/model/AudioPickerState;", "", "audioRoutes", "", "currentAudioRoute", "", "activeBluetoothDeviceName", "shouldShowPicker", "", "<init>", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Z)V", "getAudioRoutes", "()Ljava/util/Map;", "getCurrentAudioRoute", "()Ljava/lang/String;", "getActiveBluetoothDeviceName", "getShouldShowPicker", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class AudioPickerState {

    @Nullable
    private final String activeBluetoothDeviceName;

    @NotNull
    private final Map<?, ?> audioRoutes;

    @Nullable
    private final String currentAudioRoute;
    private final boolean shouldShowPicker;

    public AudioPickerState(@NotNull Map<?, ?> map, @Nullable String str, @Nullable String str2, boolean z) {
        map.getClass();
        this.audioRoutes = map;
        this.currentAudioRoute = str;
        this.activeBluetoothDeviceName = str2;
        this.shouldShowPicker = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AudioPickerState copy$default(AudioPickerState audioPickerState, Map map, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            map = audioPickerState.audioRoutes;
        }
        if ((i & 2) != 0) {
            str = audioPickerState.currentAudioRoute;
        }
        if ((i & 4) != 0) {
            str2 = audioPickerState.activeBluetoothDeviceName;
        }
        if ((i & 8) != 0) {
            z = audioPickerState.shouldShowPicker;
        }
        return audioPickerState.copy(map, str, str2, z);
    }

    @NotNull
    public final Map<?, ?> component1() {
        return this.audioRoutes;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getCurrentAudioRoute() {
        return this.currentAudioRoute;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getActiveBluetoothDeviceName() {
        return this.activeBluetoothDeviceName;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShouldShowPicker() {
        return this.shouldShowPicker;
    }

    @NotNull
    public final AudioPickerState copy(@NotNull Map<?, ?> audioRoutes, @Nullable String currentAudioRoute, @Nullable String activeBluetoothDeviceName, boolean shouldShowPicker) {
        audioRoutes.getClass();
        return new AudioPickerState(audioRoutes, currentAudioRoute, activeBluetoothDeviceName, shouldShowPicker);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioPickerState)) {
            return false;
        }
        AudioPickerState audioPickerState = (AudioPickerState) other;
        return Intrinsics.areEqual(this.audioRoutes, audioPickerState.audioRoutes) && Intrinsics.areEqual(this.currentAudioRoute, audioPickerState.currentAudioRoute) && Intrinsics.areEqual(this.activeBluetoothDeviceName, audioPickerState.activeBluetoothDeviceName) && this.shouldShowPicker == audioPickerState.shouldShowPicker;
    }

    @Nullable
    public final String getActiveBluetoothDeviceName() {
        return this.activeBluetoothDeviceName;
    }

    @NotNull
    public final Map<?, ?> getAudioRoutes() {
        return this.audioRoutes;
    }

    @Nullable
    public final String getCurrentAudioRoute() {
        return this.currentAudioRoute;
    }

    public final boolean getShouldShowPicker() {
        return this.shouldShowPicker;
    }

    public int hashCode() {
        int hashCode = this.audioRoutes.hashCode() * 31;
        String str = this.currentAudioRoute;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.activeBluetoothDeviceName;
        return Boolean.hashCode(this.shouldShowPicker) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "AudioPickerState(audioRoutes=" + this.audioRoutes + ", currentAudioRoute=" + this.currentAudioRoute + ", activeBluetoothDeviceName=" + this.activeBluetoothDeviceName + ", shouldShowPicker=" + this.shouldShowPicker + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
