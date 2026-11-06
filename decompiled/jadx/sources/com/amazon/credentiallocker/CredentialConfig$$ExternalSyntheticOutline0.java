package com.amazon.credentiallocker;

import android.content.res.TypedArray;
import com.amazon.alexa.routing.api.RoutingRegistry;
import com.amazon.clouddrive.android.core.interfaces.Metrics;
import com.amazon.comms.calling.service.VideoConstraints;
import com.amazon.comms.log.CommsLogger;
import com.amazon.comms.ringservice.webrtc.PeerConnectionClient;
import com.amazon.coral.model.Model;
import com.amazon.dee.app.dependencies.RoutingModule;
import com.amazon.dee.app.services.logging.Log;
import com.amazon.dee.app.strictmode.StackTrace;
import com.amazon.photos.discovery.internal.util.KotlinExtKt$catchDb$1;
import com.amazon.photos.uploader.UploadRequest;
import com.amazon.rtcmedia.util.RtcscLogger;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.codehaus.jackson.JsonToken;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public abstract /* synthetic */ class CredentialConfig$$ExternalSyntheticOutline0 {
    public static /* synthetic */ void m(Object obj) {
        boolean isTerminated;
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
            return;
        }
        if (!(obj instanceof ExecutorService)) {
            if (obj instanceof TypedArray) {
                ((TypedArray) obj).recycle();
                return;
            } else {
                Path$$ExternalSyntheticBUOutline0.m();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) obj;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static String m$1(String str, String str2, StringBuilder sb) {
        sb.append(String.valueOf(str));
        sb.append(str2);
        return sb.toString();
    }

    public static ImmutableMap m(ImmutableMap immutableMap) {
        return ImmutableMap.builder().putAll(immutableMap).build();
    }

    public static String m(int i, int i2, String str) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    public static String m(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String m(int i, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String m(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String m(PeerConnectionClient peerConnectionClient, StringBuilder sb, String str) {
        String str2;
        str2 = peerConnectionClient.logTag;
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }

    public static String m(String str, Model model) {
        return str + model;
    }

    public static String m(String str, String str2, StringBuilder sb) {
        sb.append(str.toString());
        sb.append(str2);
        return sb.toString();
    }

    public static String m(String str, List list, StringBuilder sb) {
        sb.append(String.valueOf(list));
        sb.append(str);
        return sb.toString();
    }

    public static String m(String str, JsonToken jsonToken) {
        return str + jsonToken;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static StringBuilder m21223m(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static ArrayList m(StackTrace stackTrace, HashMap hashMap, ArrayList arrayList) {
        hashMap.put(Integer.valueOf(stackTrace.hashCode()), arrayList);
        return new ArrayList();
    }

    public static Iterator m(Iterable iterable, Function1 function1) {
        iterable.getClass();
        function1.getClass();
        return iterable.iterator();
    }

    public static void m(int i, int i2, int i3, TreeMap treeMap, Integer num) {
        treeMap.put(num, new VideoConstraints(i, i2, i3));
    }

    public static void m(CommsLogger commsLogger, String str, String str2) {
        commsLogger.e(str + str2);
    }

    public static void m(UploadRequest uploadRequest, StringBuilder sb, String str) {
        sb.append(uploadRequest.getId());
        sb.append(str);
    }

    public static int m(int i, String str) {
        return String.valueOf(str).length() + i;
    }

    public static void m(String str, int i, CommsLogger commsLogger) {
        commsLogger.i(str + i);
    }

    public static void m(String str, int i, String str2, String str3, RoutingRegistry routingRegistry) {
        routingRegistry.register(RoutingModule.route(str, i).asRoot().withParent(str2).withTemplate(str3).build());
    }

    public static void m(String str, Metrics metrics, String str2, Exception exc) {
        metrics.recordSimpleErrorEvent(str2, new KotlinExtKt$catchDb$1(str), exc);
    }

    public static void m(String str, String str2, RtcscLogger rtcscLogger) {
        rtcscLogger.i(str + str2);
    }

    public static void m(String str, String str2, String str3) {
        Log.e(str3, str + str2);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static void m21224m(String str, String str2, StringBuilder sb) {
        sb.append(String.valueOf(str));
        sb.append(str2);
    }

    public static void m(String str, String str2, Throwable th) {
        str.getClass();
        str2.getClass();
        th.getClass();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static void m21225m(String str, List list, StringBuilder sb) {
        sb.append(String.valueOf(list));
        sb.append(str);
    }

    public static void m(String str, boolean z, CommsLogger commsLogger) {
        commsLogger.i(str + z);
    }

    public static void m(StringBuilder sb, boolean z, CommsLogger commsLogger) {
        sb.append(z);
        commsLogger.i(sb.toString());
    }

    public static void m(StringBuilder sb, boolean z, RtcscLogger rtcscLogger) {
        sb.append(z);
        rtcscLogger.i(sb.toString());
    }
}
