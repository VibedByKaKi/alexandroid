package com.amazon.coral.google.common.base;

import com.amazon.coral.google.common.annotations.GwtCompatible;
import com.amazon.coral.google.common.annotations.GwtIncompatible;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public final class Charsets {

    @GwtIncompatible
    public static final Charset US_ASCII = Charset.forName("US-ASCII");
    public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    public static final Charset UTF_8 = Charset.forName("UTF-8");

    @GwtIncompatible
    public static final Charset UTF_16BE = Charset.forName("UTF-16BE");

    @GwtIncompatible
    public static final Charset UTF_16LE = Charset.forName("UTF-16LE");

    @GwtIncompatible
    public static final Charset UTF_16 = Charset.forName("UTF-16");

    private Charsets() {
    }
}
