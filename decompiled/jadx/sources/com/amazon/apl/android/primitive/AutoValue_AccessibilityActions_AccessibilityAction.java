package com.amazon.apl.android.primitive;

import com.amazon.apl.android.primitive.AccessibilityActions;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_AccessibilityActions_AccessibilityAction extends AccessibilityActions.AccessibilityAction {
    private final String label;
    private final String name;

    public AutoValue_AccessibilityActions_AccessibilityAction(String str, String str2) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null name");
            throw null;
        }
        this.name = str;
        if (str2 != null) {
            this.label = str2;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null label");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AccessibilityActions.AccessibilityAction) {
            AccessibilityActions.AccessibilityAction accessibilityAction = (AccessibilityActions.AccessibilityAction) obj;
            if (this.name.equals(accessibilityAction.name()) && this.label.equals(accessibilityAction.label())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.label.hashCode() ^ ((this.name.hashCode() ^ 1000003) * 1000003);
    }

    @Override // com.amazon.apl.android.primitive.AccessibilityActions.AccessibilityAction
    public String label() {
        return this.label;
    }

    @Override // com.amazon.apl.android.primitive.AccessibilityActions.AccessibilityAction
    public String name() {
        return this.name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityAction{name=");
        sb.append(this.name);
        sb.append(", label=");
        return a$$ExternalSyntheticOutline0.m(sb, this.label, StringSubstitutor.DEFAULT_VAR_END);
    }
}
