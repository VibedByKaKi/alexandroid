package androidx.webkit;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceResponse;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.core.util.AtomicFile$$ExternalSyntheticBUOutline0;
import androidx.core.util.Pair;
import androidx.webkit.internal.AssetHelper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class WebViewAssetLoader {
    public static final String DEFAULT_DOMAIN = "appassets.androidplatform.net";
    private static final String TAG = "WebViewAssetLoader";
    private final List<PathMatcher> mMatchers;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private String mDomain = WebViewAssetLoader.DEFAULT_DOMAIN;
        private final List<Pair<String, PathHandler>> mHandlerList = new ArrayList();
        private boolean mHttpAllowed;

        public Builder addPathHandler(String str, PathHandler pathHandler) {
            this.mHandlerList.add(Pair.create(str, pathHandler));
            return this;
        }

        public WebViewAssetLoader build() {
            ArrayList arrayList = new ArrayList();
            for (Pair<String, PathHandler> pair : this.mHandlerList) {
                arrayList.add(new PathMatcher(this.mDomain, pair.first, this.mHttpAllowed, pair.second));
            }
            return new WebViewAssetLoader(arrayList);
        }

        public Builder setDomain(String str) {
            this.mDomain = str;
            return this;
        }

        public Builder setHttpAllowed(boolean z) {
            this.mHttpAllowed = z;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InternalStoragePathHandler implements PathHandler {
        private static final String[] FORBIDDEN_DATA_DIRS = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};
        private final File mDirectory;

        public InternalStoragePathHandler(Context context, File file) {
            try {
                this.mDirectory = new File(AssetHelper.getCanonicalDirPath(file));
                if (isAllowedInternalStorageDir(context)) {
                    return;
                }
                throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
            } catch (IOException e) {
                AtomicFile$$ExternalSyntheticBUOutline0.m(e, file.getPath(), "Failed to resolve the canonical path for the given directory: ");
                throw null;
            }
        }

        private boolean isAllowedInternalStorageDir(Context context) throws IOException {
            String canonicalDirPath = AssetHelper.getCanonicalDirPath(this.mDirectory);
            String canonicalDirPath2 = AssetHelper.getCanonicalDirPath(context.getCacheDir());
            String canonicalDirPath3 = AssetHelper.getCanonicalDirPath(AssetHelper.getDataDir(context));
            if ((!canonicalDirPath.startsWith(canonicalDirPath2) && !canonicalDirPath.startsWith(canonicalDirPath3)) || canonicalDirPath.equals(canonicalDirPath2) || canonicalDirPath.equals(canonicalDirPath3)) {
                return false;
            }
            for (String str : FORBIDDEN_DATA_DIRS) {
                if (canonicalDirPath.startsWith(canonicalDirPath3 + str)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.webkit.WebViewAssetLoader.PathHandler
        @WorkerThread
        public WebResourceResponse handle(String str) {
            File canonicalFileIfChild;
            try {
                canonicalFileIfChild = AssetHelper.getCanonicalFileIfChild(this.mDirectory, str);
            } catch (IOException e) {
                Log.e(WebViewAssetLoader.TAG, "Error opening the requested path: " + str, e);
            }
            if (canonicalFileIfChild != null) {
                return new WebResourceResponse(AssetHelper.guessMimeType(str), null, AssetHelper.openFile(canonicalFileIfChild));
            }
            Log.e(WebViewAssetLoader.TAG, String.format("The requested file: %s is outside the mounted directory: %s", str, this.mDirectory));
            return new WebResourceResponse(null, null, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface PathHandler {
        @WorkerThread
        WebResourceResponse handle(String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public static class PathMatcher {
        static final String HTTPS_SCHEME = "https";
        static final String HTTP_SCHEME = "http";
        final String mAuthority;
        final PathHandler mHandler;
        final boolean mHttpEnabled;
        final String mPath;

        public PathMatcher(String str, String str2, boolean z, PathHandler pathHandler) {
            if (str2.isEmpty() || str2.charAt(0) != '/') {
                Single$$ExternalSyntheticBUOutline0.m$3("Path should start with a slash '/'.");
                throw null;
            }
            if (!str2.endsWith("/")) {
                Single$$ExternalSyntheticBUOutline0.m$3("Path should end with a slash '/'");
                throw null;
            }
            this.mAuthority = str;
            this.mPath = str2;
            this.mHttpEnabled = z;
            this.mHandler = pathHandler;
        }

        @WorkerThread
        public String getSuffixPath(String str) {
            return str.replaceFirst(this.mPath, "");
        }

        @WorkerThread
        public PathHandler match(Uri uri) {
            if (uri.getScheme().equals("http") && !this.mHttpEnabled) {
                return null;
            }
            if ((uri.getScheme().equals("http") || uri.getScheme().equals("https")) && uri.getAuthority().equals(this.mAuthority) && uri.getPath().startsWith(this.mPath)) {
                return this.mHandler;
            }
            return null;
        }
    }

    public WebViewAssetLoader(List<PathMatcher> list) {
        this.mMatchers = list;
    }

    @WorkerThread
    public WebResourceResponse shouldInterceptRequest(Uri uri) {
        WebResourceResponse handle;
        for (PathMatcher pathMatcher : this.mMatchers) {
            PathHandler match = pathMatcher.match(uri);
            if (match != null && (handle = match.handle(pathMatcher.getSuffixPath(uri.getPath()))) != null) {
                return handle;
            }
        }
        return null;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AssetsPathHandler implements PathHandler {
        private final AssetHelper mAssetHelper;

        public AssetsPathHandler(Context context) {
            this.mAssetHelper = new AssetHelper(context);
        }

        @Override // androidx.webkit.WebViewAssetLoader.PathHandler
        @WorkerThread
        public WebResourceResponse handle(String str) {
            try {
                return new WebResourceResponse(AssetHelper.guessMimeType(str), null, this.mAssetHelper.openAsset(str));
            } catch (IOException e) {
                Log.e(WebViewAssetLoader.TAG, "Error opening asset path: " + str, e);
                return new WebResourceResponse(null, null, null);
            }
        }

        @VisibleForTesting
        public AssetsPathHandler(AssetHelper assetHelper) {
            this.mAssetHelper = assetHelper;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ResourcesPathHandler implements PathHandler {
        private final AssetHelper mAssetHelper;

        public ResourcesPathHandler(Context context) {
            this.mAssetHelper = new AssetHelper(context);
        }

        @Override // androidx.webkit.WebViewAssetLoader.PathHandler
        @WorkerThread
        public WebResourceResponse handle(String str) {
            try {
                return new WebResourceResponse(AssetHelper.guessMimeType(str), null, this.mAssetHelper.openResource(str));
            } catch (Resources.NotFoundException e) {
                Log.e(WebViewAssetLoader.TAG, "Resource not found from the path: " + str, e);
                return new WebResourceResponse(null, null, null);
            } catch (IOException e2) {
                Log.e(WebViewAssetLoader.TAG, "Error opening resource from the path: " + str, e2);
                return new WebResourceResponse(null, null, null);
            }
        }

        @VisibleForTesting
        public ResourcesPathHandler(AssetHelper assetHelper) {
            this.mAssetHelper = assetHelper;
        }
    }
}
