package com.amazon.apl.android.providers.impl;

import android.content.Context;
import com.amazon.apl.android.providers.ILocalTimeOffsetProvider;
import com.amazon.apl.viewhost.config.DefaultTimeProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public class BroadcastLocalTimeOffsetProvider extends DefaultTimeProvider implements ILocalTimeOffsetProvider {
    public BroadcastLocalTimeOffsetProvider(Context context) {
        super(context);
    }
}
