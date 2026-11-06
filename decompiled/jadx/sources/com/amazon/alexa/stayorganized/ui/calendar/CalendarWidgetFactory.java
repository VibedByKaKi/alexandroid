package com.amazon.alexa.stayorganized.ui.calendar;

import android.content.Context;
import android.content.Intent;
import android.text.format.DateFormat;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.stayorganized.R;
import com.amazon.alexa.stayorganized.data.models.CalendarItemModel;
import defpackage.a$$ExternalSyntheticOutline0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/stayorganized/ui/calendar/CalendarWidgetFactory;", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getCount", "", "getItemId", "", "position", "getLoadingView", "Landroid/widget/RemoteViews;", "getViewAt", "getViewTypeCount", "hasStableIds", "", "onCreate", "", "onDataSetChanged", "onDestroy", "Companion", "AlexaMobileAndroidStayOrganized_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class CalendarWidgetFactory implements RemoteViewsService.RemoteViewsFactory {
    private static final int ERROR_STATE_ITEM_COUNT = 2;

    @NotNull
    private static final String TAG = "CalendarWidgetFactory";

    @NotNull
    private final Context context;

    public CalendarWidgetFactory(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getCount() {
        CalendarWidgetPresenter calendarWidgetPresenter = CalendarWidgetPresenter.INSTANCE;
        if (calendarWidgetPresenter.isRenderingErrorState$AlexaMobileAndroidStayOrganized_release()) {
            return 2;
        }
        return calendarWidgetPresenter.getItemCount$AlexaMobileAndroidStayOrganized_release();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public long getItemId(int position) {
        return position;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    @NotNull
    public RemoteViews getLoadingView() {
        RemoteViews remoteViews = new RemoteViews(this.context.getPackageName(), R.layout.calendar_error_item);
        Intent intent = new Intent();
        intent.putExtra("clickedOn", "text");
        remoteViews.setOnClickFillInIntent(R.id.calendar_error_text_wrapper, intent);
        return remoteViews;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    @NotNull
    public RemoteViews getViewAt(int position) {
        RemoteViews remoteViews = new RemoteViews(this.context.getPackageName(), R.layout.calendar_item);
        CalendarWidgetPresenter calendarWidgetPresenter = CalendarWidgetPresenter.INSTANCE;
        if (calendarWidgetPresenter.isRenderingErrorState$AlexaMobileAndroidStayOrganized_release()) {
            remoteViews.setViewVisibility(R.id.calendar_error_layout, 0);
            remoteViews.setViewVisibility(R.id.calendar_text_wrapper, 8);
            Intent intent = new Intent();
            intent.putExtra("clickedOn", "text");
            remoteViews.setOnClickFillInIntent(R.id.calendar_error_text_wrapper, intent);
        } else {
            remoteViews.setViewVisibility(R.id.calendar_error_layout, 8);
            remoteViews.setViewVisibility(R.id.calendar_text_wrapper, 0);
        }
        CalendarItemModel itemModelByPosition$AlexaMobileAndroidStayOrganized_release = calendarWidgetPresenter.getItemModelByPosition$AlexaMobileAndroidStayOrganized_release(position);
        if (itemModelByPosition$AlexaMobileAndroidStayOrganized_release != null) {
            itemModelByPosition$AlexaMobileAndroidStayOrganized_release.getTitle();
        }
        if (itemModelByPosition$AlexaMobileAndroidStayOrganized_release != null) {
            remoteViews.setTextViewText(R.id.calendar_item_text, itemModelByPosition$AlexaMobileAndroidStayOrganized_release.getTitle());
            Locale locale = Locale.getDefault();
            locale.getClass();
            Date date = new Date(itemModelByPosition$AlexaMobileAndroidStayOrganized_release.getStartTime());
            Date date2 = new Date(itemModelByPosition$AlexaMobileAndroidStayOrganized_release.getEndTime());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm aaa", locale);
            if (DateFormat.is24HourFormat(this.context)) {
                simpleDateFormat = new SimpleDateFormat("HH:mm", locale);
            }
            String m = ParcelCompat$$ExternalSyntheticOutline0.m(simpleDateFormat.format(date), " - ", simpleDateFormat.format(date2), " · ", itemModelByPosition$AlexaMobileAndroidStayOrganized_release.getCalendar());
            if (itemModelByPosition$AlexaMobileAndroidStayOrganized_release.getAllDayEvent()) {
                m = a$$ExternalSyntheticOutline0.m$1(this.context.getString(R.string.calendar_all_day), " · ", itemModelByPosition$AlexaMobileAndroidStayOrganized_release.getCalendar());
            }
            remoteViews.setTextViewText(R.id.calendar_item_subtitle, m);
            int color = ResourcesCompat.getColor(this.context.getResources(), R.color.calendar_widget_common_color, null);
            int color2 = ResourcesCompat.getColor(this.context.getResources(), R.color.calendar_widget_grey_out_color, null);
            remoteViews.setTextColor(R.id.calendar_item_text, color);
            remoteViews.setTextColor(R.id.calendar_item_subtitle, color2);
            Date date3 = new Date();
            if (!itemModelByPosition$AlexaMobileAndroidStayOrganized_release.getAllDayEvent() && date2.compareTo(date3) < 0) {
                remoteViews.setTextColor(R.id.calendar_item_text, color2);
                remoteViews.setTextColor(R.id.calendar_item_subtitle, color2);
            }
        } else {
            remoteViews.setTextViewText(R.id.calendar_item_text, "");
            remoteViews.setTextViewText(R.id.calendar_item_subtitle, "");
        }
        Intent intent2 = new Intent();
        intent2.putExtra("position", position).putExtra("clickedOn", "text");
        remoteViews.setOnClickFillInIntent(R.id.calendar_text_wrapper, intent2);
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
        CalendarWidgetPresenter.INSTANCE.setUpdateBy("widgetDrop");
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDataSetChanged() {
        CalendarWidgetPresenter.INSTANCE.getCalendarWidgetModel$AlexaMobileAndroidStayOrganized_release(this.context);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDestroy() {
    }
}
