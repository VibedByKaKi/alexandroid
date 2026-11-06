package com.amazon.alexa.voice.ui.onedesign.travel;

import android.content.res.Resources;
import androidx.annotation.DrawableRes;
import com.amazon.alexa.voice.ui.metrics.CardMetricsInteractor;
import com.amazon.alexa.voice.ui.onedesign.travel.TravelTimeDistanceContract;
import com.amazon.alexa.vox.ui.onedesign.R;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class TravelTimeDistancePresenter implements TravelTimeDistanceContract.Presenter {
    private final TravelTimeDistanceContract.Interactor interactor;
    private final CardMetricsInteractor metricsInteractor;
    private final Resources resources;
    private final TravelTimeDistanceFormatter travelTimeDistanceFormatter;
    private final TravelTimeDistanceContract.View view;

    public TravelTimeDistancePresenter(TravelTimeDistanceContract.View view, TravelTimeDistanceContract.Interactor interactor, TravelTimeDistanceFormatter travelTimeDistanceFormatter, CardMetricsInteractor cardMetricsInteractor, Resources resources) {
        this.view = view;
        this.interactor = interactor;
        this.travelTimeDistanceFormatter = travelTimeDistanceFormatter;
        this.metricsInteractor = cardMetricsInteractor;
        this.resources = resources;
    }

    private String getCardName() {
        return this.interactor.getCard().getClass().getSimpleName();
    }

    @DrawableRes
    private int getIndicator(int i) {
        return i == 0 ? R.drawable.ic_voice_ui_od_traffic_indicator_green : i == 1 ? R.drawable.ic_voice_ui_od_traffic_indicator_orange : R.drawable.ic_voice_ui_od_traffic_indicator_red;
    }

    private CharSequence getPrimaryLabel(TravelTimeDistanceModel travelTimeDistanceModel) {
        int travelCardType = travelTimeDistanceModel.getTravelCardType();
        TravelTimeDistanceFormatter travelTimeDistanceFormatter = this.travelTimeDistanceFormatter;
        return travelCardType == 0 ? travelTimeDistanceFormatter.format(travelTimeDistanceModel.getTimeToDestination()) : travelTimeDistanceFormatter.format(travelTimeDistanceModel.getDistanceToDestination());
    }

    private CharSequence getSecondaryLabel(TravelTimeDistanceModel travelTimeDistanceModel) {
        return travelTimeDistanceModel.getTravelCardType() == 0 ? travelTimeDistanceModel.getDistanceToDestination() : travelTimeDistanceModel.getTimeToDestination();
    }

    private CharSequence getSubTitle(TravelTimeDistanceModel travelTimeDistanceModel) {
        if (travelTimeDistanceModel.getOrigin().length() != 0) {
            return travelTimeDistanceModel.getOrigin();
        }
        int travelCardType = travelTimeDistanceModel.getTravelCardType();
        Resources resources = this.resources;
        return travelCardType == 0 ? resources.getString(R.string.voice_ui_od_travel_time) : resources.getString(R.string.voice_ui_od_travel_distance);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.travel.TravelTimeDistanceContract.Presenter
    public void closeClicked() {
        this.interactor.close();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.travel.TravelTimeDistanceContract.Presenter
    public void dismiss() {
        this.interactor.dismiss();
    }

    public CharSequence formatRoadSegment(List<? extends CharSequence> list) {
        int size = list.size();
        if (size == 0) {
            return "";
        }
        Resources resources = this.resources;
        return size == 1 ? resources.getQuantityString(R.plurals.voice_ui_od_travel_time_distance_route, 1, list.get(0)) : resources.getQuantityString(R.plurals.voice_ui_od_travel_time_distance_route, 2, list.get(0), list.get(1));
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.travel.TravelTimeDistanceContract.Presenter
    public void start() {
        TravelTimeDistanceModel card = this.interactor.getCard();
        this.view.floodBackgroundToStatusBar();
        this.view.setTitle(card.getDestination());
        this.view.setSubTitle(getSubTitle(card));
        this.view.setPrimaryLabel(getPrimaryLabel(card));
        this.view.setRoadSegment(formatRoadSegment(card.getRoadSegments()));
        this.view.setSecondaryLabel(getSecondaryLabel(card));
        this.view.setTrafficCondition(getIndicator(card.getCondition()));
        this.metricsInteractor.reportCardShown(getCardName() + "_" + card.getTravelCardType());
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.travel.TravelTimeDistanceContract.Presenter
    public void end() {
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.travel.TravelTimeDistanceContract.Presenter
    public void interacted() {
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.travel.TravelTimeDistanceContract.Presenter
    public void viewDestroyed() {
    }
}
