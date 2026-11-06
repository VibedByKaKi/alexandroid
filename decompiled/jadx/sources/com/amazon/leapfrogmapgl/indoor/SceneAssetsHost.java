package com.amazon.leapfrogmapgl.indoor;

import android.util.Log;
import com.dee.app.contacts.common.constants.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0012J\b\u0010\u0013\u001a\u00020\u0010H\u0007J\u001b\u0010\u0014\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0000¢\u0006\u0002\b\u0016J\u001b\u0010\u0017\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0000¢\u0006\u0002\b\u0018J\r\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R&\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/amazon/leapfrogmapgl/indoor/SceneAssetsHost;", "", "<init>", "()V", Constants.LOG_TAG, "", "provider", "Lcom/amazon/leapfrogmapgl/indoor/SceneAssetsHost$Provider;", "getProvider$annotations", "getProvider", "()Lcom/amazon/leapfrogmapgl/indoor/SceneAssetsHost$Provider;", "setProvider", "(Lcom/amazon/leapfrogmapgl/indoor/SceneAssetsHost$Provider;)V", "rootListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function0;", "", "applyCurrentRoot", "applyCurrentRoot$LeapfrogMapGLAndroid_release", "notifyRootAvailable", "addRootListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addRootListener$LeapfrogMapGLAndroid_release", "removeRootListener", "removeRootListener$LeapfrogMapGLAndroid_release", "isReadyToBoot", "", "isReadyToBoot$LeapfrogMapGLAndroid_release", "Provider", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSceneAssetsHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SceneAssetsHost.kt\ncom/amazon/leapfrogmapgl/indoor/SceneAssetsHost\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1#2:66\n1869#3,2:67\n*S KotlinDebug\n*F\n+ 1 SceneAssetsHost.kt\ncom/amazon/leapfrogmapgl/indoor/SceneAssetsHost\n*L\n44#1:67,2\n*E\n"})
/* loaded from: classes5.dex */
public final class SceneAssetsHost {

    @NotNull
    private static final String TAG = "FTV_SceneAssetsHost";

    @Nullable
    private static volatile Provider provider;

    @NotNull
    public static final SceneAssetsHost INSTANCE = new SceneAssetsHost();

    @NotNull
    private static final CopyOnWriteArrayList<Function0<Unit>> rootListeners = new CopyOnWriteArrayList<>();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/amazon/leapfrogmapgl/indoor/SceneAssetsHost$Provider;", "", "currentRoot", "", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Provider {
        @Nullable
        String currentRoot();
    }

    private SceneAssetsHost() {
    }

    @Nullable
    public static final Provider getProvider() {
        return provider;
    }

    @JvmStatic
    public static final void notifyRootAvailable() {
        String str;
        INSTANCE.applyCurrentRoot$LeapfrogMapGLAndroid_release();
        File root = SceneAssets.INSTANCE.getRoot();
        if (root == null || (str = root.getPath()) == null) {
            str = "(none)";
        }
        Log.i(TAG, "FTV_SCENE_ASSETS_AVAILABLE ".concat(str));
        Iterator<T> it2 = rootListeners.iterator();
        while (it2.hasNext()) {
            Function0 function0 = (Function0) it2.next();
            try {
                Result.Companion companion = Result.INSTANCE;
                function0.invoke();
                Result.m25294constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m25294constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    public static final void setProvider(@Nullable Provider provider2) {
        provider = provider2;
    }

    public final void addRootListener$LeapfrogMapGLAndroid_release(@NotNull Function0<Unit> listener) {
        listener.getClass();
        rootListeners.add(listener);
    }

    public final void applyCurrentRoot$LeapfrogMapGLAndroid_release() {
        Object m25294constructorimpl;
        Provider provider2 = provider;
        if (provider2 == null) {
            return;
        }
        SceneAssets sceneAssets = SceneAssets.INSTANCE;
        try {
            Result.Companion companion = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(provider2.currentRoot());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m25300isFailureimpl(m25294constructorimpl)) {
            m25294constructorimpl = null;
        }
        sceneAssets.setRoot((String) m25294constructorimpl);
    }

    public final boolean isReadyToBoot$LeapfrogMapGLAndroid_release() {
        SceneAssets sceneAssets = SceneAssets.INSTANCE;
        if (sceneAssets.getRoot() != null || provider == null) {
            return true;
        }
        applyCurrentRoot$LeapfrogMapGLAndroid_release();
        return sceneAssets.getRoot() != null;
    }

    public final void removeRootListener$LeapfrogMapGLAndroid_release(@NotNull Function0<Unit> listener) {
        listener.getClass();
        rootListeners.remove(listener);
    }

    @JvmStatic
    public static /* synthetic */ void getProvider$annotations() {
    }
}
