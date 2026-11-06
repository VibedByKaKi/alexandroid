package com.amazon.apl.android.graphic;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.apl.android.AVGFilter;
import com.amazon.apl.android.PropertyMap;
import com.amazon.apl.android.RenderingContext;
import com.amazon.apl.android.primitive.Gradient;
import com.amazon.apl.android.primitive.GraphicFilters;
import com.amazon.apl.android.scaling.IMetricsTransform;
import com.amazon.apl.enums.GraphicElementType;
import com.amazon.apl.enums.GraphicFilterType;
import com.amazon.apl.enums.GraphicPropertyKey;
import com.amazon.common.BoundObject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class GraphicElement extends BoundObject {
    private static final String TAG = "GraphicElement";
    private final List<GraphicElement> mChildren;
    private List<AVGFilter> mFilters;
    private GraphicElementMap mGraphicElementMap;
    public final PropertyMap<GraphicElement, GraphicPropertyKey> mProperties;
    private final RenderingContext mRenderingContext;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.apl.android.graphic.GraphicElement$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$apl$enums$GraphicFilterType;

        static {
            int[] iArr = new int[GraphicFilterType.values().length];
            $SwitchMap$com$amazon$apl$enums$GraphicFilterType = iArr;
            try {
                iArr[GraphicFilterType.kGraphicFilterTypeDropShadow.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public GraphicElement(GraphicElementMap graphicElementMap, long j, RenderingContext renderingContext) {
        bind(j);
        this.mChildren = new ArrayList();
        this.mRenderingContext = renderingContext;
        this.mProperties = new PropertyMap<GraphicElement, GraphicPropertyKey>() { // from class: com.amazon.apl.android.graphic.GraphicElement.1
            @Override // com.amazon.apl.android.PropertyMap
            @Nullable
            public IMetricsTransform getMetricsTransform() {
                return GraphicElement.this.mRenderingContext.getMetricsTransform();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.apl.android.PropertyMap
            @NonNull
            public GraphicElement getMapOwner() {
                return GraphicElement.this;
            }
        };
        this.mGraphicElementMap = graphicElementMap;
        this.mFilters = new ArrayList();
        createFilters();
        putInMap(graphicElementMap);
        nInflateChildren(getNativeHandle());
    }

    private native String nGetUniqueId(long j);

    public void addChildren(long j) {
        this.mChildren.add(GraphicElementFactory.getOrCreateGraphicElement(this.mGraphicElementMap, j, this.mRenderingContext));
    }

    public void applyDirtyProperties(@NonNull Set<String> set) {
        for (String str : set) {
            GraphicElement graphicElement = this.mGraphicElementMap.get(str);
            if (graphicElement != null) {
                graphicElement.applyProperties();
            } else {
                AppLaunchChecker$$ExternalSyntheticOutline0.m("Cannot find graphic for unique id: ", str, TAG);
            }
        }
    }

    public void applyFilters(@NonNull Bitmap bitmap, float f, float f2) {
        Iterator<AVGFilter> it2 = this.mFilters.iterator();
        while (it2.hasNext()) {
            it2.next().apply(bitmap, f, f2);
        }
    }

    public abstract void applyProperties();

    public boolean containsFilters() {
        return this.mFilters.size() > 0;
    }

    public boolean containsNonUniformScaling() {
        PropertyMap<GraphicElement, GraphicPropertyKey> propertyMap = this.mProperties;
        GraphicPropertyKey graphicPropertyKey = GraphicPropertyKey.kGraphicPropertyTransform;
        if (!propertyMap.hasProperty(graphicPropertyKey)) {
            return false;
        }
        float[] fArr = new float[9];
        this.mProperties.getTransform(graphicPropertyKey).getValues(fArr);
        return fArr[0] != fArr[4];
    }

    public boolean containsSkew() {
        PropertyMap<GraphicElement, GraphicPropertyKey> propertyMap = this.mProperties;
        GraphicPropertyKey graphicPropertyKey = GraphicPropertyKey.kGraphicPropertyTransform;
        if (!propertyMap.hasProperty(graphicPropertyKey)) {
            return false;
        }
        float[] fArr = new float[9];
        this.mProperties.getTransform(graphicPropertyKey).getValues(fArr);
        return (fArr[1] == 0.0f && fArr[3] == 0.0f) ? false : true;
    }

    public void createFilters() {
        for (GraphicFilters.GraphicFilter graphicFilter : this.mProperties.getGraphicFilters(GraphicPropertyKey.kGraphicPropertyFilters)) {
            if (AnonymousClass2.$SwitchMap$com$amazon$apl$enums$GraphicFilterType[graphicFilter.filterType().ordinal()] == 1) {
                this.mFilters.add(new AVGDropShadowFilter(graphicFilter.color(), graphicFilter.radius(), graphicFilter.horizontalOffset(), graphicFilter.verticalOffset()));
            }
        }
    }

    public boolean doesMapContainFilters() {
        return this.mGraphicElementMap.containsFilters();
    }

    public boolean doesMapContainNonUniformScaling() {
        return this.mGraphicElementMap.containsNonUniformScaling();
    }

    public boolean doesMapContainsSkew() {
        return this.mGraphicElementMap.containsSkew();
    }

    public List<GraphicElement> getChildren() {
        return this.mChildren;
    }

    @NonNull
    public Gradient getGradient(@NonNull GraphicPropertyKey graphicPropertyKey) {
        return Gradient.create(this, graphicPropertyKey);
    }

    @NonNull
    public GraphicPattern getGraphicPattern(@NonNull GraphicPropertyKey graphicPropertyKey) {
        return GraphicPattern.create(this, graphicPropertyKey, this.mGraphicElementMap, this.mRenderingContext);
    }

    public PropertyMap<GraphicElement, GraphicPropertyKey> getProperties() {
        return this.mProperties;
    }

    public RenderingContext getRenderingContext() {
        return this.mRenderingContext;
    }

    public GraphicContainerElement getRootContainer() {
        return this.mGraphicElementMap.getRoot();
    }

    @NonNull
    public GraphicElementType getType() {
        return GraphicElementType.valueOf(nGetType(getNativeHandle()));
    }

    public String getUniqueId() {
        return nGetUniqueId(getNativeHandle());
    }

    public native HashSet nGetDirtyProperties(long j);

    public native int nGetType(long j);

    public native void nInflateChildren(long j);

    public void putInMap(GraphicElementMap graphicElementMap) {
        graphicElementMap.put(this);
    }
}
