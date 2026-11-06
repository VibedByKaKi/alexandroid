package com.reactcommunity.rndatetimepicker;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.amazon.tarazed.dialog.AbstractDialog$$ExternalSyntheticLambda1;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.util.RNLog;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Calendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang3.time.TimeZones;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class Common {
    public static final String LABEL = "label";
    public static final String NEGATIVE = "negative";
    public static final String NEUTRAL = "neutral";
    public static final String POSITIVE = "positive";
    public static final String TEXT_COLOR = "textColor";

    @NonNull
    public static DialogInterface.OnShowListener combine(@NonNull DialogInterface.OnShowListener... onShowListenerArr) {
        return new AbstractDialog$$ExternalSyntheticLambda1(onShowListenerArr, 2);
    }

    public static Bundle createDatePickerArguments(ReadableMap readableMap) {
        Bundle createFragmentArguments = createFragmentArguments(readableMap);
        if (readableMap.hasKey(RNConstants.ARG_MINDATE) && !readableMap.isNull(RNConstants.ARG_MINDATE)) {
            createFragmentArguments.putLong(RNConstants.ARG_MINDATE, (long) readableMap.getDouble(RNConstants.ARG_MINDATE));
        }
        if (readableMap.hasKey(RNConstants.ARG_MAXDATE) && !readableMap.isNull(RNConstants.ARG_MAXDATE)) {
            createFragmentArguments.putLong(RNConstants.ARG_MAXDATE, (long) readableMap.getDouble(RNConstants.ARG_MAXDATE));
        }
        if (readableMap.hasKey("display") && !readableMap.isNull("display")) {
            createFragmentArguments.putString("display", readableMap.getString("display"));
        }
        if (readableMap.hasKey(RNConstants.ARG_DIALOG_BUTTONS) && !readableMap.isNull(RNConstants.ARG_DIALOG_BUTTONS)) {
            createFragmentArguments.putBundle(RNConstants.ARG_DIALOG_BUTTONS, Arguments.toBundle(readableMap.getMap(RNConstants.ARG_DIALOG_BUTTONS)));
        }
        if (readableMap.hasKey(RNConstants.ARG_TZOFFSET_MINS) && !readableMap.isNull(RNConstants.ARG_TZOFFSET_MINS)) {
            createFragmentArguments.putLong(RNConstants.ARG_TZOFFSET_MINS, (long) readableMap.getDouble(RNConstants.ARG_TZOFFSET_MINS));
        }
        if (readableMap.hasKey("testID") && !readableMap.isNull("testID")) {
            createFragmentArguments.putString("testID", readableMap.getString("testID"));
        }
        if (readableMap.hasKey("fullscreen") && !readableMap.isNull("fullscreen")) {
            createFragmentArguments.putBoolean("fullscreen", readableMap.getBoolean("fullscreen"));
        }
        if (readableMap.hasKey(RNConstants.FIRST_DAY_OF_WEEK) && !readableMap.isNull(RNConstants.FIRST_DAY_OF_WEEK)) {
            createFragmentArguments.putInt(RNConstants.FIRST_DAY_OF_WEEK, readableMap.getInt(RNConstants.FIRST_DAY_OF_WEEK) + 1);
        }
        if (readableMap.hasKey(RNConstants.ARG_START_ON_YEAR_SELECTION) && !readableMap.isNull(RNConstants.ARG_START_ON_YEAR_SELECTION)) {
            createFragmentArguments.putBoolean(RNConstants.ARG_START_ON_YEAR_SELECTION, readableMap.getBoolean(RNConstants.ARG_START_ON_YEAR_SELECTION));
        }
        return createFragmentArguments;
    }

    public static Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        if (readableMap.hasKey("value") && !readableMap.isNull("value")) {
            bundle.putLong("value", (long) readableMap.getDouble("value"));
        }
        if (readableMap.hasKey(RNConstants.ARG_TZ_NAME) && !readableMap.isNull(RNConstants.ARG_TZ_NAME)) {
            bundle.putString(RNConstants.ARG_TZ_NAME, readableMap.getString(RNConstants.ARG_TZ_NAME));
        }
        if (readableMap.hasKey("title") && !readableMap.isNull("title")) {
            bundle.putString("title", readableMap.getString("title"));
        }
        if (readableMap.hasKey(RNConstants.ARG_INITIAL_INPUT_MODE) && !readableMap.isNull(RNConstants.ARG_INITIAL_INPUT_MODE)) {
            bundle.putString(RNConstants.ARG_INITIAL_INPUT_MODE, readableMap.getString(RNConstants.ARG_INITIAL_INPUT_MODE));
        }
        return bundle;
    }

    public static Bundle createTimePickerArguments(ReadableMap readableMap) {
        Bundle createFragmentArguments = createFragmentArguments(readableMap);
        if (readableMap.hasKey(RNConstants.ARG_IS24HOUR) && !readableMap.isNull(RNConstants.ARG_IS24HOUR)) {
            createFragmentArguments.putBoolean(RNConstants.ARG_IS24HOUR, readableMap.getBoolean(RNConstants.ARG_IS24HOUR));
        }
        if (readableMap.hasKey("display") && !readableMap.isNull("display")) {
            createFragmentArguments.putString("display", readableMap.getString("display"));
        }
        if (readableMap.hasKey(RNConstants.ARG_DIALOG_BUTTONS) && !readableMap.isNull(RNConstants.ARG_DIALOG_BUTTONS)) {
            createFragmentArguments.putBundle(RNConstants.ARG_DIALOG_BUTTONS, Arguments.toBundle(readableMap.getMap(RNConstants.ARG_DIALOG_BUTTONS)));
        }
        if (readableMap.hasKey(RNConstants.ARG_INTERVAL) && !readableMap.isNull(RNConstants.ARG_INTERVAL)) {
            createFragmentArguments.putInt(RNConstants.ARG_INTERVAL, readableMap.getInt(RNConstants.ARG_INTERVAL));
        }
        if (readableMap.hasKey(RNConstants.ARG_TZOFFSET_MINS) && !readableMap.isNull(RNConstants.ARG_TZOFFSET_MINS)) {
            createFragmentArguments.putLong(RNConstants.ARG_TZOFFSET_MINS, (long) readableMap.getDouble(RNConstants.ARG_TZOFFSET_MINS));
        }
        return createFragmentArguments;
    }

    public static void dismissDialog(FragmentActivity fragmentActivity, String str, Promise promise) {
        if (fragmentActivity == null) {
            promise.reject(RNConstants.ERROR_NO_ACTIVITY, "Tried to close a " + str + " dialog while not attached to an Activity");
            return;
        }
        try {
            DialogFragment dialogFragment = (DialogFragment) fragmentActivity.getSupportFragmentManager().findFragmentByTag(str);
            boolean z = dialogFragment != null;
            if (z) {
                dialogFragment.dismiss();
            }
            promise.resolve(Boolean.valueOf(z));
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    private static Integer getButtonColor(Bundle bundle, String str) {
        Bundle bundle2;
        int i;
        Bundle bundle3 = bundle.getBundle(RNConstants.ARG_DIALOG_BUTTONS);
        if (bundle3 == null || (bundle2 = bundle3.getBundle(str)) == null || (i = (int) bundle2.getDouble(TEXT_COLOR, 0.0d)) == 0) {
            return null;
        }
        return Integer.valueOf(i);
    }

    public static int getDefaultDialogButtonTextColor(@NonNull Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.textColorPrimary, typedValue, true);
        int i = typedValue.resourceId;
        return i != 0 ? ContextCompat.getColor(context, i) : typedValue.data;
    }

    public static RNDatePickerDisplay getDisplayDate(Bundle bundle) {
        return (bundle == null || bundle.getString("display", null) == null) ? RNDatePickerDisplay.DEFAULT : RNDatePickerDisplay.valueOf(bundle.getString("display").toUpperCase(Locale.US));
    }

    public static RNTimePickerDisplay getDisplayTime(Bundle bundle) {
        return (bundle == null || bundle.getString("display", null) == null) ? RNTimePickerDisplay.DEFAULT : RNTimePickerDisplay.valueOf(bundle.getString("display").toUpperCase(Locale.US));
    }

    public static TimeZone getTimeZone(Bundle bundle) {
        if (bundle != null && bundle.containsKey(RNConstants.ARG_TZOFFSET_MINS)) {
            return new SimpleTimeZone(((int) bundle.getLong(RNConstants.ARG_TZOFFSET_MINS)) * 60000, TimeZones.GMT_ID);
        }
        if (bundle != null && bundle.containsKey(RNConstants.ARG_TZ_NAME)) {
            String string = bundle.getString(RNConstants.ARG_TZ_NAME);
            if (TimeZones.GMT_ID.equals(string)) {
                return TimeZone.getTimeZone(TimeZones.GMT_ID);
            }
            if (!TimeZones.GMT_ID.equals(TimeZone.getTimeZone(string).getID())) {
                return TimeZone.getTimeZone(string);
            }
            StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("'", string, "' does not exist in TimeZone.getAvailableIDs(). Falling back to TimeZone.getDefault()=");
            m2m.append(TimeZone.getDefault().getID());
            RNLog.w(null, m2m.toString());
        }
        return TimeZone.getDefault();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$combine$2(DialogInterface.OnShowListener[] onShowListenerArr, DialogInterface dialogInterface) {
        for (DialogInterface.OnShowListener onShowListener : onShowListenerArr) {
            if (onShowListener != null) {
                onShowListener.onShow(dialogInterface);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openYearDialog$1(boolean z, AlertDialog alertDialog, DialogInterface dialogInterface) {
        View findViewById;
        if (z && (alertDialog instanceof DatePickerDialog)) {
            DatePicker datePicker = ((DatePickerDialog) alertDialog).getDatePicker();
            int identifier = Resources.getSystem().getIdentifier("date_picker_header_year", "id", "android");
            if (identifier == 0 || (findViewById = datePicker.findViewById(identifier)) == null) {
                return;
            }
            findViewById.performClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setButtonTextColor$0(AlertDialog alertDialog, Context context, Bundle bundle, boolean z, DialogInterface dialogInterface) {
        Button button = alertDialog.getButton(-1);
        Button button2 = alertDialog.getButton(-2);
        Button button3 = alertDialog.getButton(-3);
        int defaultDialogButtonTextColor = getDefaultDialogButtonTextColor(context);
        setTextColor(button, POSITIVE, bundle, z, defaultDialogButtonTextColor);
        setTextColor(button2, NEGATIVE, bundle, z, defaultDialogButtonTextColor);
        setTextColor(button3, NEUTRAL, bundle, z, defaultDialogButtonTextColor);
    }

    public static long maxDateWithTimeZone(Bundle bundle) {
        if (!bundle.containsKey(RNConstants.ARG_MAXDATE)) {
            return Long.MAX_VALUE;
        }
        Calendar calendar = Calendar.getInstance(getTimeZone(bundle));
        calendar.setTimeInMillis(bundle.getLong(RNConstants.ARG_MAXDATE));
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis();
    }

    public static long minDateWithTimeZone(Bundle bundle) {
        if (!bundle.containsKey(RNConstants.ARG_MINDATE)) {
            return 0L;
        }
        Calendar calendar = Calendar.getInstance(getTimeZone(bundle));
        calendar.setTimeInMillis(bundle.getLong(RNConstants.ARG_MINDATE));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    @NonNull
    public static DialogInterface.OnShowListener openYearDialog(final AlertDialog alertDialog, final boolean z) {
        return new DialogInterface.OnShowListener() { // from class: com.reactcommunity.rndatetimepicker.Common$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                Common.lambda$openYearDialog$1(z, alertDialog, dialogInterface);
            }
        };
    }

    private static void setButtonLabel(Bundle bundle, AlertDialog alertDialog, int i, DialogInterface.OnClickListener onClickListener) {
        if (bundle == null || bundle.getString("label") == null) {
            return;
        }
        alertDialog.setButton(i, bundle.getString("label"), onClickListener);
    }

    @NonNull
    public static DialogInterface.OnShowListener setButtonTextColor(@NonNull final Context context, final AlertDialog alertDialog, final Bundle bundle, final boolean z) {
        return new DialogInterface.OnShowListener() { // from class: com.reactcommunity.rndatetimepicker.Common$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                Common.lambda$setButtonTextColor$0(alertDialog, context, bundle, z, dialogInterface);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setButtonTitles(@NonNull Bundle bundle, AlertDialog alertDialog, DialogInterface.OnClickListener onClickListener) {
        Bundle bundle2 = bundle.getBundle(RNConstants.ARG_DIALOG_BUTTONS);
        if (bundle2 == null) {
            return;
        }
        setButtonLabel(bundle2.getBundle(NEUTRAL), alertDialog, -3, onClickListener);
        DialogInterface.OnClickListener onClickListener2 = (DialogInterface.OnClickListener) alertDialog;
        setButtonLabel(bundle2.getBundle(POSITIVE), alertDialog, -1, onClickListener2);
        setButtonLabel(bundle2.getBundle(NEGATIVE), alertDialog, -2, onClickListener2);
    }

    private static void setTextColor(Button button, String str, Bundle bundle, boolean z, int i) {
        if (button == null) {
            return;
        }
        Integer buttonColor = getButtonColor(bundle, str);
        if (z || buttonColor != null) {
            if (buttonColor != null) {
                i = buttonColor.intValue();
            }
            button.setTextColor(i);
        }
    }
}
