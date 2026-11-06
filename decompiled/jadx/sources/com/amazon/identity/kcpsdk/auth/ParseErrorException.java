package com.amazon.identity.kcpsdk.auth;

import com.amazon.identity.kcpsdk.common.ParseError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ParseErrorException extends Exception {
    private static final long serialVersionUID = 1;
    final ParseError mError;

    public ParseErrorException(ParseError parseError) {
        this.mError = parseError;
    }
}
