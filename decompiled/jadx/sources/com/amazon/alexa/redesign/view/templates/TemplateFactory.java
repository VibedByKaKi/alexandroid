package com.amazon.alexa.redesign.view.templates;

import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.redesign.view.homeFeed.BaseCardViewHolder;
import com.amazon.alexa.redesign.view.homeFeed.RecyclerViewItem;
import com.amazon.alexa.routing.api.RouteParameter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/redesign/view/templates/TemplateFactory;", "", "create", "Lcom/amazon/alexa/redesign/view/homeFeed/BaseCardViewHolder;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/amazon/alexa/redesign/view/homeFeed/RecyclerViewItem;", "viewType", "", RouteParameter.PARENT, "Landroid/view/ViewGroup;", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public interface TemplateFactory {
    @NotNull
    <T extends RecyclerViewItem> BaseCardViewHolder<T> create(int viewType, @NotNull ViewGroup parent);
}
