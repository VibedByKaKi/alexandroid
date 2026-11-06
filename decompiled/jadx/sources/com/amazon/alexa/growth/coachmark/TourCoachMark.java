package com.amazon.alexa.growth.coachmark;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import com.amazon.alexa.eventing.Event$$ExternalSyntheticLambda2;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.growth.coachmark.CoachMark;
import com.amazon.alexa.growth.metrics.BIMetricsRecorder;
import com.amazon.alexa.growth.metrics.OEMetricsRecorder;
import com.amazon.alexa.mosaic.themes.R;
import com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserverRegistrar;
import com.amazon.alexa.routing.api.RoutingService;
import com.amazon.alexa.tasks.api.TaskManager;
import com.github.florent37.viewtooltip.ViewTooltip;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class TourCoachMark extends CoachMark {
    protected static final String TAG = "CoachMark";
    static final String TOUR_COACH_MARK_CLICK_DISMISS = "TourCoachMarkDismiss";
    static final String TOUR_COACH_MARK_CLICK_NEXT = "TourCoachMarkNext";
    public ANCHORVIEWSHAPE anchorviewshape;
    private View coachMarkCustomView;
    private String customText;
    private View.OnClickListener customTextClickListener;
    private Integer customTitleColor;
    public Button dismissButton;
    private boolean isCustomTextMode;
    public Button nextButton;
    public int sequenceNumber;
    public int sequenceTotal;
    private String title;
    private TextView titleTextView;
    private TourCoachMarkListener tourCoachMarkListener;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ANCHORVIEWSHAPE {
        RECT,
        ROUND
    }

    public TourCoachMark(@NonNull View view, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable ViewTooltip.Position position, @Nullable ViewTooltip.ALIGN align, @Nullable ANCHORVIEWSHAPE anchorviewshape, @Nullable ViewGroup viewGroup, @NonNull CoachMark.ORIENTATION orientation, @NonNull OEMetricsRecorder oEMetricsRecorder, @NonNull BIMetricsRecorder bIMetricsRecorder, @NonNull TaskManager taskManager, @NonNull RoutingService routingService, @NonNull FeatureServiceV2 featureServiceV2, @NonNull MainActivityLifecycleObserverRegistrar mainActivityLifecycleObserverRegistrar) {
        super(view, str, position, align, viewGroup, orientation, oEMetricsRecorder, bIMetricsRecorder, taskManager, routingService, featureServiceV2, mainActivityLifecycleObserverRegistrar);
        this.sequenceNumber = 0;
        this.sequenceTotal = 0;
        this.isCustomTextMode = false;
        this.anchorviewshape = anchorviewshape;
        this.text = str3;
        this.title = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$generateFullscreenTouchInterceptor$5(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeFullScreenTouchView$4() {
        this.fullscreenRootView.removeView(this.fullscreenTouchInterceptorView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderCoachMark$1(View view) {
        dismiss();
        TourCoachMarkListener tourCoachMarkListener = this.tourCoachMarkListener;
        if (tourCoachMarkListener != null) {
            tourCoachMarkListener.onDismiss();
        }
        CoachMarkVisibilityHelper.setCoachMarkShown(this.anchorViewContext, this.coachMarkId);
        CoachMarkVisibilityHelper.setCoachMarkInvisible();
        BIMetricsRecorder bIMetricsRecorder = this.biMetricsRecorder;
        String str = this.coachMarkId;
        bIMetricsRecorder.recordEventOccurrence(new String[]{str, TOUR_COACH_MARK_CLICK_DISMISS}, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderCoachMark$2(View view) {
        onNextButtonClicked();
        CoachMarkVisibilityHelper.setCoachMarkShown(this.anchorViewContext, this.coachMarkId);
        BIMetricsRecorder bIMetricsRecorder = this.biMetricsRecorder;
        String str = this.coachMarkId;
        bIMetricsRecorder.recordEventOccurrence(new String[]{str, TOUR_COACH_MARK_CLICK_NEXT}, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderCoachMark$3(View view) {
        Rect rect = new Rect();
        this.nextButton.getHitRect(rect);
        int dimensionPixelSize = this.anchorViewContext.getResources().getDimensionPixelSize(R.dimen.mosaic_space_stack_small);
        rect.top -= dimensionPixelSize;
        rect.bottom += dimensionPixelSize;
        view.setTouchDelegate(new TouchDelegate(rect, this.nextButton));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestFocus$0() {
        this.coachMarkCustomView.requestFocus();
        this.coachMarkCustomView.sendAccessibilityEvent(8);
    }

    @Override // com.amazon.alexa.growth.coachmark.CoachMark
    @SuppressLint({"ClickableViewAccessibility"})
    public void generateFullscreenTouchInterceptor() {
        FullscreenTouchInterceptorView fullscreenTouchInterceptorView = new FullscreenTouchInterceptorView(this.anchorViewContext);
        this.fullscreenTouchInterceptorView = fullscreenTouchInterceptorView;
        fullscreenTouchInterceptorView.setAnchorView(this.anchorView, this.anchorviewshape);
        this.fullscreenTouchInterceptorView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.fullscreenTouchInterceptorView.bringToFront();
        this.fullscreenTouchInterceptorView.setOnTouchListener(new TourCoachMark$$ExternalSyntheticLambda1(0));
        this.fullscreenTouchInterceptorView.setForeground(new ColorDrawable(ViewCompat.MEASURED_STATE_MASK));
        this.fullscreenTouchInterceptorView.getForeground().setAlpha(128);
        this.fullscreenRootView.addView(this.fullscreenTouchInterceptorView);
    }

    @Override // com.amazon.alexa.growth.coachmark.CoachMark
    public void initializeCoachMark() {
        View inflate = this.anchorViewActivity.getLayoutInflater().inflate(com.amazon.alexa.growth.R.layout.coach_mark_dialog, this.tooltipView);
        this.coachMarkCustomView = inflate;
        this.titleTextView = (TextView) inflate.findViewById(com.amazon.alexa.growth.R.id.coach_mark_status_text);
        TextView textView = (TextView) this.coachMarkCustomView.findViewById(com.amazon.alexa.growth.R.id.coach_mark_text);
        this.customTextView = textView;
        CoachMarkAnimation coachMarkAnimation = new CoachMarkAnimation(this.resources, textView);
        coachMarkAnimation.enableTextFadeIn = false;
        CoachMark.CoachMarkPositioning calculateCoachMarkPositioning = calculateCoachMarkPositioning();
        int round = Math.round(this.resources.getDimension(com.amazon.alexa.growth.R.dimen.touroverlay_coachmark_arrow_width));
        int round2 = Math.round(this.resources.getDimension(com.amazon.alexa.growth.R.dimen.touroverlay_coachmark_distance_with_view));
        int round3 = Math.round(this.resources.getDimension(com.amazon.alexa.growth.R.dimen.touroverlay_coachmark_distance_with_arrow));
        int round4 = Math.round(this.resources.getDimension(com.amazon.alexa.growth.R.dimen.coachmark_distance_with_boarder));
        this.coachMarkCustomView.setClipToOutline(true);
        this.tooltip = ViewTooltip.on(this.anchorViewActivity, this.fullscreenRootView, this.anchorView).testId(this.resources.getResourceName(com.amazon.alexa.growth.R.id.coach_mark)).corner(Math.round(this.resources.getDimension(com.amazon.alexa.growth.R.dimen.touroverlay_coachmark_corner_radius) * 2.0f)).arrowHeight(Math.round(this.resources.getDimension(com.amazon.alexa.growth.R.dimen.touroverlay_coachmark_arrow_height))).arrowWidth(round).padding(0, 0, 0, 0).withShadow(true).align(calculateCoachMarkPositioning.alignment).position(calculateCoachMarkPositioning.position).clickToHide(false).autoHide(false, 0L).customView(this.coachMarkCustomView).distanceWithView(round2).distanceWithArrow(round3 + round).margin(round4, 0, round4, 0).animation(coachMarkAnimation);
        setupCoachMarkColors();
    }

    public void onNextButtonClicked() {
        TourCoachMarkListener tourCoachMarkListener = this.tourCoachMarkListener;
        if (tourCoachMarkListener != null) {
            if (this.sequenceTotal > this.sequenceNumber + 1) {
                tourCoachMarkListener.onNext();
            } else {
                tourCoachMarkListener.onComplete();
                CoachMarkVisibilityHelper.setCoachMarkInvisible();
            }
        }
    }

    @Override // com.amazon.alexa.growth.coachmark.CoachMark
    public void removeFullScreenTouchView() {
        this.anchorViewActivity.runOnUiThread(new TourCoachMark$$ExternalSyntheticLambda0(this, 1));
    }

    @Override // com.amazon.alexa.growth.coachmark.CoachMark
    public void renderCoachMark() {
        OEMetricsRecorder oEMetricsRecorder = this.oeMetricsRecorder;
        String str = this.coachMarkId;
        this.renderTimer = oEMetricsRecorder.createRenderTimer(new String[]{"CoachMark", str}, str);
        this.tooltipView = this.tooltip.show();
        CoachMarkVisibilityHelper.setCoachMarkVisible();
        View view = this.coachMarkCustomView;
        if (view != null) {
            Button button = (Button) view.findViewById(com.amazon.alexa.growth.R.id.coach_mark_btn_dismiss);
            this.dismissButton = button;
            final int i = 0;
            button.setOnClickListener(new View.OnClickListener(this) { // from class: com.amazon.alexa.growth.coachmark.TourCoachMark$$ExternalSyntheticLambda2
                public final /* synthetic */ TourCoachMark f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i2 = i;
                    TourCoachMark tourCoachMark = this.f$0;
                    switch (i2) {
                        case 0:
                            tourCoachMark.lambda$renderCoachMark$1(view2);
                            break;
                        default:
                            tourCoachMark.lambda$renderCoachMark$2(view2);
                            break;
                    }
                }
            });
            Button button2 = (Button) this.coachMarkCustomView.findViewById(com.amazon.alexa.growth.R.id.coach_mark_btn_next);
            this.nextButton = button2;
            final int i2 = 1;
            button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.amazon.alexa.growth.coachmark.TourCoachMark$$ExternalSyntheticLambda2
                public final /* synthetic */ TourCoachMark f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i22 = i2;
                    TourCoachMark tourCoachMark = this.f$0;
                    switch (i22) {
                        case 0:
                            tourCoachMark.lambda$renderCoachMark$1(view2);
                            break;
                        default:
                            tourCoachMark.lambda$renderCoachMark$2(view2);
                            break;
                    }
                }
            });
            View findViewById = this.coachMarkCustomView.findViewById(com.amazon.alexa.growth.R.id.coach_mark_btn_next_container);
            findViewById.post(new Event$$ExternalSyntheticLambda2(this, findViewById, 14));
            TextView textView = this.customTextView;
            if (textView != null) {
                textView.setText(this.text);
            }
            if (this.titleTextView != null) {
                setCoachMarkTitle(this.title);
                Integer num = this.customTitleColor;
                if (num != null) {
                    this.titleTextView.setTextColor(num.intValue());
                }
            }
            TextView textView2 = (TextView) this.coachMarkCustomView.findViewById(com.amazon.alexa.growth.R.id.coach_mark_sequence_num);
            if (this.isCustomTextMode) {
                textView2.setText(this.customText);
                textView2.setClickable(true);
                textView2.setFocusable(true);
                textView2.setOnClickListener(this.customTextClickListener);
                textView2.setTextColor(this.anchorViewContext.getResources().getColor(R.color.mosaic_color_text_link));
            } else if (this.sequenceTotal > 0) {
                textView2.setText(this.anchorViewContext.getResources().getString(com.amazon.alexa.growth.R.string.coachmark_tour_page, Integer.valueOf(this.sequenceNumber + 1), Integer.valueOf(this.sequenceTotal)));
                textView2.setClickable(false);
                textView2.setFocusable(false);
                textView2.setOnClickListener(null);
                textView2.setTextColor(this.anchorViewContext.getResources().getColor(R.color.mosaic_coachmark_pagination_text));
            }
            if (this.sequenceNumber + 1 >= this.sequenceTotal) {
                this.nextButton.setText(this.anchorViewContext.getResources().getString(com.amazon.alexa.growth.R.string.coachmark_tour_done));
            }
        }
        this.tooltipView.setLabelFor(this.anchorView.getId());
        generateFullscreenTouchInterceptor();
        this.oeMetricsRecorder.recordTimer(this.renderTimer);
    }

    public void requestFocus() {
        View view = this.coachMarkCustomView;
        if (view == null) {
            return;
        }
        view.post(new TourCoachMark$$ExternalSyntheticLambda0(this, 0));
    }

    public void setCoachMarkListener(TourCoachMarkListener tourCoachMarkListener) {
        this.tourCoachMarkListener = tourCoachMarkListener;
    }

    public void setCoachMarkTitle(String str) {
        TextView textView;
        if (TextUtils.isEmpty(str) || this.anchorViewActivity == null || (textView = this.titleTextView) == null) {
            return;
        }
        textView.setText(str);
        this.titleTextView.setContentDescription(str);
        Integer num = this.customTitleColor;
        if (num != null) {
            this.titleTextView.setTextColor(num.intValue());
        }
    }

    public void setCustomText(String str, View.OnClickListener onClickListener) {
        this.customText = str;
        this.customTextClickListener = onClickListener;
        this.isCustomTextMode = (str == null || onClickListener == null) ? false : true;
    }

    public void setCustomTitleColor(int i) {
        this.customTitleColor = Integer.valueOf(i);
    }

    public void setSequenceNumber(int i) {
        this.sequenceNumber = i;
    }

    public void setSequenceTotal(int i) {
        this.sequenceTotal = i;
    }

    @Override // com.amazon.alexa.growth.coachmark.CoachMark
    @VisibleForTesting(otherwise = 4)
    public void setupCoachMarkColors() {
        int color = this.anchorViewContext.getResources().getColor(R.color.mosaic_coachmark_background);
        this.tooltip.color(color);
        this.tooltip.shadowColor(this.themeHelper.getColorFromAttribute(this.anchorViewContext, R.attr.mosaicTransparent));
        this.coachMarkCustomView.setBackgroundTintList(ColorStateList.valueOf(color));
        this.tooltip.withShadow(true);
    }

    public TourCoachMark(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable ViewTooltip.Position position, @Nullable ViewTooltip.ALIGN align, @Nullable ANCHORVIEWSHAPE anchorviewshape, @Nullable ViewGroup viewGroup, @NonNull CoachMark.ORIENTATION orientation, @NonNull OEMetricsRecorder oEMetricsRecorder, @NonNull BIMetricsRecorder bIMetricsRecorder, @NonNull TaskManager taskManager, @NonNull RoutingService routingService, @NonNull FeatureServiceV2 featureServiceV2, @NonNull MainActivityLifecycleObserverRegistrar mainActivityLifecycleObserverRegistrar) {
        super(str, position, align, viewGroup, orientation, oEMetricsRecorder, bIMetricsRecorder, taskManager, routingService, featureServiceV2, mainActivityLifecycleObserverRegistrar);
        this.sequenceNumber = 0;
        this.sequenceTotal = 0;
        this.isCustomTextMode = false;
        this.anchorviewshape = anchorviewshape;
        this.text = str3;
        this.title = str2;
    }
}
