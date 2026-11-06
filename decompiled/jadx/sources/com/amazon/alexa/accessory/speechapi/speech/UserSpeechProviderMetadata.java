package com.amazon.alexa.accessory.speechapi.speech;

import com.amazon.alexa.accessory.speechapi.speech.UserSpeechProvider;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.SpeechProviderMetadataBundleKeys;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B5\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/speech/UserSpeechProviderMetadata;", "", SpeechProviderMetadataBundleKeys.SUPPORTED_INITIATION_TYPES, "", "Lcom/amazon/alexa/accessory/speechapi/speech/UserSpeechProvider$SupportedInitiationType;", SpeechProviderMetadataBundleKeys.SUPPORTED_WAKE_WORDS, "", SpeechProviderMetadataBundleKeys.PROVIDER_SCOPE, "Lcom/amazon/alexa/accessory/speechapi/speech/UserSpeechProvider$Scope;", "softwareVersion", "(Ljava/util/Set;Ljava/util/Set;Lcom/amazon/alexa/accessory/speechapi/speech/UserSpeechProvider$Scope;Ljava/lang/String;)V", "getProviderScope", "getSupportedInitiationTypes", "getSupportedWakeWords", "supportsServerInitiatedDialogs", "", "supportsWakeWord", "Companion", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserSpeechProviderMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserSpeechProviderMetadata.kt\ncom/amazon/alexa/accessory/speechapi/speech/UserSpeechProviderMetadata\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
/* loaded from: classes16.dex */
public final class UserSpeechProviderMetadata {

    @NotNull
    public static final String ALEXA_WAKE_WORD = "alexa";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String EMPTY_STRING = "";

    @NotNull
    private final UserSpeechProvider.Scope providerScope;

    @Nullable
    private final String softwareVersion;

    @NotNull
    private final Set<UserSpeechProvider.SupportedInitiationType> supportedInitiationTypes;

    @NotNull
    private final Set<String> supportedWakeWords;

    /* JADX WARN: Multi-variable type inference failed */
    private UserSpeechProviderMetadata(Set<? extends UserSpeechProvider.SupportedInitiationType> set, Set<String> set2, UserSpeechProvider.Scope scope, String str) {
        if (set == 0) {
            Single$$ExternalSyntheticBUOutline0.m$2("initiation types can't be null");
            throw null;
        }
        if (set2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$2("wake word list can't be null");
            throw null;
        }
        if (scope == null) {
            Single$$ExternalSyntheticBUOutline0.m$2("provider type can't be null");
            throw null;
        }
        this.providerScope = scope;
        this.supportedInitiationTypes = set;
        this.supportedWakeWords = set2;
        this.softwareVersion = str;
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final UserSpeechProviderMetadata create(@NotNull Set<? extends UserSpeechProvider.SupportedInitiationType> set, @NotNull Set<String> set2, @NotNull UserSpeechProvider.Scope scope) {
        return INSTANCE.create(set, set2, scope);
    }

    @NotNull
    public final UserSpeechProvider.Scope getProviderScope() {
        return this.providerScope;
    }

    @NotNull
    public final Set<UserSpeechProvider.SupportedInitiationType> getSupportedInitiationTypes() {
        Set<UserSpeechProvider.SupportedInitiationType> unmodifiableSet = Collections.unmodifiableSet(this.supportedInitiationTypes);
        unmodifiableSet.getClass();
        return unmodifiableSet;
    }

    @NotNull
    public final Set<String> getSupportedWakeWords() {
        Set<String> unmodifiableSet = Collections.unmodifiableSet(this.supportedWakeWords);
        unmodifiableSet.getClass();
        return unmodifiableSet;
    }

    public final boolean supportsServerInitiatedDialogs() {
        return this.supportedInitiationTypes.contains(UserSpeechProvider.SupportedInitiationType.SERVER);
    }

    public final boolean supportsWakeWord() {
        return this.supportedInitiationTypes.contains(UserSpeechProvider.SupportedInitiationType.WAKE_WORD);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/speech/UserSpeechProviderMetadata$Companion;", "", "()V", "ALEXA_WAKE_WORD", "", "EMPTY_STRING", "create", "Lcom/amazon/alexa/accessory/speechapi/speech/UserSpeechProviderMetadata;", SpeechProviderMetadataBundleKeys.SUPPORTED_INITIATION_TYPES, "", "Lcom/amazon/alexa/accessory/speechapi/speech/UserSpeechProvider$SupportedInitiationType;", SpeechProviderMetadataBundleKeys.SUPPORTED_WAKE_WORDS, SpeechProviderMetadataBundleKeys.PROVIDER_SCOPE, "Lcom/amazon/alexa/accessory/speechapi/speech/UserSpeechProvider$Scope;", "softwareVersion", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ UserSpeechProviderMetadata create$default(Companion companion, Set set, Set set2, UserSpeechProvider.Scope scope, String str, int i, Object obj) {
            if ((i & 8) != 0) {
                str = "";
            }
            return companion.create(set, set2, scope, str);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final UserSpeechProviderMetadata create(@NotNull Set<? extends UserSpeechProvider.SupportedInitiationType> set, @NotNull Set<String> set2, @NotNull UserSpeechProvider.Scope scope) {
            set.getClass();
            set2.getClass();
            scope.getClass();
            return create$default(this, set, set2, scope, null, 8, null);
        }

        private Companion() {
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final UserSpeechProviderMetadata create(@NotNull Set<? extends UserSpeechProvider.SupportedInitiationType> supportedInitiationTypes, @NotNull Set<String> supportedWakeWords, @NotNull UserSpeechProvider.Scope providerScope, @Nullable String softwareVersion) {
            supportedInitiationTypes.getClass();
            supportedWakeWords.getClass();
            providerScope.getClass();
            return new UserSpeechProviderMetadata(supportedInitiationTypes, supportedWakeWords, providerScope, softwareVersion, null);
        }
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final UserSpeechProviderMetadata create(@NotNull Set<? extends UserSpeechProvider.SupportedInitiationType> set, @NotNull Set<String> set2, @NotNull UserSpeechProvider.Scope scope, @Nullable String str) {
        return INSTANCE.create(set, set2, scope, str);
    }

    public /* synthetic */ UserSpeechProviderMetadata(Set set, Set set2, UserSpeechProvider.Scope scope, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, set2, scope, str);
    }
}
