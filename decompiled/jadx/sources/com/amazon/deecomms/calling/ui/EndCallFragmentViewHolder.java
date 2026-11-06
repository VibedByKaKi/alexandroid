package com.amazon.deecomms.calling.ui;

import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.amazon.deecomms.R;
import com.amazon.deecomms.calling.controller.EndCallActionClickListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class EndCallFragmentViewHolder {
    private TextView mAcknowledgeText;
    private TextView mCallDuration;
    private RelativeLayout mCallRatingLayout;
    private RelativeLayout mCallRatingSheet;
    private TextView mDescription;
    private TextView mEndCallStatus;
    private final EndCallActionClickListener mListener;
    private TextView mParticipantName;
    private Button mRateCallButton;
    private RatingBar mRatingBar;
    private final View mRoot;
    private Button mSkipButton;

    public EndCallFragmentViewHolder(EndCallActionClickListener endCallActionClickListener, View view) {
        this.mListener = endCallActionClickListener;
        this.mRoot = view;
        initializeViews();
        initializeListeners();
    }

    private void downscaleDescription() {
        this.mDescription.setAlpha(0.8f);
        this.mDescription.setTextSize(14.0f);
        this.mDescription.setVisibility(0);
    }

    private void initializeListeners() {
        final int i = 0;
        this.mRatingBar.setOnRatingBarChangeListener(new EndCallFragmentViewHolder$$ExternalSyntheticLambda0(this, i));
        this.mRateCallButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.amazon.deecomms.calling.ui.EndCallFragmentViewHolder$$ExternalSyntheticLambda1
            public final /* synthetic */ EndCallFragmentViewHolder f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                EndCallFragmentViewHolder endCallFragmentViewHolder = this.f$0;
                switch (i2) {
                    case 0:
                        endCallFragmentViewHolder.lambda$initializeListeners$1(view);
                        break;
                    default:
                        endCallFragmentViewHolder.lambda$initializeListeners$2(view);
                        break;
                }
            }
        });
        final int i2 = 1;
        this.mSkipButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.amazon.deecomms.calling.ui.EndCallFragmentViewHolder$$ExternalSyntheticLambda1
            public final /* synthetic */ EndCallFragmentViewHolder f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                EndCallFragmentViewHolder endCallFragmentViewHolder = this.f$0;
                switch (i22) {
                    case 0:
                        endCallFragmentViewHolder.lambda$initializeListeners$1(view);
                        break;
                    default:
                        endCallFragmentViewHolder.lambda$initializeListeners$2(view);
                        break;
                }
            }
        });
    }

    private void initializeViews() {
        this.mCallRatingLayout = (RelativeLayout) this.mRoot.findViewById(R.id.call_rating_layout);
        this.mRateCallButton = (Button) this.mRoot.findViewById(R.id.rate_call_button);
        this.mCallRatingSheet = (RelativeLayout) this.mRoot.findViewById(R.id.call_rating_sheet);
        this.mDescription = (TextView) this.mRoot.findViewById(R.id.description);
        this.mRatingBar = (RatingBar) this.mRoot.findViewById(R.id.rating_bar);
        this.mAcknowledgeText = (TextView) this.mRoot.findViewById(R.id.acknowledge_text);
        this.mSkipButton = (Button) this.mRoot.findViewById(R.id.skip_button);
        this.mParticipantName = (TextView) this.mRoot.findViewById(R.id.callParticipantName);
        this.mCallDuration = (TextView) this.mRoot.findViewById(R.id.screen_title);
        this.mEndCallStatus = (TextView) this.mRoot.findViewById(R.id.callStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeListeners$0(RatingBar ratingBar, float f, boolean z) {
        if (z) {
            this.mListener.onStarsClicked(Math.round(f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeListeners$1(View view) {
        this.mListener.onRateCallClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeListeners$2(View view) {
        this.mListener.onSkipClicked();
    }

    private void upscaleDescription() {
        this.mDescription.setAlpha(1.0f);
        this.mDescription.setTextSize(18.0f);
        this.mDescription.setVisibility(0);
    }

    public void disableBarRating() {
        this.mRatingBar.setIsIndicator(true);
    }

    public void hideBottomSheet() {
        this.mCallRatingLayout.setVisibility(4);
        this.mRateCallButton.setVisibility(8);
        this.mCallRatingSheet.setVisibility(8);
    }

    public void hideRateCallAndShowCallRatingSheet() {
        this.mCallRatingLayout.setVisibility(0);
        this.mRateCallButton.setVisibility(8);
        this.mCallRatingSheet.setVisibility(0);
    }

    public void hideSkipAndShowThanks(@NonNull String str) {
        this.mDescription.setText(str);
        upscaleDescription();
        this.mSkipButton.setVisibility(8);
        this.mAcknowledgeText.setVisibility(0);
    }

    public void showRateCallAndHideCallRatingSheet() {
        this.mCallRatingLayout.setVisibility(0);
        this.mRateCallButton.setVisibility(0);
        this.mCallRatingSheet.setVisibility(8);
    }

    public void showSkipAndHideThanks(@NonNull String str) {
        this.mDescription.setText(str);
        downscaleDescription();
        this.mSkipButton.setVisibility(0);
        this.mAcknowledgeText.setVisibility(8);
    }

    public void updateViews(String str, String str2, String str3) {
        this.mParticipantName.setText(str);
        this.mCallDuration.setText(str2);
        this.mEndCallStatus.setText(str3);
        this.mParticipantName.setContentDescription(str + " " + str3);
    }
}
