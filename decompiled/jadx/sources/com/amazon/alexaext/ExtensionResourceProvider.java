package com.amazon.alexaext;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import androidx.annotation.NonNull;
import com.amazon.alexaext.ResourceHolder;
import com.amazon.common.BoundObject;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ExtensionResourceProvider extends BoundObject {
    static ExtensionResourceProvider noOpInstance;
    final Presenter<ResourceHolder.ViewDelegate, View> customPresenter;
    final Presenter<SurfaceHolder, SurfaceView> defaultPresenter;
    private final Map<String, ResourceHolder> mResources = new HashMap();
    final Presenter<SurfaceHolder, SurfaceView> surfacePresenter;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public abstract class Presenter<R, V extends View> {
        public Presenter() {
        }

        public void bindResource(ResourceHolder resourceHolder, R r) {
            resourceHolder.setResource(r);
            ExtensionResourceProvider.this.associateResource(resourceHolder);
            ResourceHolder.Callback callback = resourceHolder.getCallback();
            if (callback != null) {
                callback.resourceReady(resourceHolder.resourceId());
            }
        }

        public void bindView(ResourceHolder resourceHolder, V v) {
            resourceHolder.setView(v);
            ResourceHolder.Callback callback = resourceHolder.getCallback();
            if (callback != null) {
                callback.viewReady(resourceHolder.resourceId(), v);
            }
        }

        public abstract ResourceHolder<R, V> createResourceHolder(String str, Context context, ResourceHolder.Callback callback);

        public void unbindResource(ResourceHolder resourceHolder) {
            ResourceHolder.Callback callback = resourceHolder.getCallback();
            if (callback != null) {
                callback.resourceDestroyed(resourceHolder.resourceId());
            }
            ExtensionResourceProvider.this.disassociateResource(resourceHolder);
            resourceHolder.setResource(null);
        }

        public void unbindView(ResourceHolder resourceHolder) {
            ResourceHolder.Callback callback = resourceHolder.getCallback();
            if (callback != null) {
                callback.viewDestroyed(resourceHolder.resourceId());
            }
            resourceHolder.setView(null);
        }
    }

    public ExtensionResourceProvider() {
        Presenter<SurfaceHolder, SurfaceView> presenter = new Presenter<SurfaceHolder, SurfaceView>() { // from class: com.amazon.alexaext.ExtensionResourceProvider.2
            @Override // com.amazon.alexaext.ExtensionResourceProvider.Presenter
            public ResourceHolder<SurfaceHolder, SurfaceView> createResourceHolder(String str, Context context, ResourceHolder.Callback callback) {
                final ResourceHolder<SurfaceHolder, SurfaceView> resourceHolder = new ResourceHolder<>(str);
                resourceHolder.setCallback(callback);
                final SurfaceView surfaceView = new SurfaceView(context);
                surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() { // from class: com.amazon.alexaext.ExtensionResourceProvider.2.1
                    @Override // android.view.SurfaceHolder.Callback
                    public synchronized void surfaceCreated(SurfaceHolder surfaceHolder) {
                        resourceHolder.setResource(surfaceView.getHolder());
                        bindResource(resourceHolder, surfaceHolder);
                    }

                    @Override // android.view.SurfaceHolder.Callback
                    public synchronized void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                        unbindResource(resourceHolder);
                        unbindView(resourceHolder);
                    }

                    @Override // android.view.SurfaceHolder.Callback
                    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                    }
                });
                bindView(resourceHolder, surfaceView);
                return resourceHolder;
            }
        };
        this.surfacePresenter = presenter;
        this.customPresenter = new Presenter<ResourceHolder.ViewDelegate, View>() { // from class: com.amazon.alexaext.ExtensionResourceProvider.3
            @Override // com.amazon.alexaext.ExtensionResourceProvider.Presenter
            public ResourceHolder<ResourceHolder.ViewDelegate, View> createResourceHolder(@NonNull String str, @NonNull Context context, ResourceHolder.Callback callback) {
                final ResourceHolder<ResourceHolder.ViewDelegate, View> resourceHolder = new ResourceHolder<>(str);
                resourceHolder.setCallback(callback);
                final WeakReference weakReference = new WeakReference(context);
                bindResource(resourceHolder, new ResourceHolder.ViewDelegate() { // from class: com.amazon.alexaext.ExtensionResourceProvider.3.1
                    @Override // com.amazon.alexaext.ResourceHolder.ViewDelegate
                    public Context getContext() {
                        return (Context) weakReference.get();
                    }

                    @Override // com.amazon.alexaext.ResourceHolder.ViewDelegate
                    public void setContentView(View view) {
                        bindView(resourceHolder, view);
                    }
                });
                return resourceHolder;
            }
        };
        this.defaultPresenter = presenter;
        bind(nCreate());
    }

    private native long nCreate();

    public static ExtensionResourceProvider noOpInstance() {
        if (noOpInstance == null) {
            noOpInstance = new ExtensionResourceProvider() { // from class: com.amazon.alexaext.ExtensionResourceProvider.1
                @Override // com.amazon.alexaext.ExtensionResourceProvider
                public Presenter selectPresenter(String str) {
                    return null;
                }
            };
        }
        return noOpInstance;
    }

    private long requestResource(String str) {
        ResourceHolder resourceHolder = this.mResources.get(str);
        if (resourceHolder != null) {
            return resourceHolder.getNativeHandle();
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Resource Not Available.");
        return 0L;
    }

    public void associateResource(@NonNull ResourceHolder resourceHolder) {
        this.mResources.put(resourceHolder.resourceId(), resourceHolder);
    }

    public void disassociateResource(@NonNull ResourceHolder resourceHolder) {
        this.mResources.remove(resourceHolder.resourceId());
    }

    public ResourceHolder getResource(String str) {
        ResourceHolder resourceHolder = this.mResources.get(str);
        if (resourceHolder != null) {
            return resourceHolder;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Resource Not Available.");
        return null;
    }

    public Presenter selectPresenter(String str) {
        String upperCase = str.toUpperCase();
        upperCase.getClass();
        switch (upperCase) {
            case "DEFAULT":
            case "":
                return this.defaultPresenter;
            case "SURFACE":
                return this.surfacePresenter;
            case "CUSTOM":
                return this.customPresenter;
            default:
                Single$$ExternalSyntheticBUOutline0.m$2("The resource type is not supported: ".concat(str));
                return null;
        }
    }
}
