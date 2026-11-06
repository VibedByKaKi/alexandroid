package com.amazon.alexa.apl;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.apl.dagger.component.AplComponent;
import com.amazon.alexa.apl.dagger.component.AplFactory;
import com.amazon.alexa.apl.sdk.AlexaClientSdkApis;
import com.amazon.alexa.apl.uioptions.AplViewUiParams;
import com.amazon.regulator.ViewController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0001$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u0017H\u0007J\u0006\u0010\u001c\u001a\u00020\u0017J\u0006\u0010\u001d\u001a\u00020\u0017J\u0006\u0010\u001e\u001a\u00020\u0017J\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\u0017J\u000e\u0010#\u001a\u00020\f2\u0006\u0010 \u001a\u00020!R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/amazon/alexa/apl/APLRenderingEngine;", "", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mAlexaClientSdkApis", "Lcom/amazon/alexa/apl/sdk/AlexaClientSdkApis;", "mAplInteractor", "Lcom/amazon/alexa/apl/AplInteractor;", "mAplPresenter", "Lcom/amazon/alexa/apl/AplPresenter;", "mIsInitialized", "", "mOrchestrator", "Lcom/amazon/alexa/apl/APLOrchestrator;", "mViewController", "Lcom/amazon/alexa/apl/APLViewController;", "createController", "aplViewUiParams", "Lcom/amazon/alexa/apl/uioptions/AplViewUiParams;", "createViewController", "Lcom/amazon/regulator/ViewController;", "destroy", "", "handleConfigChange", "newConfig", "Landroid/content/res/Configuration;", "initAplComponent", "initialize", "pause", "release", "render", "aplRenderingAction", "Lcom/amazon/alexa/apl/AplRenderingAction;", "resume", "willRenderNewView", "Companion", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class APLRenderingEngine {
    private static final String TAG = "APLRenderingEngine";
    private AlexaClientSdkApis mAlexaClientSdkApis;
    private AplInteractor mAplInteractor;
    private AplPresenter mAplPresenter;

    @NotNull
    private Context mContext;
    private boolean mIsInitialized;
    private APLOrchestrator mOrchestrator;
    private APLViewController mViewController;

    public APLRenderingEngine(@NotNull Context context) {
        context.getClass();
        this.mContext = context;
    }

    @VisibleForTesting
    @NotNull
    public final APLViewController createController(@NotNull AplViewUiParams aplViewUiParams) {
        aplViewUiParams.getClass();
        return APLViewController.INSTANCE.create(aplViewUiParams);
    }

    @Nullable
    public final ViewController createViewController(@NotNull AplViewUiParams aplViewUiParams) {
        aplViewUiParams.getClass();
        if (!this.mIsInitialized) {
            Log.e(TAG, "Not Initialized. Initialization is necessary before use.");
            return null;
        }
        Log.i(TAG, "createViewController");
        APLViewController createController = createController(aplViewUiParams);
        this.mViewController = createController;
        if (createController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewController");
            createController = null;
        }
        AplPresenter aplPresenter = this.mAplPresenter;
        if (aplPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAplPresenter");
            aplPresenter = null;
        }
        createController.registerViewListener(aplPresenter);
        APLViewController aPLViewController = this.mViewController;
        if (aPLViewController != null) {
            return aPLViewController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mViewController");
        return null;
    }

    public final void destroy() {
        AlexaClientSdkApis alexaClientSdkApis = this.mAlexaClientSdkApis;
        if (alexaClientSdkApis == null) {
            return;
        }
        if (alexaClientSdkApis == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAlexaClientSdkApis");
            alexaClientSdkApis = null;
        }
        alexaClientSdkApis.destroy();
    }

    public final void handleConfigChange(@NotNull Configuration newConfig) {
        newConfig.getClass();
        if (!this.mIsInitialized) {
            Log.e(TAG, "Not Initialized. Initialization is necessary before use.");
            return;
        }
        Log.i(TAG, "handleConfigChange");
        AplPresenter aplPresenter = this.mAplPresenter;
        if (aplPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAplPresenter");
            aplPresenter = null;
        }
        aplPresenter.handleConfigChange(newConfig);
    }

    @VisibleForTesting
    public final void initAplComponent() {
        AplFactory.INSTANCE.initAplComponent(this.mContext);
    }

    public final void initialize() {
        if (this.mIsInitialized) {
            return;
        }
        initAplComponent();
        AplComponent component = AplFactory.INSTANCE.getComponent();
        this.mAplPresenter = component.getAplPresenter();
        this.mAplInteractor = component.getAplInteractor();
        this.mOrchestrator = component.getAplOrchestrator();
        this.mAlexaClientSdkApis = component.getAlexaClientSdkApis();
        AplPresenter aplPresenter = this.mAplPresenter;
        AlexaClientSdkApis alexaClientSdkApis = null;
        if (aplPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAplPresenter");
            aplPresenter = null;
        }
        AplInteractor aplInteractor = this.mAplInteractor;
        if (aplInteractor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAplInteractor");
            aplInteractor = null;
        }
        aplPresenter.registerListener(aplInteractor);
        AlexaClientSdkApis alexaClientSdkApis2 = this.mAlexaClientSdkApis;
        if (alexaClientSdkApis2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAlexaClientSdkApis");
        } else {
            alexaClientSdkApis = alexaClientSdkApis2;
        }
        alexaClientSdkApis.start();
        this.mIsInitialized = true;
    }

    public final void pause() {
        if (!this.mIsInitialized) {
            Log.e(TAG, "Not Initialized. Initialization is necessary before use.");
            return;
        }
        APLViewController aPLViewController = this.mViewController;
        if (aPLViewController != null) {
            if (aPLViewController == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewController");
                aPLViewController = null;
            }
            aPLViewController.pause();
        }
    }

    public final void release() {
        if (this.mIsInitialized) {
            AplPresenter aplPresenter = this.mAplPresenter;
            AlexaClientSdkApis alexaClientSdkApis = null;
            if (aplPresenter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAplPresenter");
                aplPresenter = null;
            }
            AplInteractor aplInteractor = this.mAplInteractor;
            if (aplInteractor == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAplInteractor");
                aplInteractor = null;
            }
            aplPresenter.deregisterListener(aplInteractor);
            AlexaClientSdkApis alexaClientSdkApis2 = this.mAlexaClientSdkApis;
            if (alexaClientSdkApis2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAlexaClientSdkApis");
            } else {
                alexaClientSdkApis = alexaClientSdkApis2;
            }
            alexaClientSdkApis.stop();
            this.mIsInitialized = false;
        }
    }

    public final void render(@NotNull AplRenderingAction aplRenderingAction) {
        aplRenderingAction.getClass();
        if (!this.mIsInitialized) {
            Log.e(TAG, "Not Initialized. Initialization is necessary before use.");
            return;
        }
        AlexaClientSdkApis alexaClientSdkApis = this.mAlexaClientSdkApis;
        APLOrchestrator aPLOrchestrator = null;
        if (alexaClientSdkApis == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAlexaClientSdkApis");
            alexaClientSdkApis = null;
        }
        if (!alexaClientSdkApis.isStarted()) {
            AlexaClientSdkApis alexaClientSdkApis2 = this.mAlexaClientSdkApis;
            if (alexaClientSdkApis2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAlexaClientSdkApis");
                alexaClientSdkApis2 = null;
            }
            alexaClientSdkApis2.start();
        }
        APLOrchestrator aPLOrchestrator2 = this.mOrchestrator;
        if (aPLOrchestrator2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOrchestrator");
        } else {
            aPLOrchestrator = aPLOrchestrator2;
        }
        aPLOrchestrator.orchestrate(aplRenderingAction);
    }

    public final void resume() {
        if (!this.mIsInitialized) {
            Log.e(TAG, "Not Initialized. Initialization is necessary before use.");
            return;
        }
        APLViewController aPLViewController = this.mViewController;
        if (aPLViewController != null) {
            if (aPLViewController == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewController");
                aPLViewController = null;
            }
            aPLViewController.resume();
        }
    }

    public final boolean willRenderNewView(@NotNull AplRenderingAction aplRenderingAction) {
        aplRenderingAction.getClass();
        if (!this.mIsInitialized) {
            Log.e(TAG, "Not Initialized. Initialization is necessary before use.");
            return false;
        }
        Log.i(TAG, "shouldRenderNewView");
        APLOrchestrator aPLOrchestrator = this.mOrchestrator;
        if (aPLOrchestrator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOrchestrator");
            aPLOrchestrator = null;
        }
        return aPLOrchestrator.isNewDocumentRenderingNeeded(aplRenderingAction);
    }
}
