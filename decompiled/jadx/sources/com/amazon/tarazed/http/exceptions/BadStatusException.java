package com.amazon.tarazed.http.exceptions;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/tarazed/http/exceptions/BadStatusException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "response", "", "statusCode", "", "(Ljava/lang/String;I)V", "getResponse", "()Ljava/lang/String;", "getStatusCode", "()I", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BadStatusException extends IllegalStateException {

    @NotNull
    private final String response;
    private final int statusCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadStatusException(@NotNull String str, int i) {
        super("Failed request with status code " + i + ":\n" + str);
        str.getClass();
        this.response = str;
        this.statusCode = i;
    }

    @NotNull
    public final String getResponse() {
        return this.response;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }
}
