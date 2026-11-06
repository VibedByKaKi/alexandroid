package com.amazon.identity.platform.metric.csm;

import android.content.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface MAPCSMTransition {
    void addAttribute(String str, String str2);

    void addTag(String str);

    long mark(String str);

    void setRequestId(String str);

    void stopTransition(Context context);
}
