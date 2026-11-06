package com.amazon.alexa.api.compat.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.SpeechProviderMetadataBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB7\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaUserSpeechProviderMetadata;", "", SpeechProviderMetadataBundleKeys.SUPPORTED_INITIATION_TYPES, "", "Lcom/amazon/alexa/api/compat/model/AlexaSupportedInitiationType;", SpeechProviderMetadataBundleKeys.SUPPORTED_WAKE_WORDS, "", SpeechProviderMetadataBundleKeys.PROVIDER_SCOPE, "Lcom/amazon/alexa/api/compat/model/AlexaUserSpeechProviderScope;", "softwareVersion", "<init>", "(Ljava/util/Set;Ljava/util/Set;Lcom/amazon/alexa/api/compat/model/AlexaUserSpeechProviderScope;Ljava/lang/String;)V", "getSupportedInitiationTypes", "()Ljava/util/Set;", "getSupportedWakeWords", "getProviderScope", "()Lcom/amazon/alexa/api/compat/model/AlexaUserSpeechProviderScope;", "getSoftwareVersion", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AlexaUserSpeechProviderMetadata {

    @NotNull
    public static final String ALEXA_WAKE_WORD = "alexa";

    @NotNull
    private final AlexaUserSpeechProviderScope providerScope;

    @Nullable
    private final String softwareVersion;

    @NotNull
    private final Set<AlexaSupportedInitiationType> supportedInitiationTypes;

    @NotNull
    private final Set<String> supportedWakeWords;
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public AlexaUserSpeechProviderMetadata(@NotNull Set<? extends AlexaSupportedInitiationType> set, @NotNull Set<String> set2, @NotNull AlexaUserSpeechProviderScope alexaUserSpeechProviderScope, @Nullable String str) {
        set.getClass();
        set2.getClass();
        alexaUserSpeechProviderScope.getClass();
        this.supportedInitiationTypes = set;
        this.supportedWakeWords = set2;
        this.providerScope = alexaUserSpeechProviderScope;
        this.softwareVersion = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AlexaUserSpeechProviderMetadata copy$default(AlexaUserSpeechProviderMetadata alexaUserSpeechProviderMetadata, Set set, Set set2, AlexaUserSpeechProviderScope alexaUserSpeechProviderScope, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            set = alexaUserSpeechProviderMetadata.supportedInitiationTypes;
        }
        if ((i & 2) != 0) {
            set2 = alexaUserSpeechProviderMetadata.supportedWakeWords;
        }
        if ((i & 4) != 0) {
            alexaUserSpeechProviderScope = alexaUserSpeechProviderMetadata.providerScope;
        }
        if ((i & 8) != 0) {
            str = alexaUserSpeechProviderMetadata.softwareVersion;
        }
        return alexaUserSpeechProviderMetadata.copy(set, set2, alexaUserSpeechProviderScope, str);
    }

    @NotNull
    public final Set<AlexaSupportedInitiationType> component1() {
        return this.supportedInitiationTypes;
    }

    @NotNull
    public final Set<String> component2() {
        return this.supportedWakeWords;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final AlexaUserSpeechProviderScope getProviderScope() {
        return this.providerScope;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getSoftwareVersion() {
        return this.softwareVersion;
    }

    @NotNull
    public final AlexaUserSpeechProviderMetadata copy(@NotNull Set<? extends AlexaSupportedInitiationType> supportedInitiationTypes, @NotNull Set<String> supportedWakeWords, @NotNull AlexaUserSpeechProviderScope providerScope, @Nullable String softwareVersion) {
        supportedInitiationTypes.getClass();
        supportedWakeWords.getClass();
        providerScope.getClass();
        return new AlexaUserSpeechProviderMetadata(supportedInitiationTypes, supportedWakeWords, providerScope, softwareVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlexaUserSpeechProviderMetadata)) {
            return false;
        }
        AlexaUserSpeechProviderMetadata alexaUserSpeechProviderMetadata = (AlexaUserSpeechProviderMetadata) other;
        return Intrinsics.areEqual(this.supportedInitiationTypes, alexaUserSpeechProviderMetadata.supportedInitiationTypes) && Intrinsics.areEqual(this.supportedWakeWords, alexaUserSpeechProviderMetadata.supportedWakeWords) && this.providerScope == alexaUserSpeechProviderMetadata.providerScope && Intrinsics.areEqual(this.softwareVersion, alexaUserSpeechProviderMetadata.softwareVersion);
    }

    @NotNull
    public final AlexaUserSpeechProviderScope getProviderScope() {
        return this.providerScope;
    }

    @Nullable
    public final String getSoftwareVersion() {
        return this.softwareVersion;
    }

    @NotNull
    public final Set<AlexaSupportedInitiationType> getSupportedInitiationTypes() {
        return this.supportedInitiationTypes;
    }

    @NotNull
    public final Set<String> getSupportedWakeWords() {
        return this.supportedWakeWords;
    }

    public int hashCode() {
        int hashCode = (this.providerScope.hashCode() + ((this.supportedWakeWords.hashCode() + (this.supportedInitiationTypes.hashCode() * 31)) * 31)) * 31;
        String str = this.softwareVersion;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "AlexaUserSpeechProviderMetadata(supportedInitiationTypes=" + this.supportedInitiationTypes + ", supportedWakeWords=" + this.supportedWakeWords + ", providerScope=" + this.providerScope + ", softwareVersion=" + this.softwareVersion + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ AlexaUserSpeechProviderMetadata(Set set, Set set2, AlexaUserSpeechProviderScope alexaUserSpeechProviderScope, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, set2, alexaUserSpeechProviderScope, (i & 8) != 0 ? null : str);
    }
}
