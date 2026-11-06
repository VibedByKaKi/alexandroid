package com.amazon.alexa.voice.ui.onedesign.traffic;

import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.annotation.UiModel;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UiModel(builder = true)
/* loaded from: classes20.dex */
public interface TrafficCardModel extends Parcelable {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @UiModel(builder = true)
    public interface RouteModel extends Parcelable {
        public static final int CONDITION_GOOD = 0;
        public static final int CONDITION_SLOW = 2;
        public static final int CONDITION_SLUGGISH = 1;

        int getCondition();

        @NonNull
        CharSequence getDistance();

        @NonNull
        List<CharSequence> getStreetList();

        @NonNull
        CharSequence getTimeToDestination();
    }

    @NonNull
    List<? extends RouteModel> getRouteList();
}
