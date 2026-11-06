package autovalue.shaded.com.google.common.base;

import autovalue.shaded.com.google.common.annotations.GwtCompatible;
import autovalue.shaded.com.google.common.annotations.GwtIncompatible;
import autovalue.shaded.com.google.common.annotations.J2ktIncompatible;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes15.dex */
public final class Charsets {

    @GwtIncompatible
    @J2ktIncompatible
    public static final Charset US_ASCII = Charset.forName("US-ASCII");
    public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    public static final Charset UTF_8 = Charset.forName("UTF-8");

    @GwtIncompatible
    @J2ktIncompatible
    public static final Charset UTF_16BE = Charset.forName("UTF-16BE");

    @GwtIncompatible
    @J2ktIncompatible
    public static final Charset UTF_16LE = Charset.forName("UTF-16LE");

    @GwtIncompatible
    @J2ktIncompatible
    public static final Charset UTF_16 = Charset.forName("UTF-16");

    private Charsets() {
    }
}
