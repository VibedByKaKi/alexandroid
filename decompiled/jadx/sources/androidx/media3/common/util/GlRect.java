package androidx.media3.common.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UnstableApi
/* loaded from: classes14.dex */
public final class GlRect {
    public int bottom;
    public int left;
    public int right;
    public int top;

    public GlRect(int i, int i2, int i3, int i4) {
        Assertions.checkArgument(i <= i3 && i2 <= i4);
        this.left = i;
        this.bottom = i2;
        this.right = i3;
        this.top = i4;
    }

    public GlRect(int i, int i2) {
        this(0, 0, i, i2);
    }
}
