package com.amazon.alexa.ra.core.features.personality;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/ra/core/features/personality/NetworkFetchResult;", "", "bytes", "", "wasFromCache", "", "<init>", "([BZ)V", "getBytes", "()[B", "getWasFromCache", "()Z", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "component1", "component2", "copy", "toString", "", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class NetworkFetchResult {
    public static final int $stable = 8;

    @NotNull
    private final byte[] bytes;
    private final boolean wasFromCache;

    public NetworkFetchResult(@NotNull byte[] bArr, boolean z) {
        bArr.getClass();
        this.bytes = bArr;
        this.wasFromCache = z;
    }

    public static /* synthetic */ NetworkFetchResult copy$default(NetworkFetchResult networkFetchResult, byte[] bArr, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = networkFetchResult.bytes;
        }
        if ((i & 2) != 0) {
            z = networkFetchResult.wasFromCache;
        }
        return networkFetchResult.copy(bArr, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final byte[] getBytes() {
        return this.bytes;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getWasFromCache() {
        return this.wasFromCache;
    }

    @NotNull
    public final NetworkFetchResult copy(@NotNull byte[] bytes, boolean wasFromCache) {
        bytes.getClass();
        return new NetworkFetchResult(bytes, wasFromCache);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(NetworkFetchResult.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        NetworkFetchResult networkFetchResult = (NetworkFetchResult) other;
        return Arrays.equals(this.bytes, networkFetchResult.bytes) && this.wasFromCache == networkFetchResult.wasFromCache;
    }

    @NotNull
    public final byte[] getBytes() {
        return this.bytes;
    }

    public final boolean getWasFromCache() {
        return this.wasFromCache;
    }

    public int hashCode() {
        return Boolean.hashCode(this.wasFromCache) + (Arrays.hashCode(this.bytes) * 31);
    }

    @NotNull
    public String toString() {
        return AppLaunchChecker$$ExternalSyntheticOutline0.m("NetworkFetchResult(bytes=", Arrays.toString(this.bytes), ", wasFromCache=", this.wasFromCache, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
