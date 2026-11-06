package com.amazon.ptz.util;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.UUID;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DirectiveHelpers {
    private static final int CORRELATION_TOKEN_LENGTH = 49;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private DirectiveHelpers() {
    }

    public static String generateCorrelationToken() {
        return RandomAlphanumericString.getString(49);
    }

    public static UUID generateUUID() {
        return UUID.randomUUID();
    }
}
