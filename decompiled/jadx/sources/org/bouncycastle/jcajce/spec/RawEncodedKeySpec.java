package org.bouncycastle.jcajce.spec;

import com.amazon.alexa.capabilityagent.cardstudiosurface.common.SurfaceWire;
import java.security.spec.EncodedKeySpec;

/* loaded from: classes11.dex */
public class RawEncodedKeySpec extends EncodedKeySpec {
    public RawEncodedKeySpec(byte[] bArr) {
        super(bArr);
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return SurfaceWire.RENDER_TYPE_RAW;
    }
}
