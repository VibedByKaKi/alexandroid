package com.amazon.alexa.api.compat.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AplStateBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lcom/amazon/alexa/api/compat/model/AplState;", "", "presentationToken", "", AplStateBundleKeys.PRESENTATION_SESSION, "version", AplStateBundleKeys.COMPONENTS_VISIBLE_ON_SCREEN, AplStateBundleKeys.DATA_SOURCES, AplStateBundleKeys.SHOULD_CLEAR_STATE_PROVIDER_DATA, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getPresentationToken", "()Ljava/lang/String;", "getPresentationSession", "getVersion", "getComponentsVisibleOnScreen", "getDataSources", "getShouldClearStateProviderData", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Builder", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AplState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String componentsVisibleOnScreen;

    @Nullable
    private final String dataSources;

    @Nullable
    private final String presentationSession;

    @Nullable
    private final String presentationToken;
    private final boolean shouldClearStateProviderData;

    @Nullable
    private final String version;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\u0012\u001a\u00020\u0013R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AplState$Builder;", "", "<init>", "()V", "presentationToken", "", AplStateBundleKeys.PRESENTATION_SESSION, "version", AplStateBundleKeys.COMPONENTS_VISIBLE_ON_SCREEN, AplStateBundleKeys.DATA_SOURCES, AplStateBundleKeys.SHOULD_CLEAR_STATE_PROVIDER_DATA, "", "setPresentationToken", "setPresentationSession", "setVersion", "setComponentsVisibleOnScreen", "setDataSources", "setShouldClearStateProviderData", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/api/compat/model/AplState;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAplState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AplState.kt\ncom/amazon/alexa/api/compat/model/AplState$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
    public static final class Builder {
        public static final int $stable = 8;

        @Nullable
        private String componentsVisibleOnScreen;

        @Nullable
        private String dataSources;

        @Nullable
        private String presentationSession;

        @Nullable
        private String presentationToken;
        private boolean shouldClearStateProviderData;

        @Nullable
        private String version;

        @NotNull
        public final AplState build() {
            return new AplState(this.presentationToken, this.presentationSession, this.version, this.componentsVisibleOnScreen, this.dataSources, this.shouldClearStateProviderData);
        }

        @NotNull
        public final Builder setComponentsVisibleOnScreen(@Nullable String componentsVisibleOnScreen) {
            this.componentsVisibleOnScreen = componentsVisibleOnScreen;
            return this;
        }

        @NotNull
        public final Builder setDataSources(@Nullable String dataSources) {
            this.dataSources = dataSources;
            return this;
        }

        @NotNull
        public final Builder setPresentationSession(@Nullable String presentationSession) {
            this.presentationSession = presentationSession;
            return this;
        }

        @NotNull
        public final Builder setPresentationToken(@Nullable String presentationToken) {
            this.presentationToken = presentationToken;
            return this;
        }

        @NotNull
        public final Builder setShouldClearStateProviderData(boolean shouldClearStateProviderData) {
            this.shouldClearStateProviderData = shouldClearStateProviderData;
            return this;
        }

        @NotNull
        public final Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
    }

    public /* synthetic */ AplState(String str, String str2, String str3, String str4, String str5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? false : z);
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    public static /* synthetic */ AplState copy$default(AplState aplState, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aplState.presentationToken;
        }
        if ((i & 2) != 0) {
            str2 = aplState.presentationSession;
        }
        if ((i & 4) != 0) {
            str3 = aplState.version;
        }
        if ((i & 8) != 0) {
            str4 = aplState.componentsVisibleOnScreen;
        }
        if ((i & 16) != 0) {
            str5 = aplState.dataSources;
        }
        if ((i & 32) != 0) {
            z = aplState.shouldClearStateProviderData;
        }
        String str6 = str5;
        boolean z2 = z;
        return aplState.copy(str, str2, str3, str4, str6, z2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getPresentationToken() {
        return this.presentationToken;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getPresentationSession() {
        return this.presentationSession;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getComponentsVisibleOnScreen() {
        return this.componentsVisibleOnScreen;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getDataSources() {
        return this.dataSources;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShouldClearStateProviderData() {
        return this.shouldClearStateProviderData;
    }

    @NotNull
    public final AplState copy(@Nullable String presentationToken, @Nullable String presentationSession, @Nullable String version, @Nullable String componentsVisibleOnScreen, @Nullable String dataSources, boolean shouldClearStateProviderData) {
        return new AplState(presentationToken, presentationSession, version, componentsVisibleOnScreen, dataSources, shouldClearStateProviderData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AplState)) {
            return false;
        }
        AplState aplState = (AplState) other;
        return Intrinsics.areEqual(this.presentationToken, aplState.presentationToken) && Intrinsics.areEqual(this.presentationSession, aplState.presentationSession) && Intrinsics.areEqual(this.version, aplState.version) && Intrinsics.areEqual(this.componentsVisibleOnScreen, aplState.componentsVisibleOnScreen) && Intrinsics.areEqual(this.dataSources, aplState.dataSources) && this.shouldClearStateProviderData == aplState.shouldClearStateProviderData;
    }

    @Nullable
    public final String getComponentsVisibleOnScreen() {
        return this.componentsVisibleOnScreen;
    }

    @Nullable
    public final String getDataSources() {
        return this.dataSources;
    }

    @Nullable
    public final String getPresentationSession() {
        return this.presentationSession;
    }

    @Nullable
    public final String getPresentationToken() {
        return this.presentationToken;
    }

    public final boolean getShouldClearStateProviderData() {
        return this.shouldClearStateProviderData;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.presentationToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.presentationSession;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.version;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.componentsVisibleOnScreen;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dataSources;
        return Boolean.hashCode(this.shouldClearStateProviderData) + ((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.presentationToken;
        String str2 = this.presentationSession;
        String str3 = this.version;
        String str4 = this.componentsVisibleOnScreen;
        String str5 = this.dataSources;
        boolean z = this.shouldClearStateProviderData;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("AplState(presentationToken=", str, ", presentationSession=", str2, ", version=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, ", componentsVisibleOnScreen=", str4, ", dataSources=");
        m.append(str5);
        m.append(", shouldClearStateProviderData=");
        m.append(z);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AplState$Companion;", "", "<init>", "()V", "builder", "Lcom/amazon/alexa/api/compat/model/AplState$Builder;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Builder builder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    public AplState(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z) {
        this.presentationToken = str;
        this.presentationSession = str2;
        this.version = str3;
        this.componentsVisibleOnScreen = str4;
        this.dataSources = str5;
        this.shouldClearStateProviderData = z;
    }

    public AplState() {
        this(null, null, null, null, null, false, 63, null);
    }
}
