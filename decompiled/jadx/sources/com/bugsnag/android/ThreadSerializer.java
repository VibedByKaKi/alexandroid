package com.bugsnag.android;

import com.amazon.alexa.auth.BuildConfig;
import com.bugsnag.android.Thread;
import com.dee.app.metrics.MetricsConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bugsnag/android/ThreadSerializer;", "Lcom/bugsnag/android/MapSerializer;", "Lcom/bugsnag/android/Thread;", "()V", "serialize", "", BuildConfig.FLAVOR_authType, "", "", "", "thread", "bugsnag-plugin-react-native_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class ThreadSerializer implements MapSerializer<Thread> {
    /* renamed from: serialize, reason: avoid collision after fix types in other method */
    public void serialize2(@NotNull Map<String, Object> map, @NotNull Thread thread) {
        map.getClass();
        thread.getClass();
        map.put("id", Long.valueOf(thread.getId()));
        map.put("name", thread.getName());
        String obj = thread.getType().toString();
        Locale locale = Locale.US;
        locale.getClass();
        if (obj == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("null cannot be cast to non-null type java.lang.String");
            return;
        }
        Object lowerCase = obj.toLowerCase(locale);
        lowerCase.getClass();
        map.put("type", lowerCase);
        map.put("errorReportingThread", Boolean.valueOf(thread.getErrorReportingThread()));
        Thread.State state = thread.getState();
        state.getClass();
        map.put("state", state.getDescriptor());
        List<Stackframe> stacktrace = thread.getStacktrace();
        stacktrace.getClass();
        List<Stackframe> list = stacktrace;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Stackframe stackframe : list) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(MetricsConstants.NativeFetch.METHOD, stackframe.getMethod());
            linkedHashMap.put("lineNumber", stackframe.getLineNumber());
            linkedHashMap.put("file", stackframe.getFile());
            linkedHashMap.put("inProject", stackframe.getInProject());
            arrayList.add(linkedHashMap);
        }
        map.put("stacktrace", arrayList);
    }

    @Override // com.bugsnag.android.MapSerializer
    public /* bridge */ /* synthetic */ void serialize(Map map, Thread thread) {
        serialize2((Map<String, Object>) map, thread);
    }
}
