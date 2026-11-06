package com.amazon.alexa.stayorganized.ui.calendar;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.format.DateFormat;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.compose.ui.Actual_androidKt$$ExternalSyntheticLambda0;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.stayorganized.R;
import com.amazon.alexa.stayorganized.data.models.CalendarItemModel;
import com.amazon.alexa.stayorganized.data.models.CalendarTopModel;
import com.amazon.alexa.stayorganized.data.models.CalendarWidgetModel;
import com.amazon.alexa.stayorganized.data.repository.CalendarWidgetRepository;
import com.amazon.alexa.stayorganized.data.repository.MetricsRepository;
import com.amazon.alexa.stayorganized.data.subscriber.CalendarWidgetSubscriber;
import com.amazon.alexa.voice.ui.VoiceActivity;
import com.amazon.deecomms.common.Constants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\b(J&\u0010)\u001a\u00020*2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010+\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0002\b\u0003\u0018\u00010.J\r\u0010/\u001a\u00020,H\u0000¢\u0006\u0002\b0J\u0017\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u00020,H\u0000¢\u0006\u0002\b4J\u0015\u00105\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\b6J\u001c\u00107\u001a\u0004\u0018\u0001082\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u00109\u001a\u00020:H\u0002J\b\u0010;\u001a\u00020,H\u0002J\u0015\u0010<\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\b=J\r\u0010>\u001a\u00020\u0018H\u0000¢\u0006\u0002\b?J\u0016\u0010@\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u00109\u001a\u00020:J\u0015\u0010A\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\bBJ\u0015\u0010C\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\bDJ\u0015\u0010E\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\bFJ\u0015\u0010G\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\bHJ\u0015\u0010I\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\bJJ\u0015\u0010K\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\bLJ\u0015\u0010M\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\bNJ\r\u0010O\u001a\u00020%H\u0000¢\u0006\u0002\bPJ\u0015\u0010Q\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\bRJ\r\u0010S\u001a\u00020%H\u0000¢\u0006\u0002\bTJ\u001a\u0010U\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010V\u001a\u00020*H\u0002J\u0015\u0010W\u001a\u00020%2\u0006\u0010V\u001a\u00020*H\u0000¢\u0006\u0002\bXJ\u001f\u0010Y\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010V\u001a\u00020*H\u0000¢\u0006\u0002\bZJ\u0017\u0010[\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0000¢\u0006\u0002\b\\J\u0015\u0010]\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\b^J\u001f\u0010_\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010`\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0002\baJ\u0015\u0010b\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\bcJ\u001b\u0010d\u001a\u00020%2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020%0fH\u0000¢\u0006\u0002\bgJ(\u0010h\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010V\u001a\u00020*2\f\u0010-\u001a\b\u0012\u0002\b\u0003\u0018\u00010.H\u0002J(\u0010i\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010V\u001a\u00020*2\f\u0010-\u001a\b\u0012\u0002\b\u0003\u0018\u00010.H\u0002J\u001a\u0010j\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010V\u001a\u00020*H\u0002J(\u0010k\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010V\u001a\u00020*2\f\u0010-\u001a\b\u0012\u0002\b\u0003\u0018\u00010.H\u0002J\"\u0010l\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010V\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J(\u0010m\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010V\u001a\u00020*2\f\u0010-\u001a\b\u0012\u0002\b\u0003\u0018\u00010.H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006n"}, d2 = {"Lcom/amazon/alexa/stayorganized/ui/calendar/CalendarWidgetPresenter;", "", "()V", "CALENDAR_ACTION_ARROW_CLICK", "", "CALENDAR_ACTION_EMPTY_CLICK", "CALENDAR_ACTION_HEADER_CLICK", "CALENDAR_ACTION_PLUS_CLICK", "lastUpdateTime", "", "getLastUpdateTime", "()Ljava/lang/Long;", "setLastUpdateTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "mainHandler", "Landroid/os/Handler;", "model", "Lcom/amazon/alexa/stayorganized/data/models/CalendarWidgetModel;", "getModel$AlexaMobileAndroidStayOrganized_release", "()Lcom/amazon/alexa/stayorganized/data/models/CalendarWidgetModel;", "setModel$AlexaMobileAndroidStayOrganized_release", "(Lcom/amazon/alexa/stayorganized/data/models/CalendarWidgetModel;)V", "shouldRenderErrorState", "", "subscriber", "Lcom/amazon/alexa/stayorganized/data/subscriber/CalendarWidgetSubscriber;", "getSubscriber", "()Lcom/amazon/alexa/stayorganized/data/subscriber/CalendarWidgetSubscriber;", "setSubscriber", "(Lcom/amazon/alexa/stayorganized/data/subscriber/CalendarWidgetSubscriber;)V", "updateBy", "getUpdateBy", "()Ljava/lang/String;", "setUpdateBy", "(Ljava/lang/String;)V", "getCalendarWidgetModel", "", "context", "Landroid/content/Context;", "getCalendarWidgetModel$AlexaMobileAndroidStayOrganized_release", "getCalendarWidgetRemoteView", "Landroid/widget/RemoteViews;", "appWidgetId", "", "widgetClass", "Ljava/lang/Class;", "getItemCount", "getItemCount$AlexaMobileAndroidStayOrganized_release", "getItemModelByPosition", "Lcom/amazon/alexa/stayorganized/data/models/CalendarItemModel;", "position", "getItemModelByPosition$AlexaMobileAndroidStayOrganized_release", "getLocalModel", "getLocalModel$AlexaMobileAndroidStayOrganized_release", "getPendingIntent", "Landroid/app/PendingIntent;", "intent", "Landroid/content/Intent;", "getPendingIntentFlag", "initSubscriberIfNeed", "initSubscriberIfNeed$AlexaMobileAndroidStayOrganized_release", "isRenderingErrorState", "isRenderingErrorState$AlexaMobileAndroidStayOrganized_release", "onAction", "onArrowClicked", "onArrowClicked$AlexaMobileAndroidStayOrganized_release", "onCalendarPageEvent", "onCalendarPageEvent$AlexaMobileAndroidStayOrganized_release", "onEmptyViewClicked", "onEmptyViewClicked$AlexaMobileAndroidStayOrganized_release", "onHeaderClicked", "onHeaderClicked$AlexaMobileAndroidStayOrganized_release", "onLogout", "onLogout$AlexaMobileAndroidStayOrganized_release", "onPlusClicked", "onPlusClicked$AlexaMobileAndroidStayOrganized_release", "onTextClicked", "onTextClicked$AlexaMobileAndroidStayOrganized_release", "onWidgetDisabled", "onWidgetDisabled$AlexaMobileAndroidStayOrganized_release", "onWidgetEnabled", "onWidgetEnabled$AlexaMobileAndroidStayOrganized_release", "onWidgetResized", "onWidgetResized$AlexaMobileAndroidStayOrganized_release", "renderErrorView", "views", "renderItemCount", "renderItemCount$AlexaMobileAndroidStayOrganized_release", "renderLastUpdateTime", "renderLastUpdateTime$AlexaMobileAndroidStayOrganized_release", "rerenderListView", "rerenderListView$AlexaMobileAndroidStayOrganized_release", "rerenderWidgetContainer", "rerenderWidgetContainer$AlexaMobileAndroidStayOrganized_release", "routeToAddItemPage", "id", "routeToAddItemPage$AlexaMobileAndroidStayOrganized_release", "routeToListPage", "routeToListPage$AlexaMobileAndroidStayOrganized_release", "safeRerender", "block", "Lkotlin/Function0;", "safeRerender$AlexaMobileAndroidStayOrganized_release", "setArrowPendingIntent", "setEmptyView", "setHeaderPendingIntent", "setListViewActionTemplate", "setListViewAdapter", "setPlusPendingIntent", "AlexaMobileAndroidStayOrganized_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCalendarWidgetPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarWidgetPresenter.kt\ncom/amazon/alexa/stayorganized/ui/calendar/CalendarWidgetPresenter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,344:1\n13430#2,2:345\n*S KotlinDebug\n*F\n+ 1 CalendarWidgetPresenter.kt\ncom/amazon/alexa/stayorganized/ui/calendar/CalendarWidgetPresenter\n*L\n228#1:345,2\n*E\n"})
/* loaded from: classes19.dex */
public final class CalendarWidgetPresenter {

    @NotNull
    public static final String CALENDAR_ACTION_ARROW_CLICK = "com.amazon.alexa.stayorganized.ui.calendar.CALENDAR_ACTION_ARROW_CLICK";

    @NotNull
    public static final String CALENDAR_ACTION_EMPTY_CLICK = "com.amazon.alexa.stayorganized.ui.calendar.CALENDAR_ACTION_EMPTY_CLICK";

    @NotNull
    public static final String CALENDAR_ACTION_HEADER_CLICK = "com.amazon.alexa.stayorganized.ui.calendar.CALENDAR_ACTION_HEADER_CLICK";

    @NotNull
    public static final String CALENDAR_ACTION_PLUS_CLICK = "com.amazon.alexa.stayorganized.ui.calendar.CALENDAR_ACTION_PLUS_CLICK";

    @Nullable
    private static Long lastUpdateTime;

    @Nullable
    private static CalendarWidgetModel model;
    private static boolean shouldRenderErrorState;

    @Nullable
    private static CalendarWidgetSubscriber subscriber;

    @NotNull
    public static final CalendarWidgetPresenter INSTANCE = new CalendarWidgetPresenter();

    @NotNull
    private static String updateBy = "";

    @NotNull
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());

    private CalendarWidgetPresenter() {
    }

    private final PendingIntent getPendingIntent(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, 0, intent, getPendingIntentFlag());
    }

    private final int getPendingIntentFlag() {
        return Build.VERSION.SDK_INT > 30 ? 167772160 : 134217728;
    }

    private final void renderErrorView(Context context, RemoteViews views) {
        views.setTextViewText(R.id.calendar_last_updated_text, context != null ? context.getString(R.string.calendar_error) : null);
        views.setViewVisibility(R.id.calendar_last_updated_text, 0);
        views.setViewVisibility(R.id.calendar_item_count, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void safeRerender$lambda$0(Function0 function0) {
        function0.getClass();
        function0.invoke();
    }

    private final void setArrowPendingIntent(Context context, RemoteViews views, Class<?> widgetClass) {
        Intent m = TableInfo$$ExternalSyntheticOutline0.m(context, widgetClass, CALENDAR_ACTION_ARROW_CLICK);
        m.putExtra("position", -1).putExtra("clickedOn", "widget");
        views.setOnClickPendingIntent(R.id.calendar_arrow, getPendingIntent(context, m));
        views.setOnClickPendingIntent(R.id.calendar_last_updated_text, getPendingIntent(context, m));
    }

    private final void setEmptyView(Context context, RemoteViews views, Class<?> widgetClass) {
        Intent m = TableInfo$$ExternalSyntheticOutline0.m(context, widgetClass, CALENDAR_ACTION_EMPTY_CLICK);
        m.putExtra("position", -1).putExtra("clickedOn", "widget");
        views.setOnClickPendingIntent(R.id.calendar_empty_view, getPendingIntent(context, m));
        views.setEmptyView(R.id.calendar_widget_list_view, R.id.calendar_empty_view);
    }

    private final void setHeaderPendingIntent(Context context, RemoteViews views) {
        Intent m = TableInfo$$ExternalSyntheticOutline0.m(context, CalendarWidgetProvider.class, CALENDAR_ACTION_HEADER_CLICK);
        m.putExtra("position", -1).putExtra("clickedOn", "widget");
        views.setTextViewText(R.id.calendar_widget_title, new SimpleDateFormat("EEEE',' MMMM dd", Locale.getDefault()).format(Calendar.getInstance().getTime()) + (context != null ? context.getString(R.string.calendar_header_title_postfix) : null));
        views.setOnClickPendingIntent(R.id.calendar_widget_header, getPendingIntent(context, m));
    }

    private final void setListViewActionTemplate(Context context, RemoteViews views, Class<?> widgetClass) {
        Intent m = TableInfo$$ExternalSyntheticOutline0.m(context, widgetClass, CALENDAR_ACTION_PLUS_CLICK);
        m.setData(Uri.parse(m.toUri(1)));
        views.setPendingIntentTemplate(R.id.calendar_widget_list_view, getPendingIntent(context, m));
    }

    private final void setListViewAdapter(Context context, RemoteViews views, int appWidgetId) {
        Intent intent = new Intent(context, (Class<?>) CalendarWidgetService.class);
        intent.putExtra("appWidgetId", appWidgetId).setData(Uri.parse(intent.toUri(1)));
        views.setRemoteAdapter(R.id.calendar_widget_list_view, intent);
    }

    private final void setPlusPendingIntent(Context context, RemoteViews views, Class<?> widgetClass) {
        Intent m = TableInfo$$ExternalSyntheticOutline0.m(context, widgetClass, CALENDAR_ACTION_PLUS_CLICK);
        m.putExtra("position", -1).putExtra("clickedOn", "widget");
        views.setOnClickPendingIntent(R.id.calendar_plus_button, getPendingIntent(context, m));
    }

    public final void getCalendarWidgetModel$AlexaMobileAndroidStayOrganized_release(@NotNull final Context context) {
        context.getClass();
        if (Intrinsics.areEqual(updateBy, "appOpen") || Intrinsics.areEqual(updateBy, "widgetDrop") || Intrinsics.areEqual(updateBy, "arrow") || Intrinsics.areEqual(updateBy, "calendarPage")) {
            try {
                final CalendarWidgetModel calendarWidgetModel = CalendarWidgetRepository.INSTANCE.getCalendarWidgetModel(context);
                updateBy = "dataRefreshed";
                safeRerender$AlexaMobileAndroidStayOrganized_release(new Function0<Unit>() { // from class: com.amazon.alexa.stayorganized.ui.calendar.CalendarWidgetPresenter$getCalendarWidgetModel$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        CalendarWidgetPresenter calendarWidgetPresenter = CalendarWidgetPresenter.INSTANCE;
                        calendarWidgetPresenter.setModel$AlexaMobileAndroidStayOrganized_release(CalendarWidgetModel.this);
                        CalendarWidgetPresenter.shouldRenderErrorState = false;
                        calendarWidgetPresenter.setLastUpdateTime(Long.valueOf(System.currentTimeMillis()));
                        calendarWidgetPresenter.rerenderWidgetContainer$AlexaMobileAndroidStayOrganized_release(context);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                });
            } catch (Exception e) {
                Log.e("CalendarWidget", "Failed to get calendar model", e);
                updateBy = "dataRefreshed";
                safeRerender$AlexaMobileAndroidStayOrganized_release(new Function0<Unit>() { // from class: com.amazon.alexa.stayorganized.ui.calendar.CalendarWidgetPresenter$getCalendarWidgetModel$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        CalendarWidgetPresenter calendarWidgetPresenter = CalendarWidgetPresenter.INSTANCE;
                        calendarWidgetPresenter.setModel$AlexaMobileAndroidStayOrganized_release(null);
                        CalendarWidgetPresenter.shouldRenderErrorState = true;
                        calendarWidgetPresenter.setLastUpdateTime(null);
                        calendarWidgetPresenter.rerenderWidgetContainer$AlexaMobileAndroidStayOrganized_release(context);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                });
            }
        }
    }

    @NotNull
    public final RemoteViews getCalendarWidgetRemoteView(@Nullable Context context, int appWidgetId, @Nullable Class<?> widgetClass) {
        RemoteViews remoteViews = new RemoteViews(context != null ? context.getPackageName() : null, R.layout.calendar_widget);
        setHeaderPendingIntent(context, remoteViews);
        setListViewAdapter(context, remoteViews, appWidgetId);
        setListViewActionTemplate(context, remoteViews, widgetClass);
        setEmptyView(context, remoteViews, widgetClass);
        setArrowPendingIntent(context, remoteViews, widgetClass);
        setPlusPendingIntent(context, remoteViews, widgetClass);
        if (isRenderingErrorState$AlexaMobileAndroidStayOrganized_release()) {
            renderErrorView(context, remoteViews);
            return remoteViews;
        }
        renderLastUpdateTime$AlexaMobileAndroidStayOrganized_release(context, remoteViews);
        renderItemCount$AlexaMobileAndroidStayOrganized_release(remoteViews);
        return remoteViews;
    }

    public final int getItemCount$AlexaMobileAndroidStayOrganized_release() {
        List<CalendarItemModel> items;
        CalendarWidgetModel calendarWidgetModel = model;
        if (calendarWidgetModel == null || (items = calendarWidgetModel.getItems()) == null) {
            return 0;
        }
        return items.size();
    }

    @Nullable
    public final CalendarItemModel getItemModelByPosition$AlexaMobileAndroidStayOrganized_release(int position) {
        List<CalendarItemModel> items;
        CalendarWidgetModel calendarWidgetModel = model;
        if (calendarWidgetModel == null || (items = calendarWidgetModel.getItems()) == null) {
            return null;
        }
        return (CalendarItemModel) CollectionsKt.getOrNull(items, position);
    }

    @Nullable
    public final Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public final void getLocalModel$AlexaMobileAndroidStayOrganized_release(@NotNull Context context) {
        context.getClass();
        if (model == null) {
            try {
                model = CalendarWidgetRepository.INSTANCE.getLocalCalendarWidgetModel(context);
                shouldRenderErrorState = false;
            } catch (Exception unused) {
                model = null;
                shouldRenderErrorState = true;
            }
        }
    }

    @Nullable
    public final CalendarWidgetModel getModel$AlexaMobileAndroidStayOrganized_release() {
        return model;
    }

    @Nullable
    public final CalendarWidgetSubscriber getSubscriber() {
        return subscriber;
    }

    @NotNull
    public final String getUpdateBy() {
        return updateBy;
    }

    public final void initSubscriberIfNeed$AlexaMobileAndroidStayOrganized_release(@NotNull Context context) {
        Object obj;
        context.getClass();
        if (subscriber == null) {
            subscriber = new CalendarWidgetSubscriber(context);
            obj = ComponentRegistry.getInstance().getLazy(EventBus.class).get();
            CalendarWidgetSubscriber calendarWidgetSubscriber = subscriber;
            calendarWidgetSubscriber.getClass();
            ((EventBus) obj).subscribe(calendarWidgetSubscriber);
        }
    }

    public final boolean isRenderingErrorState$AlexaMobileAndroidStayOrganized_release() {
        return model == null && shouldRenderErrorState;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final void onAction(@NotNull Context context, @NotNull Intent intent) {
        context.getClass();
        intent.getClass();
        String stringExtra = intent.getStringExtra("clickedOn");
        if (stringExtra != null) {
            if (Intrinsics.areEqual(stringExtra, "text")) {
                getLocalModel$AlexaMobileAndroidStayOrganized_release(context);
                onTextClicked$AlexaMobileAndroidStayOrganized_release(context);
            }
            if (Intrinsics.areEqual(stringExtra, "widget")) {
                getLocalModel$AlexaMobileAndroidStayOrganized_release(context);
                String action = intent.getAction();
                if (action != null) {
                    switch (action.hashCode()) {
                        case -1773495409:
                            if (action.equals(CALENDAR_ACTION_PLUS_CLICK)) {
                                onPlusClicked$AlexaMobileAndroidStayOrganized_release(context);
                                break;
                            }
                            break;
                        case -985721022:
                            if (action.equals(CALENDAR_ACTION_HEADER_CLICK)) {
                                onHeaderClicked$AlexaMobileAndroidStayOrganized_release(context);
                                break;
                            }
                            break;
                        case 904824906:
                            if (action.equals(CALENDAR_ACTION_EMPTY_CLICK)) {
                                onEmptyViewClicked$AlexaMobileAndroidStayOrganized_release(context);
                                break;
                            }
                            break;
                        case 1596029446:
                            if (action.equals(CALENDAR_ACTION_ARROW_CLICK)) {
                                onArrowClicked$AlexaMobileAndroidStayOrganized_release(context);
                                break;
                            }
                            break;
                    }
                }
            }
        }
    }

    public final void onArrowClicked$AlexaMobileAndroidStayOrganized_release(@NotNull Context context) {
        context.getClass();
        MetricsRepository.INSTANCE.recordInteractionEvent(MetricsRepository.CALENDAR_EVENT_REFRESH_CLICK, MetricsRepository.SUB_COMPONENT_CALENDAR);
        updateBy = "arrow";
        rerenderListView$AlexaMobileAndroidStayOrganized_release(context);
    }

    public final void onCalendarPageEvent$AlexaMobileAndroidStayOrganized_release(@NotNull Context context) {
        context.getClass();
        updateBy = "calendarPage";
        rerenderListView$AlexaMobileAndroidStayOrganized_release(context);
    }

    public final void onEmptyViewClicked$AlexaMobileAndroidStayOrganized_release(@NotNull Context context) {
        context.getClass();
        MetricsRepository.INSTANCE.recordInteractionEvent(MetricsRepository.CALENDAR_EVENT_EMPTY_CLICK, MetricsRepository.SUB_COMPONENT_CALENDAR);
        routeToListPage$AlexaMobileAndroidStayOrganized_release(context);
    }

    public final void onHeaderClicked$AlexaMobileAndroidStayOrganized_release(@NotNull Context context) {
        context.getClass();
        MetricsRepository.INSTANCE.recordInteractionEvent(MetricsRepository.CALENDAR_EVENT_HEADER_CLICK, MetricsRepository.SUB_COMPONENT_CALENDAR);
        routeToListPage$AlexaMobileAndroidStayOrganized_release(context);
    }

    public final void onLogout$AlexaMobileAndroidStayOrganized_release(@NotNull Context context) {
        context.getClass();
        CalendarWidgetRepository.INSTANCE.clearCache(context);
        updateBy = "logout";
        model = null;
        shouldRenderErrorState = true;
        lastUpdateTime = null;
        rerenderListView$AlexaMobileAndroidStayOrganized_release(context);
    }

    public final void onPlusClicked$AlexaMobileAndroidStayOrganized_release(@NotNull Context context) {
        context.getClass();
        MetricsRepository.INSTANCE.recordInteractionEvent(MetricsRepository.CALENDAR_EVENT_ADD_CLICK, MetricsRepository.SUB_COMPONENT_CALENDAR);
        routeToAddItemPage$AlexaMobileAndroidStayOrganized_release(context, null);
    }

    public final void onTextClicked$AlexaMobileAndroidStayOrganized_release(@NotNull Context context) {
        context.getClass();
        MetricsRepository.INSTANCE.recordInteractionEvent(MetricsRepository.CALENDAR_EVENT_ITEM_CLICK, MetricsRepository.SUB_COMPONENT_CALENDAR);
        routeToListPage$AlexaMobileAndroidStayOrganized_release(context);
    }

    public final void onWidgetDisabled$AlexaMobileAndroidStayOrganized_release() {
        Object obj;
        MetricsRepository.INSTANCE.recordInteractionEvent(MetricsRepository.CALENDAR_EVENT_WIDGET_REMOVE, MetricsRepository.SUB_COMPONENT_CALENDAR);
        if (subscriber != null) {
            obj = ComponentRegistry.getInstance().getLazy(EventBus.class).get();
            CalendarWidgetSubscriber calendarWidgetSubscriber = subscriber;
            calendarWidgetSubscriber.getClass();
            ((EventBus) obj).unsubscribe(calendarWidgetSubscriber);
            subscriber = null;
        }
    }

    public final void onWidgetEnabled$AlexaMobileAndroidStayOrganized_release(@NotNull Context context) {
        context.getClass();
        MetricsRepository.INSTANCE.recordInteractionEvent(MetricsRepository.CALENDAR_EVENT_WIDGET_ADD, MetricsRepository.SUB_COMPONENT_CALENDAR);
        initSubscriberIfNeed$AlexaMobileAndroidStayOrganized_release(context);
    }

    public final void onWidgetResized$AlexaMobileAndroidStayOrganized_release() {
        MetricsRepository.INSTANCE.recordInteractionEvent(MetricsRepository.CALENDAR_EVENT_WIDGET_RESIZE, MetricsRepository.SUB_COMPONENT_CALENDAR);
    }

    public final void renderItemCount$AlexaMobileAndroidStayOrganized_release(@NotNull RemoteViews views) {
        CalendarTopModel calendarTopModel;
        views.getClass();
        CalendarWidgetModel calendarWidgetModel = model;
        int activeItemCount = (calendarWidgetModel == null || (calendarTopModel = calendarWidgetModel.getCalendarTopModel()) == null) ? 0 : calendarTopModel.getActiveItemCount();
        views.setTextViewText(R.id.calendar_item_count, MarkdownConstants.LEFT_PARENTHESIS + activeItemCount + MarkdownConstants.RIGHT_PARENTHESIS);
        views.setViewVisibility(R.id.calendar_item_count, 0);
    }

    public final void renderLastUpdateTime$AlexaMobileAndroidStayOrganized_release(@Nullable Context context, @NotNull RemoteViews views) {
        views.getClass();
        if (lastUpdateTime == null) {
            views.setViewVisibility(R.id.calendar_last_updated_text, 8);
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE, MMMM d, h:mm aaa", Locale.getDefault());
        if (DateFormat.is24HourFormat(context)) {
            simpleDateFormat = new SimpleDateFormat("EEEE, MMMM d, HH:mm", Locale.getDefault());
        }
        Long l = lastUpdateTime;
        l.getClass();
        String format = simpleDateFormat.format(new Date(l.longValue()));
        format.getClass();
        views.setTextViewText(R.id.calendar_last_updated_text, context != null ? context.getString(R.string.calendar_as_of, format) : null);
        views.setViewVisibility(R.id.calendar_last_updated_text, 0);
    }

    public final void rerenderListView$AlexaMobileAndroidStayOrganized_release(@Nullable Context context) {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        context.getClass();
        appWidgetManager.notifyAppWidgetViewDataChanged(appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) CalendarWidgetProvider.class)), R.id.calendar_widget_list_view);
    }

    public final void rerenderWidgetContainer$AlexaMobileAndroidStayOrganized_release(@NotNull Context context) {
        context.getClass();
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) CalendarWidgetProvider.class));
        if (appWidgetIds != null) {
            for (int i : appWidgetIds) {
                appWidgetManager.updateAppWidget(i, INSTANCE.getCalendarWidgetRemoteView(context, i, CalendarWidgetProvider.class));
            }
        }
    }

    public final void routeToAddItemPage$AlexaMobileAndroidStayOrganized_release(@NotNull Context context, @Nullable String id) {
        String str;
        String deepLinkBaseUri;
        context.getClass();
        CalendarWidgetModel calendarWidgetModel = model;
        CalendarTopModel calendarTopModel = calendarWidgetModel != null ? calendarWidgetModel.getCalendarTopModel() : null;
        if (calendarTopModel == null || (str = calendarTopModel.getAddCalendarRoute()) == null) {
            str = "v2/elements-calendars";
        }
        String concat = (calendarTopModel == null || (deepLinkBaseUri = calendarTopModel.getDeepLinkBaseUri()) == null) ? "https://alexa.amazon.com/spa/index.html#v2/elements-calendars" : deepLinkBaseUri.concat(str);
        if (id != null) {
            concat = a$$ExternalSyntheticOutline0.m$1(concat, "?eventId=", id);
        }
        Intent putExtra = new Intent(VoiceActivity.ACTION_LAUNCH_FROM_QUICK_ACTIONS_WIDGET).setData(Uri.parse(concat)).setClassName(context.getPackageName(), "com.amazon.dee.app.ui.main.MainActivity").addFlags(131072).addFlags(268435456).putExtra(Constants.BUNDLE_KEY_REACT_NATIVE_ROUTE_NAME, str);
        putExtra.getClass();
        context.startActivity(putExtra);
    }

    public final void routeToListPage$AlexaMobileAndroidStayOrganized_release(@NotNull Context context) {
        String str;
        String deepLinkBaseUri;
        context.getClass();
        CalendarWidgetModel calendarWidgetModel = model;
        CalendarTopModel calendarTopModel = calendarWidgetModel != null ? calendarWidgetModel.getCalendarTopModel() : null;
        if (calendarTopModel == null || (str = calendarTopModel.getCalendarListRoute()) == null) {
            str = "v2/elements-calendars";
        }
        Intent putExtra = new Intent(VoiceActivity.ACTION_LAUNCH_FROM_QUICK_ACTIONS_WIDGET).setData(Uri.parse((calendarTopModel == null || (deepLinkBaseUri = calendarTopModel.getDeepLinkBaseUri()) == null) ? "https://alexa.amazon.com/spa/index.html#v2/elements-calendars" : deepLinkBaseUri.concat(str))).setClassName(context.getPackageName(), "com.amazon.dee.app.ui.main.MainActivity").addFlags(131072).addFlags(268435456).putExtra(Constants.BUNDLE_KEY_REACT_NATIVE_ROUTE_NAME, str);
        putExtra.getClass();
        context.startActivity(putExtra);
    }

    public final void safeRerender$AlexaMobileAndroidStayOrganized_release(@NotNull Function0<Unit> block) {
        block.getClass();
        if (Build.VERSION.SDK_INT > 34) {
            mainHandler.post(new Actual_androidKt$$ExternalSyntheticLambda0(block, 8));
        } else {
            block.invoke();
        }
    }

    public final void setLastUpdateTime(@Nullable Long l) {
        lastUpdateTime = l;
    }

    public final void setModel$AlexaMobileAndroidStayOrganized_release(@Nullable CalendarWidgetModel calendarWidgetModel) {
        model = calendarWidgetModel;
    }

    public final void setSubscriber(@Nullable CalendarWidgetSubscriber calendarWidgetSubscriber) {
        subscriber = calendarWidgetSubscriber;
    }

    public final void setUpdateBy(@NotNull String str) {
        str.getClass();
        updateBy = str;
    }
}
