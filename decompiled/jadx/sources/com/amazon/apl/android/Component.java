package com.amazon.apl.android;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.apl.android.component.ComponentDependencies;
import com.amazon.apl.android.primitive.AccessibilityActions;
import com.amazon.apl.android.primitive.AccessibilityAdjustableRange;
import com.amazon.apl.android.primitive.Dimension;
import com.amazon.apl.android.primitive.Gradient;
import com.amazon.apl.android.primitive.Rect;
import com.amazon.apl.android.scaling.IMetricsTransform;
import com.amazon.apl.android.utils.AccessibilitySettingsUtil;
import com.amazon.apl.enums.ComponentType;
import com.amazon.apl.enums.Display;
import com.amazon.apl.enums.LayoutDirection;
import com.amazon.apl.enums.PropertyKey;
import com.amazon.apl.enums.Role;
import com.amazon.apl.enums.UpdateType;
import com.amazon.common.BoundObject;
import com.amazon.common.Consumer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class Component extends BoundObject implements IAccessibilityProvider {
    private static final boolean DEBUG = false;
    private static final String METRIC_COMPONENT_NULL = "Component.uninflated_component_in_core";
    private static final String TAG = "Component";
    private static AccessibilitySettingsUtil sAccessibilitySettingsUtil = AccessibilitySettingsUtil.getInstance();

    @NonNull
    private final String mParentUniqueId;

    @NonNull
    public final PropertyMap<Component, PropertyKey> mProperties;

    @NonNull
    private final RenderingContext mRenderingContext;

    @Deprecated
    RootContext mRootContext;
    private Bitmap mShadowBitmap;

    @NonNull
    private final String mUniqueId;
    private boolean mInvisibleOverride = false;
    private Map<String, Component> mChildren = new HashMap();

    public Component(ComponentDependencies componentDependencies) {
        bind(componentDependencies.getNativeHandle());
        this.mUniqueId = componentDependencies.getUniqueId();
        this.mRenderingContext = componentDependencies.getRenderingContext();
        this.mParentUniqueId = componentDependencies.getParentUniqueId();
        this.mRootContext = componentDependencies.getRootContext();
        this.mProperties = createPropertyMap();
        registerWithParent();
    }

    private float getCalculatedHeight() {
        return nGetCalculatedHeight(getNativeHandle());
    }

    private float getCalculatedWidth() {
        return nGetCalculatedWidth(getNativeHandle());
    }

    private float[] getGlobalPointCoordinates(float f, float f2) {
        return nGetGlobalPointCoordinates(getNativeHandle(), f, f2);
    }

    private static native boolean nCheckDirty(long j);

    private static native boolean nCheckDirtyProperty(long j, int i);

    private static native void nEnsureLayout(long j);

    private static native float nGetCalculatedHeight(long j);

    private static native float nGetCalculatedWidth(long j);

    private static native int nGetChildCount(long j);

    @NonNull
    private static native String nGetChildId(long j, int i);

    private static native int nGetDisplayedChildCount(long j);

    private static native String nGetDisplayedChildId(long j, int i);

    private static native float[] nGetGlobalPointCoordinates(long j, float f, float f2);

    @NonNull
    private static native String nGetHierarchySignature(long j);

    @NonNull
    private static native String nGetId(long j);

    private static native String nGetParentId(long j);

    private static native int nGetParentType(long j);

    private static native int nGetType(long j);

    @NonNull
    private static native String nGetUniqueId(long j);

    private static native void nUpdate(long j, int i, int i2);

    private static native void nUpdate(long j, int i, byte[] bArr);

    private void registerChild(Component component) {
        this.mChildren.put(component.getUniqueId(), component);
    }

    private void registerWithParent() {
        Component parent = getParent();
        if (parent == null) {
            return;
        }
        parent.registerChild(this);
    }

    private void release(Consumer<Component> consumer) {
        Iterator<Component> it2 = getChildren().iterator();
        while (it2.hasNext()) {
            it2.next().release(consumer);
        }
        consumer.accept(this);
        this.mChildren.clear();
    }

    private void unRegisterChild(Component component) {
        this.mChildren.remove(component.getUniqueId());
    }

    @VisibleForTesting
    public boolean checkDirty() {
        return nCheckDirty(getNativeHandle());
    }

    @VisibleForTesting
    public boolean checkDirtyProperty(PropertyKey propertyKey) {
        return nCheckDirtyProperty(getNativeHandle(), propertyKey.getIndex());
    }

    public PropertyMap<Component, PropertyKey> createPropertyMap() {
        return new PropertyMap<Component, PropertyKey>() { // from class: com.amazon.apl.android.Component.1
            @Override // com.amazon.apl.android.PropertyMap
            @NonNull
            public IMetricsTransform getMetricsTransform() {
                return Component.this.getRenderingContext().getMetricsTransform();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.apl.android.PropertyMap
            @NonNull
            public Component getMapOwner() {
                return Component.this;
            }
        };
    }

    public final void ensureLayout() {
        nEnsureLayout(getNativeHandle());
    }

    public void focus(boolean z) {
        update(UpdateType.kUpdateTakeFocus, z);
    }

    @Override // com.amazon.apl.android.IAccessibilityProvider
    @NonNull
    public final AccessibilityActions getAccessibilityActions() {
        return this.mProperties.getAccessibilityActions(PropertyKey.kPropertyAccessibilityActions);
    }

    @Override // com.amazon.apl.android.IAccessibilityProvider
    @Nullable
    public final AccessibilityAdjustableRange getAccessibilityAdjustableRange() {
        return this.mProperties.getAccessibilityAdjustableRange(PropertyKey.kPropertyAccessibilityAdjustableRange);
    }

    @Override // com.amazon.apl.android.IAccessibilityProvider
    @Nullable
    public final String getAccessibilityAdjustableValue() {
        return this.mProperties.getString(PropertyKey.kPropertyAccessibilityAdjustableValue);
    }

    public final int getAccessibilityHidden() {
        return this.mProperties.getInt(PropertyKey.kPropertyAccessibilityHidden);
    }

    @Override // com.amazon.apl.android.IAccessibilityProvider
    @Nullable
    public final String getAccessibilityLabel() {
        return this.mProperties.getString(PropertyKey.kPropertyAccessibilityLabel);
    }

    @Override // com.amazon.apl.android.IAccessibilityProvider
    public final String getAccessibilityNodeText() {
        return this.mProperties.getString(PropertyKey.kPropertyText);
    }

    public List<Component> getAllChildren() {
        int childCount = getChildCount();
        ArrayList arrayList = new ArrayList(childCount);
        for (int i = 0; i < childCount; i++) {
            Component childAt = getChildAt(i);
            if (childAt != null) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public int getBackgroundColor() {
        return this.mProperties.getColor(PropertyKey.kPropertyBackground);
    }

    public Gradient getBackgroundGradient() {
        return this.mProperties.getGradient(PropertyKey.kPropertyBackground);
    }

    public final Rect getBounds() {
        return this.mProperties.getRect(PropertyKey.kPropertyBounds);
    }

    public Object[] getChangedChildren() {
        return (Object[]) this.mProperties.get(PropertyKey.kPropertyNotifyChildrenChanged);
    }

    @Nullable
    public Component getChildAt(int i) {
        return getChildById(getChildId(i));
    }

    public Component getChildById(String str) {
        if (this.mChildren.containsKey(str)) {
            return this.mChildren.get(str);
        }
        Component orInflateComponentWithUniqueId = this.mRootContext.getOrInflateComponentWithUniqueId(str);
        if (orInflateComponentWithUniqueId != null) {
            return orInflateComponentWithUniqueId;
        }
        Log.e(TAG, this + ". getChildById returned null for id: " + str);
        return null;
    }

    public final int getChildCount() {
        return nGetChildCount(getNativeHandle());
    }

    @NonNull
    public final String getChildId(int i) {
        return nGetChildId(getNativeHandle(), i);
    }

    @VisibleForTesting(otherwise = 2)
    public Collection<Component> getChildren() {
        return this.mChildren.values();
    }

    @NonNull
    public String getComponentId() {
        return getUniqueId();
    }

    @NonNull
    public final ComponentType getComponentType() {
        return ComponentType.valueOf(nGetType(getNativeHandle()));
    }

    public final Display getDisplay() {
        return Display.valueOf(this.mProperties.getEnum(PropertyKey.kPropertyDisplay));
    }

    public Component getDisplayedChildAt(int i) {
        return getChildById(getDisplayedChildId(i));
    }

    public int getDisplayedChildCount() {
        return nGetDisplayedChildCount(getNativeHandle());
    }

    public String getDisplayedChildId(int i) {
        return nGetDisplayedChildId(getNativeHandle(), i);
    }

    public List<Component> getDisplayedChildren() {
        int displayedChildCount = getDisplayedChildCount();
        ArrayList arrayList = new ArrayList(displayedChildCount);
        for (int i = 0; i < displayedChildCount; i++) {
            Component displayedChildAt = getDisplayedChildAt(i);
            if (displayedChildAt != null) {
                arrayList.add(displayedChildAt);
            }
        }
        return arrayList;
    }

    @NonNull
    public Dimension getDrawnBorderWidth() {
        return this.mProperties.getDimension(PropertyKey.kPropertyDrawnBorderWidth);
    }

    @NonNull
    public final String getHierarchySignature() {
        return nGetHierarchySignature(getNativeHandle());
    }

    @Override // com.amazon.apl.android.IAccessibilityProvider
    @NonNull
    public final String getId() {
        return nGetId(getNativeHandle());
    }

    public final Rect getInnerBounds() {
        return this.mProperties.getRect(PropertyKey.kPropertyInnerBounds);
    }

    public LayoutDirection getLayoutDirection() {
        return LayoutDirection.valueOf(this.mProperties.getEnum(PropertyKey.kPropertyLayoutDirection));
    }

    public float getOpacity() {
        return this.mProperties.getFloat(PropertyKey.kPropertyOpacity);
    }

    @Nullable
    public Component getParent() {
        String parentId = getParentId();
        if (parentId.isEmpty()) {
            return null;
        }
        return this.mRootContext.getOrInflateComponentWithUniqueId(parentId);
    }

    public final String getParentId() {
        return this.mParentUniqueId;
    }

    public final ComponentType getParentType() {
        return ComponentType.valueOf(nGetParentType(getNativeHandle()));
    }

    public ArrayList<float[]> getPathCoordinates() {
        float calculatedWidth = getCalculatedWidth();
        float calculatedHeight = getCalculatedHeight();
        float[] globalPointCoordinates = getGlobalPointCoordinates(0.0f, 0.0f);
        float[] globalPointCoordinates2 = getGlobalPointCoordinates(calculatedWidth, 0.0f);
        float[] globalPointCoordinates3 = getGlobalPointCoordinates(calculatedWidth, calculatedHeight);
        float[] globalPointCoordinates4 = getGlobalPointCoordinates(0.0f, calculatedHeight);
        ArrayList<float[]> arrayList = new ArrayList<>();
        arrayList.add(globalPointCoordinates);
        arrayList.add(globalPointCoordinates2);
        arrayList.add(globalPointCoordinates3);
        arrayList.add(globalPointCoordinates4);
        return arrayList;
    }

    @NonNull
    public final PropertyMap<Component, PropertyKey> getProperties() {
        return this.mProperties;
    }

    public final RenderingContext getRenderingContext() {
        return this.mRenderingContext;
    }

    @Override // com.amazon.apl.android.IAccessibilityProvider
    public Role getRole() {
        return Role.valueOf(this.mProperties.getEnum(PropertyKey.kPropertyRole));
    }

    @VisibleForTesting
    @Deprecated
    public RootContext getRootContext() {
        return this.mRootContext;
    }

    public Bitmap getShadowBitmap() {
        return this.mShadowBitmap;
    }

    public int getShadowColor() {
        return this.mProperties.getColor(PropertyKey.kPropertyShadowColor);
    }

    public float[] getShadowCornerRadius() {
        return new float[]{0.0f, 0.0f, 0.0f, 0.0f};
    }

    public int getShadowOffsetHorizontal() {
        Dimension dimension = this.mProperties.getDimension(PropertyKey.kPropertyShadowHorizontalOffset);
        if (dimension == null) {
            return 0;
        }
        return dimension.intValue();
    }

    public int getShadowOffsetVertical() {
        Dimension dimension = this.mProperties.getDimension(PropertyKey.kPropertyShadowVerticalOffset);
        if (dimension == null) {
            return 0;
        }
        return dimension.intValue();
    }

    public int getShadowRadius() {
        Dimension dimension = this.mProperties.getDimension(PropertyKey.kPropertyShadowRadius);
        if (dimension == null) {
            return 0;
        }
        return dimension.intValue();
    }

    public RectF getShadowRect() {
        Rect bounds = getBounds();
        float shadowOffsetHorizontal = getShadowOffsetHorizontal();
        float shadowOffsetVertical = getShadowOffsetVertical();
        return new RectF(bounds.getLeft() + shadowOffsetHorizontal, bounds.getTop() + shadowOffsetVertical, bounds.getRight() + shadowOffsetHorizontal, bounds.getBottom() + shadowOffsetVertical);
    }

    public final Matrix getTransform() {
        return this.mProperties.getScaledTransform(PropertyKey.kPropertyTransform);
    }

    @NonNull
    public final String getUniqueId() {
        return this.mUniqueId;
    }

    public IAPLViewPresenter getViewPresenter() {
        return this.mRootContext.getViewPresenter();
    }

    @Override // com.amazon.apl.android.IAccessibilityProvider
    public boolean hasAccessibilityAdjustableRange() {
        return hasProperty(PropertyKey.kPropertyAccessibilityAdjustableRange);
    }

    @Override // com.amazon.apl.android.IAccessibilityProvider
    public boolean hasAccessibilityAdjustableValue() {
        return hasProperty(PropertyKey.kPropertyAccessibilityAdjustableValue);
    }

    public boolean hasProperty(PropertyKey propertyKey) {
        return this.mProperties.hasProperty(propertyKey);
    }

    @Override // com.amazon.apl.android.IAccessibilityProvider
    public boolean hasTextProperty() {
        return hasProperty(PropertyKey.kPropertyText);
    }

    public final boolean hasTransform() {
        return this.mProperties.hasTransform();
    }

    @Override // com.amazon.apl.android.IAccessibilityProvider
    public final boolean isChecked() {
        return this.mProperties.getBoolean(PropertyKey.kPropertyChecked);
    }

    public boolean isClickable() {
        ComponentType componentType = getComponentType();
        if (isDisabled() || !isFocusable()) {
            return false;
        }
        return componentType == ComponentType.kComponentTypeTouchWrapper || componentType == ComponentType.kComponentTypeVectorGraphic;
    }

    @Override // com.amazon.apl.android.IAccessibilityProvider
    public final boolean isDisabled() {
        return this.mProperties.getBoolean(PropertyKey.kPropertyDisabled);
    }

    @Override // com.amazon.apl.android.IAccessibilityProvider
    public boolean isFocusable() {
        return this.mProperties.getBoolean(PropertyKey.kPropertyFocusable);
    }

    @Override // com.amazon.apl.android.IAccessibilityProvider
    public boolean isFocusableInTouchMode() {
        return false;
    }

    public boolean isGradientBackground() {
        return this.mProperties.isGradient(PropertyKey.kPropertyBackground);
    }

    public boolean isInvisibleOverride() {
        return this.mInvisibleOverride;
    }

    public boolean isLaidOut() {
        return this.mProperties.getBoolean(PropertyKey.kPropertyLaidOut);
    }

    public void releaseChild(@NonNull Component component, @NonNull Consumer<Component> consumer) {
        unRegisterChild(component);
        component.release(consumer);
    }

    public void setInvisibleOverride(boolean z) {
        if (this.mInvisibleOverride != z) {
            this.mInvisibleOverride = z;
            getViewPresenter().onComponentChange(this, Collections.singletonList(PropertyKey.kPropertyDisplay));
        }
    }

    public void setShadowBitmap(Bitmap bitmap) {
        this.mShadowBitmap = bitmap;
    }

    public boolean shouldDrawBoxShadow() {
        return (getShadowOffsetHorizontal() == 0 && getShadowOffsetVertical() == 0 && getShadowRadius() == 0) ? false : true;
    }

    public String toString() {
        return "{type: " + getComponentType() + ", uid: " + getComponentId() + ", id: " + getId() + ", parent: " + getParentId() + StringSubstitutor.DEFAULT_VAR_END;
    }

    public void update(@NonNull UpdateType updateType, int i) {
        if (updateType == UpdateType.kUpdateScrollPosition) {
            i = Math.round(getRenderingContext().getMetricsTransform().toCore(i));
        }
        nUpdate(getNativeHandle(), updateType.getIndex(), i);
    }

    @Override // com.amazon.apl.android.IAccessibilityProvider
    public void update(@NonNull UpdateType updateType, String str) {
        nUpdate(getNativeHandle(), updateType.getIndex(), BitVector$$ExternalSyntheticOutline0.m(str, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(StandardCharsets.UTF_8));
    }

    public void update(@NonNull UpdateType updateType, boolean z) {
        update(updateType, z ? 1 : 0);
    }

    @VisibleForTesting
    public Component(@NonNull String str, @NonNull String str2, @NonNull RenderingContext renderingContext, PropertyMap<Component, PropertyKey> propertyMap) {
        this.mUniqueId = str;
        this.mParentUniqueId = str2;
        this.mRenderingContext = renderingContext;
        this.mProperties = propertyMap;
        registerWithParent();
    }
}
