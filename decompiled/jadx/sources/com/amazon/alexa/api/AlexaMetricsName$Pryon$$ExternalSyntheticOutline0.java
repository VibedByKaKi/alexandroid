package com.amazon.alexa.api;

import android.os.RemoteException;
import com.amazon.alexa.accessory.notificationpublisher.utils.Log;
import com.amazon.alexa.accessory.protocol.Common;
import com.amazon.alexa.accessoryclient.common.query.request.QuerySessionRequest;
import com.amazon.alexa.accessoryclient.common.query.response.ErrorCodeResponse;
import com.amazon.alexa.accessoryservice.service.rxipc.AccessoriesRequestHandler;
import com.amazon.alexa.api.compat.migration.sdk.ListenerFacadeSlot;
import com.amazon.alexa.assistant.foundation.logging.Logger;
import com.google.gson.JsonObject;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.serialization.json.JsonBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public abstract /* synthetic */ class AlexaMetricsName$Pryon$$ExternalSyntheticOutline0 {
    public static String m(String str, String str2, String str3, List list, String str4) {
        return str + str2 + str3 + list + str4;
    }

    public static void m$1(JsonBuilder jsonBuilder, boolean z, boolean z2, String str) {
        jsonBuilder.getClass();
        jsonBuilder.setIgnoreUnknownKeys(z);
        jsonBuilder.setLenient(z2);
        jsonBuilder.setClassDiscriminator(str);
    }

    public static ErrorCodeResponse m(Common.ErrorCode errorCode, Common.ErrorCode errorCode2) {
        errorCode.getClass();
        return new ErrorCodeResponse(errorCode2);
    }

    public static AlexaMetricsName m(AlexaMetricsName alexaMetricsName, StringBuilder sb, String str) {
        sb.append(alexaMetricsName.getValue());
        sb.append(str);
        return AlexaMetricsName.create(sb.toString());
    }

    public static JsonObject m(String str, String str2, String str3, String str4) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(str, str2);
        jsonObject.addProperty(str3, str4);
        return jsonObject;
    }

    public static String m() {
        String instant = Instant.now().toString();
        instant.getClass();
        return instant;
    }

    public static String m(double d, String str, StringBuilder sb) {
        sb.append(d);
        sb.append(str);
        return sb.toString();
    }

    public static String m(AccessoriesRequestHandler accessoriesRequestHandler, QuerySessionRequest querySessionRequest) {
        accessoriesRequestHandler.getClass();
        querySessionRequest.getClass();
        return querySessionRequest.getIdentifier();
    }

    public static String m(ByteString byteString, ByteString byteString2) {
        byteString.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString2);
        return byteString.toStringUtf8();
    }

    public static int m(ListenerFacadeSlot listenerFacadeSlot, int i, int i2) {
        return (listenerFacadeSlot.hashCode() + i) * i2;
    }

    public static String m(String str, String str2, String str3, boolean z) {
        return str + str2 + str3 + z;
    }

    public static String m(String str, String str2, List list) {
        return str + list + str2;
    }

    public static String m(String str, boolean z) {
        return str + z;
    }

    public static String m(StringBuilder sb, boolean z, String str, boolean z2, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static StringBuilder m14724m(String str, String str2, String str3, List list, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(list);
        sb.append(str4);
        return sb;
    }

    public static ArrayList m(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return arrayList;
    }

    public static HashMap m(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return hashMap;
    }

    public static CoroutineScope m(Job job, int i, Object obj, CoroutineDispatcher coroutineDispatcher) {
        return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(job, i, obj).plus(coroutineDispatcher));
    }

    public static void m(int i, String str, String str2) {
        Log.w(str2, str + i);
    }

    public static void m(Exception exc, Function1 function1) {
        function1.invoke(Result.m25293boximpl(Result.m25294constructorimpl(ResultKt.createFailure(exc))));
    }

    public static void m(String str, int i, String str2, RemoteException remoteException) {
        android.util.Log.e(str2, str + i, remoteException);
    }

    public static void m(String str, int i, StringBuilder sb) {
        sb.append(String.valueOf(i));
        sb.append(str);
    }

    public static void m(String str, String str2, Logger logger, String str3, Exception exc) {
        logger.error(str3, str + str2, exc);
    }

    public static void m(String str, String str2, String str3) {
        Log.d(str3, str + str2);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static void m14725m(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static void m14726m(StringBuilder sb, boolean z, String str, boolean z2, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
    }

    public static void m(Unit unit, Function1 function1) {
        function1.invoke(Result.m25293boximpl(Result.m25294constructorimpl(unit)));
    }

    public static void m(JsonBuilder jsonBuilder, boolean z, boolean z2, String str) {
        jsonBuilder.getClass();
        jsonBuilder.setEncodeDefaults(z);
        jsonBuilder.setExplicitNulls(z2);
        jsonBuilder.setClassDiscriminator(str);
    }
}
