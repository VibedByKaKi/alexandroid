package com.amazon.alexa.voice.ui.onedesign.calendar;

import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.annotation.UiModel;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UiModel(builder = true)
/* loaded from: classes20.dex */
public interface CalendarCardModel extends Parcelable {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @UiModel(builder = true)
    public interface EventModel extends Parcelable {
        boolean getAllDay();

        long getEndTime();

        CharSequence getId();

        CharSequence getLocation();

        boolean getMultiDay();

        @NonNull
        CharSequence getName();

        CharSequence getProvider();

        long getStartTime();
    }

    @NonNull
    List<? extends EventModel> getEventList();

    CharSequence getTitle();
}
