package org.chromium.net.apihelpers;

import org.bouncycastle.asn1.ocsp.CrlID$$ExternalSyntheticBUOutline0;
import org.chromium.net.UrlResponseInfo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class RedirectHandlers {
    private RedirectHandlers() {
    }

    public static RedirectHandler alwaysFollow() {
        return new CrlID$$ExternalSyntheticBUOutline0(29);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$alwaysFollow$1(UrlResponseInfo urlResponseInfo, String str) throws Exception {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$neverFollow$0(UrlResponseInfo urlResponseInfo, String str) throws Exception {
        return false;
    }

    public static RedirectHandler neverFollow() {
        return new CrlID$$ExternalSyntheticBUOutline0(28);
    }
}
