package com.amazon.alexa.api;

import android.os.Bundle;
import com.amazon.alexa.api.Bundles;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AudioOutputContextBundleKeys;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.DialogExtrasBundleKeys;
import com.amazon.alexa.client.annotations.NonNull;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.utils.TimeProvider;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaDialogExtras {
    private final AlexaUserInterfaceOptions alexaUserInterfaceOptions;
    private final AudioOutputContext audioOutputContext;
    private final long dialogStartTimestampMillis;
    private final boolean enableInteractionFromLockscreen;
    private final boolean enableSpeakerVerification;

    @Nullable
    private final String interactionLabel;
    private final String invocationType;
    private final boolean isUserOnComms;
    private final boolean isUserVoiceVerified;
    private final LaunchType launchType;
    private final boolean mustCoordinateResponses;

    @Nullable
    private final ResponseType responseType;
    private final boolean suppressEndpointSound;
    private final boolean suppressEndpointSoundOnlyOnFirstTurn;
    private final boolean suppressSpeechResponse;
    private final boolean suppressUserInterface;
    private final boolean suppressWakeSound;
    private final boolean suppressWakeSoundOnlyOnFirstTurn;
    private final boolean suppressWakewordVerification;
    private final TimeProvider timeProvider;

    @Nullable
    private final String universalPrivacyCode;
    static final DialogExtrasKeys KEY_IS_USER_VOICE_VERIFIED = new DialogExtrasKeys(DialogExtrasKeysEnum.IS_USER_VOICE_VERIFIED);
    static final DialogExtrasKeys KEY_SUPPRESS_ENDPOINT_SOUND = new DialogExtrasKeys(DialogExtrasKeysEnum.SUPPRESS_ENDPOINT_SOUND);
    static final DialogExtrasKeys KEY_SUPPRESS_ENDPOINT_SOUND_ONLY_ON_FIRST_TURN = new DialogExtrasKeys(DialogExtrasKeysEnum.SUPPRESS_ENDPOINT_SOUND_ONLY_ON_FIRST_TURN);
    static final DialogExtrasKeys KEY_SUPPRESS_UI = new DialogExtrasKeys(DialogExtrasKeysEnum.SUPPRESS_UI);
    static final DialogExtrasKeys KEY_SUPPRESS_WAKE_SOUND = new DialogExtrasKeys(DialogExtrasKeysEnum.SUPPRESS_WAKESOUND);
    static final DialogExtrasKeys KEY_SUPPRESS_WAKE_SOUND_ONLY_ON_FIRST_TURN = new DialogExtrasKeys(DialogExtrasKeysEnum.SUPPRESS_WAKESOUND_ONLY_ON_FIRST_TURN);
    static final DialogExtrasKeys KEY_INVOCATION_TYPE = new DialogExtrasKeys(DialogExtrasKeysEnum.INVOCATION_TYPE);
    static final DialogExtrasKeys KEY_LAUNCH_TYPE = new DialogExtrasKeys(DialogExtrasKeysEnum.LAUNCH_TYPE);
    static final DialogExtrasKeys KEY_AUDIO_OUTPUT_CONTEXT = new DialogExtrasKeys(DialogExtrasKeysEnum.AUDIO_OUTPUT_CONTEXT);
    static final DialogExtrasKeys KEY_AUDIO_OUTPUT_DEVICE_ADDRESS = new DialogExtrasKeys(DialogExtrasKeysEnum.AUDIO_OUTPUT_DEVICE_ADDRESS);
    static final DialogExtrasKeys KEY_AUDIO_OUTPUT_DEVICE_FRIENDLY_NAME = new DialogExtrasKeys(DialogExtrasKeysEnum.AUDIO_OUTPUT_DEVICE_FRIENDLY_NAME);
    static final DialogExtrasKeys KEY_AUDIO_OUTPUT_SHOULD_PLAY_OVER_SCO = new DialogExtrasKeys(DialogExtrasKeysEnum.AUDIO_OUTPUT_SHOULD_PLAY_OVER_SCO);
    static final DialogExtrasKeys KEY_USER_INTERFACE_OPTIONS = new DialogExtrasKeys(DialogExtrasKeysEnum.USER_INTERFACE_OPTIONS);
    static final DialogExtrasKeys KEY_SUPPRESS_WW_VERIFICATION = new DialogExtrasKeys(DialogExtrasKeysEnum.SUPPRESS_WW_VERIFICATION);
    static final DialogExtrasKeys KEY_ENABLE_SPEAKER_VERIFICATION = new DialogExtrasKeys(DialogExtrasKeysEnum.ENABLE_SPEAKER_VERIFICATION);
    static final DialogExtrasKeys KEY_SUPPRESS_SPEECH_RESPONSE = new DialogExtrasKeys(DialogExtrasKeysEnum.SUPPRESS_SPEECH_RESPONSE);
    static final DialogExtrasKeys KEY_IS_USER_ON_COMMS = new DialogExtrasKeys(DialogExtrasKeysEnum.IS_USER_ON_COMMS);
    static final DialogExtrasKeys KEY_DIALOG_START_TIMESTAMP_MILLIS = new DialogExtrasKeys(DialogExtrasKeysEnum.DIALOG_START_TIMESTAMP_MILLIS);
    static final DialogExtrasKeys KEY_MUST_COORDINATE_RESPONSES = new DialogExtrasKeys(DialogExtrasKeysEnum.MUST_COORDINATE_RESPONSES);
    static final DialogExtrasKeys KEY_UNIVERSAL_PRIVACY_CODE = new DialogExtrasKeys(DialogExtrasKeysEnum.UNIVERSAL_PRIVACY_CODE);
    static final DialogExtrasKeys KEY_INTERACTION_LABEL = new DialogExtrasKeys(DialogExtrasKeysEnum.INTERACTION_LABEL);
    static final DialogExtrasKeys KEY_RESPONSE_TYPE = new DialogExtrasKeys(DialogExtrasKeysEnum.RESPONSE_TYPE);
    static final DialogExtrasKeys KEY_ENABLE_INTERACTION_ON_LOCKSCREEN = new DialogExtrasKeys(DialogExtrasKeysEnum.ENABLE_INTERACTION_ON_LOCKSCREEN);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DialogExtrasKeys implements Bundles.Key {
        private final DialogExtrasKeysEnum enumVal;

        public DialogExtrasKeys(DialogExtrasKeysEnum dialogExtrasKeysEnum) {
            this.enumVal = dialogExtrasKeysEnum;
        }

        @Override // com.amazon.alexa.api.Bundles.Key
        public String name() {
            return this.enumVal.getName();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum DialogExtrasKeysEnum {
        IS_USER_VOICE_VERIFIED("userVoiceVerified"),
        SUPPRESS_ENDPOINT_SOUND(DialogExtrasBundleKeys.SUPPRESS_ENDPOINT_SOUND),
        SUPPRESS_UI(DialogExtrasBundleKeys.SUPPRESS_USER_INTERFACE),
        SUPPRESS_WAKESOUND(DialogExtrasBundleKeys.SUPPRESS_WAKE_SOUND),
        SUPPRESS_WAKESOUND_ONLY_ON_FIRST_TURN(DialogExtrasBundleKeys.SUPPRESS_WAKE_SOUND_ONLY_ON_FIRST_TURN),
        SUPPRESS_ENDPOINT_SOUND_ONLY_ON_FIRST_TURN(DialogExtrasBundleKeys.SUPPRESS_ENDPOINT_SOUND_ONLY_ON_FIRST_TURN),
        INVOCATION_TYPE("invocationType"),
        LAUNCH_TYPE("launchType"),
        AUDIO_OUTPUT_CONTEXT(DialogExtrasBundleKeys.AUDIO_OUTPUT_CONTEXT),
        AUDIO_OUTPUT_DEVICE_ADDRESS("deviceAddress"),
        AUDIO_OUTPUT_DEVICE_FRIENDLY_NAME("deviceFriendlyName"),
        USER_INTERFACE_OPTIONS("uiOptions"),
        AUDIO_OUTPUT_SHOULD_PLAY_OVER_SCO(AudioOutputContextBundleKeys.SHOULD_PLAY_OVER_SCO),
        SUPPRESS_WW_VERIFICATION(DialogExtrasBundleKeys.SUPPRESS_WAKEWORD_VERIFICATION),
        ENABLE_SPEAKER_VERIFICATION(DialogExtrasBundleKeys.ENABLE_SPEAKER_VERIFICATION),
        SUPPRESS_SPEECH_RESPONSE("suppressSpeechResponse"),
        IS_USER_ON_COMMS(DialogExtrasBundleKeys.IS_USER_ON_COMMS),
        DIALOG_START_TIMESTAMP_MILLIS("dialogStartTimestampMillis"),
        MUST_COORDINATE_RESPONSES(DialogExtrasBundleKeys.MUST_COORDINATE_RESPONSES),
        UNIVERSAL_PRIVACY_CODE("universalPrivacyCode"),
        INTERACTION_LABEL("interactionLabel"),
        RESPONSE_TYPE("responseType"),
        ENABLE_INTERACTION_ON_LOCKSCREEN("enableInteractionOnLockscreen");

        private String name;

        DialogExtrasKeysEnum(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    private AlexaDialogExtras(Builder builder) {
        TimeProvider timeProvider = new TimeProvider();
        this.timeProvider = timeProvider;
        this.isUserVoiceVerified = builder.isUserVoiceVerified;
        this.suppressEndpointSound = builder.suppressEndpointSound;
        this.suppressEndpointSoundOnlyOnFirstTurn = builder.suppressEndpointSoundOnlyOnFirstTurn;
        this.suppressWakeSound = builder.suppressWakeSound;
        this.suppressWakeSoundOnlyOnFirstTurn = builder.suppressWakeSoundOnlyOnFirstTurn;
        this.suppressUserInterface = builder.suppressUserInterface;
        this.invocationType = builder.invocationType;
        this.launchType = builder.launchType != null ? builder.launchType : LaunchType.UNKNOWN;
        this.audioOutputContext = builder.audioOutputContext != null ? builder.audioOutputContext : AudioOutputContext.DEFAULT;
        this.alexaUserInterfaceOptions = builder.alexaUserInterfaceOptions != null ? builder.alexaUserInterfaceOptions : AlexaUserInterfaceOptions.builder().build();
        this.suppressWakewordVerification = builder.suppressWakewordVerification;
        this.enableInteractionFromLockscreen = builder.enableInteractionFromLockscreen;
        this.enableSpeakerVerification = builder.enableSpeakerVerification;
        this.suppressSpeechResponse = builder.suppressSpeechResponse;
        this.isUserOnComms = builder.isUserOnComms;
        this.dialogStartTimestampMillis = builder.dialogStartTimestampMillis == 0 ? timeProvider.elapsedRealTime() : builder.dialogStartTimestampMillis;
        this.mustCoordinateResponses = builder.mustCoordinateResponses;
        this.universalPrivacyCode = builder.universalPrivacyCode;
        this.interactionLabel = builder.interactionLabel;
        this.responseType = builder.responseType;
    }

    public static Builder builder() {
        return new Builder();
    }

    private boolean getBoolean(@Nullable Bundle bundle, Bundles.Key key) {
        return bundle != null && Bundles.getBoolean(bundle, key);
    }

    public static Builder getBuilder(@NonNull AlexaDialogExtras alexaDialogExtras) {
        return builder().setAudioOutputContext(alexaDialogExtras.getAudioOutputContext()).setInvocationType(alexaDialogExtras.getInvocationType()).setLaunchType(alexaDialogExtras.getLaunchType()).setUserVoiceVerified(alexaDialogExtras.isUserVoiceVerified()).suppressUserInterface(alexaDialogExtras.suppressUserInterface()).setAlexaUserInterfaceOptions(alexaDialogExtras.getAlexaUserInterfaceOptions()).suppressWakeSoundOnlyOnFirstTurn(alexaDialogExtras.suppressWakeSoundOnlyOnFirstTurn()).suppressWakeSound(alexaDialogExtras.suppressWakeSound()).suppressEndpointSoundOnlyOnFirstTurn(alexaDialogExtras.suppressEndpointSoundOnlyOnFirstTurn()).suppressEndpointSound(alexaDialogExtras.suppressEndpointSound()).suppressWakewordVerification(alexaDialogExtras.suppressWakewordVerification()).enableSpeakerVerification(alexaDialogExtras.enableSpeakerVerification()).suppressSpeechResponse(alexaDialogExtras.suppressSpeechResponse()).isUserOnComms(alexaDialogExtras.isUserOnComms()).setDialogStartTimestampMillis(alexaDialogExtras.getDialogStartTimestampMillis()).setUniversalPrivacyCode(alexaDialogExtras.getUniversalPrivacyCode()).setInteractionLabel(alexaDialogExtras.getInteractionLabel()).enableInteractionFromLockscreen(alexaDialogExtras.enableInteractionFromLockscreen).setResponseType(alexaDialogExtras.getResponseType());
    }

    private ResponseType getResponseType(@Nullable Bundle bundle) {
        String optionalString;
        if (bundle == null || (optionalString = Bundles.getOptionalString(bundle, KEY_RESPONSE_TYPE)) == null) {
            return null;
        }
        try {
            return ResponseType.valueOf(optionalString);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private String getString(@Nullable Bundle bundle, Bundles.Key key) {
        if (bundle != null) {
            return Bundles.getOptionalString(bundle, key);
        }
        return null;
    }

    private long getTimestampFromBundle(@Nullable Bundle bundle) {
        if (bundle == null) {
            return this.timeProvider.elapsedRealTime();
        }
        long j = Bundles.getLong(bundle, KEY_DIALOG_START_TIMESTAMP_MILLIS);
        return j == 0 ? this.timeProvider.elapsedRealTime() : j;
    }

    public boolean enableSpeakerVerification() {
        return this.enableSpeakerVerification;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlexaDialogExtras)) {
            return false;
        }
        AlexaDialogExtras alexaDialogExtras = (AlexaDialogExtras) obj;
        return isUserVoiceVerified() == alexaDialogExtras.isUserVoiceVerified() && this.suppressEndpointSound == alexaDialogExtras.suppressEndpointSound && this.suppressEndpointSoundOnlyOnFirstTurn == alexaDialogExtras.suppressEndpointSoundOnlyOnFirstTurn && this.suppressUserInterface == alexaDialogExtras.suppressUserInterface && this.suppressWakeSound == alexaDialogExtras.suppressWakeSound && this.suppressWakeSoundOnlyOnFirstTurn == alexaDialogExtras.suppressWakeSoundOnlyOnFirstTurn && this.suppressWakewordVerification == alexaDialogExtras.suppressWakewordVerification && this.enableSpeakerVerification == alexaDialogExtras.enableSpeakerVerification && this.suppressSpeechResponse == alexaDialogExtras.suppressSpeechResponse && this.isUserOnComms == alexaDialogExtras.isUserOnComms && this.dialogStartTimestampMillis == alexaDialogExtras.dialogStartTimestampMillis && Objects.equals(getInvocationType(), alexaDialogExtras.getInvocationType()) && getLaunchType() == alexaDialogExtras.getLaunchType() && Objects.equals(getAudioOutputContext(), alexaDialogExtras.getAudioOutputContext()) && Objects.equals(getAlexaUserInterfaceOptions(), alexaDialogExtras.getAlexaUserInterfaceOptions()) && Objects.equals(getUniversalPrivacyCode(), alexaDialogExtras.getUniversalPrivacyCode()) && Objects.equals(getInteractionLabel(), alexaDialogExtras.getInteractionLabel()) && Objects.equals(getResponseType(), alexaDialogExtras.getResponseType());
    }

    public AlexaUserInterfaceOptions getAlexaUserInterfaceOptions(@Nullable Bundle bundle) {
        if (bundle != null) {
            DialogExtrasKeys dialogExtrasKeys = KEY_USER_INTERFACE_OPTIONS;
            if (bundle.containsKey(dialogExtrasKeys.name())) {
                return new AlexaUserInterfaceOptions(Bundles.getOptionalBundle(bundle, dialogExtrasKeys));
            }
        }
        return AlexaUserInterfaceOptions.builder().build();
    }

    public AudioOutputContext getAudioOutputContext(@Nullable Bundle bundle) {
        boolean z;
        Bundle bundle2;
        AudioDevice audioDevice = AudioDevice.DEFAULT;
        if (bundle == null || (bundle2 = bundle.getBundle(KEY_AUDIO_OUTPUT_CONTEXT.name())) == null) {
            z = false;
        } else {
            String string = bundle2.getString(KEY_AUDIO_OUTPUT_DEVICE_ADDRESS.name());
            String string2 = bundle2.getString(KEY_AUDIO_OUTPUT_DEVICE_FRIENDLY_NAME.name());
            if (string == null) {
                string = AudioDevice.DEFAULT_PHYSICAL_ADDRESS;
            }
            if (string2 == null) {
                string2 = AudioDevice.DEFAULT_FRIENDLY_NAME;
            }
            audioDevice = AudioDevice.create(string, string2);
            z = bundle2.getBoolean(KEY_AUDIO_OUTPUT_SHOULD_PLAY_OVER_SCO.name());
        }
        return new AudioOutputContext(audioDevice, z);
    }

    public Bundle getBundle() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putString(KEY_AUDIO_OUTPUT_DEVICE_ADDRESS.name(), this.audioOutputContext.getDevice().getPhysicalAddress());
        bundle2.putString(KEY_AUDIO_OUTPUT_DEVICE_FRIENDLY_NAME.name(), this.audioOutputContext.getDevice().getFriendlyName());
        bundle2.putBoolean(KEY_AUDIO_OUTPUT_SHOULD_PLAY_OVER_SCO.name(), this.audioOutputContext.shouldPlayOverSco());
        bundle.putBoolean(KEY_IS_USER_VOICE_VERIFIED.name(), this.isUserVoiceVerified);
        bundle.putBoolean(KEY_SUPPRESS_ENDPOINT_SOUND.name(), this.suppressEndpointSound);
        bundle.putBoolean(KEY_SUPPRESS_ENDPOINT_SOUND_ONLY_ON_FIRST_TURN.name(), this.suppressEndpointSoundOnlyOnFirstTurn);
        bundle.putBoolean(KEY_SUPPRESS_UI.name(), this.suppressUserInterface);
        bundle.putBoolean(KEY_SUPPRESS_WAKE_SOUND.name(), this.suppressWakeSound);
        bundle.putBoolean(KEY_SUPPRESS_WAKE_SOUND_ONLY_ON_FIRST_TURN.name(), this.suppressWakeSoundOnlyOnFirstTurn);
        bundle.putString(KEY_INVOCATION_TYPE.name(), this.invocationType);
        bundle.putString(KEY_LAUNCH_TYPE.name(), this.launchType.name());
        bundle.putBundle(KEY_AUDIO_OUTPUT_CONTEXT.name(), bundle2);
        bundle.putBundle(KEY_USER_INTERFACE_OPTIONS.name(), this.alexaUserInterfaceOptions.getBundle());
        bundle.putBoolean(KEY_SUPPRESS_WW_VERIFICATION.name(), this.suppressWakewordVerification);
        bundle.putBoolean(KEY_ENABLE_INTERACTION_ON_LOCKSCREEN.name(), this.enableInteractionFromLockscreen);
        bundle.putBoolean(KEY_ENABLE_SPEAKER_VERIFICATION.name(), this.enableSpeakerVerification);
        bundle.putBoolean(KEY_SUPPRESS_SPEECH_RESPONSE.name(), this.suppressSpeechResponse);
        bundle.putBoolean(KEY_IS_USER_ON_COMMS.name(), this.isUserOnComms);
        bundle.putLong(KEY_DIALOG_START_TIMESTAMP_MILLIS.name(), this.dialogStartTimestampMillis);
        bundle.putBoolean(KEY_MUST_COORDINATE_RESPONSES.name(), this.mustCoordinateResponses);
        bundle.putString(KEY_UNIVERSAL_PRIVACY_CODE.name(), this.universalPrivacyCode);
        bundle.putString(KEY_INTERACTION_LABEL.name(), this.interactionLabel);
        if (this.responseType != null) {
            bundle.putString(KEY_RESPONSE_TYPE.name(), this.responseType.name());
        }
        return bundle;
    }

    public long getDialogStartTimestampMillis() {
        return this.dialogStartTimestampMillis;
    }

    @Nullable
    public String getInteractionLabel() {
        return this.interactionLabel;
    }

    @Nullable
    public String getInvocationType() {
        return this.invocationType;
    }

    public LaunchType getLaunchType() {
        return this.launchType;
    }

    @Nullable
    public String getUniversalPrivacyCode() {
        return this.universalPrivacyCode;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(isUserVoiceVerified()), Boolean.valueOf(this.suppressEndpointSound), Boolean.valueOf(this.suppressEndpointSoundOnlyOnFirstTurn), Boolean.valueOf(this.suppressUserInterface), Boolean.valueOf(this.suppressWakeSound), Boolean.valueOf(this.suppressWakeSoundOnlyOnFirstTurn), Boolean.valueOf(this.suppressWakewordVerification), Boolean.valueOf(this.enableSpeakerVerification), Boolean.valueOf(this.suppressSpeechResponse), Boolean.valueOf(this.isUserOnComms), Long.valueOf(this.dialogStartTimestampMillis), getInvocationType(), getLaunchType(), getAudioOutputContext(), getAlexaUserInterfaceOptions(), getUniversalPrivacyCode(), getInteractionLabel(), getResponseType());
    }

    public boolean isInteractionEnabledOnLockscreen() {
        return this.enableInteractionFromLockscreen;
    }

    public boolean isUserOnComms() {
        return this.isUserOnComms;
    }

    public boolean isUserVoiceVerified() {
        return this.isUserVoiceVerified;
    }

    public boolean mustCoordinateResponses() {
        return this.mustCoordinateResponses;
    }

    public boolean suppressEndpointSound() {
        return this.suppressEndpointSound;
    }

    public boolean suppressEndpointSoundOnlyOnFirstTurn() {
        return this.suppressEndpointSoundOnlyOnFirstTurn;
    }

    public boolean suppressSpeechResponse() {
        return this.suppressSpeechResponse;
    }

    public boolean suppressUserInterface() {
        return this.suppressUserInterface;
    }

    public boolean suppressWakeSound() {
        return this.suppressWakeSound;
    }

    public boolean suppressWakeSoundOnlyOnFirstTurn() {
        return this.suppressWakeSoundOnlyOnFirstTurn;
    }

    public boolean suppressWakewordVerification() {
        return this.suppressWakewordVerification;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private AlexaUserInterfaceOptions alexaUserInterfaceOptions;
        private AudioOutputContext audioOutputContext;
        private long dialogStartTimestampMillis;
        private boolean enableInteractionFromLockscreen;
        private boolean enableSpeakerVerification;
        private String interactionLabel;
        private String invocationType;
        private boolean isUserOnComms;
        private boolean isUserVoiceVerified;
        private LaunchType launchType;
        private boolean mustCoordinateResponses;
        private ResponseType responseType;
        private boolean suppressEndpointSound;
        private boolean suppressEndpointSoundOnlyOnFirstTurn;
        private boolean suppressSpeechResponse;
        private boolean suppressUserInterface;
        private boolean suppressWakeSound;
        private boolean suppressWakeSoundOnlyOnFirstTurn;
        private boolean suppressWakewordVerification;
        private String universalPrivacyCode;

        public AlexaDialogExtras build() {
            return new AlexaDialogExtras(this);
        }

        public Builder enableInteractionFromLockscreen(boolean z) {
            this.enableInteractionFromLockscreen = z;
            return this;
        }

        public Builder enableSpeakerVerification(boolean z) {
            this.enableSpeakerVerification = z;
            return this;
        }

        public Builder isUserOnComms(boolean z) {
            this.isUserOnComms = z;
            return this;
        }

        public Builder setAlexaUserInterfaceOptions(AlexaUserInterfaceOptions alexaUserInterfaceOptions) {
            this.alexaUserInterfaceOptions = alexaUserInterfaceOptions;
            return this;
        }

        public Builder setAudioOutputContext(AudioOutputContext audioOutputContext) {
            this.audioOutputContext = audioOutputContext;
            return this;
        }

        public Builder setDialogStartTimestampMillis(long j) {
            this.dialogStartTimestampMillis = j;
            return this;
        }

        public Builder setInteractionLabel(String str) {
            this.interactionLabel = str;
            return this;
        }

        public Builder setInvocationType(String str) {
            this.invocationType = str;
            return this;
        }

        public Builder setLaunchType(LaunchType launchType) {
            this.launchType = launchType;
            return this;
        }

        public Builder setMustCoordinateResponses(boolean z) {
            this.mustCoordinateResponses = z;
            return this;
        }

        public Builder setResponseType(ResponseType responseType) {
            this.responseType = responseType;
            return this;
        }

        public Builder setUniversalPrivacyCode(String str) {
            this.universalPrivacyCode = str;
            return this;
        }

        public Builder setUserVoiceVerified(boolean z) {
            this.isUserVoiceVerified = z;
            return this;
        }

        public Builder suppressEndpointSound(boolean z) {
            this.suppressEndpointSound = z;
            return this;
        }

        public Builder suppressEndpointSoundOnlyOnFirstTurn(boolean z) {
            this.suppressEndpointSoundOnlyOnFirstTurn = z;
            return this;
        }

        public Builder suppressSpeechResponse(boolean z) {
            this.suppressSpeechResponse = z;
            return this;
        }

        public Builder suppressUserInterface(boolean z) {
            this.suppressUserInterface = z;
            return this;
        }

        public Builder suppressWakeSound(boolean z) {
            this.suppressWakeSound = z;
            return this;
        }

        public Builder suppressWakeSoundOnlyOnFirstTurn(boolean z) {
            this.suppressWakeSoundOnlyOnFirstTurn = z;
            return this;
        }

        public Builder suppressWakewordVerification(boolean z) {
            this.suppressWakewordVerification = z;
            return this;
        }

        private Builder() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DialogExtrasBundleAdapter implements BundleAdapter<AlexaDialogExtras> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.api.BundleAdapter
        public AlexaDialogExtras createFromBundle(Bundle bundle) {
            return new AlexaDialogExtras(bundle);
        }

        @Override // com.amazon.alexa.api.BundleAdapter
        public Bundle toBundle(AlexaDialogExtras alexaDialogExtras) {
            return alexaDialogExtras.getBundle();
        }
    }

    @Nullable
    public ResponseType getResponseType() {
        return this.responseType;
    }

    public AlexaUserInterfaceOptions getAlexaUserInterfaceOptions() {
        return this.alexaUserInterfaceOptions;
    }

    public AudioOutputContext getAudioOutputContext() {
        return this.audioOutputContext;
    }

    public AlexaDialogExtras(@Nullable Bundle bundle) {
        this.timeProvider = new TimeProvider();
        this.isUserVoiceVerified = getBoolean(bundle, KEY_IS_USER_VOICE_VERIFIED);
        this.suppressEndpointSound = getBoolean(bundle, KEY_SUPPRESS_ENDPOINT_SOUND);
        this.suppressEndpointSoundOnlyOnFirstTurn = getBoolean(bundle, KEY_SUPPRESS_ENDPOINT_SOUND_ONLY_ON_FIRST_TURN);
        this.suppressUserInterface = getBoolean(bundle, KEY_SUPPRESS_UI);
        this.suppressWakeSound = getBoolean(bundle, KEY_SUPPRESS_WAKE_SOUND);
        this.suppressWakeSoundOnlyOnFirstTurn = getBoolean(bundle, KEY_SUPPRESS_WAKE_SOUND_ONLY_ON_FIRST_TURN);
        this.invocationType = getString(bundle, KEY_INVOCATION_TYPE);
        this.launchType = LaunchType.fromString(getString(bundle, KEY_LAUNCH_TYPE));
        this.audioOutputContext = getAudioOutputContext(bundle);
        this.alexaUserInterfaceOptions = getAlexaUserInterfaceOptions(bundle);
        this.suppressWakewordVerification = getBoolean(bundle, KEY_SUPPRESS_WW_VERIFICATION);
        this.enableInteractionFromLockscreen = getBoolean(bundle, KEY_ENABLE_INTERACTION_ON_LOCKSCREEN);
        this.enableSpeakerVerification = getBoolean(bundle, KEY_ENABLE_SPEAKER_VERIFICATION);
        this.suppressSpeechResponse = getBoolean(bundle, KEY_SUPPRESS_SPEECH_RESPONSE);
        this.isUserOnComms = getBoolean(bundle, KEY_IS_USER_ON_COMMS);
        this.dialogStartTimestampMillis = getTimestampFromBundle(bundle);
        this.mustCoordinateResponses = getBoolean(bundle, KEY_MUST_COORDINATE_RESPONSES);
        this.universalPrivacyCode = getString(bundle, KEY_UNIVERSAL_PRIVACY_CODE);
        this.interactionLabel = getString(bundle, KEY_INTERACTION_LABEL);
        this.responseType = getResponseType(bundle);
    }
}
