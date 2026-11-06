package com.amazon.apl.android;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.apl.android.primitive.AccessibilityActions;
import com.amazon.apl.android.primitive.AccessibilityAdjustableRange;
import com.amazon.apl.enums.Role;
import com.amazon.apl.enums.UpdateType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface IAccessibilityProvider {
    AccessibilityActions getAccessibilityActions();

    default AccessibilityAdjustableRange getAccessibilityAdjustableRange() {
        return AccessibilityAdjustableRange.create(0.0f, 0.0f, 0.0f);
    }

    default String getAccessibilityAdjustableValue() {
        return null;
    }

    @Nullable
    String getAccessibilityLabel();

    default String getAccessibilityNodeText() {
        return null;
    }

    String getId();

    default Role getRole() {
        return Role.kRoleNone;
    }

    default boolean hasAccessibilityAdjustableRange() {
        return false;
    }

    default boolean hasAccessibilityAdjustableValue() {
        return false;
    }

    default boolean hasTextProperty() {
        return false;
    }

    boolean isChecked();

    boolean isDisabled();

    default boolean isFocusable() {
        return false;
    }

    default boolean isFocusableInTouchMode() {
        return false;
    }

    default boolean isScrollable() {
        return false;
    }

    void update(@NonNull UpdateType updateType, String str);
}
