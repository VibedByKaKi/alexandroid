package com.amazon.alexa.ra.features.floatingwindow;

import android.app.ActivityOptions;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.model.Constants;
import com.amazon.alexa.voice.ui.ra.RaUiOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002R\u000e\u0010\u000f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/ra/features/floatingwindow/FloatingWindowLauncher;", "", "<init>", "()V", "launch", "", "context", "Landroid/content/Context;", "conversationId", "", Constants.EXTRA_USE_DYNAMIC_STARTERS, "", "isConversationSurfaceOpen", "readBounds", "Landroid/graphics/Rect;", com.dee.app.contacts.common.constants.Constants.LOG_TAG, "FLOATING_WINDOW_BOUNDS_SETTING", "APP_IN_FOREGROUND_SETTING", "FLOATING_WINDOW_OPEN_SETTING", "FLOATING_UI_ACTION", "FLOATING_UI_ACTIVITY", "UI_OPTIONS_EXTRA", "WINDOWING_MODE_OPTION", "WINDOWING_MODE_MULTI_WINDOW", "", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFloatingWindowLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingWindowLauncher.kt\ncom/amazon/alexa/ra/features/floatingwindow/FloatingWindowLauncher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
/* loaded from: classes18.dex */
public final class FloatingWindowLauncher {
    public static final int $stable = 0;

    @NotNull
    private static final String APP_IN_FOREGROUND_SETTING = "alexa_app_in_foreground";

    @NotNull
    private static final String FLOATING_UI_ACTION = "amazon.intent.action.SHOW_RA_UI_FLOATING";

    @NotNull
    private static final String FLOATING_UI_ACTIVITY = "com.amazon.dee.app.tablet.ui.TabletRaActivity";

    @NotNull
    private static final String FLOATING_WINDOW_BOUNDS_SETTING = "alexa_window_bounds";

    @NotNull
    private static final String FLOATING_WINDOW_OPEN_SETTING = "alexa_window_is_open";

    @NotNull
    public static final FloatingWindowLauncher INSTANCE = new FloatingWindowLauncher();

    @NotNull
    private static final String TAG = "FloatingWindowLauncher";

    @NotNull
    private static final String UI_OPTIONS_EXTRA = "ra_ui_options";
    private static final int WINDOWING_MODE_MULTI_WINDOW = 6;

    @NotNull
    private static final String WINDOWING_MODE_OPTION = "android.activity.windowingMode";

    private FloatingWindowLauncher() {
    }

    private final Rect readBounds(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), FLOATING_WINDOW_BOUNDS_SETTING);
        if (string == null) {
            string = "";
        }
        return Rect.unflattenFromString(string);
    }

    public final boolean isConversationSurfaceOpen(@NotNull Context context) {
        context.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Secure.getInt(contentResolver, APP_IN_FOREGROUND_SETTING, 0) == 1;
        boolean z2 = Settings.Secure.getInt(contentResolver, FLOATING_WINDOW_OPEN_SETTING, 0) == 1;
        Log.i(TAG, "isConversationSurfaceOpen: appInForeground=" + z + ", floatingWindowOpen=" + z2);
        return z || z2;
    }

    public final void launch(@NotNull Context context, @Nullable String conversationId, boolean useDynamicStarters) {
        context.getClass();
        Rect readBounds = readBounds(context);
        if (readBounds == null) {
            Log.w(TAG, "Floating window bounds not set; cannot launch floating window");
            return;
        }
        Bundle bundle = ActivityOptions.makeBasic().setLaunchBounds(readBounds).toBundle();
        bundle.putInt(WINDOWING_MODE_OPTION, 6);
        Intent intent = new Intent(FLOATING_UI_ACTION);
        intent.setClassName(context.getPackageName(), FLOATING_UI_ACTIVITY);
        intent.setFlags(268435456);
        intent.putExtra("ra_ui_options", new RaUiOptions.Builder().setConversationId(conversationId).build());
        intent.putExtra(Constants.EXTRA_USE_DYNAMIC_STARTERS, useDynamicStarters);
        try {
            context.startActivity(intent, bundle);
        } catch (ActivityNotFoundException e) {
            Log.w(TAG, "TabletRaActivity not found; cannot launch floating window", e);
        }
    }
}
