package com.amazon.alexa.stayorganized.ui;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.core.content.res.ResourcesCompat;
import com.amazon.alexa.stayorganized.R;
import com.amazon.alexa.stayorganized.data.models.ShoppingListItemModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/stayorganized/ui/ShoppingListWidgetFactory;", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "(Landroid/content/Context;Landroid/content/Intent;)V", "getCount", "", "getErrorState", "Landroid/widget/RemoteViews;", "getItemId", "", "position", "getLoadingView", "getViewAt", "getViewTypeCount", "hasStableIds", "", "onCreate", "", "onDataSetChanged", "onDestroy", "Companion", "AlexaMobileAndroidStayOrganized_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ShoppingListWidgetFactory implements RemoteViewsService.RemoteViewsFactory {
    private static final int ERROR_STATE_ITEM_COUNT = 2;

    @NotNull
    private static final String TAG = "ShoppingListWidgetFactory";

    @NotNull
    private final Context context;

    public ShoppingListWidgetFactory(@NotNull Context context, @NotNull Intent intent) {
        context.getClass();
        intent.getClass();
        this.context = context;
    }

    private final RemoteViews getErrorState() {
        RemoteViews remoteViews = new RemoteViews(this.context.getPackageName(), R.layout.shopping_list_error_item);
        Intent intent = new Intent();
        intent.putExtra("clickedOn", "text");
        remoteViews.setOnClickFillInIntent(R.id.error_text_wrapper, intent);
        return remoteViews;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getCount() {
        ShoppingListWidgetPresenter shoppingListWidgetPresenter = ShoppingListWidgetPresenter.INSTANCE;
        if (shoppingListWidgetPresenter.isRenderingErrorState$AlexaMobileAndroidStayOrganized_release()) {
            return 2;
        }
        return shoppingListWidgetPresenter.getItemCount$AlexaMobileAndroidStayOrganized_release();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public long getItemId(int position) {
        return position;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    @NotNull
    public RemoteViews getLoadingView() {
        return getErrorState();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    @NotNull
    public RemoteViews getViewAt(int position) {
        String str;
        RemoteViews remoteViews = new RemoteViews(this.context.getPackageName(), R.layout.shopping_list_item);
        ShoppingListWidgetPresenter shoppingListWidgetPresenter = ShoppingListWidgetPresenter.INSTANCE;
        if (shoppingListWidgetPresenter.isRenderingErrorState$AlexaMobileAndroidStayOrganized_release()) {
            remoteViews.setViewVisibility(R.id.shopping_list_error_layout, 0);
            remoteViews.setViewVisibility(R.id.checkbox, 8);
            remoteViews.setViewVisibility(R.id.text_wrapper, 8);
            Intent intent = new Intent();
            intent.putExtra("clickedOn", "text");
            remoteViews.setOnClickFillInIntent(R.id.error_text_wrapper, intent);
        } else {
            remoteViews.setViewVisibility(R.id.shopping_list_error_layout, 8);
            remoteViews.setViewVisibility(R.id.checkbox, 0);
            remoteViews.setViewVisibility(R.id.text_wrapper, 0);
        }
        ShoppingListItemModel itemModelByPosition$AlexaMobileAndroidStayOrganized_release = shoppingListWidgetPresenter.getItemModelByPosition$AlexaMobileAndroidStayOrganized_release(position);
        int i = R.id.shopping_list_item_text;
        if (itemModelByPosition$AlexaMobileAndroidStayOrganized_release == null || (str = itemModelByPosition$AlexaMobileAndroidStayOrganized_release.getTitle()) == null) {
            str = "";
        }
        remoteViews.setTextViewText(i, str);
        if (itemModelByPosition$AlexaMobileAndroidStayOrganized_release != null) {
            itemModelByPosition$AlexaMobileAndroidStayOrganized_release.getTitle();
        }
        if ((itemModelByPosition$AlexaMobileAndroidStayOrganized_release != null ? Long.valueOf(itemModelByPosition$AlexaMobileAndroidStayOrganized_release.getTimestamp()) : null) != null) {
            String str2 = new SimpleDateFormat("EEEE, MMMM d, h:mm", Locale.getDefault()).format(new Date(itemModelByPosition$AlexaMobileAndroidStayOrganized_release.getTimestamp())).toString();
            String str3 = new SimpleDateFormat(" aaa", Locale.getDefault()).format(new Date(itemModelByPosition$AlexaMobileAndroidStayOrganized_release.getTimestamp())).toString();
            remoteViews.setTextViewText(R.id.shopping_list_item_subtitle, str2 + str3);
        }
        Intent intent2 = new Intent();
        intent2.putExtra("position", position);
        intent2.putExtra("clickedOn", "checkbox");
        if (itemModelByPosition$AlexaMobileAndroidStayOrganized_release != null ? itemModelByPosition$AlexaMobileAndroidStayOrganized_release.isComplete() : false) {
            remoteViews.setImageViewResource(R.id.checkbox, R.drawable.ic_checkbox);
            remoteViews.setTextColor(R.id.shopping_list_item_text, ResourcesCompat.getColor(this.context.getResources(), R.color.completed_title_color, null));
            remoteViews.setTextColor(R.id.shopping_list_item_subtitle, ResourcesCompat.getColor(this.context.getResources(), R.color.completed_subtitle_color, null));
            remoteViews.setContentDescription(R.id.checkbox, this.context.getResources().getString(R.string.shopping_list_checked));
        } else {
            remoteViews.setImageViewResource(R.id.checkbox, R.drawable.rectangle_2_svg);
            remoteViews.setTextColor(R.id.shopping_list_item_text, ResourcesCompat.getColor(this.context.getResources(), R.color.not_completed_title_color, null));
            remoteViews.setTextColor(R.id.shopping_list_item_subtitle, ResourcesCompat.getColor(this.context.getResources(), R.color.not_completed_subtitle_color, null));
            remoteViews.setContentDescription(R.id.checkbox, this.context.getResources().getString(R.string.shopping_list_unchecked));
        }
        remoteViews.setOnClickFillInIntent(R.id.checkbox, intent2);
        Intent intent3 = new Intent();
        intent3.putExtra("position", position);
        intent3.putExtra("clickedOn", "text");
        remoteViews.setOnClickFillInIntent(R.id.text_wrapper, intent3);
        return remoteViews;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onCreate() {
        ShoppingListWidgetPresenter.INSTANCE.setUpdateBy("widgetDrop");
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDataSetChanged() {
        ShoppingListWidgetPresenter.INSTANCE.getShoppingListModel$AlexaMobileAndroidStayOrganized_release(this.context);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDestroy() {
    }
}
