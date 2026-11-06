package com.amazon.alexa.accessory.speechapi.speech;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AudioMetadataBundleKeys;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\u0003J\b\u0010\n\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/speech/AccessoryAudioMetadata;", "", "accessoryAudioProfile", "Lcom/amazon/alexa/accessory/speechapi/speech/AccessoryAudioProfile;", AudioMetadataBundleKeys.AUDIO_FORMAT, "", "accessoryWakeWord", "Lcom/amazon/alexa/accessory/speechapi/speech/AccessoryWakeWord;", "(Lcom/amazon/alexa/accessory/speechapi/speech/AccessoryAudioProfile;Ljava/lang/String;Lcom/amazon/alexa/accessory/speechapi/speech/AccessoryWakeWord;)V", "getAccessoryAudioProfile", "getAccessoryWakeWord", "getAudioFormat", "Companion", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AccessoryAudioMetadata {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AccessoryAudioProfile accessoryAudioProfile;

    @Nullable
    private final AccessoryWakeWord accessoryWakeWord;

    @NotNull
    private final String audioFormat;

    private AccessoryAudioMetadata(AccessoryAudioProfile accessoryAudioProfile, String str, AccessoryWakeWord accessoryWakeWord) {
        this.accessoryAudioProfile = accessoryAudioProfile;
        this.audioFormat = str;
        this.accessoryWakeWord = accessoryWakeWord;
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final AccessoryAudioMetadata create(@NotNull AccessoryAudioProfile accessoryAudioProfile, @NotNull String str) {
        return INSTANCE.create(accessoryAudioProfile, str);
    }

    @NotNull
    public final AccessoryAudioProfile getAccessoryAudioProfile() {
        return this.accessoryAudioProfile;
    }

    @Nullable
    public final AccessoryWakeWord getAccessoryWakeWord() {
        return this.accessoryWakeWord;
    }

    @NotNull
    public final String getAudioFormat() {
        return this.audioFormat;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/speech/AccessoryAudioMetadata$Companion;", "", "()V", "create", "Lcom/amazon/alexa/accessory/speechapi/speech/AccessoryAudioMetadata;", "accessoryAudioProfile", "Lcom/amazon/alexa/accessory/speechapi/speech/AccessoryAudioProfile;", AudioMetadataBundleKeys.AUDIO_FORMAT, "", "accessoryWakeWord", "Lcom/amazon/alexa/accessory/speechapi/speech/AccessoryWakeWord;", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AccessoryAudioMetadata create$default(Companion companion, AccessoryAudioProfile accessoryAudioProfile, String str, AccessoryWakeWord accessoryWakeWord, int i, Object obj) {
            if ((i & 4) != 0) {
                accessoryWakeWord = null;
            }
            return companion.create(accessoryAudioProfile, str, accessoryWakeWord);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final AccessoryAudioMetadata create(@NotNull AccessoryAudioProfile accessoryAudioProfile, @NotNull String str) {
            accessoryAudioProfile.getClass();
            str.getClass();
            return create$default(this, accessoryAudioProfile, str, null, 4, null);
        }

        private Companion() {
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final AccessoryAudioMetadata create(@NotNull AccessoryAudioProfile accessoryAudioProfile, @NotNull String audioFormat, @Nullable AccessoryWakeWord accessoryWakeWord) {
            accessoryAudioProfile.getClass();
            audioFormat.getClass();
            return new AccessoryAudioMetadata(accessoryAudioProfile, audioFormat, accessoryWakeWord, null);
        }
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final AccessoryAudioMetadata create(@NotNull AccessoryAudioProfile accessoryAudioProfile, @NotNull String str, @Nullable AccessoryWakeWord accessoryWakeWord) {
        return INSTANCE.create(accessoryAudioProfile, str, accessoryWakeWord);
    }

    public /* synthetic */ AccessoryAudioMetadata(AccessoryAudioProfile accessoryAudioProfile, String str, AccessoryWakeWord accessoryWakeWord, DefaultConstructorMarker defaultConstructorMarker) {
        this(accessoryAudioProfile, str, accessoryWakeWord);
    }
}
