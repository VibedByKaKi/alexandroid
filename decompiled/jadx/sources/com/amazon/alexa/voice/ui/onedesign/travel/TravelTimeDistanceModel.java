package com.amazon.alexa.voice.ui.onedesign.travel;

import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.annotation.UiModel;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UiModel(builder = true)
/* loaded from: classes20.dex */
public interface TravelTimeDistanceModel extends Parcelable {
    public static final int CONDITION_EXTREMELY_SLOW = 3;
    public static final int CONDITION_GOOD = 0;
    public static final int CONDITION_SLOW = 2;
    public static final int CONDITION_SLUGGISH = 1;
    public static final int TRAVEL_DISTANCE = 1;
    public static final int TRAVEL_TIME = 0;

    int getCondition();

    @NonNull
    CharSequence getDestination();

    @NonNull
    CharSequence getDistanceToDestination();

    @NonNull
    CharSequence getOrigin();

    @NonNull
    List<CharSequence> getRoadSegments();

    @NonNull
    CharSequence getTimeToDestination();

    int getTravelCardType();
}
