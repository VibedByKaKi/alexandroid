package com.facebook.common.closeables;

import com.facebook.react.ReactHost$$ExternalSyntheticLambda0;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0004"}, d2 = {"closeableCleanupFunction", "Lkotlin/Function1;", "Ljava/io/Closeable;", "", "fbcore_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutoCleanupDelegateKt {

    @NotNull
    private static final Function1<Closeable, Unit> closeableCleanupFunction = new ReactHost$$ExternalSyntheticLambda0(10);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit closeableCleanupFunction$lambda$0(Closeable closeable) {
        closeable.getClass();
        closeable.close();
        return Unit.INSTANCE;
    }
}
