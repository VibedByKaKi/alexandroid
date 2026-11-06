package com.amazon.alexa.voice.ui.onedesign.list;

import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.annotation.UiModel;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UiModel(builder = true)
/* loaded from: classes20.dex */
public interface ListCardModel extends Parcelable {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @UiModel(builder = true)
    public interface ItemModel extends Parcelable {
        @NonNull
        CharSequence getName();
    }

    @NonNull
    List<? extends ItemModel> getItemList();

    @NonNull
    String getListType();
}
