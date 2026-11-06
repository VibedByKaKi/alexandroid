package com.amazon.photos.discovery.internal.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.handsfree.protocols.sierracontentprovider.SierraContentProviderContract;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/photos/discovery/internal/model/Digest;", "", SierraContentProviderContract.MD5_VALUE, "", "visualDigest", "(Ljava/lang/String;Ljava/lang/String;)V", "getMd5", "()Ljava/lang/String;", "getVisualDigest", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Digest {

    @Nullable
    private final String md5;

    @Nullable
    private final String visualDigest;

    public /* synthetic */ Digest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ Digest copy$default(Digest digest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = digest.md5;
        }
        if ((i & 2) != 0) {
            str2 = digest.visualDigest;
        }
        return digest.copy(str, str2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getVisualDigest() {
        return this.visualDigest;
    }

    @NotNull
    public final Digest copy(@Nullable String md5, @Nullable String visualDigest) {
        return new Digest(md5, visualDigest);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Digest)) {
            return false;
        }
        Digest digest = (Digest) other;
        return Intrinsics.areEqual(this.md5, digest.md5) && Intrinsics.areEqual(this.visualDigest, digest.visualDigest);
    }

    @Nullable
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    public final String getVisualDigest() {
        return this.visualDigest;
    }

    public int hashCode() {
        String str = this.md5;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.visualDigest;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Digest(md5=");
        sb.append(this.md5);
        sb.append(", visualDigest=");
        return ArcMode$$ExternalSyntheticOutline0.m(')', this.visualDigest, sb);
    }

    public Digest(@Nullable String str, @Nullable String str2) {
        this.md5 = str;
        this.visualDigest = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Digest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
