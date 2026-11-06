package org.apache.logging.log4j.message;

import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface Message extends Serializable {
    @Deprecated
    default String getFormat() {
        return null;
    }

    String getFormattedMessage();

    Object[] getParameters();

    Throwable getThrowable();
}
