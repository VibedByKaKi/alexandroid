package com.amazon.identity.mobi.common.ui;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum UIType {
    TIV_APPROVAL(1),
    ATB_CONSENT_APPROVAL(0);

    private final int mPriority;
    private final int mUiPendingQueueCapacity = 1;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class UITypeComparator implements Comparator<UIType>, Serializable {
        @Override // java.util.Comparator
        public int compare(UIType uIType, UIType uIType2) {
            if (uIType.getPriority() < uIType2.getPriority()) {
                return -1;
            }
            return uIType.getPriority() > uIType2.getPriority() ? 1 : 0;
        }
    }

    UIType(int i) {
        this.mPriority = i;
    }

    public final int getPriority() {
        return this.mPriority;
    }

    public final int getUiPendingQueueCapacity() {
        return this.mUiPendingQueueCapacity;
    }
}
