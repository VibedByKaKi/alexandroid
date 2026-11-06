package com.amazon.photos.autosave;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u001e\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0003¢\u0006\u0002\u0010\u0005J!\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0003HÆ\u0003J+\u0010\t\u001a\u00020\u00002 \b\u0002\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R)\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/amazon/photos/autosave/UploadRequestMetadata;", "", "nodeProperties", "", "", "(Ljava/util/Map;)V", "getNodeProperties", "()Ljava/util/Map;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AndroidPhotosAutosave_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UploadRequestMetadata {

    @NotNull
    private final Map<String, Map<String, String>> nodeProperties;

    /* JADX WARN: Multi-variable type inference failed */
    public UploadRequestMetadata(@NotNull Map<String, ? extends Map<String, String>> map) {
        map.getClass();
        this.nodeProperties = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UploadRequestMetadata copy$default(UploadRequestMetadata uploadRequestMetadata, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = uploadRequestMetadata.nodeProperties;
        }
        return uploadRequestMetadata.copy(map);
    }

    @NotNull
    public final Map<String, Map<String, String>> component1() {
        return this.nodeProperties;
    }

    @NotNull
    public final UploadRequestMetadata copy(@NotNull Map<String, ? extends Map<String, String>> nodeProperties) {
        nodeProperties.getClass();
        return new UploadRequestMetadata(nodeProperties);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UploadRequestMetadata) && Intrinsics.areEqual(this.nodeProperties, ((UploadRequestMetadata) other).nodeProperties);
    }

    @NotNull
    public final Map<String, Map<String, String>> getNodeProperties() {
        return this.nodeProperties;
    }

    public int hashCode() {
        return this.nodeProperties.hashCode();
    }

    @NotNull
    public String toString() {
        return "UploadRequestMetadata(nodeProperties=" + this.nodeProperties + ')';
    }
}
