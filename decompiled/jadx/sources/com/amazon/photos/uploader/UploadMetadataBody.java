package com.amazon.photos.uploader;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.deecomms.nativemodules.util.ReactBridgeSerializer;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\"\b\u0002\u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J#\u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007\u0018\u00010\u0007HÆ\u0003JC\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\"\b\u0002\u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR0\u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/amazon/photos/uploader/UploadMetadataBody;", "", "()V", "name", "", ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME, "properties", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getKind", "()Ljava/lang/String;", "getName", "getProperties", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UploadMetadataBody {

    @SerializedName(ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME)
    @Nullable
    private final String kind;

    @SerializedName("name")
    @NotNull
    private final String name;

    @SerializedName("properties")
    @Nullable
    private final Map<String, Map<String, String>> properties;

    public /* synthetic */ UploadMetadataBody(String str, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "FILE" : str2, (i & 4) != 0 ? null : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UploadMetadataBody copy$default(UploadMetadataBody uploadMetadataBody, String str, String str2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadMetadataBody.name;
        }
        if ((i & 2) != 0) {
            str2 = uploadMetadataBody.kind;
        }
        if ((i & 4) != 0) {
            map = uploadMetadataBody.properties;
        }
        return uploadMetadataBody.copy(str, str2, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    @Nullable
    public final Map<String, Map<String, String>> component3() {
        return this.properties;
    }

    @NotNull
    public final UploadMetadataBody copy(@NotNull String name, @Nullable String kind, @Nullable Map<String, ? extends Map<String, String>> properties) {
        name.getClass();
        return new UploadMetadataBody(name, kind, properties);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadMetadataBody)) {
            return false;
        }
        UploadMetadataBody uploadMetadataBody = (UploadMetadataBody) other;
        return Intrinsics.areEqual(this.name, uploadMetadataBody.name) && Intrinsics.areEqual(this.kind, uploadMetadataBody.kind) && Intrinsics.areEqual(this.properties, uploadMetadataBody.properties);
    }

    @Nullable
    public final String getKind() {
        return this.kind;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Map<String, Map<String, String>> getProperties() {
        return this.properties;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.kind;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Map<String, String>> map = this.properties;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UploadMetadataBody(name=" + this.name + ", kind=" + this.kind + ", properties=" + this.properties + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UploadMetadataBody(@NotNull String str, @Nullable String str2, @Nullable Map<String, ? extends Map<String, String>> map) {
        str.getClass();
        this.name = str;
        this.kind = str2;
        this.properties = map;
    }

    public UploadMetadataBody() {
        this("", null, null, 6, null);
    }
}
