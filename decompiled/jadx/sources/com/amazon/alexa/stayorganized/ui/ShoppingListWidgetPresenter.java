package com.amazon.alexa.stayorganized.ui;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.compose.ui.Actual_androidKt$$ExternalSyntheticLambda0;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.stayorganized.R;
import com.amazon.alexa.stayorganized.data.models.ShoppingListItemModel;
import com.amazon.alexa.stayorganized.data.models.ShoppingListTopModel;
import com.amazon.alexa.stayorganized.data.models.ShoppingListWidgetModel;
import com.amazon.alexa.stayorganized.data.repository.MetricsRepository;
import com.amazon.alexa.stayorganized.data.repository.ShoppingListRepository;
import com.amazon.alexa.stayorganized.data.subscriber.ShoppingListWidgetSubscriber;
import com.amazon.alexa.voice.ui.VoiceActivity;
import com.amazon.alexa.widget.QuickActionsWidget;
import com.amazon.deecomms.common.Constants;
import java.text.SimpleDateFormat;
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
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\f\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010)H\u0002J\r\u0010*\u001a\u00020+H\u0000¢\u0006\u0002\b,J\u0017\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u00020+H\u0000¢\u0006\u0002\b0J\u0015\u00101\u001a\u0002022\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\b3J\u0006\u00104\u001a\u00020+J\u0017\u00105\u001a\u0004\u0018\u00010\u00122\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\b6J6\u00107\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020+2\f\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010)J\u000e\u0010;\u001a\u0002022\u0006\u0010&\u001a\u00020'J\u000e\u0010<\u001a\u0002022\u0006\u0010&\u001a\u00020'J\r\u0010=\u001a\u00020\u0018H\u0000¢\u0006\u0002\b>J\u0016\u0010?\u001a\u0002022\u0006\u0010&\u001a\u00020'2\u0006\u0010@\u001a\u00020AJ\u0015\u0010B\u001a\u0002022\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\bCJ\u001d\u0010D\u001a\u0002022\u0006\u0010&\u001a\u00020'2\u0006\u0010/\u001a\u00020+H\u0000¢\u0006\u0002\bEJ\u0015\u0010F\u001a\u0002022\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\bGJ\u0015\u0010H\u001a\u0002022\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\bIJ\u000e\u0010J\u001a\u0002022\u0006\u0010&\u001a\u00020'J\u0015\u0010K\u001a\u0002022\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\bLJ\u000e\u0010M\u001a\u0002022\u0006\u0010&\u001a\u00020'J\u0015\u0010N\u001a\u0002022\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\bOJ\r\u0010P\u001a\u000202H\u0000¢\u0006\u0002\bQJ\u0015\u0010R\u001a\u0002022\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\bSJ\r\u0010T\u001a\u000202H\u0000¢\u0006\u0002\bUJ\u001a\u0010V\u001a\u0002022\u0006\u0010W\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J\u0015\u0010X\u001a\u0002022\u0006\u0010W\u001a\u00020%H\u0000¢\u0006\u0002\bYJ\u001f\u0010Z\u001a\u0002022\u0006\u0010W\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0000¢\u0006\u0002\b[J\u0015\u0010\\\u001a\u0002022\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\b]J\u0015\u0010^\u001a\u0002022\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\b_J\u0015\u0010`\u001a\u0002022\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\baJ\u0015\u0010b\u001a\u0002022\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\bcJ\u001b\u0010d\u001a\u0002022\f\u0010e\u001a\b\u0012\u0004\u0012\u0002020fH\u0000¢\u0006\u0002\bgJ0\u0010h\u001a\u0002022\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u00109\u001a\u00020\u00042\u0006\u0010W\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010)H\u0002J\"\u0010i\u001a\u0002022\u0006\u0010W\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010j\u001a\u00020AH\u0002J\u001a\u0010k\u001a\u0002022\u0006\u0010W\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J0\u0010l\u001a\u0002022\b\u0010&\u001a\u0004\u0018\u00010'2\f\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010)2\u0006\u00108\u001a\u00020\u00042\u0006\u0010W\u001a\u00020%H\u0002J\"\u0010m\u001a\u0002022\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010:\u001a\u00020+2\u0006\u0010W\u001a\u00020%H\u0002J0\u0010n\u001a\u00020A2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u00108\u001a\u00020\u00042\u0006\u0010W\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010)H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006o"}, d2 = {"Lcom/amazon/alexa/stayorganized/ui/ShoppingListWidgetPresenter;", "", "()V", "ACTION_ARROW_CLICK_LARGE", "", "ACTION_EMPTY_CLICK_LARGE", "ACTION_HEADER_CLICK_LARGE", "ACTION_PLUS_CLICK_LARGE", "lastUpdateTime", "", "getLastUpdateTime", "()Ljava/lang/Long;", "setLastUpdateTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "mainHandler", "Landroid/os/Handler;", "model", "Lcom/amazon/alexa/stayorganized/data/models/ShoppingListWidgetModel;", "getModel$AlexaMobileAndroidStayOrganized_release", "()Lcom/amazon/alexa/stayorganized/data/models/ShoppingListWidgetModel;", "setModel$AlexaMobileAndroidStayOrganized_release", "(Lcom/amazon/alexa/stayorganized/data/models/ShoppingListWidgetModel;)V", "shouldRenderErrorState", "", "subscriber", "Lcom/amazon/alexa/stayorganized/data/subscriber/ShoppingListWidgetSubscriber;", "getSubscriber", "()Lcom/amazon/alexa/stayorganized/data/subscriber/ShoppingListWidgetSubscriber;", "setSubscriber", "(Lcom/amazon/alexa/stayorganized/data/subscriber/ShoppingListWidgetSubscriber;)V", "updateBy", "getUpdateBy", "()Ljava/lang/String;", "setUpdateBy", "(Ljava/lang/String;)V", "buildContainerRemoteView", "Landroid/widget/RemoteViews;", "context", "Landroid/content/Context;", "widgetClass", "Ljava/lang/Class;", "getItemCount", "", "getItemCount$AlexaMobileAndroidStayOrganized_release", "getItemModelByPosition", "Lcom/amazon/alexa/stayorganized/data/models/ShoppingListItemModel;", "position", "getItemModelByPosition$AlexaMobileAndroidStayOrganized_release", "getLocalModel", "", "getLocalModel$AlexaMobileAndroidStayOrganized_release", "getPendingIntentFlag", "getShoppingListModel", "getShoppingListModel$AlexaMobileAndroidStayOrganized_release", "getShoppingListWidgetRemoteView", "plusAction", "arrowAction", "appWidgetId", "initEventBusSubscriber", "initEventBusSubscriberIfWidgets", "isRenderingErrorState", "isRenderingErrorState$AlexaMobileAndroidStayOrganized_release", "onAction", "intent", "Landroid/content/Intent;", "onArrowClicked", "onArrowClicked$AlexaMobileAndroidStayOrganized_release", "onCheckboxClicked", "onCheckboxClicked$AlexaMobileAndroidStayOrganized_release", "onEmptyStateClicked", "onEmptyStateClicked$AlexaMobileAndroidStayOrganized_release", "onHeaderClicked", "onHeaderClicked$AlexaMobileAndroidStayOrganized_release", "onLogout", "onPlusClicked", "onPlusClicked$AlexaMobileAndroidStayOrganized_release", "onShoppingListPageEvent", "onTextClicked", "onTextClicked$AlexaMobileAndroidStayOrganized_release", "onWidgetDisabled", "onWidgetDisabled$AlexaMobileAndroidStayOrganized_release", "onWidgetEnabled", "onWidgetEnabled$AlexaMobileAndroidStayOrganized_release", "onWidgetResized", "onWidgetResized$AlexaMobileAndroidStayOrganized_release", "renderErrorView", "views", "renderItemCount", "renderItemCount$AlexaMobileAndroidStayOrganized_release", "renderLastUpdateTime", "renderLastUpdateTime$AlexaMobileAndroidStayOrganized_release", "rerenderListView", "rerenderListView$AlexaMobileAndroidStayOrganized_release", "rerenderWidgetContainer", "rerenderWidgetContainer$AlexaMobileAndroidStayOrganized_release", "routeToAddItem", "routeToAddItem$AlexaMobileAndroidStayOrganized_release", "routeToShoppingListPage", "routeToShoppingListPage$AlexaMobileAndroidStayOrganized_release", "safeRerender", "block", "Lkotlin/Function0;", "safeRerender$AlexaMobileAndroidStayOrganized_release", "setArrowPendingIntent", "setEmptyView", "plusIntent", "setHeaderPendingIntent", "setListViewActionTemplate", "setListViewAdapter", "setPlusPendingIntent", "AlexaMobileAndroidStayOrganized_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShoppingListWidgetPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShoppingListWidgetPresenter.kt\ncom/amazon/alexa/stayorganized/ui/ShoppingListWidgetPresenter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,428:1\n13430#2,2:429\n*S KotlinDebug\n*F\n+ 1 ShoppingListWidgetPresenter.kt\ncom/amazon/alexa/stayorganized/ui/ShoppingListWidgetPresenter\n*L\n346#1:429,2\n*E\n"})
/* loaded from: classes19.dex */
public final class ShoppingListWidgetPresenter {

    @NotNull
    public static final String ACTION_ARROW_CLICK_LARGE = "com.amazon.alexa.stayorganized.ui.ACTION_ARROW_CLICK_LARGE";

    @NotNull
    public static final String ACTION_EMPTY_CLICK_LARGE = "com.amazon.alexa.stayorganized.ui.ACTION_EMPTY_CLICK_LARGE";

    @NotNull
    public static final String ACTION_HEADER_CLICK_LARGE = "com.amazon.alexa.stayorganized.ui.ACTION_HEADER_CLICK_LARGE";

    @NotNull
    public static final String ACTION_PLUS_CLICK_LARGE = "com.amazon.alexa.stayorganized.ui.ACTION_PLUS_CLICK_LARGE";

    @Nullable
    private static Long lastUpdateTime;

    @Nullable
    private static ShoppingListWidgetModel model;
    private static boolean shouldRenderErrorState;

    @Nullable
    private static ShoppingListWidgetSubscriber subscriber;

    @NotNull
    public static final ShoppingListWidgetPresenter INSTANCE = new ShoppingListWidgetPresenter();

    @NotNull
    private static String updateBy = "";

    @NotNull
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());

    private ShoppingListWidgetPresenter() {
    }

    private final RemoteViews buildContainerRemoteView(Context context, Class<?> widgetClass) {
        return new RemoteViews(context != null ? context.getPackageName() : null, R.layout.shopping_list_widget_large);
    }

    private final void renderErrorView(RemoteViews views, Context context) {
        views.setTextViewText(R.id.last_updated_text, context != null ? context.getString(R.string.shopping_list_error) : null);
        views.setViewVisibility(R.id.last_updated_text, 0);
        views.setViewVisibility(R.id.item_count, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void safeRerender$lambda$0(Function0 function0) {
        function0.getClass();
        function0.invoke();
    }

    private final void setArrowPendingIntent(Context context, String arrowAction, RemoteViews views, Class<?> widgetClass) {
        Intent intent = new Intent(context, widgetClass);
        intent.setAction(arrowAction);
        intent.putExtra("position", -1);
        intent.putExtra("clickedOn", "widget");
        views.setOnClickPendingIntent(R.id.arrow, PendingIntent.getBroadcast(context, 0, intent, getPendingIntentFlag()));
    }

    private final void setEmptyView(RemoteViews views, Context context, Intent plusIntent) {
        Intent intent = new Intent(context, (Class<?>) ShoppingListWidgetLarge.class);
        intent.setAction(ACTION_EMPTY_CLICK_LARGE);
        intent.putExtra("position", -1);
        intent.putExtra("clickedOn", "widget");
        views.setOnClickPendingIntent(R.id.empty_view, PendingIntent.getBroadcast(context, 0, intent, getPendingIntentFlag()));
        views.setEmptyView(R.id.shopping_list_list_view, R.id.empty_view);
    }

    private final void setHeaderPendingIntent(RemoteViews views, Context context) {
        Intent intent = new Intent(context, (Class<?>) ShoppingListWidgetLarge.class);
        intent.setAction(ACTION_HEADER_CLICK_LARGE);
        intent.putExtra("position", -1);
        intent.putExtra("clickedOn", "widget");
        views.setOnClickPendingIntent(R.id.widget_header, PendingIntent.getBroadcast(context, 0, intent, getPendingIntentFlag()));
    }

    private final void setListViewActionTemplate(Context context, Class<?> widgetClass, String plusAction, RemoteViews views) {
        Intent m = TableInfo$$ExternalSyntheticOutline0.m(context, widgetClass, plusAction);
        m.setData(Uri.parse(m.toUri(1)));
        views.setPendingIntentTemplate(R.id.shopping_list_list_view, PendingIntent.getBroadcast(context, 0, m, getPendingIntentFlag()));
    }

    private final void setListViewAdapter(Context context, int appWidgetId, RemoteViews views) {
        Intent intent = new Intent(context, (Class<?>) ShoppingListWidgetService.class);
        intent.putExtra("appWidgetId", appWidgetId);
        intent.setData(Uri.parse(intent.toUri(1)));
        views.setRemoteAdapter(R.id.shopping_list_list_view, intent);
    }

    private final Intent setPlusPendingIntent(Context context, String plusAction, RemoteViews views, Class<?> widgetClass) {
        Intent intent = new Intent(context, widgetClass);
        intent.setAction(plusAction);
        intent.putExtra("position", -1);
        intent.putExtra("clickedOn", "widget");
        views.setOnClickPendingIntent(R.id.plus_button, PendingIntent.getBroadcast(context, 0, intent, getPendingIntentFlag()));
        return intent;
    }

    public final int getItemCount$AlexaMobileAndroidStayOrganized_release() {
        List<ShoppingListItemModel> items;
        ShoppingListWidgetModel shoppingListWidgetModel = model;
        if (shoppingListWidgetModel == null || (items = shoppingListWidgetModel.getItems()) == null) {
            return 0;
        }
        return items.size();
    }

    @Nullable
    public final ShoppingListItemModel getItemModelByPosition$AlexaMobileAndroidStayOrganized_release(int position) {
        List<ShoppingListItemModel> items;
        ShoppingListWidgetModel shoppingListWidgetModel = model;
        if (shoppingListWidgetModel == null || (items = shoppingListWidgetModel.getItems()) == null) {
            return null;
        }
        return (ShoppingListItemModel) CollectionsKt.getOrNull(items, position);
    }

    @Nullable
    public final Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public final void getLocalModel$AlexaMobileAndroidStayOrganized_release(@NotNull Context context) {
        context.getClass();
        if (model == null) {
            try {
                model = ShoppingListRepository.INSTANCE.getLocalShoppingListModel(context);
                shouldRenderErrorState = false;
            } catch (Exception unused) {
                model = null;
                shouldRenderErrorState = true;
            }
        }
    }

    @Nullable
    public final ShoppingListWidgetModel getModel$AlexaMobileAndroidStayOrganized_release() {
        return model;
    }

    public final int getPendingIntentFlag() {
        return Build.VERSION.SDK_INT > 30 ? 167772160 : 134217728;
    }

    @Nullable
    public final ShoppingListWidgetModel getShoppingListModel$AlexaMobileAndroidStayOrganized_release(@NotNull final Context context) {
        context.getClass();
        if (Intrinsics.areEqual(updateBy, "appOpen") || Intrinsics.areEqual(updateBy, "widgetDrop") || Intrinsics.areEqual(updateBy, "arrow") || Intrinsics.areEqual(updateBy, "shoppingListPage")) {
            try {
                final ShoppingListWidgetModel shoppingListModel = ShoppingListRepository.INSTANCE.getShoppingListModel(context);
                safeRerender$AlexaMobileAndroidStayOrganized_release(new Function0<Unit>() { // from class: com.amazon.alexa.stayorganized.ui.ShoppingListWidgetPresenter$getShoppingListModel$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ShoppingListWidgetPresenter shoppingListWidgetPresenter = ShoppingListWidgetPresenter.INSTANCE;
                        shoppingListWidgetPresenter.setModel$AlexaMobileAndroidStayOrganized_release(ShoppingListWidgetModel.this);
                        ShoppingListWidgetPresenter.shouldRenderErrorState = false;
                        shoppingListWidgetPresenter.setLastUpdateTime(Long.valueOf(System.currentTimeMillis()));
                        shoppingListWidgetPresenter.rerenderWidgetContainer$AlexaMobileAndroidStayOrganized_release(context);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                });
            } catch (Exception e) {
                Log.e("ShoppingListWidget", "Failed to get shopping list model", e);
                safeRerender$AlexaMobileAndroidStayOrganized_release(new Function0<Unit>() { // from class: com.amazon.alexa.stayorganized.ui.ShoppingListWidgetPresenter$getShoppingListModel$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ShoppingListWidgetPresenter shoppingListWidgetPresenter = ShoppingListWidgetPresenter.INSTANCE;
                        shoppingListWidgetPresenter.setModel$AlexaMobileAndroidStayOrganized_release(null);
                        ShoppingListWidgetPresenter.shouldRenderErrorState = true;
                        shoppingListWidgetPresenter.setLastUpdateTime(null);
                        shoppingListWidgetPresenter.rerenderWidgetContainer$AlexaMobileAndroidStayOrganized_release(context);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                });
            }
        } else if (Intrinsics.areEqual(updateBy, "logout")) {
            safeRerender$AlexaMobileAndroidStayOrganized_release(new Function0<Unit>() { // from class: com.amazon.alexa.stayorganized.ui.ShoppingListWidgetPresenter$getShoppingListModel$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ShoppingListWidgetPresenter.INSTANCE.rerenderWidgetContainer$AlexaMobileAndroidStayOrganized_release(context);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            });
        }
        return model;
    }

    @NotNull
    public final RemoteViews getShoppingListWidgetRemoteView(@Nullable Context context, @NotNull String plusAction, @NotNull String arrowAction, int appWidgetId, @Nullable Class<?> widgetClass) {
        plusAction.getClass();
        arrowAction.getClass();
        RemoteViews buildContainerRemoteView = buildContainerRemoteView(context, widgetClass);
        setListViewAdapter(context, appWidgetId, buildContainerRemoteView);
        setListViewActionTemplate(context, widgetClass, plusAction, buildContainerRemoteView);
        setEmptyView(buildContainerRemoteView, context, setPlusPendingIntent(context, plusAction, buildContainerRemoteView, widgetClass));
        setHeaderPendingIntent(buildContainerRemoteView, context);
        setArrowPendingIntent(context, arrowAction, buildContainerRemoteView, widgetClass);
        if (isRenderingErrorState$AlexaMobileAndroidStayOrganized_release()) {
            renderErrorView(buildContainerRemoteView, context);
            return buildContainerRemoteView;
        }
        renderLastUpdateTime$AlexaMobileAndroidStayOrganized_release(buildContainerRemoteView, context);
        renderItemCount$AlexaMobileAndroidStayOrganized_release(buildContainerRemoteView);
        return buildContainerRemoteView;
    }

    @Nullable
    public final ShoppingListWidgetSubscriber getSubscriber() {
        return subscriber;
    }

    @NotNull
    public final String getUpdateBy() {
        return updateBy;
    }

    public final void initEventBusSubscriber(@NotNull Context context) {
        Object obj;
        context.getClass();
        if (subscriber == null) {
            subscriber = new ShoppingListWidgetSubscriber(context);
            obj = ComponentRegistry.getInstance().get(EventBus.class).get();
            ShoppingListWidgetSubscriber shoppingListWidgetSubscriber = subscriber;
            shoppingListWidgetSubscriber.getClass();
            ((EventBus) obj).subscribe(shoppingListWidgetSubscriber);
        }
    }

    public final void initEventBusSubscriberIfWidgets(@NotNull Context context) {
        context.getClass();
        if (AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) ShoppingListWidgetLarge.class)).length > 0) {
            initEventBusSubscriber(context);
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
        int intExtra = intent.getIntExtra("position", -1);
        String stringExtra = intent.getStringExtra("clickedOn");
        if (stringExtra != null) {
            int hashCode = stringExtra.hashCode();
            if (hashCode != -788047292) {
                if (hashCode == 3556653) {
                    if (stringExtra.equals("text")) {
                        getLocalModel$AlexaMobileAndroidStayOrganized_release(context);
                        onTextClicked$AlexaMobileAndroidStayOrganized_release(context);
                        return;
                    }
                    return;
                }
                if (hashCode == 1536891843 && stringExtra.equals("checkbox")) {
                    getLocalModel$AlexaMobileAndroidStayOrganized_release(context);
                    onCheckboxClicked$AlexaMobileAndroidStayOrganized_release(context, intExtra);
                }
                return;
            }
            if (stringExtra.equals("widget")) {
                getLocalModel$AlexaMobileAndroidStayOrganized_release(context);
                String action = intent.getAction();
                if (action != null) {
                    switch (action.hashCode()) {
                        case -380951057:
                            if (action.equals(ACTION_HEADER_CLICK_LARGE)) {
                                onHeaderClicked$AlexaMobileAndroidStayOrganized_release(context);
                                break;
                            }
                            break;
                        case -31679631:
                            if (action.equals("com.amazon.alexa.stayorganized.ui.ACTION_ARROW_CLICK_LARGE")) {
                                onArrowClicked$AlexaMobileAndroidStayOrganized_release(context);
                                break;
                            }
                            break;
                        case 384224444:
                            if (action.equals("com.amazon.alexa.stayorganized.ui.ACTION_PLUS_CLICK_LARGE")) {
                                onPlusClicked$AlexaMobileAndroidStayOrganized_release(context);
                                break;
                            }
                            break;
                        case 1804527285:
                            if (action.equals(ACTION_EMPTY_CLICK_LARGE)) {
                                onEmptyStateClicked$AlexaMobileAndroidStayOrganized_release(context);
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
        updateBy = "arrow";
        rerenderListView$AlexaMobileAndroidStayOrganized_release(context);
        MetricsRepository metricsRepository = MetricsRepository.INSTANCE;
        metricsRepository.recordInteractionEvent(metricsRepository.getEVENT_REFRESH_CLICKED(), metricsRepository.getSUB_COMPONENT());
    }

    public final void onCheckboxClicked$AlexaMobileAndroidStayOrganized_release(@NotNull Context context, int position) {
        context.getClass();
        updateBy = "checkbox";
        ShoppingListItemModel itemModelByPosition$AlexaMobileAndroidStayOrganized_release = getItemModelByPosition$AlexaMobileAndroidStayOrganized_release(position);
        if (itemModelByPosition$AlexaMobileAndroidStayOrganized_release != null) {
            int version = itemModelByPosition$AlexaMobileAndroidStayOrganized_release.getVersion();
            itemModelByPosition$AlexaMobileAndroidStayOrganized_release.setComplete(!itemModelByPosition$AlexaMobileAndroidStayOrganized_release.isComplete());
            itemModelByPosition$AlexaMobileAndroidStayOrganized_release.setVersion(itemModelByPosition$AlexaMobileAndroidStayOrganized_release.getVersion() + 1);
            ShoppingListRepository.INSTANCE.completeItem(itemModelByPosition$AlexaMobileAndroidStayOrganized_release, version);
            rerenderListView$AlexaMobileAndroidStayOrganized_release(context);
            MetricsRepository metricsRepository = MetricsRepository.INSTANCE;
            metricsRepository.recordInteractionEvent(itemModelByPosition$AlexaMobileAndroidStayOrganized_release.isComplete() ? metricsRepository.getEVENT_LIST_ITEM_UNCHECKED() : metricsRepository.getEVENT_LIST_ITEM_CHECKED(), metricsRepository.getSUB_COMPONENT());
        }
    }

    public final void onEmptyStateClicked$AlexaMobileAndroidStayOrganized_release(@NotNull Context context) {
        context.getClass();
        routeToAddItem$AlexaMobileAndroidStayOrganized_release(context);
        MetricsRepository metricsRepository = MetricsRepository.INSTANCE;
        metricsRepository.recordInteractionEvent(metricsRepository.getEVENT_EMPTY_STATE_CLICKED(), metricsRepository.getSUB_COMPONENT());
    }

    public final void onHeaderClicked$AlexaMobileAndroidStayOrganized_release(@NotNull Context context) {
        context.getClass();
        routeToShoppingListPage$AlexaMobileAndroidStayOrganized_release(context);
        MetricsRepository metricsRepository = MetricsRepository.INSTANCE;
        metricsRepository.recordInteractionEvent(metricsRepository.getEVENT_HEADER_CLICKED(), metricsRepository.getSUB_COMPONENT());
    }

    public final void onLogout(@NotNull Context context) {
        context.getClass();
        ShoppingListRepository.INSTANCE.clearCache(context);
        updateBy = "logout";
        model = null;
        shouldRenderErrorState = true;
        lastUpdateTime = null;
        rerenderListView$AlexaMobileAndroidStayOrganized_release(context);
    }

    public final void onPlusClicked$AlexaMobileAndroidStayOrganized_release(@NotNull Context context) {
        context.getClass();
        routeToAddItem$AlexaMobileAndroidStayOrganized_release(context);
        MetricsRepository metricsRepository = MetricsRepository.INSTANCE;
        metricsRepository.recordInteractionEvent(metricsRepository.getEVENT_ADD_CLICKED(), metricsRepository.getSUB_COMPONENT());
    }

    public final void onShoppingListPageEvent(@NotNull Context context) {
        context.getClass();
        updateBy = "shoppingListPage";
        rerenderListView$AlexaMobileAndroidStayOrganized_release(context);
    }

    public final void onTextClicked$AlexaMobileAndroidStayOrganized_release(@NotNull Context context) {
        context.getClass();
        routeToShoppingListPage$AlexaMobileAndroidStayOrganized_release(context);
        MetricsRepository metricsRepository = MetricsRepository.INSTANCE;
        metricsRepository.recordInteractionEvent(metricsRepository.getEVENT_LIST_ITEM_CLICKED(), metricsRepository.getSUB_COMPONENT());
    }

    public final void onWidgetDisabled$AlexaMobileAndroidStayOrganized_release() {
        Object obj;
        MetricsRepository metricsRepository = MetricsRepository.INSTANCE;
        metricsRepository.recordInteractionEvent(metricsRepository.getEVENT_WIDGET_REMOVE(), metricsRepository.getSUB_COMPONENT());
        if (subscriber != null) {
            obj = ComponentRegistry.getInstance().get(EventBus.class).get();
            ShoppingListWidgetSubscriber shoppingListWidgetSubscriber = subscriber;
            shoppingListWidgetSubscriber.getClass();
            ((EventBus) obj).unsubscribe(shoppingListWidgetSubscriber);
            subscriber = null;
        }
    }

    public final void onWidgetEnabled$AlexaMobileAndroidStayOrganized_release(@NotNull Context context) {
        context.getClass();
        MetricsRepository metricsRepository = MetricsRepository.INSTANCE;
        metricsRepository.recordInteractionEvent(metricsRepository.getEVENT_WIDGET_ADD(), metricsRepository.getSUB_COMPONENT());
        initEventBusSubscriber(context);
    }

    public final void onWidgetResized$AlexaMobileAndroidStayOrganized_release() {
        MetricsRepository metricsRepository = MetricsRepository.INSTANCE;
        metricsRepository.recordInteractionEvent(metricsRepository.getEVENT_WIDGET_RESIZE(), metricsRepository.getSUB_COMPONENT());
    }

    public final void renderItemCount$AlexaMobileAndroidStayOrganized_release(@NotNull RemoteViews views) {
        ShoppingListTopModel shoppingListTopModel;
        views.getClass();
        ShoppingListWidgetModel shoppingListWidgetModel = model;
        int activeItemCount = (shoppingListWidgetModel == null || (shoppingListTopModel = shoppingListWidgetModel.getShoppingListTopModel()) == null) ? 0 : shoppingListTopModel.getActiveItemCount();
        if (activeItemCount <= 0) {
            views.setViewVisibility(R.id.item_count, 8);
            return;
        }
        views.setTextViewText(R.id.item_count, MarkdownConstants.LEFT_PARENTHESIS + activeItemCount + MarkdownConstants.RIGHT_PARENTHESIS);
        views.setViewVisibility(R.id.item_count, 0);
    }

    public final void renderLastUpdateTime$AlexaMobileAndroidStayOrganized_release(@NotNull RemoteViews views, @Nullable Context context) {
        views.getClass();
        if (lastUpdateTime == null) {
            views.setViewVisibility(R.id.last_updated_text, 8);
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE, MMMM d, h:mm", Locale.getDefault());
        Long l = lastUpdateTime;
        l.getClass();
        String str = simpleDateFormat.format(new Date(l.longValue())).toString();
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(" aaa", Locale.getDefault());
        Long l2 = lastUpdateTime;
        l2.getClass();
        views.setTextViewText(R.id.last_updated_text, context != null ? context.getString(R.string.shopping_list_as_of, BitVector$$ExternalSyntheticOutline0.m(str, simpleDateFormat2.format(new Date(l2.longValue())).toString())) : null);
        views.setViewVisibility(R.id.last_updated_text, 0);
    }

    public final void rerenderListView$AlexaMobileAndroidStayOrganized_release(@NotNull Context context) {
        context.getClass();
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        appWidgetManager.notifyAppWidgetViewDataChanged(appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) ShoppingListWidgetLarge.class)), R.id.shopping_list_list_view);
    }

    public final void rerenderWidgetContainer$AlexaMobileAndroidStayOrganized_release(@NotNull Context context) {
        context.getClass();
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) ShoppingListWidgetLarge.class));
        if (appWidgetIds != null) {
            int length = appWidgetIds.length;
            int i = 0;
            while (i < length) {
                int i2 = appWidgetIds[i];
                Context context2 = context;
                appWidgetManager.updateAppWidget(i2, INSTANCE.getShoppingListWidgetRemoteView(context2, "com.amazon.alexa.stayorganized.ui.ACTION_PLUS_CLICK_LARGE", "com.amazon.alexa.stayorganized.ui.ACTION_ARROW_CLICK_LARGE", i2, ShoppingListWidgetLarge.class));
                i++;
                context = context2;
            }
        }
    }

    public final void routeToAddItem$AlexaMobileAndroidStayOrganized_release(@NotNull Context context) {
        String str;
        String str2;
        ShoppingListTopModel shoppingListTopModel;
        ShoppingListTopModel shoppingListTopModel2;
        String deepLinkBaseUri;
        ShoppingListTopModel shoppingListTopModel3;
        context.getClass();
        ShoppingListWidgetModel shoppingListWidgetModel = model;
        if (shoppingListWidgetModel == null || (shoppingListTopModel2 = shoppingListWidgetModel.getShoppingListTopModel()) == null || (deepLinkBaseUri = shoppingListTopModel2.getDeepLinkBaseUri()) == null) {
            str = QuickActionsWidget.ROUTE_LISTS;
        } else {
            ShoppingListWidgetModel shoppingListWidgetModel2 = model;
            str = BitVector$$ExternalSyntheticOutline0.m(deepLinkBaseUri, (shoppingListWidgetModel2 == null || (shoppingListTopModel3 = shoppingListWidgetModel2.getShoppingListTopModel()) == null) ? null : shoppingListTopModel3.getAddItemRoute());
        }
        Intent addFlags = new Intent(VoiceActivity.ACTION_LAUNCH_FROM_QUICK_ACTIONS_WIDGET).setData(Uri.parse(str)).setClassName(context.getPackageName(), "com.amazon.dee.app.ui.main.MainActivity").addFlags(131072).addFlags(268435456);
        ShoppingListWidgetModel shoppingListWidgetModel3 = model;
        if (shoppingListWidgetModel3 == null || (shoppingListTopModel = shoppingListWidgetModel3.getShoppingListTopModel()) == null || (str2 = shoppingListTopModel.getAddItemRoute()) == null) {
            str2 = "v2/lists";
        }
        Intent putExtra = addFlags.putExtra(Constants.BUNDLE_KEY_REACT_NATIVE_ROUTE_NAME, str2);
        putExtra.getClass();
        context.startActivity(putExtra);
    }

    public final void routeToShoppingListPage$AlexaMobileAndroidStayOrganized_release(@NotNull Context context) {
        String str;
        String str2;
        ShoppingListTopModel shoppingListTopModel;
        ShoppingListTopModel shoppingListTopModel2;
        String deepLinkBaseUri;
        ShoppingListTopModel shoppingListTopModel3;
        context.getClass();
        ShoppingListWidgetModel shoppingListWidgetModel = model;
        if (shoppingListWidgetModel == null || (shoppingListTopModel2 = shoppingListWidgetModel.getShoppingListTopModel()) == null || (deepLinkBaseUri = shoppingListTopModel2.getDeepLinkBaseUri()) == null) {
            str = QuickActionsWidget.ROUTE_LISTS;
        } else {
            ShoppingListWidgetModel shoppingListWidgetModel2 = model;
            str = BitVector$$ExternalSyntheticOutline0.m(deepLinkBaseUri, (shoppingListWidgetModel2 == null || (shoppingListTopModel3 = shoppingListWidgetModel2.getShoppingListTopModel()) == null) ? null : shoppingListTopModel3.getShoppingListRoute());
        }
        Intent addFlags = new Intent(VoiceActivity.ACTION_LAUNCH_FROM_QUICK_ACTIONS_WIDGET).setData(Uri.parse(str)).setClassName(context.getPackageName(), "com.amazon.dee.app.ui.main.MainActivity").addFlags(131072).addFlags(268435456);
        ShoppingListWidgetModel shoppingListWidgetModel3 = model;
        if (shoppingListWidgetModel3 == null || (shoppingListTopModel = shoppingListWidgetModel3.getShoppingListTopModel()) == null || (str2 = shoppingListTopModel.getShoppingListRoute()) == null) {
            str2 = "v2/lists";
        }
        Intent putExtra = addFlags.putExtra(Constants.BUNDLE_KEY_REACT_NATIVE_ROUTE_NAME, str2);
        putExtra.getClass();
        context.startActivity(putExtra);
    }

    public final void safeRerender$AlexaMobileAndroidStayOrganized_release(@NotNull Function0<Unit> block) {
        block.getClass();
        if (Build.VERSION.SDK_INT > 34) {
            mainHandler.post(new Actual_androidKt$$ExternalSyntheticLambda0(block, 7));
        } else {
            block.invoke();
        }
    }

    public final void setLastUpdateTime(@Nullable Long l) {
        lastUpdateTime = l;
    }

    public final void setModel$AlexaMobileAndroidStayOrganized_release(@Nullable ShoppingListWidgetModel shoppingListWidgetModel) {
        model = shoppingListWidgetModel;
    }

    public final void setSubscriber(@Nullable ShoppingListWidgetSubscriber shoppingListWidgetSubscriber) {
        subscriber = shoppingListWidgetSubscriber;
    }

    public final void setUpdateBy(@NotNull String str) {
        str.getClass();
        updateBy = str;
    }
}
