package com.facebook.drawee.interfaces;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import javax.annotation.concurrent.ThreadSafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ThreadSafe
/* loaded from: classes6.dex */
public interface DraweeHierarchy {
    Rect getBounds();

    Drawable getTopLevelDrawable();
}
