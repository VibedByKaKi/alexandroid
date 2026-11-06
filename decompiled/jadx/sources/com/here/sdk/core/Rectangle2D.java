package com.here.sdk.core;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Rectangle2D {

    @NonNull
    public Point2D origin;

    @NonNull
    public Size2D size;

    public Rectangle2D(@NonNull Point2D point2D, @NonNull Size2D size2D) {
        this.origin = point2D;
        this.size = size2D;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Rectangle2D)) {
            return false;
        }
        Rectangle2D rectangle2D = (Rectangle2D) obj;
        return Objects.equals(this.origin, rectangle2D.origin) && Objects.equals(this.size, rectangle2D.size);
    }

    public int hashCode() {
        Point2D point2D = this.origin;
        int hashCode = (JfifUtil.MARKER_EOI + (point2D != null ? point2D.hashCode() : 0)) * 31;
        Size2D size2D = this.size;
        return hashCode + (size2D != null ? size2D.hashCode() : 0);
    }
}
