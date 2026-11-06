package com.amazon.alexa.stayorganized.ui;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RemoteViews;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J&\u0010\u0012\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/stayorganized/ui/ShoppingListWidgetLarge;", "Landroid/appwidget/AppWidgetProvider;", "()V", "onAppWidgetOptionsChanged", "", "context", "Landroid/content/Context;", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetId", "", "newOptions", "Landroid/os/Bundle;", "onDisabled", "onEnabled", "onReceive", "intent", "Landroid/content/Intent;", "onUpdate", "appWidgetIds", "", "Companion", "AlexaMobileAndroidStayOrganized_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShoppingListWidgetLarge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShoppingListWidgetLarge.kt\ncom/amazon/alexa/stayorganized/ui/ShoppingListWidgetLarge\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,57:1\n13430#2,2:58\n*S KotlinDebug\n*F\n+ 1 ShoppingListWidgetLarge.kt\ncom/amazon/alexa/stayorganized/ui/ShoppingListWidgetLarge\n*L\n17#1:58,2\n*E\n"})
/* loaded from: classes19.dex */
public final class ShoppingListWidgetLarge extends AppWidgetProvider {

    @NotNull
    public static final String ACTION_ARROW_CLICK_LARGE = "com.amazon.alexa.stayorganized.ui.ACTION_ARROW_CLICK_LARGE";

    @NotNull
    public static final String ACTION_PLUS_CLICK_LARGE = "com.amazon.alexa.stayorganized.ui.ACTION_PLUS_CLICK_LARGE";

    @Override // android.appwidget.AppWidgetProvider
    public void onAppWidgetOptionsChanged(@Nullable Context context, @Nullable AppWidgetManager appWidgetManager, int appWidgetId, @Nullable Bundle newOptions) {
        super.onAppWidgetOptionsChanged(context, appWidgetManager, appWidgetId, newOptions);
        ShoppingListWidgetPresenter.INSTANCE.onWidgetResized$AlexaMobileAndroidStayOrganized_release();
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDisabled(@Nullable Context context) {
        super.onDisabled(context);
        ShoppingListWidgetPresenter.INSTANCE.onWidgetDisabled$AlexaMobileAndroidStayOrganized_release();
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(@NotNull Context context) {
        context.getClass();
        super.onEnabled(context);
        ShoppingListWidgetPresenter.INSTANCE.onWidgetEnabled$AlexaMobileAndroidStayOrganized_release(context);
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        context.getClass();
        intent.getClass();
        super.onReceive(context, intent);
        ShoppingListWidgetPresenter.INSTANCE.onAction(context, intent);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(@Nullable Context context, @Nullable AppWidgetManager appWidgetManager, @Nullable int[] appWidgetIds) {
        if (appWidgetIds != null) {
            int length = appWidgetIds.length;
            int i = 0;
            while (i < length) {
                int i2 = appWidgetIds[i];
                Context context2 = context;
                RemoteViews shoppingListWidgetRemoteView = ShoppingListWidgetPresenter.INSTANCE.getShoppingListWidgetRemoteView(context2, "com.amazon.alexa.stayorganized.ui.ACTION_PLUS_CLICK_LARGE", "com.amazon.alexa.stayorganized.ui.ACTION_ARROW_CLICK_LARGE", i2, ShoppingListWidgetLarge.class);
                if (appWidgetManager != null) {
                    appWidgetManager.updateAppWidget(i2, shoppingListWidgetRemoteView);
                }
                i++;
                context = context2;
            }
        }
        super.onUpdate(context, appWidgetManager, appWidgetIds);
    }
}
