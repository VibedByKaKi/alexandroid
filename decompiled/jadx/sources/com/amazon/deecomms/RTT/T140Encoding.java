package com.amazon.deecomms.RTT;

import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.api.CommsIdentityManager;
import com.amazon.deecomms.common.Constants;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class T140Encoding {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, CommsIdentityManager.class);

    private T140Encoding() {
    }

    public static String decode(byte[] bArr) {
        String str = new String(bArr, StandardCharsets.UTF_8);
        LOG.d("Deocoded string".concat(str));
        return str;
    }

    public static byte[] encode(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        sb.append(charSequence);
        return sb.toString().getBytes(StandardCharsets.UTF_8);
    }
}
