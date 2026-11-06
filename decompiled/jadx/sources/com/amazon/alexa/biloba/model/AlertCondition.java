package com.amazon.alexa.biloba.model;

import android.content.res.Resources;
import com.amazon.alexa.biloba.R;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AlertCondition {
    private final String condition;
    private int configurationType;
    private final String id;
    private boolean selected;

    public AlertCondition(String str, String str2, boolean z) {
        this.id = str;
        this.condition = str2;
        this.configurationType = -1;
        this.selected = z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int getAlertConfigurationTypeFromString(String str) {
        boolean z;
        if (str == null) {
            return -1;
        }
        switch (str.hashCode()) {
            case -1850772531:
                if (str.equals("NO_ACTIVITY")) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            case -1109522855:
                if (str.equals("SMART_HOME_ACTIVITY")) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            case 21649588:
                if (str.equals("PAUSE_NOTIFICATION")) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            case 198088487:
                if (str.equals("FIRST_ACTIVITY_OF_THE_DAY")) {
                    z = 3;
                    break;
                }
                z = -1;
                break;
            case 279501858:
                if (str.equals("ANY_ACTIVITY")) {
                    z = 4;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        switch (z) {
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AlertCondition alertCondition = (AlertCondition) obj;
            if (Objects.equals(this.id, alertCondition.id) && Objects.equals(this.condition, alertCondition.condition) && Integer.valueOf(this.configurationType).equals(Integer.valueOf(alertCondition.configurationType)) && Boolean.valueOf(this.selected).equals(Boolean.valueOf(alertCondition.selected))) {
                return true;
            }
        }
        return false;
    }

    public String getAlertConfigurationTypeAsStringResource(Resources resources) {
        int i = this.configurationType;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? resources.getString(R.string.alert_unknown) : resources.getString(R.string.alert_pause_notification) : resources.getString(R.string.alert_smart_home_activity_detected) : resources.getString(R.string.alert_any_activity_detected) : resources.getString(R.string.alert_first_activity_of_the_day) : resources.getString(R.string.alert_no_activity_detected);
    }

    public String getAlertConfigurationTypeInString() {
        int i = this.configurationType;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "PAUSE_NOTIFICATION" : "SMART_HOME_ACTIVITY" : "ANY_ACTIVITY" : "FIRST_ACTIVITY_OF_THE_DAY" : "NO_ACTIVITY";
    }

    public String getCondition() {
        String str = this.condition;
        return str == null ? getAlertConfigurationTypeInString() : str;
    }

    public int getConfigurationType() {
        return this.configurationType;
    }

    public String getId() {
        return this.id;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.condition, Integer.valueOf(this.configurationType), Boolean.valueOf(this.selected));
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setSelected(boolean z) {
        this.selected = z;
    }

    public AlertCondition(String str, int i, boolean z) {
        this.id = str;
        this.condition = null;
        this.configurationType = i;
        this.selected = z;
    }
}
