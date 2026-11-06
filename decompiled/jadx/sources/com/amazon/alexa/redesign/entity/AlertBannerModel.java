package com.amazon.alexa.redesign.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.view.homeFeed.RecyclerViewItem;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/redesign/entity/AlertBannerModel;", "Lcom/amazon/alexa/redesign/entity/CardModel;", "<init>", "()V", "alertMessage", "", "getAlertMessage", "()Ljava/lang/String;", "setAlertMessage", "(Ljava/lang/String;)V", "toViewItem", "Lcom/amazon/alexa/redesign/view/homeFeed/RecyclerViewItem;", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class AlertBannerModel extends CardModel {
    public static final int $stable = 8;

    @SerializedName("alertMessage")
    @NotNull
    private String alertMessage = "";

    @NotNull
    public final String getAlertMessage() {
        return this.alertMessage;
    }

    public final void setAlertMessage(@NotNull String str) {
        str.getClass();
        this.alertMessage = str;
    }

    @Override // com.amazon.alexa.redesign.entity.CardModel
    @Nullable
    public RecyclerViewItem toViewItem() {
        return null;
    }
}
