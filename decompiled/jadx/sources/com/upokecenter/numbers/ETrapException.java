package com.upokecenter.numbers;

import com.amazon.alexa.mobile.assistant.client.metrics.RaUiEventMetricsAdapter;
import com.amazon.alexa.ra.core.metrics.InteractionLabel;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class ETrapException extends ArithmeticException {
    private static final long serialVersionUID = 1;
    private final EContext ctx;
    private final int error;
    private final int errors;
    private final Object result;

    public ETrapException(int i, int i2, EContext eContext, Object obj) {
        super(FlagToMessage(i));
        if ((i & i2) != i2) {
            Single$$ExternalSyntheticBUOutline0.m$3("flags doesn't include flag");
            throw null;
        }
        this.error = i2;
        this.errors = i;
        this.ctx = eContext == null ? null : eContext.Copy();
        this.result = obj;
    }

    private static String FlagToMessage(int i) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (int i2 = 0; i2 < 32; i2++) {
            int i3 = 1 << i2;
            if ((i & i3) != 0) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(i3 == 32 ? "Clamped" : i3 == 128 ? "DivideByZero" : i3 == 1 ? "Inexact" : i3 == 64 ? RaUiEventMetricsAdapter.INVALID_METRIC_NAME_SUFFIX : i3 == 16 ? InteractionLabel.OVERFLOW : i3 == 2 ? "Rounded" : i3 == 4 ? "Subnormal" : i3 == 8 ? "Underflow" : "Trap");
                z = false;
            }
        }
        return sb.toString();
    }

    public boolean HasError(int i) {
        return (getError() & i) == i;
    }

    public final EContext getContext() {
        return this.ctx;
    }

    public final int getError() {
        return this.error;
    }

    public final int getErrors() {
        return this.errors;
    }

    public final Object getResult() {
        return this.result;
    }

    public ETrapException(String str) {
        super(str);
        this.error = 64;
        this.errors = 64;
        this.ctx = null;
        this.result = null;
    }

    public ETrapException(String str, Throwable th) {
        super(str);
        initCause(th);
        this.error = 64;
        this.errors = 64;
        EContext eContext = this.ctx;
        this.ctx = eContext == null ? null : eContext.Copy();
        this.result = null;
    }

    public ETrapException(int i, EContext eContext, Object obj) {
        this(i, i, eContext, obj);
    }

    public ETrapException() {
        this(FlagToMessage(64));
    }
}
