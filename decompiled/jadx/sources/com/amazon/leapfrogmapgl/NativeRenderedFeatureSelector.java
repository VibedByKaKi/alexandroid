package com.amazon.leapfrogmapgl;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J=\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/amazon/leapfrogmapgl/NativeRenderedFeatureSelector;", "", "geometryTypes", "", "", "sourceLayerEquals", "propertyName", "propertyValue", "<init>", "(Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGeometryTypes", "()Ljava/util/Set;", "getSourceLayerEquals", "()Ljava/lang/String;", "getPropertyName", "getPropertyValue", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NativeRenderedFeatureSelector {

    @NotNull
    private final Set<String> geometryTypes;

    @Nullable
    private final String propertyName;

    @Nullable
    private final String propertyValue;

    @Nullable
    private final String sourceLayerEquals;

    public NativeRenderedFeatureSelector(@NotNull Set<String> set, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        set.getClass();
        this.geometryTypes = set;
        this.sourceLayerEquals = str;
        this.propertyName = str2;
        this.propertyValue = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NativeRenderedFeatureSelector copy$default(NativeRenderedFeatureSelector nativeRenderedFeatureSelector, Set set, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            set = nativeRenderedFeatureSelector.geometryTypes;
        }
        if ((i & 2) != 0) {
            str = nativeRenderedFeatureSelector.sourceLayerEquals;
        }
        if ((i & 4) != 0) {
            str2 = nativeRenderedFeatureSelector.propertyName;
        }
        if ((i & 8) != 0) {
            str3 = nativeRenderedFeatureSelector.propertyValue;
        }
        return nativeRenderedFeatureSelector.copy(set, str, str2, str3);
    }

    @NotNull
    public final Set<String> component1() {
        return this.geometryTypes;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getSourceLayerEquals() {
        return this.sourceLayerEquals;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getPropertyName() {
        return this.propertyName;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getPropertyValue() {
        return this.propertyValue;
    }

    @NotNull
    public final NativeRenderedFeatureSelector copy(@NotNull Set<String> geometryTypes, @Nullable String sourceLayerEquals, @Nullable String propertyName, @Nullable String propertyValue) {
        geometryTypes.getClass();
        return new NativeRenderedFeatureSelector(geometryTypes, sourceLayerEquals, propertyName, propertyValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeRenderedFeatureSelector)) {
            return false;
        }
        NativeRenderedFeatureSelector nativeRenderedFeatureSelector = (NativeRenderedFeatureSelector) other;
        return Intrinsics.areEqual(this.geometryTypes, nativeRenderedFeatureSelector.geometryTypes) && Intrinsics.areEqual(this.sourceLayerEquals, nativeRenderedFeatureSelector.sourceLayerEquals) && Intrinsics.areEqual(this.propertyName, nativeRenderedFeatureSelector.propertyName) && Intrinsics.areEqual(this.propertyValue, nativeRenderedFeatureSelector.propertyValue);
    }

    @NotNull
    public final Set<String> getGeometryTypes() {
        return this.geometryTypes;
    }

    @Nullable
    public final String getPropertyName() {
        return this.propertyName;
    }

    @Nullable
    public final String getPropertyValue() {
        return this.propertyValue;
    }

    @Nullable
    public final String getSourceLayerEquals() {
        return this.sourceLayerEquals;
    }

    public int hashCode() {
        int hashCode = this.geometryTypes.hashCode() * 31;
        String str = this.sourceLayerEquals;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.propertyName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.propertyValue;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Set<String> set = this.geometryTypes;
        String str = this.sourceLayerEquals;
        String str2 = this.propertyName;
        String str3 = this.propertyValue;
        StringBuilder sb = new StringBuilder("NativeRenderedFeatureSelector(geometryTypes=");
        sb.append(set);
        sb.append(", sourceLayerEquals=");
        sb.append(str);
        sb.append(", propertyName=");
        return DoubleList$$ExternalSyntheticOutline0.m(sb, str2, ", propertyValue=", str3, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
