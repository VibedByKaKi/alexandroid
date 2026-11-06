package com.amazon.alexa.accessory.speechapi.speech;

import com.amazon.alexa.accessory.speechapi.LaunchType;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.DialogExtrasBundleKeys;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 $2\u00020\u0001:\u0002#$B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u001e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u001e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u001e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010R\u001e\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0010R\u001e\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0010R\u001e\u0010!\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0010¨\u0006%"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/speech/DialogExtras;", "", "builder", "Lcom/amazon/alexa/accessory/speechapi/speech/DialogExtras$Builder;", "(Lcom/amazon/alexa/accessory/speechapi/speech/DialogExtras$Builder;)V", "<set-?>", "", "defaultAudioDeviceFriendlyName", "getDefaultAudioDeviceFriendlyName", "()Ljava/lang/String;", "defaultAudioDevicePhysicalAddress", "getDefaultAudioDevicePhysicalAddress", "invocationType", "getInvocationType", "", DialogExtrasBundleKeys.IS_USER_ON_COMMS, "()Z", "Lcom/amazon/alexa/accessory/speechapi/LaunchType;", "launchType", "getLaunchType", "()Lcom/amazon/alexa/accessory/speechapi/LaunchType;", DialogExtrasBundleKeys.MUST_COORDINATE_RESPONSES, "getMustCoordinateResponses", "shouldUseSco", "getShouldUseSco", DialogExtrasBundleKeys.SUPPRESS_ENDPOINT_SOUND, "getSuppressEndpointSound", "suppressSpeechResponse", "getSuppressSpeechResponse", DialogExtrasBundleKeys.SUPPRESS_USER_INTERFACE, "getSuppressUserInterface", DialogExtrasBundleKeys.SUPPRESS_WAKE_SOUND, "getSuppressWakeSound", "userVoiceVerified", "getUserVoiceVerified", "Builder", "Companion", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class DialogExtras {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private String defaultAudioDeviceFriendlyName;

    @NotNull
    private String defaultAudioDevicePhysicalAddress;

    @NotNull
    private String invocationType;
    private boolean isUserOnComms;

    @NotNull
    private LaunchType launchType;
    private boolean mustCoordinateResponses;
    private boolean shouldUseSco;
    private boolean suppressEndpointSound;
    private boolean suppressSpeechResponse;
    private boolean suppressUserInterface;
    private boolean suppressWakeSound;
    private boolean userVoiceVerified;

    private DialogExtras(Builder builder) {
        this.launchType = LaunchType.UNKNOWN;
        this.invocationType = builder.getInvocationType();
        this.defaultAudioDevicePhysicalAddress = builder.getDefaultAudioDevicePhysicalAddress();
        this.defaultAudioDeviceFriendlyName = builder.getDefaultAudioDeviceFriendlyName();
        this.suppressWakeSound = builder.getSuppressWakeSound();
        this.suppressEndpointSound = builder.getSuppressEndpointSound();
        this.userVoiceVerified = builder.getUserVoiceVerified();
        this.suppressUserInterface = builder.getSuppressUserInterface();
        this.shouldUseSco = builder.getShouldUseSco();
        this.suppressSpeechResponse = builder.getSuppressSpeechResponse();
        this.isUserOnComms = builder.getIsUserOnComms();
        this.mustCoordinateResponses = builder.getMustCoordinateResponses();
        this.launchType = builder.getLaunchType();
    }

    @JvmStatic
    @NotNull
    public static final Builder newBuilder() {
        return INSTANCE.newBuilder();
    }

    @NotNull
    public final String getDefaultAudioDeviceFriendlyName() {
        return this.defaultAudioDeviceFriendlyName;
    }

    @NotNull
    public final String getDefaultAudioDevicePhysicalAddress() {
        return this.defaultAudioDevicePhysicalAddress;
    }

    @NotNull
    public final String getInvocationType() {
        return this.invocationType;
    }

    @NotNull
    public final LaunchType getLaunchType() {
        return this.launchType;
    }

    public final boolean getMustCoordinateResponses() {
        return this.mustCoordinateResponses;
    }

    public final boolean getShouldUseSco() {
        return this.shouldUseSco;
    }

    public final boolean getSuppressEndpointSound() {
        return this.suppressEndpointSound;
    }

    public final boolean getSuppressSpeechResponse() {
        return this.suppressSpeechResponse;
    }

    public final boolean getSuppressUserInterface() {
        return this.suppressUserInterface;
    }

    public final boolean getSuppressWakeSound() {
        return this.suppressWakeSound;
    }

    public final boolean getUserVoiceVerified() {
        return this.userVoiceVerified;
    }

    /* renamed from: isUserOnComms, reason: from getter */
    public final boolean getIsUserOnComms() {
        return this.isUserOnComms;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010/\u001a\u000200J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0010J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0010J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0010J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0010J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0010J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0010J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001a\u0010 \u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\u001a\u0010#\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R\u001a\u0010&\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010\u0013R\u001a\u0010)\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0011\"\u0004\b+\u0010\u0013R\u001a\u0010,\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0011\"\u0004\b.\u0010\u0013¨\u00061"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/speech/DialogExtras$Builder;", "", "()V", "defaultAudioDeviceFriendlyName", "", "getDefaultAudioDeviceFriendlyName", "()Ljava/lang/String;", "setDefaultAudioDeviceFriendlyName", "(Ljava/lang/String;)V", "defaultAudioDevicePhysicalAddress", "getDefaultAudioDevicePhysicalAddress", "setDefaultAudioDevicePhysicalAddress", "invocationType", "getInvocationType", "setInvocationType", DialogExtrasBundleKeys.IS_USER_ON_COMMS, "", "()Z", "setUserOnComms", "(Z)V", "launchType", "Lcom/amazon/alexa/accessory/speechapi/LaunchType;", "getLaunchType", "()Lcom/amazon/alexa/accessory/speechapi/LaunchType;", "setLaunchType", "(Lcom/amazon/alexa/accessory/speechapi/LaunchType;)V", DialogExtrasBundleKeys.MUST_COORDINATE_RESPONSES, "getMustCoordinateResponses", "setMustCoordinateResponses", "shouldUseSco", "getShouldUseSco", "setShouldUseSco", DialogExtrasBundleKeys.SUPPRESS_ENDPOINT_SOUND, "getSuppressEndpointSound", "setSuppressEndpointSound", "suppressSpeechResponse", "getSuppressSpeechResponse", "setSuppressSpeechResponse", DialogExtrasBundleKeys.SUPPRESS_USER_INTERFACE, "getSuppressUserInterface", "setSuppressUserInterface", DialogExtrasBundleKeys.SUPPRESS_WAKE_SOUND, "getSuppressWakeSound", "setSuppressWakeSound", "userVoiceVerified", "getUserVoiceVerified", "setUserVoiceVerified", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/accessory/speechapi/speech/DialogExtras;", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public String defaultAudioDeviceFriendlyName;
        public String defaultAudioDevicePhysicalAddress;
        public String invocationType;
        private boolean isUserOnComms;

        @NotNull
        private LaunchType launchType = LaunchType.UNKNOWN;
        private boolean mustCoordinateResponses;
        private boolean shouldUseSco;
        private boolean suppressEndpointSound;
        private boolean suppressSpeechResponse;
        private boolean suppressUserInterface;
        private boolean suppressWakeSound;
        private boolean userVoiceVerified;

        @NotNull
        public final DialogExtras build() {
            return new DialogExtras(this, null);
        }

        @NotNull
        public final Builder defaultAudioDeviceFriendlyName(@NotNull String defaultAudioDeviceFriendlyName) {
            defaultAudioDeviceFriendlyName.getClass();
            setDefaultAudioDeviceFriendlyName(defaultAudioDeviceFriendlyName);
            return this;
        }

        @NotNull
        public final Builder defaultAudioDevicePhysicalAddress(@NotNull String defaultAudioDevicePhysicalAddress) {
            defaultAudioDevicePhysicalAddress.getClass();
            setDefaultAudioDevicePhysicalAddress(defaultAudioDevicePhysicalAddress);
            return this;
        }

        @NotNull
        public final String getDefaultAudioDeviceFriendlyName() {
            String str = this.defaultAudioDeviceFriendlyName;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("defaultAudioDeviceFriendlyName");
            return null;
        }

        @NotNull
        public final String getDefaultAudioDevicePhysicalAddress() {
            String str = this.defaultAudioDevicePhysicalAddress;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("defaultAudioDevicePhysicalAddress");
            return null;
        }

        @NotNull
        public final String getInvocationType() {
            String str = this.invocationType;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("invocationType");
            return null;
        }

        @NotNull
        public final LaunchType getLaunchType() {
            return this.launchType;
        }

        public final boolean getMustCoordinateResponses() {
            return this.mustCoordinateResponses;
        }

        public final boolean getShouldUseSco() {
            return this.shouldUseSco;
        }

        public final boolean getSuppressEndpointSound() {
            return this.suppressEndpointSound;
        }

        public final boolean getSuppressSpeechResponse() {
            return this.suppressSpeechResponse;
        }

        public final boolean getSuppressUserInterface() {
            return this.suppressUserInterface;
        }

        public final boolean getSuppressWakeSound() {
            return this.suppressWakeSound;
        }

        public final boolean getUserVoiceVerified() {
            return this.userVoiceVerified;
        }

        @NotNull
        public final Builder invocationType(@NotNull String invocationType) {
            invocationType.getClass();
            setInvocationType(invocationType);
            return this;
        }

        /* renamed from: isUserOnComms, reason: from getter */
        public final boolean getIsUserOnComms() {
            return this.isUserOnComms;
        }

        @NotNull
        public final Builder launchType(@NotNull LaunchType launchType) {
            launchType.getClass();
            this.launchType = launchType;
            return this;
        }

        @NotNull
        public final Builder mustCoordinateResponses(boolean mustCoordinateResponses) {
            this.mustCoordinateResponses = mustCoordinateResponses;
            return this;
        }

        public final void setDefaultAudioDeviceFriendlyName(@NotNull String str) {
            str.getClass();
            this.defaultAudioDeviceFriendlyName = str;
        }

        public final void setDefaultAudioDevicePhysicalAddress(@NotNull String str) {
            str.getClass();
            this.defaultAudioDevicePhysicalAddress = str;
        }

        public final void setInvocationType(@NotNull String str) {
            str.getClass();
            this.invocationType = str;
        }

        public final void setLaunchType(@NotNull LaunchType launchType) {
            launchType.getClass();
            this.launchType = launchType;
        }

        public final void setMustCoordinateResponses(boolean z) {
            this.mustCoordinateResponses = z;
        }

        public final void setShouldUseSco(boolean z) {
            this.shouldUseSco = z;
        }

        public final void setSuppressEndpointSound(boolean z) {
            this.suppressEndpointSound = z;
        }

        public final void setSuppressSpeechResponse(boolean z) {
            this.suppressSpeechResponse = z;
        }

        public final void setSuppressUserInterface(boolean z) {
            this.suppressUserInterface = z;
        }

        public final void setSuppressWakeSound(boolean z) {
            this.suppressWakeSound = z;
        }

        public final void setUserOnComms(boolean z) {
            this.isUserOnComms = z;
        }

        public final void setUserVoiceVerified(boolean z) {
            this.userVoiceVerified = z;
        }

        @NotNull
        public final Builder shouldUseSco(boolean shouldUseSco) {
            this.shouldUseSco = shouldUseSco;
            return this;
        }

        @NotNull
        public final Builder suppressEndpointSound(boolean suppressEndpointSound) {
            this.suppressEndpointSound = suppressEndpointSound;
            return this;
        }

        @NotNull
        public final Builder suppressSpeechResponse(boolean suppressSpeechResponse) {
            this.suppressSpeechResponse = suppressSpeechResponse;
            return this;
        }

        @NotNull
        public final Builder suppressUserInterface(boolean suppressUserInterface) {
            this.suppressUserInterface = suppressUserInterface;
            return this;
        }

        @NotNull
        public final Builder suppressWakeSound(boolean suppressWakeSound) {
            this.suppressWakeSound = suppressWakeSound;
            return this;
        }

        @NotNull
        public final Builder userVoiceVerified(boolean userVoiceVerified) {
            this.userVoiceVerified = userVoiceVerified;
            return this;
        }

        @NotNull
        public final Builder isUserOnComms(boolean isUserOnComms) {
            this.isUserOnComms = isUserOnComms;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/speech/DialogExtras$Companion;", "", "()V", "newBuilder", "Lcom/amazon/alexa/accessory/speechapi/speech/DialogExtras$Builder;", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Builder newBuilder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    public /* synthetic */ DialogExtras(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
