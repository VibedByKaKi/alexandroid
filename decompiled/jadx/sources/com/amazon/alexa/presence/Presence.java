package com.amazon.alexa.presence;

import com.amazon.deecomms.remoteConfig.ArcusConfig;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class Presence {
    private static final String COMPONENT_NAME = "PresenceComponent";

    private Presence() {
    }

    private static String extractCallingClassFromStacktrace(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length < 2) {
            return null;
        }
        String[] split = stackTraceElementArr[1].getClassName().split(ArcusConfig.PATH_SEPARATOR);
        return split[split.length - 1];
    }

    public static String tag() {
        return a$$ExternalSyntheticOutline0.m("(PresenceComponent)", extractCallingClassFromStacktrace(new Throwable().fillInStackTrace().getStackTrace()));
    }
}
