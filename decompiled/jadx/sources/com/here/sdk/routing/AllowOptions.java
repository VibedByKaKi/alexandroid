package com.here.sdk.routing;

import com.facebook.imageutils.JfifUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class AllowOptions {
    public boolean allowHov = false;
    public boolean allowHot = false;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AllowOptions)) {
            return false;
        }
        AllowOptions allowOptions = (AllowOptions) obj;
        return this.allowHov == allowOptions.allowHov && this.allowHot == allowOptions.allowHot;
    }

    public int hashCode() {
        return ((JfifUtil.MARKER_EOI + (this.allowHov ? 79 : 97)) * 31) + (this.allowHot ? 79 : 97);
    }
}
