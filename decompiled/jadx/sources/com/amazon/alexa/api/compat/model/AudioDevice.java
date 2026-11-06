package com.amazon.alexa.api.compat.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AudioOutputContextBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AudioDevice;", "", AudioOutputContextBundleKeys.PHYSICAL_ADDRESS, "", "friendlyName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPhysicalAddress", "()Ljava/lang/String;", "getFriendlyName", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AudioDevice {
    public static final int $stable = 0;

    @NotNull
    public static final String DEFAULT_PHYSICAL_ADDRESS = "INTERNAL";

    @NotNull
    private final String friendlyName;

    @NotNull
    private final String physicalAddress;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String DEFAULT_FRIENDLY_NAME = "DEFAULT_OUTPUT";

    @JvmField
    @NotNull
    public static final AudioDevice DEFAULT = new AudioDevice("INTERNAL", DEFAULT_FRIENDLY_NAME);

    public /* synthetic */ AudioDevice(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "INTERNAL" : str, (i & 2) != 0 ? DEFAULT_FRIENDLY_NAME : str2);
    }

    public static /* synthetic */ AudioDevice copy$default(AudioDevice audioDevice, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = audioDevice.physicalAddress;
        }
        if ((i & 2) != 0) {
            str2 = audioDevice.friendlyName;
        }
        return audioDevice.copy(str, str2);
    }

    @JvmStatic
    @NotNull
    public static final AudioDevice create(@NotNull String str, @NotNull String str2) {
        return INSTANCE.create(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPhysicalAddress() {
        return this.physicalAddress;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    @NotNull
    public final AudioDevice copy(@NotNull String physicalAddress, @NotNull String friendlyName) {
        physicalAddress.getClass();
        friendlyName.getClass();
        return new AudioDevice(physicalAddress, friendlyName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioDevice)) {
            return false;
        }
        AudioDevice audioDevice = (AudioDevice) other;
        return Intrinsics.areEqual(this.physicalAddress, audioDevice.physicalAddress) && Intrinsics.areEqual(this.friendlyName, audioDevice.friendlyName);
    }

    @NotNull
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    @NotNull
    public final String getPhysicalAddress() {
        return this.physicalAddress;
    }

    public int hashCode() {
        return this.friendlyName.hashCode() + (this.physicalAddress.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("AudioDevice(physicalAddress=", this.physicalAddress, ", friendlyName=", this.friendlyName, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AudioDevice$Companion;", "", "<init>", "()V", "DEFAULT_PHYSICAL_ADDRESS", "", "DEFAULT_FRIENDLY_NAME", "DEFAULT", "Lcom/amazon/alexa/api/compat/model/AudioDevice;", "create", AudioOutputContextBundleKeys.PHYSICAL_ADDRESS, "friendlyName", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final AudioDevice create(@NotNull String physicalAddress, @NotNull String friendlyName) {
            physicalAddress.getClass();
            friendlyName.getClass();
            return new AudioDevice(physicalAddress, friendlyName);
        }

        private Companion() {
        }
    }

    public AudioDevice(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.physicalAddress = str;
        this.friendlyName = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioDevice() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
