package com.amazon.identity.mobi.common.ui;

import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class UIMetrics {
    public static final String DROP_MESSAGE_FROM_QUEUE_HEAD = "MAP_DROP_MESSAGE_FROM_QUEUE_HEAD";
    public static final String DROP_MESSAGE_FROM_QUEUE_TAIL = "MAP_DROP_MESSAGE_FROM_QUEUE_TAIL";

    public static String buildMetricForUiTask(String str, UITask... uITaskArr) {
        if (uITaskArr == null) {
            return str;
        }
        StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, ":");
        int i = 0;
        for (UITask uITask : uITaskArr) {
            m1m.append(uITask.getEntryPoint());
            if (i < uITaskArr.length - 1) {
                m1m.append(":");
            }
            i++;
        }
        return m1m.toString();
    }
}
