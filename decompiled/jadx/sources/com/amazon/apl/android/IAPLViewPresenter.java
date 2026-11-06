package com.amazon.apl.android;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.apl.android.Content;
import com.amazon.apl.android.bitmap.IBitmapFactory;
import com.amazon.apl.android.configuration.ConfigurationChange;
import com.amazon.apl.android.metrics.IMetricsRecorder;
import com.amazon.apl.android.providers.AbstractMediaPlayerProvider;
import com.amazon.apl.android.providers.ITelemetryProvider;
import com.amazon.apl.android.scaling.Scaling;
import com.amazon.apl.android.scaling.ViewportMetrics;
import com.amazon.apl.android.shadow.ShadowBitmapRenderer;
import com.amazon.apl.android.utils.APLTrace;
import com.amazon.apl.android.utils.FrameStat;
import com.amazon.apl.enums.PropertyKey;
import com.amazon.apl.enums.UpdateType;
import com.amazon.common.Consumer;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface IAPLViewPresenter extends View.OnClickListener, IDocumentLifecycleListener, ViewGroup.OnHierarchyChangeListener {
    void addDocumentLifecycleListener(@NonNull IDocumentLifecycleListener iDocumentLifecycleListener);

    void associate(Component component, View view);

    void cancelTouchEvent();

    void clearLayout();

    void clearMotionEvents();

    void disassociate(View view);

    void disassociate(Component component);

    void emitFluidityIncident(int i, FrameStat[] frameStatArr, Double[] dArr, JSONObject jSONObject);

    boolean enqueueMotionEvents(List<MotionEvent> list);

    @Nullable
    default Component findComponent(View view) {
        return null;
    }

    @Nullable
    default View findView(Component component) {
        return null;
    }

    @Nullable
    APLTrace getAPLTrace();

    IBitmapFactory getBitmapFactory();

    ConfigurationChange getConfigurationChange();

    Context getContext();

    long getElapsedTime();

    AbstractMediaPlayerProvider<View> getMediaPlayerProvider();

    @NonNull
    ViewportMetrics getOrCreateViewportMetrics() throws IllegalStateException;

    ShadowBitmapRenderer getShadowRenderer();

    boolean handleTouchEvent(@NonNull MotionEvent motionEvent);

    View inflateComponentHierarchy(Component component);

    boolean isFrameMetricsEventsEnabled();

    void loadBackground(Content.DocumentBackground documentBackground);

    void mediaLoadFailed(String str, int i, String str2);

    void mediaLoaded(String str);

    IMetricsRecorder metricsRecorder();

    void onFluidityIncidentEnded(int i, long j);

    boolean onKeyPress(@NonNull KeyEvent keyEvent);

    void preDocumentRender();

    void reinflate();

    void releaseLastMotionEvent();

    void setMetricsRecorder(IMetricsRecorder iMetricsRecorder);

    void setScaling(Scaling scaling);

    ITelemetryProvider telemetry();

    void traverseComponentHierarchy(Component component, Consumer<Component> consumer);

    void updateComponent(View view, UpdateType updateType, int i);

    void updateComponent(View view, UpdateType updateType, String str);

    void updateComponent(View view, UpdateType updateType, boolean z);

    default void inflateScenegraph() {
    }

    default void clearLayoutRequestFor(View view) {
    }

    default void requestLayout(Component component) {
    }

    default void requestLayoutFor(View view) {
    }

    default void applyAllProperties(Component component, View view) {
    }

    default void onComponentChange(Component component, List<PropertyKey> list) {
    }

    default void updateViewInLayout(Component component, View view) {
    }
}
