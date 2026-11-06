package com.amazon.alexa.growth.coachmark;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import androidx.navigation.Navigation$$ExternalSyntheticLambda0;
import com.amazon.alexa.eventing.Event$$ExternalSyntheticLambda2;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.font.Font;
import com.amazon.alexa.font.FontResolver;
import com.amazon.alexa.growth.R;
import com.amazon.alexa.growth.metrics.BIMetricsRecorder;
import com.amazon.alexa.growth.metrics.OEMetricsRecorder;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver;
import com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserverRegistrar;
import com.amazon.alexa.routing.api.RouteContext;
import com.amazon.alexa.routing.api.RoutingService;
import com.amazon.alexa.tasks.api.TaskManager;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import com.github.florent37.viewtooltip.ViewTooltip;
import com.google.android.material.navigation.NavigationBarView;
import com.mrousavy.camera.react.CameraView$$ExternalSyntheticLambda0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class CoachMark {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final String COACH_MARK_NO_ID = "NO_ID";
    static final String COACH_MARK_VIEW_STATUS = "CoachMarkViewStatus";
    static final String COMPONENT_NAME = "CoachMark";
    static final String SHOW_COACH_MARK = "ShowCoachMark";
    protected static final String TAG = "CoachMark";

    @VisibleForTesting(otherwise = 4)
    ViewTooltip.ALIGN align;
    protected View anchorView;
    protected Activity anchorViewActivity;
    protected Context anchorViewContext;

    @VisibleForTesting(otherwise = 4)
    boolean anchorViewLaidOut;
    protected final BIMetricsRecorder biMetricsRecorder;

    @VisibleForTesting(otherwise = 4)
    BroadcastReceiver broadcastReceiver;

    @VisibleForTesting(otherwise = 4)
    boolean coachMarkClosed;

    @VisibleForTesting(otherwise = 4)
    String coachMarkId;

    @VisibleForTesting(otherwise = 4)
    TextView customTextView;
    protected final FeatureServiceV2 featureService;

    @VisibleForTesting(otherwise = 4)
    ViewGroup fullscreenRootView;

    @VisibleForTesting(otherwise = 4)
    FrameLayout fullscreenTouchInterceptorView;

    @VisibleForTesting(otherwise = 4)
    IntentFilter intentFilter;
    protected boolean isHorizontallyCentered;
    protected boolean isVerticallyCentered;
    protected final MainActivityLifecycleObserverRegistrar mainActivityLifecycleObserverRegistrar;
    protected final OEMetricsRecorder oeMetricsRecorder;

    @VisibleForTesting(otherwise = 4)
    OnDismissListener onDismissListener;
    protected boolean onLeftHalf;

    @VisibleForTesting(otherwise = 4)
    OnShowListener onShowListener;
    protected boolean onTopHalf;
    protected ORIENTATION orientation;

    @VisibleForTesting(otherwise = 4)
    ViewTooltip.Position position;
    protected MobilyticsMetricsTimer renderTimer;

    @VisibleForTesting(otherwise = 4)
    Resources resources;
    protected final RoutingService routingService;
    protected RoutingServiceHelper routingServiceHelper;

    @VisibleForTesting(otherwise = 4)
    boolean showCalledBeforeAnchorViewVisible;
    protected final TaskManager taskManager;

    @VisibleForTesting(otherwise = 4)
    String text;

    @VisibleForTesting
    ThemeHelper themeHelper;

    @VisibleForTesting(otherwise = 4)
    ViewTooltip tooltip;

    @VisibleForTesting(otherwise = 4)
    ViewTooltip.TooltipView tooltipView;
    protected int viewCenterXCoordinate;
    protected int viewCenterYCoordinate;
    protected int viewEndXCoordinate;
    protected int viewEndYCoordinate;
    protected int viewXCoordinate;
    protected int viewYCoordinate;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting(otherwise = 4)
    public static class CoachMarkPositioning {
        public ViewTooltip.ALIGN alignment;
        public ViewTooltip.Position position;

        public CoachMarkPositioning(ViewTooltip.Position position, ViewTooltip.ALIGN align) {
            this.position = position;
            this.alignment = align;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ORIENTATION {
        VERTICAL,
        HORIZONTAL
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OnDismissListener {
        void onDismiss(View view);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OnShowListener {
        void onShow(View view);
    }

    public CoachMark(@Nullable String str, @Nullable ViewTooltip.Position position, @Nullable ViewTooltip.ALIGN align, @Nullable ViewGroup viewGroup, @NonNull ORIENTATION orientation, @NonNull OEMetricsRecorder oEMetricsRecorder, @NonNull BIMetricsRecorder bIMetricsRecorder, @NonNull TaskManager taskManager, @NonNull RoutingService routingService, @NonNull FeatureServiceV2 featureServiceV2, @NonNull MainActivityLifecycleObserverRegistrar mainActivityLifecycleObserverRegistrar) {
        this.showCalledBeforeAnchorViewVisible = false;
        this.coachMarkClosed = false;
        this.themeHelper = new ThemeHelper();
        this.position = position;
        this.align = align;
        this.oeMetricsRecorder = oEMetricsRecorder;
        this.biMetricsRecorder = bIMetricsRecorder;
        this.featureService = featureServiceV2;
        this.taskManager = taskManager;
        this.routingService = routingService;
        this.orientation = orientation;
        this.mainActivityLifecycleObserverRegistrar = mainActivityLifecycleObserverRegistrar;
        this.routingServiceHelper = new RoutingServiceHelper(routingService);
        this.coachMarkId = str;
        this.fullscreenRootView = viewGroup;
    }

    private void init() {
        if (this.coachMarkId == null) {
            this.coachMarkId = generateUniqueId();
        }
        View view = this.anchorView;
        if (view == null) {
            Log.e(TAG, "Anchor view cannot be null");
            return;
        }
        Context context = view.getContext();
        this.anchorViewContext = context;
        this.resources = context.getResources();
        Activity activityFromView = Utils.getActivityFromView(this.anchorView);
        this.anchorViewActivity = activityFromView;
        if (this.fullscreenRootView == null) {
            Window window = activityFromView.getWindow();
            if (window == null) {
                Log.e(TAG, "Activity window is null");
                return;
            }
            this.fullscreenRootView = (ViewGroup) window.getDecorView();
        }
        boolean isLaidOut = this.anchorView.isLaidOut();
        this.anchorViewLaidOut = isLaidOut;
        if (isLaidOut) {
            initializeCoachMark();
            return;
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.amazon.alexa.growth.coachmark.CoachMark.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                CoachMark coachMark = CoachMark.this;
                if (coachMark.tooltip == null && coachMark.anchorView.isLaidOut()) {
                    try {
                        CoachMark.this.anchorView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        CoachMark coachMark2 = CoachMark.this;
                        coachMark2.anchorViewLaidOut = true;
                        coachMark2.initializeCoachMark();
                        CoachMark coachMark3 = CoachMark.this;
                        if (coachMark3.showCalledBeforeAnchorViewVisible) {
                            coachMark3.show();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        };
        try {
            this.anchorView.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        } catch (RuntimeException unused) {
            this.anchorView.post(new Event$$ExternalSyntheticLambda2(this, onGlobalLayoutListener, 12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dismiss$7(View view) {
        this.onDismissListener.onDismiss(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$generateFullscreenTouchInterceptor$6(View view, MotionEvent motionEvent) {
        dismiss();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        try {
            this.anchorView.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        } catch (RuntimeException e) {
            Log.e(TAG, "Failed to addOnGlobalLayoutListener", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderCoachMark$5(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$1(View view) {
        this.onShowListener.onShow(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$2() {
        try {
            dismiss();
        } catch (Exception e) {
            Log.e(TAG, "Failed to dismiss Coachmark in RouteChangeListener", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$3(RouteContext routeContext) {
        new Handler(Looper.getMainLooper()).post(new CoachMark$$ExternalSyntheticLambda2(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$4() {
        listenToAnchorViewOnAttachState();
        registerOrientationChangeListener(this.anchorViewContext);
        this.routingServiceHelper.registerRouteChangeListener(new CoachMark$$ExternalSyntheticLambda1(this));
        this.anchorViewActivity.runOnUiThread(new CoachMark$$ExternalSyntheticLambda2(this, 1));
        BIMetricsRecorder bIMetricsRecorder = this.biMetricsRecorder;
        String str = this.coachMarkId;
        bIMetricsRecorder.recordEventOccurrence(new String[]{str, SHOW_COACH_MARK}, str);
    }

    @VisibleForTesting(otherwise = 4)
    public CoachMarkPositioning calculateCoachMarkPositioning() {
        ViewTooltip.Position position;
        ViewTooltip.ALIGN align;
        ViewTooltip.ALIGN align2;
        ViewTooltip.Position position2 = this.position;
        if (position2 != null && (align2 = this.align) != null) {
            return new CoachMarkPositioning(position2, align2);
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.anchorViewActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int[] iArr = new int[2];
        this.anchorView.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        this.viewXCoordinate = i3;
        this.viewYCoordinate = iArr[1];
        this.viewCenterXCoordinate = Math.round((this.anchorView.getMeasuredWidth() / 2.0f) + i3);
        this.viewCenterYCoordinate = Math.round((this.anchorView.getMeasuredHeight() / 2.0f) + this.viewYCoordinate);
        this.viewEndXCoordinate = this.anchorView.getMeasuredWidth() + this.viewXCoordinate;
        this.viewEndYCoordinate = this.anchorView.getMeasuredHeight() + this.viewYCoordinate;
        int i4 = this.viewCenterXCoordinate;
        int i5 = i / 2;
        this.onLeftHalf = i4 < i5;
        int i6 = i2 / 2;
        this.onTopHalf = this.viewCenterYCoordinate < i6;
        this.isHorizontallyCentered = Math.abs(i4 - i5) < 5;
        this.isVerticallyCentered = Math.abs(this.viewCenterYCoordinate - i6) < 5;
        if (this.orientation == ORIENTATION.VERTICAL) {
            position = this.onTopHalf ? ViewTooltip.Position.BOTTOM : ViewTooltip.Position.TOP;
            align = this.isHorizontallyCentered ? ViewTooltip.ALIGN.CENTER : this.onLeftHalf ? ViewTooltip.ALIGN.START : ViewTooltip.ALIGN.END;
        } else {
            position = this.onLeftHalf ? ViewTooltip.Position.RIGHT : ViewTooltip.Position.LEFT;
            align = ViewTooltip.ALIGN.CENTER;
        }
        return new CoachMarkPositioning(position, align);
    }

    public void closeNow() {
        if (readyToClose()) {
            this.tooltip.closeNow();
            onClose();
        }
    }

    public void createCustomTextView() {
        Typeface typeface;
        try {
            typeface = FontResolver.getFont(this.anchorViewContext, Font.APP_TEXT_REGULAR);
        } catch (RuntimeException unused) {
            Log.e(TAG, "ember-regular font is not available. Falling back to default typeface.");
            typeface = Typeface.DEFAULT;
        }
        int round = Math.round(this.resources.getDimension(R.dimen.coachmark_bubble_max_width) - (this.resources.getDimension(R.dimen.coachmark_bubble_padding_horizontal) * 2.0f));
        int integer = this.resources.getInteger(R.integer.coachmark_text_view_padding);
        WrappingTextView wrappingTextView = new WrappingTextView(this.anchorViewContext);
        this.customTextView = wrappingTextView;
        wrappingTextView.setId(R.id.coach_mark_text);
        this.customTextView.setTypeface(typeface);
        this.customTextView.setTextSize(0, this.resources.getDimension(R.dimen.coachmark_bubble_text_size));
        this.customTextView.setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
        this.customTextView.setMaxWidth(round);
        this.customTextView.setMaxLines(this.resources.getInteger(R.integer.coachmark_text_view_max_lines));
        this.customTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.customTextView.setPadding(integer, integer, integer, integer);
        this.customTextView.setBackground(null);
    }

    public void dismiss() {
        if (readyToClose()) {
            ViewTooltip viewTooltip = this.tooltip;
            if (viewTooltip != null) {
                try {
                    if (this.onDismissListener != null) {
                        viewTooltip.onHide(new CoachMark$$ExternalSyntheticLambda1(this));
                    }
                    CoachMarkVisibilityHelper.setCoachMarkInvisible();
                    CoachMarkVisibilityHelper.setCoachMarkShown(this.anchorViewContext, this.coachMarkId);
                    this.tooltip.close();
                } catch (Exception e) {
                    Log.e(TAG, "Error closing tooltip: tooltip_view is null.");
                    e.printStackTrace();
                }
            }
            onClose();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void generateFullscreenTouchInterceptor() {
        this.fullscreenTouchInterceptorView = new FrameLayout(this.anchorViewContext);
        this.fullscreenTouchInterceptorView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.fullscreenTouchInterceptorView.bringToFront();
        this.fullscreenTouchInterceptorView.setOnTouchListener(new CameraView$$ExternalSyntheticLambda0(this, 1));
        this.fullscreenRootView.addView(this.fullscreenTouchInterceptorView);
    }

    public String generateUniqueId() {
        StringBuilder sb = new StringBuilder();
        try {
            View view = this.anchorView;
            while (view.getId() == -1) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                sb.insert(0, "_" + viewGroup.indexOfChild(view));
                view = viewGroup;
            }
            sb.insert(0, view.getResources().getResourceEntryName(view.getId()));
        } catch (Exception unused) {
            sb.setLength(0);
            sb.append(COACH_MARK_NO_ID);
        }
        sb.insert(0, "CoachMark_");
        return sb.toString();
    }

    public View getAnchorView() {
        return this.anchorView;
    }

    public String getCoachMarkId() {
        return this.coachMarkId;
    }

    public void initializeCoachMark() {
        createCustomTextView();
        CoachMarkAnimation coachMarkAnimation = new CoachMarkAnimation(this.resources, this.customTextView);
        CoachMarkPositioning calculateCoachMarkPositioning = calculateCoachMarkPositioning();
        int round = Math.round(this.resources.getDimension(R.dimen.coachmark_bubble_padding_vertical));
        int round2 = Math.round(this.resources.getDimension(R.dimen.coachmark_bubble_padding_horizontal));
        int round3 = Math.round(this.resources.getDimension(R.dimen.coachmark_distance_with_view));
        int round4 = Math.round(this.resources.getDimension(R.dimen.coachmark_distance_with_arrow));
        int round5 = Math.round(this.resources.getDimension(R.dimen.coachmark_distance_with_boarder));
        this.tooltip = ViewTooltip.on(this.anchorViewActivity, this.fullscreenRootView, this.anchorView).testId(this.resources.getResourceName(R.id.coach_mark)).corner(Math.round(this.resources.getDimension(R.dimen.coachmark_corner_radius))).arrowHeight(Math.round(this.resources.getDimension(R.dimen.coachmark_arrow_height))).arrowWidth(Math.round(this.resources.getDimension(R.dimen.coachmark_arrow_width))).padding(round2, round, round2, round).withShadow(true).align(calculateCoachMarkPositioning.alignment).position(calculateCoachMarkPositioning.position).clickToHide(false).autoHide(false, 0L).customView(this.customTextView).distanceWithView(round3).distanceWithArrow(round4).margin(round5, 0, round5, 0).animation(coachMarkAnimation);
        setupCoachMarkColors();
    }

    public boolean isCoachMarkPreviouslyShown() {
        CoachMarkVisibilityHelper.loadShownCoachMarksFromSharedPreferences(this.anchorViewContext);
        return CoachMarkVisibilityHelper.hasCoachMarkBeenShown(this.coachMarkId);
    }

    public void listenToAnchorViewOnAttachState() {
        this.anchorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.amazon.alexa.growth.coachmark.CoachMark.4
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                CoachMark.this.closeNow();
                CoachMark.this.anchorView.removeOnAttachStateChangeListener(this);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
            }
        });
    }

    public void onClose() {
        this.coachMarkClosed = true;
        if (this.fullscreenRootView != null && this.fullscreenTouchInterceptorView != null) {
            removeFullScreenTouchView();
        }
        try {
            BroadcastReceiver broadcastReceiver = this.broadcastReceiver;
            if (broadcastReceiver != null) {
                this.anchorViewContext.unregisterReceiver(broadcastReceiver);
            }
        } catch (Exception unused) {
            Log.e(TAG, "Error when unregistering broadcast receiver");
        }
        this.routingServiceHelper.unregisterRouteChangeListener();
    }

    public boolean readyToClose() {
        Activity activity;
        return (this.coachMarkClosed || (activity = this.anchorViewActivity) == null || activity.isDestroyed()) ? false : true;
    }

    @VisibleForTesting
    public void registerOrientationChangeListener(Context context) {
        if (this.intentFilter == null) {
            this.intentFilter = new IntentFilter();
        }
        this.intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
        if (this.broadcastReceiver == null) {
            this.broadcastReceiver = new BroadcastReceiver() { // from class: com.amazon.alexa.growth.coachmark.CoachMark.2
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    CoachMark.this.closeNow();
                }
            };
        }
        context.registerReceiver(this.broadcastReceiver, this.intentFilter);
        this.mainActivityLifecycleObserverRegistrar.addObserver(new MainActivityLifecycleObserver() { // from class: com.amazon.alexa.growth.coachmark.CoachMark.3
            @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
            public void onActivityDestroy() {
                try {
                    try {
                        CoachMark coachMark = CoachMark.this;
                        coachMark.anchorViewContext.unregisterReceiver(coachMark.broadcastReceiver);
                        CoachMark.this.routingServiceHelper.unregisterRouteChangeListener();
                    } catch (Exception unused) {
                        Log.e(CoachMark.TAG, "Error occured when unregistering broadcast receiver onDestroy");
                    }
                } finally {
                    CoachMark.this.mainActivityLifecycleObserverRegistrar.removeObserver(this);
                }
            }

            @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
            public void onActivityCreated() {
            }

            @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
            public void onActivityPause() {
            }

            @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
            public void onActivityResume() {
            }

            @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
            public void onActivityStart() {
            }

            @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
            public void onActivityStop() {
            }
        });
    }

    public void removeFullScreenTouchView() {
        this.fullscreenRootView.post(new Runnable() { // from class: com.amazon.alexa.growth.coachmark.CoachMark.5
            @Override // java.lang.Runnable
            public void run() {
                CoachMark coachMark = CoachMark.this;
                coachMark.fullscreenRootView.removeView(coachMark.fullscreenTouchInterceptorView);
                CoachMark.this.fullscreenTouchInterceptorView = null;
            }
        });
    }

    public void renderCoachMark() {
        OEMetricsRecorder oEMetricsRecorder = this.oeMetricsRecorder;
        String str = this.coachMarkId;
        this.renderTimer = oEMetricsRecorder.createRenderTimer(new String[]{AlexaMetricsConstants.MetricsComponents.COACHMARK, str}, str);
        ViewTooltip.TooltipView show = this.tooltip.show();
        this.tooltipView = show;
        show.setOnClickListener(new Navigation$$ExternalSyntheticLambda0(this, 11));
        this.tooltipView.setLabelFor(this.anchorView.getId());
        generateFullscreenTouchInterceptor();
        this.oeMetricsRecorder.recordTimer(this.renderTimer);
    }

    public void setAnchorView(@NonNull View view) {
        this.anchorView = view;
        init();
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.onDismissListener = onDismissListener;
    }

    public void setOnShowListener(OnShowListener onShowListener) {
        this.onShowListener = onShowListener;
    }

    public void setTestId(String str) {
        this.tooltip.testId(str);
    }

    public void setText(String str) {
        this.text = str;
    }

    @VisibleForTesting(otherwise = 4)
    public void setupCoachMarkColors() {
        this.customTextView.setTextColor(this.themeHelper.getColorFromAttribute(this.anchorViewContext, this.themeHelper.isLightMode(this.anchorViewContext) ? com.amazon.alexa.mosaic.themes.R.attr.mosaicBackground : com.amazon.alexa.mosaic.themes.R.attr.mosaicNeutral10));
        this.tooltip.color(this.themeHelper.getColorFromAttribute(this.anchorViewContext, com.amazon.alexa.mosaic.themes.R.attr.mosaicAction20));
        this.tooltip.shadowColor(this.themeHelper.getColorFromAttribute(this.anchorViewContext, com.amazon.alexa.mosaic.themes.R.attr.mosaicTransparent));
        this.tooltip.withShadow(true);
    }

    public void show() {
        if (!this.anchorViewLaidOut) {
            this.showCalledBeforeAnchorViewVisible = true;
            return;
        }
        if ((Utils.isDebuggable(this.anchorViewContext) || !Utils.isScreenReaderEnabled(this.anchorViewContext)) && !TextUtils.isEmpty(this.text)) {
            this.customTextView.setText(this.text);
            if (isCoachMarkPreviouslyShown()) {
                Log.i(TAG, "Coach mark has been displayed previously. Prematurely exiting show()");
                return;
            }
            if (CoachMarkVisibilityHelper.isAnyCoachMarkVisible()) {
                ParcelCompat$$ExternalSyntheticOutline0.m(this.coachMarkId, TAG, new StringBuilder("Another Coachmark is currently visible. Deferring show() for "));
            } else {
                CoachMarkVisibilityHelper.setCoachMarkVisible();
                if (this.onShowListener != null) {
                    this.tooltip.onDisplay(new CoachMark$$ExternalSyntheticLambda1(this));
                }
                this.taskManager.getExecutor(0).execute(new CoachMark$$ExternalSyntheticLambda2(this, 2));
            }
        }
    }

    public CoachMark(@NonNull View view, @Nullable String str, @Nullable ViewTooltip.Position position, @Nullable ViewTooltip.ALIGN align, @Nullable ViewGroup viewGroup, @NonNull ORIENTATION orientation, @NonNull OEMetricsRecorder oEMetricsRecorder, @NonNull BIMetricsRecorder bIMetricsRecorder, @NonNull TaskManager taskManager, @NonNull RoutingService routingService, @NonNull FeatureServiceV2 featureServiceV2, @NonNull MainActivityLifecycleObserverRegistrar mainActivityLifecycleObserverRegistrar) {
        this(str, position, align, viewGroup, orientation, oEMetricsRecorder, bIMetricsRecorder, taskManager, routingService, featureServiceV2, mainActivityLifecycleObserverRegistrar);
        this.anchorView = view;
        init();
    }
}
