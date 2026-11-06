package com.amazon.alexa.growth.coachmark;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class CoachMarkVisibilityHelper {
    static final String COACH_MARK_VIEW_STATUS = "CoachMarkViewStatus";
    private static volatile CoachMarkVisibilityHelper instance = null;
    private static final HashMap<String, Boolean> shownCoachMarkIds = new HashMap<>();
    private static boolean visibleBoolean = false;

    private CoachMarkVisibilityHelper() {
    }

    public static synchronized void clearCoachMarkShown(Context context, String str) {
        synchronized (CoachMarkVisibilityHelper.class) {
            if ("NavigateWithCards".equalsIgnoreCase(str) || AlexaMetricsConstants.MetricsComponents.MORE_MENU_COMPONENT.equalsIgnoreCase(str) || "DoMoreWithAlexa".equalsIgnoreCase(str)) {
                shownCoachMarkIds.remove(str);
                SharedPreferences.Editor edit = context.getSharedPreferences("CoachMarkViewStatus", 0).edit();
                edit.remove(str);
                edit.apply();
            }
        }
    }

    public static synchronized CoachMarkVisibilityHelper getInstance() {
        CoachMarkVisibilityHelper coachMarkVisibilityHelper;
        synchronized (CoachMarkVisibilityHelper.class) {
            try {
                if (instance == null) {
                    synchronized (CoachMarkVisibilityHelper.class) {
                        try {
                            if (instance == null) {
                                instance = new CoachMarkVisibilityHelper();
                            }
                        } finally {
                        }
                    }
                }
                coachMarkVisibilityHelper = instance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return coachMarkVisibilityHelper;
    }

    public static boolean hasCoachMarkBeenShown(String str) {
        return shownCoachMarkIds.containsKey(str);
    }

    public static synchronized boolean isAnyCoachMarkVisible() {
        boolean z;
        synchronized (CoachMarkVisibilityHelper.class) {
            z = visibleBoolean;
        }
        return z;
    }

    public static synchronized void loadShownCoachMarksFromSharedPreferences(Context context) {
        synchronized (CoachMarkVisibilityHelper.class) {
            if (shownCoachMarkIds.isEmpty()) {
                for (Map.Entry<String, ?> entry : context.getSharedPreferences("CoachMarkViewStatus", 0).getAll().entrySet()) {
                    if (entry.getValue() instanceof Boolean) {
                        shownCoachMarkIds.put(entry.getKey(), (Boolean) entry.getValue());
                    }
                }
            }
        }
    }

    public static synchronized void setCoachMarkInvisible() {
        synchronized (CoachMarkVisibilityHelper.class) {
            visibleBoolean = false;
        }
    }

    public static synchronized void setCoachMarkShown(Context context, String str) {
        synchronized (CoachMarkVisibilityHelper.class) {
            shownCoachMarkIds.put(str, Boolean.TRUE);
            SharedPreferences.Editor edit = context.getSharedPreferences("CoachMarkViewStatus", 0).edit();
            edit.putBoolean(str, true);
            edit.apply();
        }
    }

    public static synchronized void setCoachMarkVisible() {
        synchronized (CoachMarkVisibilityHelper.class) {
            visibleBoolean = true;
        }
    }
}
