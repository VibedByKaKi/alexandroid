package expo.modules.kotlin.exception;

import expo.modules.core.interfaces.DoNotStrip;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lexpo/modules/kotlin/exception/JavaScriptEvaluateException;", "Lexpo/modules/kotlin/exception/CodedException;", "message", "", "jsStack", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getJsStack", "()Ljava/lang/String;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DoNotStrip
/* loaded from: classes9.dex */
public final class JavaScriptEvaluateException extends CodedException {

    @NotNull
    private final String jsStack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaScriptEvaluateException(@NotNull String str, @NotNull String str2) {
        super(StringsKt.trimIndent("\n  Cannot evaluate JavaScript code: " + str + "\n  " + str2 + "\n  "), null, 2, null);
        str.getClass();
        str2.getClass();
        this.jsStack = str2;
    }

    @NotNull
    public final String getJsStack() {
        return this.jsStack;
    }
}
