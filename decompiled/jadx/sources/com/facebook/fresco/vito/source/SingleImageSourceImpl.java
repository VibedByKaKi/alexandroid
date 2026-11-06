package com.facebook.fresco.vito.source;

import android.net.Uri;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u0006J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J+\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0016\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/facebook/fresco/vito/source/SingleImageSourceImpl;", "Lcom/facebook/fresco/vito/source/SingleImageSource;", "uri", "Landroid/net/Uri;", "extras", "", "", "", "<init>", "(Landroid/net/Uri;Ljava/util/Map;)V", "getUri", "()Landroid/net/Uri;", "getExtras", "()Ljava/util/Map;", "getExtra", "key", "getStringExtra", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "imageUri", "getImageUri", "component1", "component2", "copy", "toString", "source_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SingleImageSourceImpl implements SingleImageSource {

    @Nullable
    private final Map<String, Object> extras;

    @NotNull
    private final Uri imageUri;

    @NotNull
    private final Uri uri;

    public SingleImageSourceImpl(@NotNull Uri uri, @Nullable Map<String, ? extends Object> map) {
        uri.getClass();
        this.uri = uri;
        this.extras = map;
        this.imageUri = getUri();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SingleImageSourceImpl copy$default(SingleImageSourceImpl singleImageSourceImpl, Uri uri, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = singleImageSourceImpl.uri;
        }
        if ((i & 2) != 0) {
            map = singleImageSourceImpl.extras;
        }
        return singleImageSourceImpl.copy(uri, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    @Nullable
    public final Map<String, Object> component2() {
        return this.extras;
    }

    @NotNull
    public final SingleImageSourceImpl copy(@NotNull Uri uri, @Nullable Map<String, ? extends Object> extras) {
        uri.getClass();
        return new SingleImageSourceImpl(uri, extras);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(SingleImageSourceImpl.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        SingleImageSourceImpl singleImageSourceImpl = (SingleImageSourceImpl) other;
        return Intrinsics.areEqual(getImageUri(), singleImageSourceImpl.getImageUri()) && Intrinsics.areEqual(getExtras(), singleImageSourceImpl.getExtras());
    }

    @Nullable
    public final Object getExtra(@NotNull String key) {
        key.getClass();
        Map<String, Object> extras = getExtras();
        if (extras != null) {
            return extras.get(key);
        }
        return null;
    }

    @Override // com.facebook.fresco.vito.source.UriImageSource
    @Nullable
    public Map<String, Object> getExtras() {
        return this.extras;
    }

    @Override // com.facebook.fresco.vito.source.UriImageSource
    @NotNull
    public Uri getImageUri() {
        return this.imageUri;
    }

    @Override // com.facebook.fresco.vito.source.SingleImageSource
    @Nullable
    public String getStringExtra(@NotNull String key) {
        key.getClass();
        Object extra = getExtra(key);
        if (extra instanceof String) {
            return (String) extra;
        }
        return null;
    }

    @Override // com.facebook.fresco.vito.source.SingleImageSource
    @NotNull
    public Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        int hashCode = getImageUri().hashCode() * 31;
        Map<String, Object> extras = getExtras();
        return hashCode + (extras != null ? extras.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SingleImageSourceImpl(uri=" + this.uri + ", extras=" + this.extras + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ SingleImageSourceImpl(Uri uri, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, (i & 2) != 0 ? null : map);
    }
}
