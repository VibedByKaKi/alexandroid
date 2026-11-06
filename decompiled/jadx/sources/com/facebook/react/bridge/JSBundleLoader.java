package com.facebook.react.bridge;

import android.content.Context;
import android.content.res.AssetManager;
import com.facebook.react.common.DebugServerException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/facebook/react/bridge/JSBundleLoader;", "", "<init>", "()V", "loadScript", "", "delegate", "Lcom/facebook/react/bridge/JSBundleLoaderDelegate;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class JSBundleLoader {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    @NotNull
    public static final JSBundleLoader createAssetLoader(@NotNull Context context, @NotNull String str, boolean z) {
        return INSTANCE.createAssetLoader(context, str, z);
    }

    @JvmStatic
    @NotNull
    public static final JSBundleLoader createCachedBundleFromNetworkLoader(@NotNull String str, @NotNull String str2) {
        return INSTANCE.createCachedBundleFromNetworkLoader(str, str2);
    }

    @JvmStatic
    @NotNull
    public static final JSBundleLoader createCachedSplitBundleFromNetworkLoader(@NotNull String str, @NotNull String str2) {
        return INSTANCE.createCachedSplitBundleFromNetworkLoader(str, str2);
    }

    @JvmStatic
    @NotNull
    public static final JSBundleLoader createFileLoader(@NotNull String str) {
        return INSTANCE.createFileLoader(str);
    }

    @NotNull
    public abstract String loadScript(@NotNull JSBundleLoaderDelegate delegate);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\tH\u0007J \u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0007J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0007¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/bridge/JSBundleLoader$Companion;", "", "<init>", "()V", "createAssetLoader", "Lcom/facebook/react/bridge/JSBundleLoader;", "context", "Landroid/content/Context;", "assetUrl", "", "loadSynchronously", "", "createFileLoader", "fileName", "createCachedBundleFromNetworkLoader", "sourceURL", "cachedFileLocation", "createCachedSplitBundleFromNetworkLoader", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final JSBundleLoader createAssetLoader(@NotNull final Context context, @NotNull final String assetUrl, final boolean loadSynchronously) {
            context.getClass();
            assetUrl.getClass();
            return new JSBundleLoader() { // from class: com.facebook.react.bridge.JSBundleLoader$Companion$createAssetLoader$1
                @Override // com.facebook.react.bridge.JSBundleLoader
                public String loadScript(JSBundleLoaderDelegate delegate) {
                    delegate.getClass();
                    AssetManager assets = context.getAssets();
                    assets.getClass();
                    delegate.loadScriptFromAssets(assets, assetUrl, loadSynchronously);
                    return assetUrl;
                }
            };
        }

        @JvmStatic
        @NotNull
        public final JSBundleLoader createCachedBundleFromNetworkLoader(@NotNull final String sourceURL, @NotNull final String cachedFileLocation) {
            sourceURL.getClass();
            cachedFileLocation.getClass();
            return new JSBundleLoader() { // from class: com.facebook.react.bridge.JSBundleLoader$Companion$createCachedBundleFromNetworkLoader$1
                @Override // com.facebook.react.bridge.JSBundleLoader
                public String loadScript(JSBundleLoaderDelegate delegate) {
                    delegate.getClass();
                    try {
                        delegate.loadScriptFromFile(cachedFileLocation, sourceURL, false);
                        return sourceURL;
                    } catch (Exception e) {
                        DebugServerException.Companion companion = DebugServerException.Companion;
                        String str = sourceURL;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        throw companion.makeGeneric(str, message, e);
                    }
                }
            };
        }

        @JvmStatic
        @NotNull
        public final JSBundleLoader createCachedSplitBundleFromNetworkLoader(@NotNull final String sourceURL, @NotNull final String cachedFileLocation) {
            sourceURL.getClass();
            cachedFileLocation.getClass();
            return new JSBundleLoader() { // from class: com.facebook.react.bridge.JSBundleLoader$Companion$createCachedSplitBundleFromNetworkLoader$1
                @Override // com.facebook.react.bridge.JSBundleLoader
                public String loadScript(JSBundleLoaderDelegate delegate) {
                    delegate.getClass();
                    try {
                        delegate.loadSplitBundleFromFile(cachedFileLocation, sourceURL);
                        return sourceURL;
                    } catch (Exception e) {
                        DebugServerException.Companion companion = DebugServerException.Companion;
                        String str = sourceURL;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        throw companion.makeGeneric(str, message, e);
                    }
                }
            };
        }

        @JvmStatic
        @NotNull
        public final JSBundleLoader createFileLoader(@NotNull final String fileName, @NotNull final String assetUrl, final boolean loadSynchronously) {
            fileName.getClass();
            assetUrl.getClass();
            return new JSBundleLoader() { // from class: com.facebook.react.bridge.JSBundleLoader$Companion$createFileLoader$1
                @Override // com.facebook.react.bridge.JSBundleLoader
                public String loadScript(JSBundleLoaderDelegate delegate) {
                    delegate.getClass();
                    delegate.loadScriptFromFile(fileName, assetUrl, loadSynchronously);
                    return fileName;
                }
            };
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final JSBundleLoader createFileLoader(@NotNull String fileName) {
            fileName.getClass();
            return createFileLoader(fileName, fileName, false);
        }
    }

    @JvmStatic
    @NotNull
    public static final JSBundleLoader createFileLoader(@NotNull String str, @NotNull String str2, boolean z) {
        return INSTANCE.createFileLoader(str, str2, z);
    }
}
