package org.openjdk.tools.javah;

import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class InternalError extends Error {
    private static final long serialVersionUID = 8411861562497165022L;

    public InternalError(String str, Throwable th) {
        super(a$$ExternalSyntheticOutline0.m("Internal error: ", str));
        initCause(th);
    }
}
