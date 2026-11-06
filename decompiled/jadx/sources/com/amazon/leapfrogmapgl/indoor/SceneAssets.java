package com.amazon.leapfrogmapgl.indoor;

import android.content.res.AssetManager;
import android.util.Log;
import com.dee.app.contacts.common.constants.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0005J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u0005J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/amazon/leapfrogmapgl/indoor/SceneAssets;", "", "<init>", "()V", Constants.LOG_TAG, "", "BOOT_FAILED_MARKER", "value", "Ljava/io/File;", "root", "getRoot", "()Ljava/io/File;", "requestedPath", "failedPath", "setRoot", "", "path", "open", "Ljava/io/InputStream;", "assets", "Landroid/content/res/AssetManager;", "file", "isSafeRelativePath", "isSafeRelativePath$LeapfrogMapGLAndroid_release", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSceneAssets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SceneAssets.kt\ncom/amazon/leapfrogmapgl/indoor/SceneAssets\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1#2:101\n2746#3,3:102\n*S KotlinDebug\n*F\n+ 1 SceneAssets.kt\ncom/amazon/leapfrogmapgl/indoor/SceneAssets\n*L\n97#1:102,3\n*E\n"})
/* loaded from: classes5.dex */
public final class SceneAssets {

    @NotNull
    public static final String BOOT_FAILED_MARKER = ".boot_failed";

    @NotNull
    public static final SceneAssets INSTANCE = new SceneAssets();

    @NotNull
    private static final String TAG = "FTV_SceneAssets";

    @Nullable
    private static volatile String failedPath;

    @Nullable
    private static volatile String requestedPath;

    @Nullable
    private static volatile File root;

    private SceneAssets() {
    }

    @Nullable
    public final File file(@NotNull String path) {
        boolean startsWith$default;
        path.getClass();
        File file = root;
        if (file != null) {
            if (!isSafeRelativePath$LeapfrogMapGLAndroid_release(path)) {
                Log.e(TAG, "FTV_SCENE_ASSET_REJECTED ".concat(path));
                return null;
            }
            File canonicalFile = new File(file, path).getCanonicalFile();
            String path2 = canonicalFile.getPath();
            path2.getClass();
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(path2, file.getPath() + File.separator, false, 2, null);
            if (!startsWith$default) {
                Log.e(TAG, "FTV_SCENE_ASSET_ESCAPES_ROOT ".concat(path));
                return null;
            }
            if (canonicalFile.isFile()) {
                return canonicalFile;
            }
        }
        return null;
    }

    @Nullable
    public final File getRoot() {
        return root;
    }

    public final boolean isSafeRelativePath$LeapfrogMapGLAndroid_release(@NotNull String path) {
        boolean startsWith$default;
        boolean contains$default;
        List split$default;
        path.getClass();
        if (path.length() != 0) {
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(path, "/", false, 2, null);
            if (!startsWith$default) {
                contains$default = StringsKt__StringsKt.contains$default((CharSequence) path, '\\', false, 2, (Object) null);
                if (!contains$default) {
                    split$default = StringsKt__StringsKt.split$default(path, new char[]{'/'}, false, 0, 6, (Object) null);
                    List<String> list = split$default;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (String str : list) {
                            if (str.length() != 0 && !Intrinsics.areEqual(str, ".") && !Intrinsics.areEqual(str, "..")) {
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    public final InputStream open(@NotNull AssetManager assets, @NotNull String path) {
        assets.getClass();
        path.getClass();
        File file = file(path);
        if (file != null) {
            return new FileInputStream(file);
        }
        InputStream open = assets.open(path);
        open.getClass();
        return open;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065 A[Catch: all -> 0x0018, TryCatch #0 {, blocks: (B:73:0x000a, B:75:0x0012, B:7:0x001e, B:14:0x002b, B:18:0x0036, B:22:0x0045, B:29:0x005d, B:31:0x0065, B:34:0x00a2, B:40:0x00b2, B:43:0x00be, B:45:0x00c6, B:49:0x00cd, B:51:0x00d5, B:63:0x0080, B:66:0x0088), top: B:72:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2 A[Catch: all -> 0x0018, TRY_ENTER, TryCatch #0 {, blocks: (B:73:0x000a, B:75:0x0012, B:7:0x001e, B:14:0x002b, B:18:0x0036, B:22:0x0045, B:29:0x005d, B:31:0x0065, B:34:0x00a2, B:40:0x00b2, B:43:0x00be, B:45:0x00c6, B:49:0x00cd, B:51:0x00d5, B:63:0x0080, B:66:0x0088), top: B:72:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean setRoot(@org.jetbrains.annotations.Nullable java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.leapfrogmapgl.indoor.SceneAssets.setRoot(java.lang.String):boolean");
    }
}
