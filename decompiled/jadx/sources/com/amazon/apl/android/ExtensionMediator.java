package com.amazon.apl.android;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexaext.ExtensionProxy;
import com.amazon.alexaext.ExtensionRegistrar;
import com.amazon.alexaext.ExtensionResourceProvider;
import com.amazon.alexaext.RemoteExtensionProxy;
import com.amazon.apl.android.dependencies.ExtensionFilterParameters;
import com.amazon.apl.android.dependencies.IExtensionEventCallback;
import com.amazon.apl.android.dependencies.IExtensionImageFilterCallback;
import com.amazon.common.BoundObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ExtensionMediator extends BoundObject implements IExtensionEventCallback, IExtensionImageFilterCallback, IDocumentLifecycleListener {
    private static final String TAG = "ExtensionMediator";
    ExtensionRegistrar extensionRegistrar;
    public ExtensionResourceProvider extensionResourceProvider;
    private Map<String, IExtensionImageFilterCallback> mCallbacks = new HashMap();
    APLExtensionExecutor mExecutor;
    private RemoteExtensionProxy.IExtensionDisconnectCallback mExtensionDisconnectCallback;
    private IExtensionGrantRequestCallback mExtensionGrantRequestCallback;
    private ILoadExtensionCallback mLoadExtensionCallback;
    private String mLogId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface IExtensionGrantRequestCallback {
        boolean isExtensionGranted(String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ILoadExtensionCallback {
        Runnable onFailure();

        Runnable onSuccess();
    }

    private ExtensionMediator(ExtensionRegistrar extensionRegistrar, ExtensionResourceProvider extensionResourceProvider, APLExtensionExecutor aPLExtensionExecutor, DocumentSession documentSession) {
        this.mExecutor = aPLExtensionExecutor;
        bind(nCreate(extensionRegistrar.getNativeHandle(), extensionResourceProvider.getNativeHandle(), aPLExtensionExecutor.getNativeHandle(), documentSession.getNativeHandle()));
    }

    public static ExtensionMediator create(@NonNull ExtensionRegistrar extensionRegistrar, @NonNull DocumentSession documentSession) {
        ExtensionResourceProvider extensionResourceProvider = new ExtensionResourceProvider();
        ExtensionMediator extensionMediator = new ExtensionMediator(extensionRegistrar, extensionResourceProvider, new APLExtensionExecutor(), documentSession);
        extensionMediator.extensionResourceProvider = extensionResourceProvider;
        extensionMediator.extensionRegistrar = extensionRegistrar;
        return extensionMediator;
    }

    private boolean isExtensionGranted(String str) {
        return this.mExtensionGrantRequestCallback.isExtensionGranted(str);
    }

    private native long nCreate(long j, long j2, long j3, long j4);

    private static native void nEnable(long j, boolean z);

    private static native void nFinish(long j);

    private static native void nInitializeExtensions(long j, long j2, long j3);

    private static native void nInitializeExtensions(long j, Object obj, long j2);

    private static native void nLoadExtensions(long j, long j2, long j3);

    private static native void nLoadExtensions(long j, Object obj, long j2);

    private static native void nOnSessionEnded(long j);

    public void enable(boolean z) {
        nEnable(getNativeHandle(), z);
    }

    public void finish() {
        this.extensionResourceProvider = null;
        this.mLoadExtensionCallback = null;
        nFinish(getNativeHandle());
    }

    public void initializeExtensions(RootConfig rootConfig, Content content, @NonNull IExtensionGrantRequestCallback iExtensionGrantRequestCallback) {
        this.mExtensionGrantRequestCallback = iExtensionGrantRequestCallback;
        this.mLogId = rootConfig.getSession().getLogId();
        nInitializeExtensions(getNativeHandle(), rootConfig.getNativeHandle(), content.getNativeHandle());
        setupRemoteExtensionProxy(content);
    }

    public void loadExtensions(RootConfig rootConfig, Content content, @NonNull ILoadExtensionCallback iLoadExtensionCallback) {
        this.mLoadExtensionCallback = iLoadExtensionCallback;
        nLoadExtensions(getNativeHandle(), rootConfig.getNativeHandle(), content.getNativeHandle());
    }

    @Override // com.amazon.apl.android.IDocumentLifecycleListener
    public synchronized void onDocumentRender(@NonNull RootContext rootContext) {
        this.mExecutor.setRootContext(rootContext);
        this.mExecutor.resume();
    }

    @NonNull
    public void onExtensionsLoaded(boolean z) {
        ILoadExtensionCallback iLoadExtensionCallback = this.mLoadExtensionCallback;
        if (iLoadExtensionCallback == null) {
            Log.wtf(TAG, "OnComplete already called for this document.");
            return;
        }
        if (z) {
            iLoadExtensionCallback.onSuccess().run();
        } else {
            Log.i(TAG, "Required extensions failed to load.");
            this.mLoadExtensionCallback.onFailure().run();
        }
        this.mLoadExtensionCallback = null;
    }

    public void onSessionEnded() {
        nOnSessionEnded(getNativeHandle());
    }

    public void pauseForInflation() {
        this.mExecutor.pause();
    }

    @Override // com.amazon.apl.android.dependencies.IExtensionImageFilterCallback
    @NonNull
    public Bitmap processImage(@Nullable Bitmap bitmap, @Nullable Bitmap bitmap2, ExtensionFilterParameters extensionFilterParameters) {
        IExtensionImageFilterCallback iExtensionImageFilterCallback = this.mCallbacks.get(extensionFilterParameters.getURI());
        return iExtensionImageFilterCallback == null ? bitmap : iExtensionImageFilterCallback.processImage(bitmap, bitmap2, extensionFilterParameters);
    }

    public void registerImageFilters(ExtensionRegistrar extensionRegistrar, Content content, RootConfig rootConfig) {
        Iterator<String> it2 = content.getExtensionRequests().iterator();
        while (it2.hasNext()) {
            ExtensionProxy extension = extensionRegistrar.getExtension(it2.next());
            if (extension != null && (extension instanceof LegacyLocalExtensionProxy)) {
                LegacyLocalExtensionProxy legacyLocalExtensionProxy = (LegacyLocalExtensionProxy) extension;
                List<ExtensionFilterDefinition> filterDefinitions = legacyLocalExtensionProxy.getFilterDefinitions();
                Iterator<ExtensionFilterDefinition> it3 = filterDefinitions.iterator();
                while (it3.hasNext()) {
                    rootConfig.registerExtensionFilter(it3.next());
                }
                if (!filterDefinitions.isEmpty()) {
                    this.mCallbacks.put(extension.getUri(), legacyLocalExtensionProxy.getFilterCallback());
                }
            }
        }
    }

    public void setExtensionDisconnectCallback(RemoteExtensionProxy.IExtensionDisconnectCallback iExtensionDisconnectCallback) {
        this.mExtensionDisconnectCallback = iExtensionDisconnectCallback;
    }

    public void setupRemoteExtensionProxy(Content content) {
        for (String str : content.getExtensionRequests()) {
            ExtensionProxy extension = this.extensionRegistrar.getExtension(str);
            if (extension instanceof RemoteExtensionProxy) {
                RemoteExtensionProxy remoteExtensionProxy = (RemoteExtensionProxy) extension;
                if (remoteExtensionProxy.getNativeHandle() == 0) {
                    AppLaunchChecker$$ExternalSyntheticOutline0.m("RemoteExtensionProxy for URI: ", str, " has an invalid native handle.", TAG);
                } else {
                    RemoteExtensionProxy.IExtensionDisconnectCallback iExtensionDisconnectCallback = this.mExtensionDisconnectCallback;
                    if (iExtensionDisconnectCallback == null) {
                        Log.e(TAG, "mExtensionDisconnectCallback is null for URI: " + str);
                    } else {
                        remoteExtensionProxy.setExtensionDisconnectCallback(iExtensionDisconnectCallback);
                    }
                }
            }
        }
    }

    public void loadExtensions(Map<String, Object> map, Content content, @NonNull ILoadExtensionCallback iLoadExtensionCallback) {
        this.mLoadExtensionCallback = iLoadExtensionCallback;
        nLoadExtensions(getNativeHandle(), map, content.getNativeHandle());
    }

    public void initializeExtensions(Map<String, Object> map, Content content, @NonNull IExtensionGrantRequestCallback iExtensionGrantRequestCallback) {
        this.mExtensionGrantRequestCallback = iExtensionGrantRequestCallback;
        nInitializeExtensions(getNativeHandle(), map, content.getNativeHandle());
        setupRemoteExtensionProxy(content);
    }

    @Override // com.amazon.apl.android.dependencies.IExtensionEventCallback
    public void onExtensionEvent(String str, String str2, Map<String, Object> map, Map<String, Object> map2, IExtensionEventCallback.IExtensionEventCallbackResult iExtensionEventCallbackResult) {
    }
}
