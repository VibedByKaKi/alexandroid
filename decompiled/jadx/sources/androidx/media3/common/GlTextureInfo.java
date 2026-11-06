package androidx.media3.common;

import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UnstableApi
/* loaded from: classes14.dex */
public final class GlTextureInfo {
    public static final GlTextureInfo UNSET = new GlTextureInfo(-1, -1, -1, -1, -1);
    public final int fboId;
    public final int height;
    public final int rboId;
    public final int texId;
    public final int width;

    public GlTextureInfo(int i, int i2, int i3, int i4, int i5) {
        this.texId = i;
        this.fboId = i2;
        this.rboId = i3;
        this.width = i4;
        this.height = i5;
    }

    public void release() throws GlUtil.GlException {
        int i = this.texId;
        if (i != -1) {
            GlUtil.deleteTexture(i);
        }
        int i2 = this.fboId;
        if (i2 != -1) {
            GlUtil.deleteFbo(i2);
        }
        int i3 = this.rboId;
        if (i3 != -1) {
            GlUtil.deleteRbo(i3);
        }
    }
}
