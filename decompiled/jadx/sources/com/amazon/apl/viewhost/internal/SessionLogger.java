package com.amazon.apl.viewhost.internal;

import android.util.Log;
import com.amazon.apl.android.Session;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SessionLogger {
    private static final Session.LogEntrySource SOURCE = Session.LogEntrySource.VIEW;
    private final String mTag;
    private WeakReference<Session> mWeakSession;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.apl.viewhost.internal.SessionLogger$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$apl$android$Session$LogEntryLevel;

        static {
            int[] iArr = new int[Session.LogEntryLevel.values().length];
            $SwitchMap$com$amazon$apl$android$Session$LogEntryLevel = iArr;
            try {
                iArr[Session.LogEntryLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$apl$android$Session$LogEntryLevel[Session.LogEntryLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$apl$android$Session$LogEntryLevel[Session.LogEntryLevel.WARN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$apl$android$Session$LogEntryLevel[Session.LogEntryLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public SessionLogger(String str, Session session) {
        this.mTag = str;
        this.mWeakSession = new WeakReference<>(session);
    }

    private void log(Session.LogEntryLevel logEntryLevel, String str, Throwable th) {
        String str2;
        Session session = this.mWeakSession.get();
        StringBuilder sb = new StringBuilder("APL:");
        if (session == null) {
            str2 = "";
        } else {
            str2 = session.getLogId() + ":";
        }
        String m = a$$ExternalSyntheticOutline0.m(sb, str2, str);
        int i = AnonymousClass1.$SwitchMap$com$amazon$apl$android$Session$LogEntryLevel[logEntryLevel.ordinal()];
        if (i == 2) {
            Log.i(this.mTag, m);
        } else if (i == 3) {
            Log.w(this.mTag, m, th);
        } else if (i == 4) {
            Log.e(this.mTag, m, th);
        }
        if (session != null) {
            session.write(logEntryLevel, SOURCE, m);
        }
    }

    public void clear() {
        this.mWeakSession.clear();
    }

    public void d(String str) {
        log(Session.LogEntryLevel.DEBUG, str, null);
    }

    public void e(String str) {
        log(Session.LogEntryLevel.ERROR, str, null);
    }

    public void i(String str) {
        log(Session.LogEntryLevel.INFO, str, null);
    }

    public void setSession(Session session) {
        this.mWeakSession = new WeakReference<>(session);
    }

    public void w(String str) {
        log(Session.LogEntryLevel.WARN, str, null);
    }

    public void e(String str, Throwable th) {
        log(Session.LogEntryLevel.ERROR, str, th);
    }

    public void w(String str, Throwable th) {
        log(Session.LogEntryLevel.WARN, str, th);
    }

    public SessionLogger(String str) {
        this(str, null);
    }
}
