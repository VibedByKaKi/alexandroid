package com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.selfbargein;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"countWords", "", "text", "", "voice_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class InflightCaptionsKt {
    public static final int countWords(@NotNull CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (!Character.isWhitespace(charSequence.charAt(i2))) {
                z = true;
            } else if (z) {
                i++;
                z = false;
            }
        }
        return z ? i + 1 : i;
    }
}
