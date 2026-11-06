package com.amazon.alexa.pmi.implementation.taplatency;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import com.amazon.identity.auth.device.api.MultipleAccountManager;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001BY\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/taplatency/Installation;", "", MultipleAccountManager.SessionPackageMappingType.JSON_KEY_SESSION_PACKAGE_MAPPING_OWNER, "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "application", "Landroid/app/Application;", "mainHandler", "Landroid/os/Handler;", "armer", "Lcom/amazon/alexa/pmi/implementation/taplatency/TapGestureArmer;", "frames", "Lcom/amazon/alexa/pmi/implementation/taplatency/FrameResponseTracker;", "arming", "Lcom/amazon/alexa/pmi/implementation/taplatency/ArmedInteractionState;", "buffer", "Lcom/amazon/alexa/pmi/implementation/taplatency/TapAttributionBuffer;", "closerHooks", "Lcom/amazon/alexa/pmi/implementation/taplatency/TapLatencyCloserHooks;", "secondaryWindows", "Lcom/amazon/alexa/pmi/implementation/taplatency/SecondaryWindowTracker;", "<init>", "(Ljava/lang/ref/WeakReference;Landroid/app/Application;Landroid/os/Handler;Lcom/amazon/alexa/pmi/implementation/taplatency/TapGestureArmer;Lcom/amazon/alexa/pmi/implementation/taplatency/FrameResponseTracker;Lcom/amazon/alexa/pmi/implementation/taplatency/ArmedInteractionState;Lcom/amazon/alexa/pmi/implementation/taplatency/TapAttributionBuffer;Lcom/amazon/alexa/pmi/implementation/taplatency/TapLatencyCloserHooks;Lcom/amazon/alexa/pmi/implementation/taplatency/SecondaryWindowTracker;)V", "getOwner", "()Ljava/lang/ref/WeakReference;", "setOwner", "(Ljava/lang/ref/WeakReference;)V", "getApplication", "()Landroid/app/Application;", "getMainHandler", "()Landroid/os/Handler;", "getArmer", "()Lcom/amazon/alexa/pmi/implementation/taplatency/TapGestureArmer;", "getFrames", "()Lcom/amazon/alexa/pmi/implementation/taplatency/FrameResponseTracker;", "getArming", "()Lcom/amazon/alexa/pmi/implementation/taplatency/ArmedInteractionState;", "getBuffer", "()Lcom/amazon/alexa/pmi/implementation/taplatency/TapAttributionBuffer;", "getCloserHooks", "()Lcom/amazon/alexa/pmi/implementation/taplatency/TapLatencyCloserHooks;", "getSecondaryWindows", "()Lcom/amazon/alexa/pmi/implementation/taplatency/SecondaryWindowTracker;", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class Installation {

    @NotNull
    private final Application application;

    @NotNull
    private final TapGestureArmer armer;

    @NotNull
    private final ArmedInteractionState arming;

    @NotNull
    private final TapAttributionBuffer buffer;

    @Nullable
    private final TapLatencyCloserHooks closerHooks;

    @NotNull
    private final FrameResponseTracker frames;

    @NotNull
    private final Handler mainHandler;

    @NotNull
    private WeakReference<Activity> owner;

    @Nullable
    private final SecondaryWindowTracker secondaryWindows;

    public Installation(@NotNull WeakReference<Activity> weakReference, @NotNull Application application, @NotNull Handler handler, @NotNull TapGestureArmer tapGestureArmer, @NotNull FrameResponseTracker frameResponseTracker, @NotNull ArmedInteractionState armedInteractionState, @NotNull TapAttributionBuffer tapAttributionBuffer, @Nullable TapLatencyCloserHooks tapLatencyCloserHooks, @Nullable SecondaryWindowTracker secondaryWindowTracker) {
        weakReference.getClass();
        application.getClass();
        handler.getClass();
        tapGestureArmer.getClass();
        frameResponseTracker.getClass();
        armedInteractionState.getClass();
        tapAttributionBuffer.getClass();
        this.owner = weakReference;
        this.application = application;
        this.mainHandler = handler;
        this.armer = tapGestureArmer;
        this.frames = frameResponseTracker;
        this.arming = armedInteractionState;
        this.buffer = tapAttributionBuffer;
        this.closerHooks = tapLatencyCloserHooks;
        this.secondaryWindows = secondaryWindowTracker;
    }

    @NotNull
    public final Application getApplication() {
        return this.application;
    }

    @NotNull
    public final TapGestureArmer getArmer() {
        return this.armer;
    }

    @NotNull
    public final ArmedInteractionState getArming() {
        return this.arming;
    }

    @NotNull
    public final TapAttributionBuffer getBuffer() {
        return this.buffer;
    }

    @Nullable
    public final TapLatencyCloserHooks getCloserHooks() {
        return this.closerHooks;
    }

    @NotNull
    public final FrameResponseTracker getFrames() {
        return this.frames;
    }

    @NotNull
    public final Handler getMainHandler() {
        return this.mainHandler;
    }

    @NotNull
    public final WeakReference<Activity> getOwner() {
        return this.owner;
    }

    @Nullable
    public final SecondaryWindowTracker getSecondaryWindows() {
        return this.secondaryWindows;
    }

    public final void setOwner(@NotNull WeakReference<Activity> weakReference) {
        weakReference.getClass();
        this.owner = weakReference;
    }
}
