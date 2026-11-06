package com.amazon.alexa.mobilytics.session;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.mobilytics.identity.MobilyticsRoute;
import com.amazon.alexa.mobilytics.util.Log;
import com.amazon.alexa.mobilytics.util.Utils;
import com.amazon.dee.sdk.iotsoftap.Constants;
import com.google.common.base.Preconditions;
import defpackage.a$$ExternalSyntheticOutline0;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import rx.Observable;
import rx.subjects.PublishSubject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class Session implements MobilyticsSession, CompoundRouteProvider, Cloneable {
    public static final String COMPOUND_ROUTE_DELIMITER = "#";
    public static final int COMPOUND_ROUTE_SIZE_LIMIT = 1024;
    public static final String DEFAULT_COMPOUND_ROUTE = "";
    private static final String SESSION_ID_DATE_FORMAT = "yyyyMMdd-HHmmssSSS";
    private static final char SESSION_ID_DELIMITER = '-';
    private static final char SESSION_ID_PAD_CHAR = '_';
    private static final int SESSION_ID_PREFIX_LENGTH = 8;
    private String compoundRoute;
    private String compoundRouteTimestamp;
    private String id;
    private final DateFormat sessionIdFormat;
    private final String sessionIdPrefix;
    private final PublishSubject<String> sessionIdSubject;
    private final PublishSubject<Session> sessionSubject;
    private long startTime;
    private int state;
    private long stopTime;
    private static int[][] TRANSITIONS = {new int[]{1, 4, 4, 4}, new int[]{4, 2, 4, 0}, new int[]{4, 4, 3, 0}, new int[]{4, 2, 4, 0}, new int[]{4, 4, 4, 4}};
    private static final String TAG = Log.tag((Class<?>) Session.class);

    public Session(@NonNull String str, @NonNull long j, @NonNull long j2, @NonNull int i) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(SESSION_ID_DATE_FORMAT, Locale.US);
        this.sessionIdFormat = simpleDateFormat;
        this.sessionSubject = PublishSubject.create();
        this.sessionIdSubject = PublishSubject.create();
        this.startTime = 0L;
        this.stopTime = 0L;
        this.compoundRoute = "";
        this.compoundRouteTimestamp = "";
        this.state = 0;
        String str2 = (String) Preconditions.checkNotNull(str);
        this.sessionIdPrefix = str2;
        this.startTime = j;
        this.stopTime = j2;
        this.state = i;
        Log.d(TAG, "MobilyticsSession initialized with prefix [%s], startTime [%d], stopTime [%d], state [%d]", str2, Long.valueOf(j), Long.valueOf(this.stopTime), Integer.valueOf(this.state));
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(Constants.UTC));
        if (this.startTime > 0) {
            generateSessionId();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (r5 != 3) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void triggerEvent(int r5) {
        /*
            r4 = this;
            java.lang.String r0 = com.amazon.alexa.mobilytics.session.Session.TAG
            java.lang.String r1 = r4.id
            int r2 = r4.state
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r2 = "[%s] Current MobilyticsSession state is %d. Event received is %d"
            com.amazon.alexa.mobilytics.util.Log.d(r0, r2, r1)
            int[][] r1 = com.amazon.alexa.mobilytics.session.Session.TRANSITIONS
            int r2 = r4.state
            r1 = r1[r2]
            r1 = r1[r5]
            r2 = 4
            if (r1 == r2) goto L70
            if (r5 == 0) goto L3a
            r2 = 1
            if (r5 == r2) goto L33
            r2 = 2
            if (r5 == r2) goto L2e
            r2 = 3
            if (r5 == r2) goto L33
            goto L48
        L2e:
            r2 = 0
            r4.stopTime = r2
            goto L48
        L33:
            long r2 = java.lang.System.currentTimeMillis()
            r4.stopTime = r2
            goto L48
        L3a:
            java.lang.String r5 = "MobilyticsSession start event called"
            com.amazon.alexa.mobilytics.util.Log.d(r0, r5)
            long r2 = java.lang.System.currentTimeMillis()
            r4.startTime = r2
            r4.generateSessionId()
        L48:
            r4.state = r1
            java.lang.String r5 = "MobilyticsSession change callback for state [%d]"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.CloneNotSupportedException -> L63
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.CloneNotSupportedException -> L63
            com.amazon.alexa.mobilytics.util.Log.d(r0, r5, r1)     // Catch: java.lang.CloneNotSupportedException -> L63
            rx.subjects.PublishSubject<com.amazon.alexa.mobilytics.session.Session> r5 = r4.sessionSubject     // Catch: java.lang.CloneNotSupportedException -> L63
            java.lang.Object r4 = r4.clone()     // Catch: java.lang.CloneNotSupportedException -> L63
            com.amazon.alexa.mobilytics.session.Session r4 = (com.amazon.alexa.mobilytics.session.Session) r4     // Catch: java.lang.CloneNotSupportedException -> L63
            r5.onNext(r4)     // Catch: java.lang.CloneNotSupportedException -> L63
            return
        L63:
            r4 = move-exception
            java.lang.String r5 = com.amazon.alexa.mobilytics.session.Session.TAG
            java.lang.String r0 = "[MobilyticsSession] Unable to create session clone"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            com.amazon.alexa.mobilytics.util.Log.e(r5, r0, r4)
            return
        L70:
            java.lang.String r4 = "Illegal state change occurred in MobilyticsSession"
            com.amazon.alexa.mobilytics.util.Log.e(r0, r4)
            java.lang.String r4 = "illegal event"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.mobilytics.session.Session.triggerEvent(int):void");
    }

    public void appendRoute(MobilyticsRoute mobilyticsRoute) {
        if (mobilyticsRoute != null) {
            int length = mobilyticsRoute.currentRoute().length() + this.compoundRoute.length();
            String str = this.compoundRoute;
            if (length > 1024) {
                Log.i(TAG, "Cannot append route. compound route length exceeded. Length:" + str.length());
                return;
            }
            String str2 = TAG;
            Log.d(str2, "current compound route: " + str);
            if ("".equals(this.compoundRoute)) {
                this.compoundRoute = mobilyticsRoute.currentRoute();
                this.compoundRouteTimestamp = Long.toString(System.currentTimeMillis());
            } else {
                this.compoundRoute = a$$ExternalSyntheticOutline0.m$1(this.compoundRoute, "#", mobilyticsRoute.currentRoute());
                this.compoundRouteTimestamp = a$$ExternalSyntheticOutline0.m$1(this.compoundRouteTimestamp, "#", Long.toString(System.currentTimeMillis()));
            }
            Log.d(str2, "new compound route: " + this.compoundRoute);
        }
    }

    public void clearCompoundRoute() {
        if (this.compoundRoute.isEmpty()) {
            return;
        }
        this.compoundRoute = "";
        this.compoundRouteTimestamp = "";
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // com.amazon.alexa.mobilytics.session.MobilyticsSession
    public long elapsedTime() {
        int i = this.state;
        long currentTimeMillis = (i == 0 || i == 2) ? this.stopTime : System.currentTimeMillis();
        long j = this.startTime;
        if (j == 0 || currentTimeMillis < j) {
            return 0L;
        }
        return currentTimeMillis - j;
    }

    @VisibleForTesting
    public void generateSessionId() {
        String str = Utils.trimOrPadString(this.sessionIdPrefix, 8, SESSION_ID_PAD_CHAR) + '-' + this.sessionIdFormat.format(Long.valueOf(this.startTime));
        this.id = str;
        Log.v(TAG, "[%s] Allocated new MobilyticsSession ID", str);
        this.sessionIdSubject.onNext(id());
    }

    @Override // com.amazon.alexa.mobilytics.session.CompoundRouteProvider
    public String getCompoundRoute() {
        return this.compoundRoute;
    }

    @Override // com.amazon.alexa.mobilytics.session.CompoundRouteProvider
    public String getCompoundRouteTimestamp() {
        return this.compoundRouteTimestamp;
    }

    @Override // com.amazon.alexa.mobilytics.session.MobilyticsSession
    @Nullable
    public String id() {
        return this.id;
    }

    @Override // com.amazon.alexa.mobilytics.session.MobilyticsSession
    public Observable<String> onIdChanged() {
        return this.sessionIdSubject.asObservable();
    }

    public Observable<Session> onStateChanged() {
        return this.sessionSubject.asObservable();
    }

    public void pause() {
        triggerEvent(1);
        Log.d(TAG, "Going to clear compound route - " + this.compoundRoute);
        clearCompoundRoute();
    }

    public void resume() {
        triggerEvent(2);
    }

    public void start() {
        triggerEvent(0);
    }

    @Override // com.amazon.alexa.mobilytics.session.MobilyticsSession
    public long startTime() {
        return this.startTime;
    }

    @Override // com.amazon.alexa.mobilytics.session.MobilyticsSession
    public int state() {
        return this.state;
    }

    public void stop() {
        triggerEvent(3);
    }

    @Override // com.amazon.alexa.mobilytics.session.MobilyticsSession
    public long stopTime() {
        return this.stopTime;
    }

    public Session(@NonNull String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(SESSION_ID_DATE_FORMAT, Locale.US);
        this.sessionIdFormat = simpleDateFormat;
        this.sessionSubject = PublishSubject.create();
        this.sessionIdSubject = PublishSubject.create();
        this.startTime = 0L;
        this.stopTime = 0L;
        this.compoundRoute = "";
        this.compoundRouteTimestamp = "";
        this.state = 0;
        this.sessionIdPrefix = str;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(Constants.UTC));
    }

    public Session(@NonNull Session session) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(SESSION_ID_DATE_FORMAT, Locale.US);
        this.sessionIdFormat = simpleDateFormat;
        this.sessionSubject = PublishSubject.create();
        this.sessionIdSubject = PublishSubject.create();
        this.startTime = 0L;
        this.stopTime = 0L;
        this.compoundRoute = "";
        this.compoundRouteTimestamp = "";
        this.state = 0;
        this.sessionIdPrefix = session.sessionIdPrefix;
        this.startTime = session.startTime;
        this.stopTime = session.stopTime;
        this.state = session.state;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(Constants.UTC));
    }
}
