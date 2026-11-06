package com.amazon.apl.android.component.helper;

import android.view.View;
import androidx.annotation.NonNull;
import com.amazon.apl.android.Component;
import com.amazon.apl.enums.AccessibilityHidden;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ComponentViewAdapterAccessibilityHelper {
    private static final ComponentViewAdapterAccessibilityHelper INSTANCE = new ComponentViewAdapterAccessibilityHelper();

    private ComponentViewAdapterAccessibilityHelper() {
    }

    public static ComponentViewAdapterAccessibilityHelper getInstance() {
        return INSTANCE;
    }

    public void applyAccessibilityHidden(@NonNull Component component, @NonNull View view) {
        if (component.getAccessibilityHidden() == AccessibilityHidden.kAccessibilityHiddenYes.getIndex()) {
            view.setImportantForAccessibility(4);
        } else {
            view.setImportantForAccessibility(0);
        }
    }

    public void applyContentDescription(@NonNull Component component, @NonNull View view, boolean z) {
        StringBuilder sb = new StringBuilder();
        String accessibilityLabel = component.getAccessibilityLabel();
        if (accessibilityLabel != null) {
            sb.append(accessibilityLabel);
        }
        if (z) {
            String accessibilityAdjustableValue = component.getAccessibilityAdjustableValue();
            sb.append(" ");
            sb.append(accessibilityAdjustableValue);
        }
        view.setContentDescription(sb.toString());
    }
}
