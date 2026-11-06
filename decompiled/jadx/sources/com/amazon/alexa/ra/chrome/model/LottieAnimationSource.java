package com.amazon.alexa.ra.chrome.model;

import androidx.annotation.RawRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/chrome/model/LottieAnimationSource;", "", "<init>", "()V", "RawResource", "FilePath", "Lcom/amazon/alexa/ra/chrome/model/LottieAnimationSource$FilePath;", "Lcom/amazon/alexa/ra/chrome/model/LottieAnimationSource$RawResource;", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class LottieAnimationSource {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/ra/chrome/model/LottieAnimationSource$FilePath;", "Lcom/amazon/alexa/ra/chrome/model/LottieAnimationSource;", "path", "", "<init>", "(Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FilePath extends LottieAnimationSource {
        public static final int $stable = 0;

        @NotNull
        private final String path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FilePath(@NotNull String str) {
            super(null);
            str.getClass();
            this.path = str;
        }

        public static /* synthetic */ FilePath copy$default(FilePath filePath, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = filePath.path;
            }
            return filePath.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        @NotNull
        public final FilePath copy(@NotNull String path) {
            path.getClass();
            return new FilePath(path);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FilePath) && Intrinsics.areEqual(this.path, ((FilePath) other).path);
        }

        @NotNull
        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            return this.path.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("FilePath(path=", this.path, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public /* synthetic */ LottieAnimationSource(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LottieAnimationSource() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/ra/chrome/model/LottieAnimationSource$RawResource;", "Lcom/amazon/alexa/ra/chrome/model/LottieAnimationSource;", "resId", "", "cacheKey", "Lcom/amazon/alexa/ra/chrome/model/LottieAnimationSource$RawResource$CacheKey;", "<init>", "(ILcom/amazon/alexa/ra/chrome/model/LottieAnimationSource$RawResource$CacheKey;)V", "getResId", "()I", "getCacheKey", "()Lcom/amazon/alexa/ra/chrome/model/LottieAnimationSource$RawResource$CacheKey;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "", "CacheKey", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RawResource extends LottieAnimationSource {
        public static final int $stable = 8;

        @NotNull
        private final CacheKey cacheKey;
        private final int resId;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/chrome/model/LottieAnimationSource$RawResource$CacheKey;", "", "None", "Default", "Custom", "Lcom/amazon/alexa/ra/chrome/model/LottieAnimationSource$RawResource$CacheKey$Custom;", "Lcom/amazon/alexa/ra/chrome/model/LottieAnimationSource$RawResource$CacheKey$Default;", "Lcom/amazon/alexa/ra/chrome/model/LottieAnimationSource$RawResource$CacheKey$None;", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface CacheKey {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/ra/chrome/model/LottieAnimationSource$RawResource$CacheKey$Custom;", "Lcom/amazon/alexa/ra/chrome/model/LottieAnimationSource$RawResource$CacheKey;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Custom implements CacheKey {
                public static final int $stable = 0;

                @NotNull
                private final String value;

                public Custom(@NotNull String str) {
                    str.getClass();
                    this.value = str;
                }

                public static /* synthetic */ Custom copy$default(Custom custom, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = custom.value;
                    }
                    return custom.copy(str);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                @NotNull
                public final Custom copy(@NotNull String value) {
                    value.getClass();
                    return new Custom(value);
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Custom) && Intrinsics.areEqual(this.value, ((Custom) other).value);
                }

                @NotNull
                public final String getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                @NotNull
                public String toString() {
                    return a$$ExternalSyntheticOutline0.m("Custom(value=", this.value, MarkdownConstants.RIGHT_PARENTHESIS);
                }
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/model/LottieAnimationSource$RawResource$CacheKey$Default;", "Lcom/amazon/alexa/ra/chrome/model/LottieAnimationSource$RawResource$CacheKey;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Default implements CacheKey {
                public static final int $stable = 0;

                @NotNull
                public static final Default INSTANCE = new Default();

                private Default() {
                }
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/model/LottieAnimationSource$RawResource$CacheKey$None;", "Lcom/amazon/alexa/ra/chrome/model/LottieAnimationSource$RawResource$CacheKey;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class None implements CacheKey {
                public static final int $stable = 0;

                @NotNull
                public static final None INSTANCE = new None();

                private None() {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RawResource(@RawRes int i, @NotNull CacheKey cacheKey) {
            super(null);
            cacheKey.getClass();
            this.resId = i;
            this.cacheKey = cacheKey;
        }

        public static /* synthetic */ RawResource copy$default(RawResource rawResource, int i, CacheKey cacheKey, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = rawResource.resId;
            }
            if ((i2 & 2) != 0) {
                cacheKey = rawResource.cacheKey;
            }
            return rawResource.copy(i, cacheKey);
        }

        /* renamed from: component1, reason: from getter */
        public final int getResId() {
            return this.resId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CacheKey getCacheKey() {
            return this.cacheKey;
        }

        @NotNull
        public final RawResource copy(@RawRes int resId, @NotNull CacheKey cacheKey) {
            cacheKey.getClass();
            return new RawResource(resId, cacheKey);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RawResource)) {
                return false;
            }
            RawResource rawResource = (RawResource) other;
            return this.resId == rawResource.resId && Intrinsics.areEqual(this.cacheKey, rawResource.cacheKey);
        }

        @NotNull
        public final CacheKey getCacheKey() {
            return this.cacheKey;
        }

        public final int getResId() {
            return this.resId;
        }

        public int hashCode() {
            return this.cacheKey.hashCode() + (Integer.hashCode(this.resId) * 31);
        }

        @NotNull
        public String toString() {
            return "RawResource(resId=" + this.resId + ", cacheKey=" + this.cacheKey + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        public /* synthetic */ RawResource(int i, CacheKey cacheKey, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? CacheKey.Default.INSTANCE : cacheKey);
        }
    }
}
