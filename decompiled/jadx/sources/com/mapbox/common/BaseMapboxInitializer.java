package com.mapbox.common;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import androidx.exifinterface.media.ExifInterface;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import com.dee.app.contacts.common.constants.Constants;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\b&\u0018\u0000 \u0010*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0005J\u0013\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u00070\u000fR \u0010\u0006\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/mapbox/common/BaseMapboxInitializer;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/startup/Initializer;", "", "()V", "initializerClass", "Ljava/lang/Class;", "getInitializerClass", "()Ljava/lang/Class;", "create", "context", "Landroid/content/Context;", "(Landroid/content/Context;)Ljava/lang/Boolean;", SmartFragmentContent.DEPENDENCIES, "", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public abstract class BaseMapboxInitializer<T> implements Initializer<Boolean> {
    private static final long LOCK_WAIT_TIME_MS = 50;

    @NotNull
    private static final String MAPBOX_PACKAGE_PREFIX = "com.mapbox.";

    @NotNull
    private static final String STARTUP_PROVIDER_NAME = "androidx.startup.InitializationProvider";

    @NotNull
    private static final String TAG = "MapboxInitializer";

    @Nullable
    private static Context appContext;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<Set<Class<? extends Initializer<?>>>> pendingInitializerClasses$delegate = LazyKt.lazy(new Function0<Set<Class<? extends Initializer<?>>>>() { // from class: com.mapbox.common.BaseMapboxInitializer$Companion$pendingInitializerClasses$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Set<Class<? extends Initializer<?>>> invoke() {
            return BaseMapboxInitializer.INSTANCE.discoverPendingMapboxInitializers$common_release();
        }
    });

    @NotNull
    private static final ConcurrentHashMap<Class<? extends Initializer<?>>, InitializerData> initializersMap = new ConcurrentHashMap<>();

    @NotNull
    private static final ReentrantLock globalLock = new ReentrantLock();

    /* JADX INFO: Access modifiers changed from: private */
    @JvmStatic
    public static final native void allowSDKThreads();

    @JvmStatic
    public static final <T> void init(@NotNull Class<? extends Initializer<T>> cls) {
        INSTANCE.init(cls);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void updateState(@NotNull Class<? extends Initializer<?>> cls, @NotNull InitializerState initializerState) {
        INSTANCE.updateState(cls, initializerState);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    @NotNull
    public final Boolean create(@NotNull Context context) {
        context.getClass();
        android.util.Log.i(TAG, getClass().getSimpleName().concat(" create() is called"));
        appContext = context.getApplicationContext();
        try {
            INSTANCE.init(getInitializerClass(), true);
        } catch (Throwable th) {
            android.util.Log.w(TAG, "Exception occurred when initializing " + getInitializerClass().getSimpleName() + ": " + th.getMessage());
            if (!initializersMap.containsKey(getInitializerClass())) {
                throw th;
            }
            INSTANCE.updateState(getInitializerClass(), InitializerState.FAILURE);
        }
        return Boolean.TRUE;
    }

    @Override // androidx.startup.Initializer
    @NotNull
    public final List<Class<? extends Initializer<?>>> dependencies() {
        return new ArrayList();
    }

    @NotNull
    public abstract Class<? extends Initializer<T>> getInitializerClass();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010!\u001a\u00020\"H\u0083 J\u001f\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00150\u00140\u001bH\u0001¢\u0006\u0002\b$J6\u0010%\u001a\u00020\"2\u0012\u0010&\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00150\u00142\u0018\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00150\u00140\u001bH\u0002J\n\u0010(\u001a\u0004\u0018\u00010\nH\u0003J(\u0010)\u001a\u00020\"\"\b\b\u0001\u0010**\u00020\u00012\u0014\u0010+\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H*0\u00150\u0014H\u0007J0\u0010)\u001a\u00020\"\"\b\b\u0001\u0010**\u00020\u00012\u0014\u0010+\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H*0\u00150\u00142\u0006\u0010,\u001a\u00020-H\u0002J\r\u0010.\u001a\u00020\"H\u0001¢\u0006\u0002\b/J'\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\u00162\f\u00103\u001a\b\u0012\u0004\u0012\u00020\"04H\u0082\bJ*\u00105\u001a\u00020\"2\u0018\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00150\u0014072\u0006\u00108\u001a\u000209H\u0002J$\u0010:\u001a\u00020\"2\u0012\u0010+\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00150\u00142\u0006\u00108\u001a\u000209H\u0007J\u0010\u0010;\u001a\u00020-*\u0006\u0012\u0002\b\u00030\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R&\u0010\t\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u0012\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00150\u0014\u0012\u0004\u0012\u00020\u00160\u00138\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\u0019R3\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00150\u00140\u001b8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u001e¨\u0006<"}, d2 = {"Lcom/mapbox/common/BaseMapboxInitializer$Companion;", "", "()V", "LOCK_WAIT_TIME_MS", "", "MAPBOX_PACKAGE_PREFIX", "", "STARTUP_PROVIDER_NAME", Constants.LOG_TAG, "appContext", "Landroid/content/Context;", "getAppContext$common_release$annotations", "getAppContext$common_release", "()Landroid/content/Context;", "setAppContext$common_release", "(Landroid/content/Context;)V", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "initializersMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "Landroidx/startup/Initializer;", "Lcom/mapbox/common/InitializerData;", "getInitializersMap$common_release$annotations", "getInitializersMap$common_release", "()Ljava/util/concurrent/ConcurrentHashMap;", "pendingInitializerClasses", "", "getPendingInitializerClasses$common_release$annotations", "getPendingInitializerClasses$common_release", "()Ljava/util/Set;", "pendingInitializerClasses$delegate", "Lkotlin/Lazy;", "allowSDKThreads", "", "discoverPendingMapboxInitializers", "discoverPendingMapboxInitializers$common_release", "getAllDependencies", "parentInitializerClass", "dependencySet", "getApplicationContextFromActivityThread", "init", ExifInterface.GPS_DIRECTION_TRUE, "initializerClass", "calledFromCreate", "", "notifySDKThreadsAllowed", "notifySDKThreadsAllowed$common_release", "runCatchingEnhanced", "context", "initializerData", "function", "Lkotlin/Function0;", "updatePendingInitializers", "updatedClasses", "", "state", "Lcom/mapbox/common/InitializerState;", "updateState", "skipFurtherInitialization", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        private final void allowSDKThreads() {
            BaseMapboxInitializer.allowSDKThreads();
        }

        private static final Set<Class<? extends Initializer<?>>> discoverPendingMapboxInitializers$fallback(String str) {
            Set<Class<? extends Initializer<?>>> keySet = BaseMapboxInitializer.INSTANCE.getInitializersMap$common_release().keySet();
            keySet.getClass();
            Set<Class<? extends Initializer<?>>> mutableSet = CollectionsKt.toMutableSet(keySet);
            android.util.Log.w(BaseMapboxInitializer.TAG, "Failed to discover Mapbox initializers: " + str + ". Falling back to best current guess");
            return mutableSet;
        }

        private final void getAllDependencies(Class<? extends Initializer<?>> parentInitializerClass, Set<Class<? extends Initializer<?>>> dependencySet) {
            Initializer<?> newInstance = parentInitializerClass.getDeclaredConstructor(null).newInstance(null);
            newInstance.getClass();
            Initializer<?> initializer = newInstance;
            if (initializer.dependencies().isEmpty()) {
                return;
            }
            List<Class<? extends Initializer<?>>> dependencies = initializer.dependencies();
            dependencies.getClass();
            for (Class<? extends Initializer<?>> cls : dependencies) {
                cls.getClass();
                dependencySet.add(cls);
                BaseMapboxInitializer.INSTANCE.getAllDependencies(cls, dependencySet);
            }
        }

        @SuppressLint({"PrivateApi"})
        private final Context getApplicationContextFromActivityThread() {
            if (Intrinsics.areEqual("robolectric", Build.FINGERPRINT)) {
                return null;
            }
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object invoke = cls.getMethod("getApplication", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
                invoke.getClass();
                return (Context) invoke;
            } catch (Throwable th) {
                try {
                    android.util.Log.w(BaseMapboxInitializer.TAG, "Unable to get application context from ActivityThread", th);
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final <T> void init(Class<? extends Initializer<T>> initializerClass, boolean calledFromCreate) {
            InitializerData initializerData;
            InitializerData copy$default;
            if (skipFurtherInitialization(initializerClass)) {
                if (calledFromCreate) {
                    try {
                        android.util.Log.i(BaseMapboxInitializer.TAG, "Already initialized " + initializerClass.getSimpleName() + " before successfully");
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
            }
            Context appContext$common_release = getAppContext$common_release();
            if (appContext$common_release == null) {
                try {
                    android.util.Log.w(BaseMapboxInitializer.TAG, "Trying to call static BaseMapboxInitializer.init() before running BaseMapboxInitializer.create()! Please make sure that Mapbox SDK is initialized before any APIs are called.");
                } catch (Throwable unused2) {
                }
                appContext$common_release = getApplicationContextFromActivityThread();
                if (appContext$common_release == null) {
                    return;
                }
            }
            while (!BaseMapboxInitializer.globalLock.tryLock(50L, TimeUnit.MILLISECONDS)) {
                if (skipFurtherInitialization(initializerClass)) {
                    return;
                }
            }
            try {
                InitializerData initializerData2 = getInitializersMap$common_release().get(initializerClass);
                if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    if ((initializerData2 != null ? initializerData2.getState() : null) != InitializerState.IN_PROGRESS) {
                        android.util.Log.i(BaseMapboxInitializer.TAG, "Init for " + initializerClass.getSimpleName() + " is happening from non-main thread!");
                    }
                }
                try {
                    if (initializerData2 != null) {
                        if (!skipFurtherInitialization(initializerClass)) {
                            initializerData = initializerData2;
                        }
                        return;
                    } else {
                        initializerData = new InitializerData(0L, null, 0, 7, null);
                        getInitializersMap$common_release().put(initializerClass, initializerData);
                    }
                    BaseMapboxInitializer.INSTANCE.updateState(initializerClass, InitializerState.IN_PROGRESS);
                    AppInitializer.getInstance(appContext$common_release).initializeComponent(initializerClass);
                    android.util.Log.i(BaseMapboxInitializer.TAG, "Initialized " + initializerClass.getSimpleName() + " successfully");
                    updateState(initializerClass, InitializerState.SUCCESS);
                    return;
                } catch (Throwable th) {
                    throw new MapboxInitializerException(copy$default, appContext$common_release, th);
                }
                copy$default = InitializerData.copy$default(initializerData, 0L, null, initializerData.getCurrentInitAttempt() + 1, 3, null);
                getInitializersMap$common_release().put(initializerClass, copy$default);
                android.util.Log.i(BaseMapboxInitializer.TAG, "MapboxInitializer started " + initializerClass.getSimpleName() + " initialization, attempt " + copy$default.getCurrentInitAttempt());
            } finally {
                BaseMapboxInitializer.globalLock.unlock();
            }
        }

        private final void runCatchingEnhanced(Context context, InitializerData initializerData, Function0<Unit> function) throws MapboxInitializerException {
            try {
                function.invoke();
            } catch (Throwable th) {
                throw new MapboxInitializerException(initializerData, context, th);
            }
        }

        private final boolean skipFurtherInitialization(Class<?> cls) {
            InitializerData initializerData = getInitializersMap$common_release().get(cls);
            if (initializerData != null) {
                return initializerData.getState() == InitializerState.SUCCESS || initializerData.getState() == InitializerState.IN_PROGRESS;
            }
            return false;
        }

        private final void updatePendingInitializers(Set<? extends Class<? extends Initializer<?>>> updatedClasses, InitializerState state) {
            boolean isEmpty;
            synchronized (getPendingInitializerClasses$common_release()) {
                try {
                    if (state != InitializerState.SUCCESS && state != InitializerState.FAILURE) {
                        BaseMapboxInitializer.INSTANCE.getPendingInitializerClasses$common_release().addAll(updatedClasses);
                        isEmpty = BaseMapboxInitializer.INSTANCE.getPendingInitializerClasses$common_release().isEmpty();
                    }
                    BaseMapboxInitializer.INSTANCE.getPendingInitializerClasses$common_release().removeAll(updatedClasses);
                    isEmpty = BaseMapboxInitializer.INSTANCE.getPendingInitializerClasses$common_release().isEmpty();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (isEmpty) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    notifySDKThreadsAllowed$common_release();
                    Result.m25294constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m25294constructorimpl(ResultKt.createFailure(th2));
                }
            }
        }

        @VisibleForTesting(otherwise = 2)
        @NotNull
        public final Set<Class<? extends Initializer<?>>> discoverPendingMapboxInitializers$common_release() {
            ArrayList<String> arrayList;
            Set<String> keySet;
            boolean startsWith$default;
            Context appContext$common_release = getAppContext$common_release();
            if (appContext$common_release == null) {
                return discoverPendingMapboxInitializers$fallback("application context is not available");
            }
            try {
                Bundle bundle = appContext$common_release.getPackageManager().getProviderInfo(new ComponentName(appContext$common_release.getPackageName(), BaseMapboxInitializer.STARTUP_PROVIDER_NAME), 128).metaData;
                if (bundle == null || (keySet = bundle.keySet()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (T t : keySet) {
                        String str = (String) t;
                        str.getClass();
                        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, BaseMapboxInitializer.MAPBOX_PACKAGE_PREFIX, false, 2, null);
                        if (startsWith$default) {
                            arrayList.add(t);
                        }
                    }
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (String str2 : arrayList) {
                        try {
                            Class<?> cls = Class.forName(str2);
                            if (BaseMapboxInitializer.class.isAssignableFrom(cls)) {
                                Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
                                newInstance.getClass();
                                linkedHashSet.add(((BaseMapboxInitializer) newInstance).getInitializerClass());
                            }
                        } catch (Throwable th) {
                            android.util.Log.e(BaseMapboxInitializer.TAG, "Failed to resolve discovered Mapbox initializer " + str2 + ": " + th.getMessage());
                        }
                    }
                    if (linkedHashSet.isEmpty()) {
                        return discoverPendingMapboxInitializers$fallback("no valid Mapbox initializers found in androidx.startup metadata");
                    }
                    Set<Class<? extends Initializer<?>>> keySet2 = getInitializersMap$common_release().keySet();
                    keySet2.getClass();
                    linkedHashSet.addAll(keySet2);
                    return linkedHashSet;
                }
                return discoverPendingMapboxInitializers$fallback("no Mapbox entries found in androidx.startup metadata");
            } catch (Throwable th2) {
                return discoverPendingMapboxInitializers$fallback(ParcelCompat$$ExternalSyntheticOutline0.m(th2, new StringBuilder("failed to read androidx.startup metadata: ")));
            }
        }

        @Nullable
        public final Context getAppContext$common_release() {
            return BaseMapboxInitializer.appContext;
        }

        @NotNull
        public final ConcurrentHashMap<Class<? extends Initializer<?>>, InitializerData> getInitializersMap$common_release() {
            return BaseMapboxInitializer.initializersMap;
        }

        @NotNull
        public final Set<Class<? extends Initializer<?>>> getPendingInitializerClasses$common_release() {
            return (Set) BaseMapboxInitializer.pendingInitializerClasses$delegate.getValue();
        }

        @VisibleForTesting(otherwise = 2)
        public final void notifySDKThreadsAllowed$common_release() {
            allowSDKThreads();
        }

        public final void setAppContext$common_release(@Nullable Context context) {
            BaseMapboxInitializer.appContext = context;
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void updateState(@NotNull Class<? extends Initializer<?>> initializerClass, @NotNull InitializerState state) {
            InitializerState initializerState;
            Unit unit;
            InitializerData initializerData;
            initializerClass.getClass();
            state.getClass();
            InitializerData initializerData2 = getInitializersMap$common_release().get(initializerClass);
            if (initializerData2 == null) {
                InitializerData initializerData3 = new InitializerData(0L, state, 0, 5, null);
                initializerState = state;
                initializerData2 = initializerData3;
            } else {
                initializerState = state;
            }
            LinkedHashSet<Class<? extends Initializer<?>>> linkedHashSet = new LinkedHashSet();
            getAllDependencies(initializerClass, linkedHashSet);
            for (Class<? extends Initializer<?>> cls : linkedHashSet) {
                Companion companion = BaseMapboxInitializer.INSTANCE;
                InitializerData initializerData4 = companion.getInitializersMap$common_release().get(cls);
                if (initializerData4 != null) {
                    if (initializerData4.getState() != InitializerState.SUCCESS) {
                        companion.getInitializersMap$common_release().put(cls, InitializerData.copy$default(initializerData4, 0L, initializerState, 0, 5, null));
                    }
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    initializerData = initializerData2;
                    companion.getInitializersMap$common_release().put(cls, InitializerData.copy$default(initializerData, 0L, initializerState, 0, 5, null));
                } else {
                    initializerData = initializerData2;
                }
                initializerData2 = initializerData;
            }
            getInitializersMap$common_release().put(initializerClass, InitializerData.copy$default(initializerData2, 0L, initializerState, 0, 5, null));
            linkedHashSet.add(initializerClass);
            updatePendingInitializers(linkedHashSet, initializerState);
        }

        private Companion() {
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getAppContext$common_release$annotations() {
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getInitializersMap$common_release$annotations() {
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getPendingInitializerClasses$common_release$annotations() {
        }

        @JvmStatic
        public final <T> void init(@NotNull Class<? extends Initializer<T>> initializerClass) {
            initializerClass.getClass();
            init(initializerClass, false);
        }
    }
}
