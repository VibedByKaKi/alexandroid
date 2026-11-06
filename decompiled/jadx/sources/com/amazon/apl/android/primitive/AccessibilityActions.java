package com.amazon.apl.android.primitive;

import com.amazon.apl.enums.APLEnum;
import com.amazon.common.BoundObject;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class AccessibilityActions implements IterableProperty<AccessibilityAction> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class AccessibilityAction {
        public static AccessibilityAction create(String str, String str2) {
            return new AutoValue_AccessibilityActions_AccessibilityAction(str, str2);
        }

        public abstract String label();

        public abstract String name();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AccessibilityActionGetter extends ArrayGetter<AccessibilityActions, AccessibilityAction> {
        public AccessibilityActionGetter(BoundObject boundObject, APLEnum aPLEnum) {
            super(boundObject, aPLEnum);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.apl.android.primitive.ArrayGetter
        public AccessibilityActions builder() {
            return new AutoValue_AccessibilityActions(new ArrayList(size()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.apl.android.primitive.ArrayGetter
        public AccessibilityAction get(int i) {
            return AccessibilityAction.create(AccessibilityActions.nGetAccessibilityActionNameAt(getNativeHandle(), getIndex(), i), AccessibilityActions.nGetAccessibilityActionLabelAt(getNativeHandle(), getIndex(), i));
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AccessibilityActionGetterV2 extends SimpleArrayGetter<AccessibilityActions, AccessibilityAction> {
        private AccessibilityActionGetterV2() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.apl.android.primitive.SimpleArrayGetter
        public AccessibilityActions builder() {
            return new AutoValue_AccessibilityActions(new ArrayList());
        }
    }

    public static AccessibilityActions create() {
        return (AccessibilityActions) IterableProperty.create(new AccessibilityActionGetterV2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native String nGetAccessibilityActionLabelAt(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native String nGetAccessibilityActionNameAt(long j, int i, int i2);

    public static AccessibilityActions create(BoundObject boundObject, APLEnum aPLEnum) {
        return (AccessibilityActions) IterableProperty.create(new AccessibilityActionGetter(boundObject, aPLEnum));
    }
}
