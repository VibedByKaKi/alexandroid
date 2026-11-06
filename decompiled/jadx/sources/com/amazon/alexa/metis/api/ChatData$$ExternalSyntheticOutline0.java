package com.amazon.alexa.metis.api;

import android.content.res.Resources;
import android.os.Parcel;
import android.util.Log;
import android.util.Pair;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.amazon.alexa.assistant.capability.externalmediaplayer.model.ExternalMediaPlayerPlaybackError;
import com.amazon.alexa.biloba.generated.network.StringUtil;
import com.amazon.alexa.client.core.messages.Name;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.ra.core.ui.RaTheme;
import com.amazon.alexa.routing.api.RoutingService;
import com.amazon.alexa.voice.handsfree.settings.locale.languagedata.MultiLanguageDataProvider;
import com.amazon.comms.log.CommsLogger;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public abstract /* synthetic */ class ChatData$$ExternalSyntheticOutline0 {
    public static ArrayList m(String str, String str2, String str3, String str4, String str5) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        arrayList.add(str3);
        arrayList.add(str4);
        arrayList.add(str5);
        return arrayList;
    }

    public static int m(CharSequence charSequence, int i, int i2) {
        return (charSequence.hashCode() + i) * i2;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static long m16640m(Resources resources, int i, float f) {
        return TextUnitKt.getSp(resources.getDimension(i) / f);
    }

    public static long m(RaTheme raTheme, Composer composer, int i) {
        return raTheme.getColors(composer, i).getTextColors().m18234getTextPrimary0d7_KjU();
    }

    public static MutableState m(int i, SnapshotMutationPolicy snapshotMutationPolicy, int i2, Object obj, Composer composer) {
        MutableState mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i), snapshotMutationPolicy, i2, obj);
        composer.updateRememberedValue(mutableStateOf$default);
        return mutableStateOf$default;
    }

    public static ImmutableMap.Builder m(String str, String str2, ImmutableMap.Builder builder, String str3) {
        return builder.put(str3, new Pair(str, str2));
    }

    public static Object m(Composer composer, int i) {
        composer.endReplaceGroup();
        composer.startReplaceGroup(i);
        return composer.rememberedValue();
    }

    public static Object m(Class cls) {
        Object obj = ComponentRegistry.getInstance().get(cls).get();
        obj.getClass();
        return obj;
    }

    public static Object m(String str) {
        return Result.m25294constructorimpl(ResultKt.createFailure(new ExternalMediaPlayerPlaybackError.InternalError(str)));
    }

    public static String m(Name name, StringBuilder sb) {
        sb.append(name.getValue());
        return sb.toString();
    }

    public static String m(String str, IOException iOException) {
        return str + iOException;
    }

    public static String m(String str, String str2, String str3) {
        str.getClass();
        return str2 + str3;
    }

    public static String m(GeneralSecurityException generalSecurityException, StringBuilder sb) {
        sb.append(generalSecurityException.getMessage());
        return sb.toString();
    }

    public static ArrayList m(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        return arrayList;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static ArrayList m16641m(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        arrayList.add(str3);
        return arrayList;
    }

    public static float m(Resources resources, int i, float f) {
        return Dp.m7368constructorimpl(resources.getDimension(i) / f);
    }

    public static Iterator m(Parcel parcel, List list) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static Locale m(MultiLanguageDataProvider.AnonymousClass1 anonymousClass1, List list, String str, String str2) {
        anonymousClass1.add(list);
        return new Locale(str, str2);
    }

    public static Set m() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    /* renamed from: m, reason: collision with other method in class */
    public static NoWhenBranchMatchedException m16642m(Composer composer, int i) {
        composer.startReplaceGroup(i);
        composer.endReplaceGroup();
        return new NoWhenBranchMatchedException();
    }

    public static void m(RoutingService routingService, String str, String str2, String str3) {
        routingService.route(str).with(str2, str3).addToBackStack().navigate();
    }

    public static void m(CommsLogger commsLogger, String str, String str2) {
        commsLogger.i(str + str2);
    }

    public static void m(String str, Object obj, String str2) {
        Log.e(str2, str + obj);
    }

    public static void m(String str, String str2, String str3, CommsLogger commsLogger) {
        commsLogger.i(str + str2 + str3);
    }

    public static void m(String str, String str2, List list) {
        str.getClass();
        str2.getClass();
        list.getClass();
    }

    public static void m(StringBuilder sb, String str, double d, String str2) {
        sb.append(str);
        sb.append(d);
        sb.append(str2);
    }

    public static void m(StringBuilder sb, String str, CommsLogger commsLogger) {
        sb.append(str);
        commsLogger.i(sb.toString());
    }

    public static void m(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(StringUtil.parameterToString(str3));
    }

    public static void m(HashSet hashSet, String str, String str2, String str3, String str4) {
        hashSet.add(str);
        hashSet.add(str2);
        hashSet.add(str3);
        hashSet.add(str4);
    }
}
