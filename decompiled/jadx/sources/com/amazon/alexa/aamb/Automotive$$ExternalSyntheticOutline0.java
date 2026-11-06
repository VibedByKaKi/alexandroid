package com.amazon.alexa.aamb;

import android.net.Uri;
import android.util.Log;
import com.amazon.alexa.accessory.avsclient.metrics.CounterMetricsHandler;
import com.amazon.alexa.accessory.avsclient.metrics.MetricMappings;
import com.amazon.alexa.accessory.avsclient.metrics.TimerMetricsHandler;
import com.amazon.alexa.accessory.metrics.AccessoryMetricsServiceHolder;
import com.amazon.alexa.accessory.protocol.Accessories;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Sequence;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public abstract /* synthetic */ class Automotive$$ExternalSyntheticOutline0 {
    public static String m(long j, String str, String str2, String str3) {
        return str + str2 + str3 + j;
    }

    public static Message.Builder m(String str) {
        return new Message.Builder().setEventType(str);
    }

    public static int m$1(String str, MetricMappings.AnonymousClass1 anonymousClass1, int i, int i2, int i3) {
        anonymousClass1.append(i, new TimerMetricsHandler(str));
        return MetricMappings.keyFor(i2, i3);
    }

    public static Object m(Class cls) {
        return ComponentRegistry.getInstance().get(cls).orNull();
    }

    public static int m(String str, MetricMappings.AnonymousClass1 anonymousClass1, int i, int i2, int i3) {
        anonymousClass1.append(i, new CounterMetricsHandler(str));
        return MetricMappings.keyFor(i2, i3);
    }

    public static String m(Uri uri, String str, String str2) {
        return str + uri + str2;
    }

    public static String m(Accessories.Response response, StringBuilder sb) {
        sb.append(response.getErrorCode());
        return sb.toString();
    }

    public static String m(IOException iOException, StringBuilder sb) {
        sb.append(iOException.getMessage());
        return sb.toString();
    }

    public static String m(String str, String str2, boolean z) {
        return str + z + str2;
    }

    public static String m(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    public static String m(StringBuilder sb, Integer num, String str) {
        sb.append(num);
        sb.append(str);
        return sb.toString();
    }

    public static String m(ASN1Sequence aSN1Sequence, StringBuilder sb) {
        sb.append(aSN1Sequence.size());
        return sb.toString();
    }

    public static StringBuilder m(long j, String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(j);
        return sb;
    }

    public static StringBuilder m(String str, double d, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(d);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder m(String str, long j, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder m(String str, String str2, String str3, long j) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(j);
        return sb;
    }

    public static StringBuilder m(String str, String str2, String str3, boolean z, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(z);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder m(String str, boolean z, String str2, boolean z2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(z);
        sb.append(str2);
        sb.append(z2);
        sb.append(str3);
        return sb;
    }

    public static HashMap m(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        hashMap.put(str3, str4);
        return hashMap;
    }

    public static void m(String str, int i, StringBuilder sb) {
        sb.append(i);
        Log.i(str, sb.toString());
    }

    public static void m(String str, String str2, Exception exc) {
        com.amazon.alexa.accessory.notificationpublisher.utils.Log.w(str2, str + exc);
    }

    public static void m(String str, String str2, String str3) {
        com.amazon.alexa.accessory.frames.utils.Log.i(str3, str + str2);
    }

    public static void m(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static void m8396m(String str, String str2, boolean z) {
        Log.i(str2, str + z);
    }

    public static void m(String str, String str2, boolean z, Map map) {
        AccessoryMetricsServiceHolder.getInstance().get().recordOccurrence(str, str2, z, map);
    }

    public static void m(StringBuilder sb, String str, String str2, boolean z, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(z);
        sb.append(str3);
    }

    public static long m(long j, long j2, int i, long j3) {
        return Long.rotateRight(j + j2, i) * j3;
    }
}
