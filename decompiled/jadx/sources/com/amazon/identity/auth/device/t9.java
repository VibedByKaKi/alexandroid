package com.amazon.identity.auth.device;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class t9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f971a;
    public final String b;

    public t9(String str, String str2) {
        this.f971a = str;
        this.b = str2;
    }

    public final String toString() {
        String str = this.f971a;
        if (str == null) {
            str = "none";
        }
        String str2 = this.b;
        return a$$ExternalSyntheticOutline0.m(MarkdownConstants.LEFT_BRACKET, str, ",", str2 != null ? str2 : "none", MarkdownConstants.RIGHT_BRACKET);
    }
}
