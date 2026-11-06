package com.here.sdk.mapview.datasource;

import com.facebook.imageutils.JfifUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TileKey {
    public int level;
    public int x;
    public int y;

    public TileKey(int i, int i2, int i3) {
        this.x = i;
        this.y = i2;
        this.level = i3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TileKey)) {
            return false;
        }
        TileKey tileKey = (TileKey) obj;
        return this.x == tileKey.x && this.y == tileKey.y && this.level == tileKey.level;
    }

    public int hashCode() {
        return ((((JfifUtil.MARKER_EOI + this.x) * 31) + this.y) * 31) + this.level;
    }
}
