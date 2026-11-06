package com.facebook.fresco.urimod;

import android.net.Uri;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.fresco.vito.source.UriImageSource;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0014JD\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH&J\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\u0001H&J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H&¨\u0006\u0015"}, d2 = {"Lcom/facebook/fresco/urimod/UriModifierInterface;", "", "modifyUri", "Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult;", "imageSource", "Lcom/facebook/fresco/vito/source/UriImageSource;", "viewport", "Lcom/facebook/fresco/urimod/Dimensions;", "scaleType", "Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;", "callerContext", "contextChain", "Lcom/facebook/common/callercontext/ContextChain;", "forLoggingOnly", "", "modifyPrefetchUri", "Landroid/net/Uri;", "uri", "unregisterReverseFallbackUri", "", "ModificationResult", "urimod_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface UriModifierInterface {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ ModificationResult modifyUri$default(UriModifierInterface uriModifierInterface, UriImageSource uriImageSource, Dimensions dimensions, ScalingUtils.ScaleType scaleType, Object obj, ContextChain contextChain, boolean z, int i, Object obj2) {
            if (obj2 != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: modifyUri");
                return null;
            }
            if ((i & 16) != 0) {
                contextChain = null;
            }
            ContextChain contextChain2 = contextChain;
            if ((i & 32) != 0) {
                z = false;
            }
            return uriModifierInterface.modifyUri(uriImageSource, dimensions, scaleType, obj, contextChain2, z);
        }
    }

    @Nullable
    Uri modifyPrefetchUri(@NotNull Uri uri, @Nullable Object callerContext);

    @NotNull
    ModificationResult modifyUri(@NotNull UriImageSource imageSource, @Nullable Dimensions viewport, @Nullable ScalingUtils.ScaleType scaleType, @Nullable Object callerContext, @Nullable ContextChain contextChain, boolean forLoggingOnly);

    void unregisterReverseFallbackUri(@NotNull Uri uri);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u000b\f\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult;", "", ClientCookie.COMMENT_ATTR, "", "<init>", "(Ljava/lang/String;)V", "bestAllowlistedSize", "", "getBestAllowlistedSize", "()Ljava/lang/Integer;", "toString", BucketLifecycleConfiguration.DISABLED, "Modified", "FallbackToOriginalUrl", "Unmodified", "FallbackToMbpMemoryCache", "FallbackToMbpDiskCache", "Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult$Disabled;", "Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult$FallbackToMbpDiskCache;", "Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult$FallbackToMbpMemoryCache;", "Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult$FallbackToOriginalUrl;", "Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult$Modified;", "Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult$Unmodified;", "urimod_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ModificationResult {

        @NotNull
        private final String comment;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult$Disabled;", "Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult;", ClientCookie.COMMENT_ATTR, "", "<init>", "(Ljava/lang/String;)V", "bestAllowlistedSize", "", "getBestAllowlistedSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "urimod_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Disabled extends ModificationResult {

            @Nullable
            private final Integer bestAllowlistedSize;

            public Disabled(@NotNull String str) {
                super(ChatData$$ExternalSyntheticOutline0.m(str, "Disabled:", str), null);
            }

            @Override // com.facebook.fresco.urimod.UriModifierInterface.ModificationResult
            @Nullable
            public Integer getBestAllowlistedSize() {
                return this.bestAllowlistedSize;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\bHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult$FallbackToMbpDiskCache;", "Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult;", "isBestSize", "", "<init>", "(Z)V", "()Z", "bestAllowlistedSize", "", "getBestAllowlistedSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "", "urimod_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FallbackToMbpDiskCache extends ModificationResult {

            @Nullable
            private final Integer bestAllowlistedSize;
            private final boolean isBestSize;

            public FallbackToMbpDiskCache(boolean z) {
                super(AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("FallbackToMbpDiskCache(isBestSize=", z), null);
                this.isBestSize = z;
            }

            public static /* synthetic */ FallbackToMbpDiskCache copy$default(FallbackToMbpDiskCache fallbackToMbpDiskCache, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = fallbackToMbpDiskCache.isBestSize;
                }
                return fallbackToMbpDiskCache.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsBestSize() {
                return this.isBestSize;
            }

            @NotNull
            public final FallbackToMbpDiskCache copy(boolean isBestSize) {
                return new FallbackToMbpDiskCache(isBestSize);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FallbackToMbpDiskCache) && this.isBestSize == ((FallbackToMbpDiskCache) other).isBestSize;
            }

            @Override // com.facebook.fresco.urimod.UriModifierInterface.ModificationResult
            @Nullable
            public Integer getBestAllowlistedSize() {
                return this.bestAllowlistedSize;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isBestSize);
            }

            public final boolean isBestSize() {
                return this.isBestSize;
            }

            @Override // com.facebook.fresco.urimod.UriModifierInterface.ModificationResult
            @NotNull
            /* renamed from: toString */
            public String getComment() {
                return Automotive$$ExternalSyntheticOutline0.m("FallbackToMbpDiskCache(isBestSize=", MarkdownConstants.RIGHT_PARENTHESIS, this.isBestSize);
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\bHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult$FallbackToMbpMemoryCache;", "Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult;", "isBestSize", "", "<init>", "(Ljava/lang/String;)V", "()Ljava/lang/String;", "bestAllowlistedSize", "", "getBestAllowlistedSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "urimod_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FallbackToMbpMemoryCache extends ModificationResult {

            @Nullable
            private final Integer bestAllowlistedSize;

            @NotNull
            private final String isBestSize;

            public FallbackToMbpMemoryCache(@NotNull String str) {
                super(ChatData$$ExternalSyntheticOutline0.m(str, "FallbackToMbpMemoryCache(", str), null);
                this.isBestSize = str;
            }

            public static /* synthetic */ FallbackToMbpMemoryCache copy$default(FallbackToMbpMemoryCache fallbackToMbpMemoryCache, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = fallbackToMbpMemoryCache.isBestSize;
                }
                return fallbackToMbpMemoryCache.copy(str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getIsBestSize() {
                return this.isBestSize;
            }

            @NotNull
            public final FallbackToMbpMemoryCache copy(@NotNull String isBestSize) {
                isBestSize.getClass();
                return new FallbackToMbpMemoryCache(isBestSize);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FallbackToMbpMemoryCache) && Intrinsics.areEqual(this.isBestSize, ((FallbackToMbpMemoryCache) other).isBestSize);
            }

            @Override // com.facebook.fresco.urimod.UriModifierInterface.ModificationResult
            @Nullable
            public Integer getBestAllowlistedSize() {
                return this.bestAllowlistedSize;
            }

            public int hashCode() {
                return this.isBestSize.hashCode();
            }

            @NotNull
            public final String isBestSize() {
                return this.isBestSize;
            }

            @Override // com.facebook.fresco.urimod.UriModifierInterface.ModificationResult
            @NotNull
            /* renamed from: toString */
            public String getComment() {
                return a$$ExternalSyntheticOutline0.m("FallbackToMbpMemoryCache(isBestSize=", this.isBestSize, MarkdownConstants.RIGHT_PARENTHESIS);
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult$FallbackToOriginalUrl;", "Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult;", "bestAllowlistedSize", "", "<init>", "(Ljava/lang/Integer;)V", "getBestAllowlistedSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult$FallbackToOriginalUrl;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "", "urimod_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FallbackToOriginalUrl extends ModificationResult {

            @Nullable
            private final Integer bestAllowlistedSize;

            public FallbackToOriginalUrl(@Nullable Integer num) {
                super("FallbackToOriginalUrl", null);
                this.bestAllowlistedSize = num;
            }

            public static /* synthetic */ FallbackToOriginalUrl copy$default(FallbackToOriginalUrl fallbackToOriginalUrl, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = fallbackToOriginalUrl.bestAllowlistedSize;
                }
                return fallbackToOriginalUrl.copy(num);
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final Integer getBestAllowlistedSize() {
                return this.bestAllowlistedSize;
            }

            @NotNull
            public final FallbackToOriginalUrl copy(@Nullable Integer bestAllowlistedSize) {
                return new FallbackToOriginalUrl(bestAllowlistedSize);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FallbackToOriginalUrl) && Intrinsics.areEqual(this.bestAllowlistedSize, ((FallbackToOriginalUrl) other).bestAllowlistedSize);
            }

            @Override // com.facebook.fresco.urimod.UriModifierInterface.ModificationResult
            @Nullable
            public Integer getBestAllowlistedSize() {
                return this.bestAllowlistedSize;
            }

            public int hashCode() {
                Integer num = this.bestAllowlistedSize;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            @Override // com.facebook.fresco.urimod.UriModifierInterface.ModificationResult
            @NotNull
            /* renamed from: toString */
            public String getComment() {
                return "FallbackToOriginalUrl(bestAllowlistedSize=" + this.bestAllowlistedSize + MarkdownConstants.RIGHT_PARENTHESIS;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult$Unmodified;", "Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult;", "reason", "", "bestAllowlistedSize", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getReason", "()Ljava/lang/String;", "getBestAllowlistedSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult$Unmodified;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "urimod_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Unmodified extends ModificationResult {

            @Nullable
            private final Integer bestAllowlistedSize;

            @NotNull
            private final String reason;

            public Unmodified(@NotNull String str, @Nullable Integer num) {
                super(TableInfo$$ExternalSyntheticOutline0.m(str, "Unmodified(reason='", str, "'"), null);
                this.reason = str;
                this.bestAllowlistedSize = num;
            }

            public static /* synthetic */ Unmodified copy$default(Unmodified unmodified, String str, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = unmodified.reason;
                }
                if ((i & 2) != 0) {
                    num = unmodified.bestAllowlistedSize;
                }
                return unmodified.copy(str, num);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getReason() {
                return this.reason;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final Integer getBestAllowlistedSize() {
                return this.bestAllowlistedSize;
            }

            @NotNull
            public final Unmodified copy(@NotNull String reason, @Nullable Integer bestAllowlistedSize) {
                reason.getClass();
                return new Unmodified(reason, bestAllowlistedSize);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Unmodified)) {
                    return false;
                }
                Unmodified unmodified = (Unmodified) other;
                return Intrinsics.areEqual(this.reason, unmodified.reason) && Intrinsics.areEqual(this.bestAllowlistedSize, unmodified.bestAllowlistedSize);
            }

            @Override // com.facebook.fresco.urimod.UriModifierInterface.ModificationResult
            @Nullable
            public Integer getBestAllowlistedSize() {
                return this.bestAllowlistedSize;
            }

            @NotNull
            public final String getReason() {
                return this.reason;
            }

            public int hashCode() {
                int hashCode = this.reason.hashCode() * 31;
                Integer num = this.bestAllowlistedSize;
                return hashCode + (num == null ? 0 : num.hashCode());
            }

            @Override // com.facebook.fresco.urimod.UriModifierInterface.ModificationResult
            @NotNull
            /* renamed from: toString */
            public String getComment() {
                return "Unmodified(reason=" + this.reason + ", bestAllowlistedSize=" + this.bestAllowlistedSize + MarkdownConstants.RIGHT_PARENTHESIS;
            }
        }

        private ModificationResult(String str) {
            this.comment = str;
        }

        @Nullable
        public abstract Integer getBestAllowlistedSize();

        @NotNull
        /* renamed from: toString, reason: from getter */
        public String getComment() {
            return this.comment;
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult$Modified;", "Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult;", "newUri", "Landroid/net/Uri;", ClientCookie.COMMENT_ATTR, "", "<init>", "(Landroid/net/Uri;Ljava/lang/String;)V", "getNewUri", "()Landroid/net/Uri;", "ModifiedToAllowlistedSize", "ModifiedToMaxDimens", "Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult$Modified$ModifiedToAllowlistedSize;", "Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult$Modified$ModifiedToMaxDimens;", "urimod_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class Modified extends ModificationResult {

            @NotNull
            private final Uri newUri;

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult$Modified$ModifiedToAllowlistedSize;", "Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult$Modified;", "newUrl", "Landroid/net/Uri;", "bestAllowlistedSize", "", "<init>", "(Landroid/net/Uri;Ljava/lang/Integer;)V", "getBestAllowlistedSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "urimod_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class ModifiedToAllowlistedSize extends Modified {

                @Nullable
                private final Integer bestAllowlistedSize;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ModifiedToAllowlistedSize(@NotNull Uri uri, @Nullable Integer num) {
                    super(uri, "ModifiedToAllowlistedSize", null);
                    uri.getClass();
                    this.bestAllowlistedSize = num;
                }

                @Override // com.facebook.fresco.urimod.UriModifierInterface.ModificationResult
                @Nullable
                public Integer getBestAllowlistedSize() {
                    return this.bestAllowlistedSize;
                }
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult$Modified$ModifiedToMaxDimens;", "Lcom/facebook/fresco/urimod/UriModifierInterface$ModificationResult$Modified;", "newUrl", "Landroid/net/Uri;", "bestAllowlistedSize", "", "<init>", "(Landroid/net/Uri;Ljava/lang/Integer;)V", "getBestAllowlistedSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "urimod_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class ModifiedToMaxDimens extends Modified {

                @Nullable
                private final Integer bestAllowlistedSize;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ModifiedToMaxDimens(@NotNull Uri uri, @Nullable Integer num) {
                    super(uri, "ModifiedToMaxDimens", null);
                    uri.getClass();
                    this.bestAllowlistedSize = num;
                }

                @Override // com.facebook.fresco.urimod.UriModifierInterface.ModificationResult
                @Nullable
                public Integer getBestAllowlistedSize() {
                    return this.bestAllowlistedSize;
                }
            }

            private Modified(Uri uri, String str) {
                super(str, null);
                this.newUri = uri;
            }

            @NotNull
            public final Uri getNewUri() {
                return this.newUri;
            }

            public /* synthetic */ Modified(Uri uri, String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(uri, str);
            }
        }

        public /* synthetic */ ModificationResult(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }
}
