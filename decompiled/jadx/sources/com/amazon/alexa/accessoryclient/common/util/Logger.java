package com.amazon.alexa.accessoryclient.common.util;

import com.amazon.alexa.accessory.internal.util.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\b\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/util/Logger;", "", "()V", "d", "", "stringFun", "Lkotlin/Function0;", "", "e", "v", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Logger {

    @NotNull
    public static final Logger INSTANCE = new Logger();

    private Logger() {
    }

    public final void d(@NotNull Function0<String> stringFun) {
        stringFun.getClass();
        if (com.amazon.alexa.accessory.internal.util.Logger.shouldLog(Logger.Level.DEBUG)) {
            com.amazon.alexa.accessory.internal.util.Logger.d(stringFun.invoke());
        }
    }

    public final void e(@NotNull Function0<String> stringFun) {
        stringFun.getClass();
        com.amazon.alexa.accessory.internal.util.Logger.e(stringFun.invoke());
    }

    public final void v(@NotNull Function0<String> stringFun) {
        stringFun.getClass();
        if (com.amazon.alexa.accessory.internal.util.Logger.shouldLog(Logger.Level.VERBOSE)) {
            com.amazon.alexa.accessory.internal.util.Logger.v(stringFun.invoke());
        }
    }
}
