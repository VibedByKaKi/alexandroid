package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.http;

import android.util.Log;
import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.Connectivity;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.DateUtil;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.InternalEventClient;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.util.Date;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public class RequestTimingHandler extends RequestHandler2 {
    public static final String REQUESTATTEMPTS_HEADER = "x-amzn-RequestAttempts";
    public static final String REQUESTTIME_HEADER = "x-amzn-RequestTime";
    public static final String SERVERINFO_HEADER = "x-amzn-ServerInfo";
    private static final String TAG = "RequestTimingHandler";
    private static final String TIMEZONE_FORMAT = "Z";
    private final Connectivity connectivity;
    private int contentLength;
    private DateFormat df = DateUtil.createLocaleIndependentDateFormatter(TIMEZONE_FORMAT);
    private final InternalEventClient eventClient;
    private long startTime;

    public RequestTimingHandler(Connectivity connectivity, InternalEventClient internalEventClient) {
        this.eventClient = internalEventClient;
        this.connectivity = connectivity;
    }

    private synchronized String getTimeZone() {
        return this.df.format(new Date());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00de A[Catch: Exception -> 0x0033, TryCatch #3 {Exception -> 0x0033, blocks: (B:4:0x0006, B:6:0x0020, B:9:0x002a, B:13:0x0036, B:14:0x004b, B:16:0x0056, B:19:0x0060, B:20:0x006b, B:22:0x007a, B:27:0x0080, B:29:0x00de, B:32:0x00e7, B:35:0x00f1, B:37:0x00f8, B:38:0x00fd, B:47:0x0044), top: B:3:0x0006, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f8 A[Catch: Exception -> 0x0033, TryCatch #3 {Exception -> 0x0033, blocks: (B:4:0x0006, B:6:0x0020, B:9:0x002a, B:13:0x0036, B:14:0x004b, B:16:0x0056, B:19:0x0060, B:20:0x006b, B:22:0x007a, B:27:0x0080, B:29:0x00de, B:32:0x00e7, B:35:0x00f1, B:37:0x00f8, B:38:0x00fd, B:47:0x0044), top: B:3:0x0006, inners: #1 }] */
    @Override // com.amazonaws.handlers.RequestHandler2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void afterResponse(com.amazonaws.Request<?> r9, com.amazonaws.Response<?> r10) {
        /*
            r8 = this;
            java.lang.String r0 = "RequestTimingHandler"
            if (r10 != 0) goto L6
            goto L108
        L6:
            com.amazonaws.http.HttpResponse r1 = r10.getHttpResponse()     // Catch: java.lang.Exception -> L33
            java.util.Map r1 = r1.getHeaders()     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = "x-amzn-RequestTime"
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L33
            long r3 = r8.startTime     // Catch: java.lang.Exception -> L33
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L33
            long r3 = r3 - r5
            if (r2 == 0) goto L36
            java.lang.String r5 = r2.trim()     // Catch: java.lang.Exception -> L33
            int r5 = r5.length()     // Catch: java.lang.Exception -> L33
            if (r5 <= 0) goto L36
            java.lang.String r5 = r2.trim()     // Catch: java.lang.Exception -> L33 java.lang.NumberFormatException -> L36
            long r3 = java.lang.Long.parseLong(r5)     // Catch: java.lang.Exception -> L33 java.lang.NumberFormatException -> L36
            goto L36
        L33:
            r8 = move-exception
            goto L103
        L36:
            java.lang.String r3 = java.lang.Long.toString(r3)     // Catch: java.lang.Exception -> L33 java.lang.NumberFormatException -> L43
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch: java.lang.Exception -> L33 java.lang.NumberFormatException -> L43
            double r3 = r3.doubleValue()     // Catch: java.lang.Exception -> L33 java.lang.NumberFormatException -> L43
            goto L4b
        L43:
            r3 = move-exception
            java.lang.String r4 = "Couldn't convert response time to double format"
            android.util.Log.e(r0, r4, r3)     // Catch: java.lang.Exception -> L33
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L4b:
            java.lang.String r5 = "x-amzn-RequestAttempts"
            java.lang.Object r5 = r1.get(r5)     // Catch: java.lang.Exception -> L33
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L33
            if (r5 == 0) goto L69
            java.lang.String r6 = r5.trim()     // Catch: java.lang.Exception -> L33
            int r6 = r6.length()     // Catch: java.lang.Exception -> L33
            if (r6 <= 0) goto L69
            java.lang.String r5 = r5.trim()     // Catch: java.lang.Exception -> L33 java.lang.NumberFormatException -> L69
            double r5 = java.lang.Double.parseDouble(r5)     // Catch: java.lang.Exception -> L33 java.lang.NumberFormatException -> L69
            goto L6b
        L69:
            r5 = 0
        L6b:
            java.lang.String r7 = "x-amzn-ServerInfo"
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.Exception -> L33
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L33
            boolean r2 = com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.StringUtil.isNullOrEmpty(r2)     // Catch: java.lang.Exception -> L33
            if (r2 != 0) goto L108
            com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.InternalEventClient r2 = r8.eventClient     // Catch: java.lang.Exception -> L33
            if (r2 != 0) goto L80
            goto L108
        L80:
            java.lang.String r7 = "_httpRequestTiming"
            com.amazonaws.mobileconnectors.amazonmobileanalytics.AnalyticsEvent r2 = r2.createEvent(r7)     // Catch: java.lang.Exception -> L33
            java.lang.String r7 = "url"
            java.net.URI r9 = r9.getEndpoint()     // Catch: java.lang.Exception -> L33
            java.net.URL r9 = r9.toURL()     // Catch: java.lang.Exception -> L33
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L33
            com.amazonaws.mobileconnectors.amazonmobileanalytics.AnalyticsEvent r9 = r2.withAttribute(r7, r9)     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = "responseCode"
            com.amazonaws.http.HttpResponse r10 = r10.getHttpResponse()     // Catch: java.lang.Exception -> L33
            int r10 = r10.getStatusCode()     // Catch: java.lang.Exception -> L33
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch: java.lang.Exception -> L33
            com.amazonaws.mobileconnectors.amazonmobileanalytics.AnalyticsEvent r9 = r9.withAttribute(r2, r10)     // Catch: java.lang.Exception -> L33
            java.lang.String r10 = "timeZone"
            java.lang.String r2 = r8.getTimeZone()     // Catch: java.lang.Exception -> L33
            com.amazonaws.mobileconnectors.amazonmobileanalytics.AnalyticsEvent r9 = r9.withAttribute(r10, r2)     // Catch: java.lang.Exception -> L33
            java.lang.String r10 = "attempts"
            java.lang.Double r2 = java.lang.Double.valueOf(r5)     // Catch: java.lang.Exception -> L33
            com.amazonaws.mobileconnectors.amazonmobileanalytics.AnalyticsEvent r9 = r9.withMetric(r10, r2)     // Catch: java.lang.Exception -> L33
            java.lang.String r10 = "totalTime"
            java.lang.Double r2 = java.lang.Double.valueOf(r3)     // Catch: java.lang.Exception -> L33
            com.amazonaws.mobileconnectors.amazonmobileanalytics.AnalyticsEvent r9 = r9.withMetric(r10, r2)     // Catch: java.lang.Exception -> L33
            java.lang.String r10 = "requestSize"
            int r2 = r8.contentLength     // Catch: java.lang.Exception -> L33
            double r2 = (double) r2     // Catch: java.lang.Exception -> L33
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch: java.lang.Exception -> L33
            com.amazonaws.mobileconnectors.amazonmobileanalytics.AnalyticsEvent r9 = r9.withMetric(r10, r2)     // Catch: java.lang.Exception -> L33
            java.lang.String r10 = "UNKNOWN"
            com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.Connectivity r2 = r8.connectivity     // Catch: java.lang.Exception -> L33
            if (r2 == 0) goto Lf1
            boolean r2 = r2.hasWifi()     // Catch: java.lang.Exception -> L33
            if (r2 == 0) goto Le7
            java.lang.String r10 = "WIFI"
            goto Lf1
        Le7:
            com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.Connectivity r2 = r8.connectivity     // Catch: java.lang.Exception -> L33
            boolean r2 = r2.hasWAN()     // Catch: java.lang.Exception -> L33
            if (r2 == 0) goto Lf1
            java.lang.String r10 = "WAN"
        Lf1:
            java.lang.String r2 = "network"
            r9.withAttribute(r2, r10)     // Catch: java.lang.Exception -> L33
            if (r1 == 0) goto Lfd
            java.lang.String r10 = "serverInfo"
            r9.withAttribute(r10, r1)     // Catch: java.lang.Exception -> L33
        Lfd:
            com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.InternalEventClient r8 = r8.eventClient     // Catch: java.lang.Exception -> L33
            r8.recordEvent(r9)     // Catch: java.lang.Exception -> L33
            goto L108
        L103:
            java.lang.String r9 = "Unable to record _RequestTime event"
            android.util.Log.e(r0, r9, r8)
        L108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.http.RequestTimingHandler.afterResponse(com.amazonaws.Request, com.amazonaws.Response):void");
    }

    @Override // com.amazonaws.handlers.RequestHandler2
    public void beforeRequest(Request<?> request) {
        this.startTime = System.currentTimeMillis();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream content = request.getContent();
        while (true) {
            try {
                int read = content.read();
                if (read == -1) {
                    this.contentLength = byteArrayOutputStream.size();
                    request.setContent(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                    return;
                }
                byteArrayOutputStream.write(read);
            } catch (IOException e) {
                Log.e(TAG, "Cannot read content of request");
                Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
                return;
            }
        }
    }

    @Override // com.amazonaws.handlers.RequestHandler2
    public void afterError(Request<?> request, Response<?> response, Exception exc) {
    }
}
