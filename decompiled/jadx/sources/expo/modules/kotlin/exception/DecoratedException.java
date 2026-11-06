package expo.modules.kotlin.exception;

import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lexpo/modules/kotlin/exception/DecoratedException;", "Lexpo/modules/kotlin/exception/CodedException;", "message", "", "cause", "<init>", "(Ljava/lang/String;Lexpo/modules/kotlin/exception/CodedException;)V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public class DecoratedException extends CodedException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DecoratedException(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull expo.modules.kotlin.exception.CodedException r6) {
        /*
            r4 = this;
            r5.getClass()
            r6.getClass()
            java.lang.String r0 = r6.getCode()
            java.lang.String r1 = java.lang.System.lineSeparator()
            java.lang.String r2 = r6.getLocalizedMessage()
            if (r2 == 0) goto L15
            goto L16
        L15:
            r2 = r6
        L16:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r1)
            java.lang.String r5 = "→ Caused by: "
            r3.append(r5)
            r3.append(r2)
            java.lang.String r5 = r3.toString()
            r4.<init>(r0, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.exception.DecoratedException.<init>(java.lang.String, expo.modules.kotlin.exception.CodedException):void");
    }
}
