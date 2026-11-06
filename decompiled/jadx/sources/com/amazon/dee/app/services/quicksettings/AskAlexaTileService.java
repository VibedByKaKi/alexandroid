package com.amazon.dee.app.services.quicksettings;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.service.quicksettings.TileService;
import com.amazon.dee.app.services.logging.Log;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0017J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Lcom/amazon/dee/app/services/quicksettings/AskAlexaTileService;", "Landroid/service/quicksettings/TileService;", "<init>", "()V", "onTileAdded", "", ViewProps.ON_CLICK, "onTileRemoved", "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AskAlexaTileService extends TileService {

    @NotNull
    private static final String ACTION_LAUNCH_FROM_QUICK_SETTINGS_TILE = "com.amazon.alexa.action.QUICK_SETTINGS_TILE";

    @NotNull
    private static final String LAUNCH_ALEXA_ACTIVITY = "com.amazon.dee.app.ui.voice.LaunchAlexaActivity";

    @NotNull
    private static final String TAG = Log.tag((Class<?>) AskAlexaTileService.class);

    @Override // android.service.quicksettings.TileService
    @SuppressLint({"StartActivityAndCollapseDeprecated"})
    public void onClick() {
        String str = TAG;
        Log.i(str, "Ask Alexa tile clicked.");
        super.onClick();
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(getApplicationContext().getPackageName(), "com.amazon.dee.app.ui.voice.LaunchAlexaActivity"));
        intent.setAction(ACTION_LAUNCH_FROM_QUICK_SETTINGS_TILE);
        intent.addFlags(268435456);
        PendingIntent activity = PendingIntent.getActivity(getApplicationContext(), 67108864, intent, 67108864);
        List<ResolveInfo> queryIntentActivities = getApplicationContext().getPackageManager().queryIntentActivities(intent, 65536);
        queryIntentActivities.getClass();
        if (queryIntentActivities.isEmpty()) {
            Log.e(str, "Cannot find activity:com.amazon.dee.app.ui.voice.LaunchAlexaActivity");
        } else if (Build.VERSION.SDK_INT >= 34) {
            Log.i(str, "Launch Ask Alexa.");
            startActivityAndCollapse(activity);
        } else {
            Log.i(str, "Launch Ask Alexa via legacy API.");
            startActivityAndCollapse(intent);
        }
    }

    @Override // android.service.quicksettings.TileService
    public void onTileAdded() {
        Log.i(TAG, "Ask Alexa tile added.");
        super.onTileAdded();
    }

    @Override // android.service.quicksettings.TileService
    public void onTileRemoved() {
        Log.i(TAG, "Ask Alexa tile removed.");
        super.onTileRemoved();
    }
}
