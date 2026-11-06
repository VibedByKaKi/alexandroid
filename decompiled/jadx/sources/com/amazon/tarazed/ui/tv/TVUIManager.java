package com.amazon.tarazed.ui.tv;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.DrawableRes;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.ra.core.data.model.Constants;
import com.amazon.tarazed.R;
import com.amazon.tarazed.coroutine.dispatcher.DispatcherProvider;
import com.amazon.tarazed.logging.TarazedSessionLogger;
import com.amazon.tarazed.metrics.TarazedMetricsHelper;
import com.amazon.tarazed.ui.ViewGroupManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 +2\u00020\u0001:\u0002+,B;\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\r\u0010\u001a\u001a\u00020\u001bH\u0000¢\u0006\u0002\b\u001cJ\r\u0010\u001d\u001a\u00020\u001bH\u0000¢\u0006\u0002\b\u001eJ\b\u0010\u001f\u001a\u00020 H\u0002J\u000e\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0011J\u0010\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%H\u0002J\u0012\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0001\u0010(\u001a\u00020\u0013J\r\u0010)\u001a\u00020\u001bH\u0000¢\u0006\u0002\b*R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/amazon/tarazed/ui/tv/TVUIManager;", "", "logger", "Lcom/amazon/tarazed/logging/TarazedSessionLogger;", "metricsHelper", "Lcom/amazon/tarazed/metrics/TarazedMetricsHelper;", "viewGroupManager", "Lcom/amazon/tarazed/ui/ViewGroupManager;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "dispatchers", "Lcom/amazon/tarazed/coroutine/dispatcher/DispatcherProvider;", "tvUIView", "Landroid/view/View;", "(Lcom/amazon/tarazed/logging/TarazedSessionLogger;Lcom/amazon/tarazed/metrics/TarazedMetricsHelper;Lcom/amazon/tarazed/ui/ViewGroupManager;Lkotlinx/coroutines/CoroutineScope;Lcom/amazon/tarazed/coroutine/dispatcher/DispatcherProvider;Landroid/view/View;)V", "registeredTVUIReinflatedListeners", "", "Lcom/amazon/tarazed/ui/tv/TVUIManager$TVUIReinflatedListener;", "uiLocation", "", "getUiLocation$TarazedAndroidLibrary_release$annotations", "()V", "getUiLocation$TarazedAndroidLibrary_release", "()I", "setUiLocation$TarazedAndroidLibrary_release", "(I)V", Constants.HINT_TEXT_OPERATION_HIDE, "Lkotlinx/coroutines/Job;", "hide$TarazedAndroidLibrary_release", "moveUI", "moveUI$TarazedAndroidLibrary_release", "notifyTVUIReinflated", "", "registerTVUIReinflatedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setAlignment", "layoutParams", "Landroid/widget/RelativeLayout$LayoutParams;", "setVirtualRemoteDrawable", "Landroid/widget/FrameLayout;", "remoteDrawableId", "show", "show$TarazedAndroidLibrary_release", "Companion", "TVUIReinflatedListener", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTVUIManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TVUIManager.kt\ncom/amazon/tarazed/ui/tv/TVUIManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,192:1\n1855#2,2:193\n*S KotlinDebug\n*F\n+ 1 TVUIManager.kt\ncom/amazon/tarazed/ui/tv/TVUIManager\n*L\n189#1:193,2\n*E\n"})
/* loaded from: classes19.dex */
public final class TVUIManager {
    private static final int BOTTOM_END = 0;
    private static final int BOTTOM_START = 1;

    @NotNull
    private static final String METRIC_NULL_VIEW = "NullView";

    @NotNull
    private static final String TAG = "TVUIManager";
    private static final int TOP_END = 3;
    private static final int TOP_START = 2;

    @NotNull
    private final CoroutineScope coroutineScope;

    @NotNull
    private final DispatcherProvider dispatchers;

    @NotNull
    private final TarazedSessionLogger logger;

    @NotNull
    private final TarazedMetricsHelper metricsHelper;

    @NotNull
    private List<TVUIReinflatedListener> registeredTVUIReinflatedListeners;

    @Nullable
    private View tvUIView;
    private int uiLocation;

    @NotNull
    private final ViewGroupManager viewGroupManager;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final int[][] UI_ALIGNMENTS = {new int[]{12, 21}, new int[]{12, 20}, new int[]{10, 20}, new int[]{10, 21}};

    @NotNull
    private static final float[] SCRIM_ROTATIONS = {45.0f, 135.0f, 225.0f, 315.0f};

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/amazon/tarazed/ui/tv/TVUIManager$TVUIReinflatedListener;", "", "onUIReinflated", "", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface TVUIReinflatedListener {
        void onUIReinflated();
    }

    @JvmOverloads
    public TVUIManager(@NotNull TarazedSessionLogger tarazedSessionLogger, @NotNull TarazedMetricsHelper tarazedMetricsHelper, @NotNull ViewGroupManager viewGroupManager, @NotNull CoroutineScope coroutineScope, @NotNull DispatcherProvider dispatcherProvider, @Nullable View view) {
        tarazedSessionLogger.getClass();
        tarazedMetricsHelper.getClass();
        viewGroupManager.getClass();
        coroutineScope.getClass();
        dispatcherProvider.getClass();
        this.logger = tarazedSessionLogger;
        this.metricsHelper = tarazedMetricsHelper;
        this.viewGroupManager = viewGroupManager;
        this.coroutineScope = coroutineScope;
        this.dispatchers = dispatcherProvider;
        this.tvUIView = view;
        if (view == null) {
            tarazedSessionLogger.e(TAG, "View is null, UI will misbehave");
            tarazedMetricsHelper.addCountHighPriority(TAG, METRIC_NULL_VIEW, 1.0d);
        }
        this.registeredTVUIReinflatedListeners = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyTVUIReinflated() {
        Iterator<T> it2 = this.registeredTVUIReinflatedListeners.iterator();
        while (it2.hasNext()) {
            ((TVUIReinflatedListener) it2.next()).onUIReinflated();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAlignment(RelativeLayout.LayoutParams layoutParams) {
        int[] iArr = UI_ALIGNMENTS[this.uiLocation];
        layoutParams.removeRule(20);
        layoutParams.removeRule(21);
        layoutParams.removeRule(10);
        layoutParams.removeRule(12);
        for (int i : iArr) {
            layoutParams.addRule(i, 1);
        }
    }

    /* renamed from: getUiLocation$TarazedAndroidLibrary_release, reason: from getter */
    public final int getUiLocation() {
        return this.uiLocation;
    }

    @NotNull
    public final Job hide$TarazedAndroidLibrary_release() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.dispatchers.main(), null, new TVUIManager$hide$1(this, null), 2, null);
        return launch$default;
    }

    @NotNull
    public final Job moveUI$TarazedAndroidLibrary_release() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.dispatchers.main(), null, new TVUIManager$moveUI$1(this, null), 2, null);
        return launch$default;
    }

    public final void registerTVUIReinflatedListener(@NotNull TVUIReinflatedListener listener) {
        listener.getClass();
        this.registeredTVUIReinflatedListeners.add(listener);
    }

    public final void setUiLocation$TarazedAndroidLibrary_release(int i) {
        this.uiLocation = i;
    }

    @Nullable
    public final FrameLayout setVirtualRemoteDrawable(@DrawableRes int remoteDrawableId) {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.dispatchers.main(), null, new TVUIManager$setVirtualRemoteDrawable$1(this, remoteDrawableId, null), 2, null);
        View view = this.tvUIView;
        if (view != null) {
            return (FrameLayout) view.findViewById(R.id.virtual_remote_container);
        }
        return null;
    }

    @NotNull
    public final Job show$TarazedAndroidLibrary_release() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.dispatchers.main(), null, new TVUIManager$show$1(this, null), 2, null);
        return launch$default;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/amazon/tarazed/ui/tv/TVUIManager$Companion;", "", "()V", "BOTTOM_END", "", "BOTTOM_START", "METRIC_NULL_VIEW", "", "SCRIM_ROTATIONS", "", com.dee.app.contacts.common.constants.Constants.LOG_TAG, "TOP_END", "TOP_START", "UI_ALIGNMENTS", "", "", "[[I", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getUiLocation$TarazedAndroidLibrary_release$annotations() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TVUIManager(@NotNull TarazedSessionLogger tarazedSessionLogger, @NotNull TarazedMetricsHelper tarazedMetricsHelper, @NotNull ViewGroupManager viewGroupManager, @NotNull CoroutineScope coroutineScope, @NotNull DispatcherProvider dispatcherProvider) {
        this(tarazedSessionLogger, tarazedMetricsHelper, viewGroupManager, coroutineScope, dispatcherProvider, null, 32, null);
        tarazedSessionLogger.getClass();
        tarazedMetricsHelper.getClass();
        viewGroupManager.getClass();
        coroutineScope.getClass();
        dispatcherProvider.getClass();
    }

    public /* synthetic */ TVUIManager(TarazedSessionLogger tarazedSessionLogger, TarazedMetricsHelper tarazedMetricsHelper, ViewGroupManager viewGroupManager, CoroutineScope coroutineScope, DispatcherProvider dispatcherProvider, View view, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tarazedSessionLogger, tarazedMetricsHelper, viewGroupManager, coroutineScope, dispatcherProvider, (i & 32) != 0 ? viewGroupManager.inflateStaticView(R.layout.tv_ui) : view);
    }
}
