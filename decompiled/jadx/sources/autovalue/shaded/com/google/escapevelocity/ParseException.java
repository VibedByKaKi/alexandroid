package autovalue.shaded.com.google.escapevelocity;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class ParseException extends RuntimeException {
    private static final long serialVersionUID = 1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ParseException(java.lang.String r2, java.lang.String r3, int r4, java.lang.String r5) {
        /*
            r1 = this;
            java.lang.String r0 = ", "
            java.lang.StringBuilder r2 = defpackage.a$$ExternalSyntheticOutline0.m1m(r2, r0)
            java.lang.String r3 = where(r3, r4)
            r2.append(r3)
            java.lang.String r3 = ", at text starting: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: autovalue.shaded.com.google.escapevelocity.ParseException.<init>(java.lang.String, java.lang.String, int, java.lang.String):void");
    }

    public static String where(String str, int i) {
        return str == null ? a$$ExternalSyntheticOutline0.m(i, "on line ") : DoubleList$$ExternalSyntheticOutline0.m(i, "on line ", " of ", str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ParseException(java.lang.String r2, java.lang.String r3, int r4) {
        /*
            r1 = this;
            java.lang.String r0 = ", "
            java.lang.StringBuilder r2 = defpackage.a$$ExternalSyntheticOutline0.m1m(r2, r0)
            java.lang.String r3 = where(r3, r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: autovalue.shaded.com.google.escapevelocity.ParseException.<init>(java.lang.String, java.lang.String, int):void");
    }
}
