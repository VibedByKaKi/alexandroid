package com.amazon.alexa.mobilytics.connector;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.mobilytics.OwnerIdentifier;
import com.amazon.alexa.mobilytics.event.operational.DefaultMobilyticsOperationalEvent;
import com.amazon.alexa.mobilytics.event.operational.OperationalEventType;
import com.amazon.alexa.mobilytics.util.Log;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class EventEmitCountBuffer {
    private static final String COMPONENT = "mobilytics";
    private static final String EMIT_COUNT_EVENT_NAME = "EventEmitCount";
    private static final long FLUSH_WINDOW_IN_MS = 3600000;
    private static final String KEY_SEPARATOR = "|";
    private static final String NO_ROUTING_MODE = "-";
    private static final String NULL_OWNER = "null";
    private static final String SUB_COMPONENT = "emit_count";
    private static final String TAG = Log.tag((Class<?>) EventEmitCountBuffer.class);
    private final Map<String, Long> counts = new HashMap();
    private long windowStart = System.currentTimeMillis();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x0013, B:10:0x0018, B:12:0x0023, B:14:0x002c, B:18:0x0049, B:21:0x0050, B:24:0x0082, B:28:0x007d, B:29:0x008b, B:33:0x0038, B:35:0x003c), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x0013, B:10:0x0018, B:12:0x0023, B:14:0x002c, B:18:0x0049, B:21:0x0050, B:24:0x0082, B:28:0x007d, B:29:0x008b, B:33:0x0038, B:35:0x003c), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0038 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x0013, B:10:0x0018, B:12:0x0023, B:14:0x002c, B:18:0x0049, B:21:0x0050, B:24:0x0082, B:28:0x007d, B:29:0x008b, B:33:0x0038, B:35:0x003c), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void addEvent(@androidx.annotation.NonNull com.amazon.alexa.mobilytics.event.MobilyticsEvent r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = r8.getOwnerIdentifier()     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L11
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L13
            goto L11
        Le:
            r8 = move-exception
            goto L9c
        L11:
            java.lang.String r0 = "null"
        L13:
            boolean r1 = r8 instanceof com.amazon.alexa.mobilytics.event.operational.MobilyticsOperationalEvent     // Catch: java.lang.Throwable -> Le
            r2 = 0
            if (r1 == 0) goto L38
            r1 = r8
            com.amazon.alexa.mobilytics.event.operational.MobilyticsOperationalEvent r1 = (com.amazon.alexa.mobilytics.event.operational.MobilyticsOperationalEvent) r1     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = r1.getOperationalEventType()     // Catch: java.lang.Throwable -> Le
            boolean r3 = r8 instanceof com.amazon.alexa.mobilytics.event.DefaultMobilyticsEvent     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto L2a
            r2 = r8
            com.amazon.alexa.mobilytics.event.DefaultMobilyticsEvent r2 = (com.amazon.alexa.mobilytics.event.DefaultMobilyticsEvent) r2     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r2.getRoutingMode()     // Catch: java.lang.Throwable -> Le
        L2a:
            if (r2 == 0) goto L32
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto L34
        L32:
            java.lang.String r2 = "kinesis_legacy"
        L34:
            r6 = r2
            r2 = r1
            r1 = r6
            goto L47
        L38:
            boolean r1 = r8 instanceof com.amazon.alexa.mobilytics.event.userinteraction.MobilyticsUserInteractionEvent     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L46
            r1 = r8
            com.amazon.alexa.mobilytics.event.userinteraction.MobilyticsUserInteractionEvent r1 = (com.amazon.alexa.mobilytics.event.userinteraction.MobilyticsUserInteractionEvent) r1     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r1.getInteractionType()     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "-"
            goto L47
        L46:
            r1 = r2
        L47:
            if (r2 == 0) goto L8b
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto L50
            goto L8b
        L50:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le
            r8.<init>()     // Catch: java.lang.Throwable -> Le
            r8.append(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = "|"
            r8.append(r0)     // Catch: java.lang.Throwable -> Le
            r8.append(r2)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = "|"
            r8.append(r0)     // Catch: java.lang.Throwable -> Le
            r8.append(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Le
            java.util.Map<java.lang.String, java.lang.Long> r0 = r7.counts     // Catch: java.lang.Throwable -> Le
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> Le
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> Le
            java.util.Map<java.lang.String, java.lang.Long> r1 = r7.counts     // Catch: java.lang.Throwable -> Le
            r2 = 1
            if (r0 != 0) goto L7d
            goto L82
        L7d:
            long r4 = r0.longValue()     // Catch: java.lang.Throwable -> Le
            long r2 = r2 + r4
        L82:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> Le
            r1.put(r8, r0)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r7)
            return
        L8b:
            java.lang.String r0 = com.amazon.alexa.mobilytics.connector.EventEmitCountBuffer.TAG     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "Skip event [%s] with unknown type"
            java.lang.String r8 = r8.getEventName()     // Catch: java.lang.Throwable -> Le
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> Le
            com.amazon.alexa.mobilytics.util.Log.d(r0, r1, r8)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r7)
            return
        L9c:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Le
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.mobilytics.connector.EventEmitCountBuffer.addEvent(com.amazon.alexa.mobilytics.event.MobilyticsEvent):void");
    }

    @Nullable
    public synchronized DefaultMobilyticsOperationalEvent flush() {
        try {
            if (this.counts.isEmpty()) {
                return null;
            }
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, Long> entry : this.counts.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
            Log.d(TAG, "Flushing [%d] keys", Integer.valueOf(this.counts.size()));
            this.counts.clear();
            this.windowStart = System.currentTimeMillis();
            DefaultMobilyticsOperationalEvent defaultMobilyticsOperationalEvent = new DefaultMobilyticsOperationalEvent(EMIT_COUNT_EVENT_NAME, OperationalEventType.DIAGNOSTIC, "mobilytics", SUB_COMPONENT, OwnerIdentifier.MOBILE_ORG_ANALYTICS_BACKEND);
            defaultMobilyticsOperationalEvent.withDebugInfo(hashMap);
            return defaultMobilyticsOperationalEvent;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean flushNeeded() {
        boolean z;
        if (!this.counts.isEmpty()) {
            z = System.currentTimeMillis() - this.windowStart > 3600000;
        }
        return z;
    }

    @VisibleForTesting
    public synchronized void setWindowStart(long j) {
        this.windowStart = j;
    }

    public synchronized int size() {
        return this.counts.size();
    }
}
