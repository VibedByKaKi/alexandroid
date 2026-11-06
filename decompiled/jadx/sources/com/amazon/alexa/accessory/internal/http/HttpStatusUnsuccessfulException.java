package com.amazon.alexa.accessory.internal.http;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class HttpStatusUnsuccessfulException extends RuntimeException {
    private final int statusCode;

    public HttpStatusUnsuccessfulException(int i) {
        super(a$$ExternalSyntheticOutline0.m(i, "Response has status code: "));
        this.statusCode = i;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public HttpStatusUnsuccessfulException(String str, int i) {
        super(TableInfo$$ExternalSyntheticOutline0.m(i, str, " Response has status code: "));
        this.statusCode = i;
    }
}
