package com.amazon.alexa.api.compat.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaCardExtras;", "", "marketplace", "", "locale", "Ljava/util/Locale;", "<init>", "(Ljava/lang/String;Ljava/util/Locale;)V", "getMarketplace", "()Ljava/lang/String;", "getLocale", "()Ljava/util/Locale;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Builder", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AlexaCardExtras {

    @Nullable
    private final Locale locale;

    @Nullable
    private final String marketplace;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaCardExtras$Builder;", "", "<init>", "()V", "marketplace", "", "locale", "Ljava/util/Locale;", "setMarketplace", "setLocale", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/api/compat/model/AlexaCardExtras;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAlexaCardExtras.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlexaCardExtras.kt\ncom/amazon/alexa/api/compat/model/AlexaCardExtras$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
    public static final class Builder {
        public static final int $stable = 8;

        @Nullable
        private Locale locale;

        @Nullable
        private String marketplace;

        @NotNull
        public final AlexaCardExtras build() {
            return new AlexaCardExtras(this.marketplace, this.locale);
        }

        @NotNull
        public final Builder setLocale(@Nullable Locale locale) {
            this.locale = locale;
            return this;
        }

        @NotNull
        public final Builder setMarketplace(@Nullable String marketplace) {
            this.marketplace = marketplace;
            return this;
        }
    }

    public /* synthetic */ AlexaCardExtras(String str, Locale locale, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : locale);
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    public static /* synthetic */ AlexaCardExtras copy$default(AlexaCardExtras alexaCardExtras, String str, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alexaCardExtras.marketplace;
        }
        if ((i & 2) != 0) {
            locale = alexaCardExtras.locale;
        }
        return alexaCardExtras.copy(str, locale);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getMarketplace() {
        return this.marketplace;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    @NotNull
    public final AlexaCardExtras copy(@Nullable String marketplace, @Nullable Locale locale) {
        return new AlexaCardExtras(marketplace, locale);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlexaCardExtras)) {
            return false;
        }
        AlexaCardExtras alexaCardExtras = (AlexaCardExtras) other;
        return Intrinsics.areEqual(this.marketplace, alexaCardExtras.marketplace) && Intrinsics.areEqual(this.locale, alexaCardExtras.locale);
    }

    @Nullable
    public final Locale getLocale() {
        return this.locale;
    }

    @Nullable
    public final String getMarketplace() {
        return this.marketplace;
    }

    public int hashCode() {
        String str = this.marketplace;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Locale locale = this.locale;
        return hashCode + (locale != null ? locale.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AlexaCardExtras(marketplace=" + this.marketplace + ", locale=" + this.locale + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaCardExtras$Companion;", "", "<init>", "()V", "builder", "Lcom/amazon/alexa/api/compat/model/AlexaCardExtras$Builder;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public AlexaCardExtras(@Nullable String str, @Nullable Locale locale) {
        this.marketplace = str;
        this.locale = locale;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlexaCardExtras() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
