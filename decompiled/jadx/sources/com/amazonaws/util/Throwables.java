package com.amazonaws.util;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.logging.LogFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum Throwables {
    ;

    private static final int MAX_RETRY = 1000;

    public static Throwable getRootCause(Throwable th) {
        if (th == null) {
            return th;
        }
        int i = 0;
        Throwable th2 = th;
        while (i < 1000) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                return th2;
            }
            i++;
            th2 = cause;
        }
        LogFactory.getLog((Class<?>) Throwables.class).debug("Possible circular reference detected on " + th.getClass() + ": [" + th + MarkdownConstants.RIGHT_BRACKET);
        return th;
    }
}
