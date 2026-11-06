package com.facebook.debug.holder;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/debug/holder/PrinterHolder;", "", "<init>", "()V", "printer", "Lcom/facebook/debug/holder/Printer;", "getPrinter$annotations", "getPrinter", "()Lcom/facebook/debug/holder/Printer;", "setPrinter", "(Lcom/facebook/debug/holder/Printer;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PrinterHolder {

    @NotNull
    public static final PrinterHolder INSTANCE = new PrinterHolder();

    @NotNull
    private static Printer printer = NoopPrinter.INSTANCE;

    private PrinterHolder() {
    }

    @NotNull
    public static final Printer getPrinter() {
        return printer;
    }

    public static final void setPrinter(@NotNull Printer printer2) {
        printer2.getClass();
        printer = printer2;
    }

    @JvmStatic
    public static /* synthetic */ void getPrinter$annotations() {
    }
}
