package expo.modules.kotlin.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lexpo/modules/kotlin/exception/ArgumentCastException;", "Lexpo/modules/kotlin/exception/DecoratedException;", "argDesiredType", "Lkotlin/reflect/KType;", "argIndex", "", "providedType", "", "cause", "Lexpo/modules/kotlin/exception/CodedException;", "<init>", "(Lkotlin/reflect/KType;ILjava/lang/String;Lexpo/modules/kotlin/exception/CodedException;)V", "Companion", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ArgumentCastException extends DecoratedException {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ArgumentCastException(@org.jetbrains.annotations.NotNull kotlin.reflect.KType r3, int r4, @org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull expo.modules.kotlin.exception.CodedException r6) {
        /*
            r2 = this;
            r3.getClass()
            r5.getClass()
            r6.getClass()
            expo.modules.kotlin.exception.ArgumentCastException$Companion r0 = expo.modules.kotlin.exception.ArgumentCastException.INSTANCE
            int r4 = r4 + 1
            java.lang.String r4 = r0.formatOrdinalNumber(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " argument cannot be cast to type "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = " (received "
            r0.append(r3)
            java.lang.String r3 = ")"
            java.lang.String r3 = defpackage.a$$ExternalSyntheticOutline0.m(r0, r5, r3)
            r2.<init>(r3, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.exception.ArgumentCastException.<init>(kotlin.reflect.KType, int, java.lang.String, expo.modules.kotlin.exception.CodedException):void");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/kotlin/exception/ArgumentCastException$Companion;", "", "<init>", "()V", "formatOrdinalNumber", "", "number", "", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String formatOrdinalNumber(int number) {
            int i = number % 100;
            String str = "th";
            if (11 > i || i >= 14) {
                int i2 = number % 10;
                if (i2 == 1) {
                    str = "st";
                } else if (i2 == 2) {
                    str = "nd";
                } else if (i2 == 3) {
                    str = "rd";
                }
            }
            return number + str;
        }

        private Companion() {
        }
    }
}
