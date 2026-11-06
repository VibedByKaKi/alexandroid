package com.google.devtools.ksp;

import com.amazon.alexa.hho.navigation.constants.DeeplinkConstants;
import com.google.devtools.ksp.symbol.KSType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@KspExperimental
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/devtools/ksp/KSTypeNotPresentException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "ksType", "Lcom/google/devtools/ksp/symbol/KSType;", "cause", "", "(Lcom/google/devtools/ksp/symbol/KSType;Ljava/lang/Throwable;)V", "getKsType", "()Lcom/google/devtools/ksp/symbol/KSType;", DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.API_QUERY_PARAM_KEY}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class KSTypeNotPresentException extends RuntimeException {

    @NotNull
    private final KSType ksType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KSTypeNotPresentException(@NotNull KSType kSType, @NotNull Throwable th) {
        super(th);
        kSType.getClass();
        th.getClass();
        this.ksType = kSType;
    }

    @NotNull
    public final KSType getKsType() {
        return this.ksType;
    }
}
