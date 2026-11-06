package com.google.zxing.pdf417.encoder;

import com.google.zxing.WriterException;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class PDF417HighLevelEncoderTestAdapter {
    private PDF417HighLevelEncoderTestAdapter() {
    }

    public static String encodeHighLevel(String str, Compaction compaction, Charset charset, boolean z) throws WriterException {
        return PDF417HighLevelEncoder.encodeHighLevel(str, compaction, charset, z);
    }
}
