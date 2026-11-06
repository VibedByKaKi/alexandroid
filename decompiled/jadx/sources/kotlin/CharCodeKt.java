package kotlin;

import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b\"\u001f\u0010\u0002\u001a\u00020\u0003*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Char", "", "code", "", "getCode$annotations", "(C)V", "getCode", "(C)I", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CharCodeKt {
    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final char Char(int i) {
        if (i >= 0 && i <= 65535) {
            return (char) i;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Invalid Char code: "));
        return (char) 0;
    }

    private static final int getCode(char c) {
        return c;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    public static /* synthetic */ void getCode$annotations(char c) {
    }
}
