package com.facebook.fresco.vito.source;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u0006J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u0006J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\t\u0010\u0017\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0001HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J5\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/facebook/fresco/vito/source/IncreasingQualityImageSource;", "Lcom/facebook/fresco/vito/source/ImageSource;", "lowResSource", "highResSource", "extras", "", "", "", "<init>", "(Lcom/facebook/fresco/vito/source/ImageSource;Lcom/facebook/fresco/vito/source/ImageSource;Ljava/util/Map;)V", "getLowResSource", "()Lcom/facebook/fresco/vito/source/ImageSource;", "getHighResSource", "getExtras", "()Ljava/util/Map;", "getExtra", "key", "getStringExtra", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "component1", "component2", "component3", "copy", "toString", "source_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class IncreasingQualityImageSource implements ImageSource {

    @Nullable
    private final Map<String, Object> extras;

    @NotNull
    private final ImageSource highResSource;

    @NotNull
    private final ImageSource lowResSource;

    public IncreasingQualityImageSource(@NotNull ImageSource imageSource, @NotNull ImageSource imageSource2, @Nullable Map<String, ? extends Object> map) {
        imageSource.getClass();
        imageSource2.getClass();
        this.lowResSource = imageSource;
        this.highResSource = imageSource2;
        this.extras = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IncreasingQualityImageSource copy$default(IncreasingQualityImageSource increasingQualityImageSource, ImageSource imageSource, ImageSource imageSource2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            imageSource = increasingQualityImageSource.lowResSource;
        }
        if ((i & 2) != 0) {
            imageSource2 = increasingQualityImageSource.highResSource;
        }
        if ((i & 4) != 0) {
            map = increasingQualityImageSource.extras;
        }
        return increasingQualityImageSource.copy(imageSource, imageSource2, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ImageSource getLowResSource() {
        return this.lowResSource;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ImageSource getHighResSource() {
        return this.highResSource;
    }

    @Nullable
    public final Map<String, Object> component3() {
        return this.extras;
    }

    @NotNull
    public final IncreasingQualityImageSource copy(@NotNull ImageSource lowResSource, @NotNull ImageSource highResSource, @Nullable Map<String, ? extends Object> extras) {
        lowResSource.getClass();
        highResSource.getClass();
        return new IncreasingQualityImageSource(lowResSource, highResSource, extras);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(IncreasingQualityImageSource.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        IncreasingQualityImageSource increasingQualityImageSource = (IncreasingQualityImageSource) other;
        return Intrinsics.areEqual(this.lowResSource, increasingQualityImageSource.lowResSource) && Intrinsics.areEqual(this.highResSource, increasingQualityImageSource.highResSource) && Intrinsics.areEqual(this.extras, increasingQualityImageSource.extras);
    }

    @Nullable
    public final Object getExtra(@NotNull String key) {
        key.getClass();
        Map<String, Object> map = this.extras;
        if (map != null) {
            return map.get(key);
        }
        return null;
    }

    @Nullable
    public final Map<String, Object> getExtras() {
        return this.extras;
    }

    @NotNull
    public final ImageSource getHighResSource() {
        return this.highResSource;
    }

    @NotNull
    public final ImageSource getLowResSource() {
        return this.lowResSource;
    }

    @Nullable
    public final String getStringExtra(@NotNull String key) {
        key.getClass();
        Object extra = getExtra(key);
        if (extra instanceof String) {
            return (String) extra;
        }
        return null;
    }

    public int hashCode() {
        int hashCode = (this.highResSource.hashCode() + (this.lowResSource.hashCode() * 31)) * 31;
        Map<String, Object> map = this.extras;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ImageSource imageSource = this.lowResSource;
        ImageSource imageSource2 = this.highResSource;
        Map<String, Object> map = this.extras;
        StringBuilder sb = new StringBuilder("IncreasingQualityImageSource(lowResSource=");
        sb.append(imageSource);
        sb.append(", highResSource=");
        sb.append(imageSource2);
        sb.append(", extras=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, map, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ IncreasingQualityImageSource(ImageSource imageSource, ImageSource imageSource2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageSource, imageSource2, (i & 4) != 0 ? null : map);
    }
}
