package com.amazon.alexa.presence.bleconn.helpers;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class MathHelper {
    private MathHelper() {
    }

    public static int clamp(int i, int i2, int i3) {
        if (i2 <= i3) {
            return Math.max(i2, Math.min(i3, i));
        }
        Single$$ExternalSyntheticBUOutline0.m$3(ErrorUtils$$ExternalSyntheticOutline0.m(i2, i3, "min (", ") should not be greater than max (", MarkdownConstants.RIGHT_PARENTHESIS));
        return 0;
    }
}
