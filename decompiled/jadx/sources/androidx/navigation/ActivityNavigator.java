package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import com.amazon.alexa.hho.navigation.constants.DeeplinkConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.dee.app.elements.ElementsRouteKeys;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.apache.http.HttpHeaders;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Navigator.Name("activity")
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0017\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0016\u0017\u0018B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u0002H\u0016J0\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0013\u0010\u0003\u001a\u00020\u00048\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Landroidx/navigation/ActivityNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/ActivityNavigator$Destination;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "hostActivity", "Landroid/app/Activity;", "createDestination", "navigate", "Landroidx/navigation/NavDestination;", DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.DESTINATION_QUERY_PARAM_KEY, ElementsRouteKeys.ARGS, "Landroid/os/Bundle;", "navOptions", "Landroidx/navigation/NavOptions;", "navigatorExtras", "Landroidx/navigation/Navigator$Extras;", "popBackStack", "", "Companion", HttpHeaders.DESTINATION, "Extras", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nActivityNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,499:1\n179#2,2:500\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator\n*L\n45#1:500,2\n*E\n"})
/* loaded from: classes14.dex */
public class ActivityNavigator extends Navigator<Destination> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String EXTRA_NAV_CURRENT = "android-support-navigation:ActivityNavigator:current";

    @NotNull
    private static final String EXTRA_NAV_SOURCE = "android-support-navigation:ActivityNavigator:source";

    @NotNull
    private static final String EXTRA_POP_ENTER_ANIM = "android-support-navigation:ActivityNavigator:popEnterAnim";

    @NotNull
    private static final String EXTRA_POP_EXIT_ANIM = "android-support-navigation:ActivityNavigator:popExitAnim";

    @NotNull
    private static final String LOG_TAG = "ActivityNavigator";

    @NotNull
    private final Context context;

    @Nullable
    private final Activity hostActivity;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/navigation/ActivityNavigator$Extras;", "Landroidx/navigation/Navigator$Extras;", "flags", "", "activityOptions", "Landroidx/core/app/ActivityOptionsCompat;", "(ILandroidx/core/app/ActivityOptionsCompat;)V", "getActivityOptions", "()Landroidx/core/app/ActivityOptionsCompat;", "getFlags", "()I", "Builder", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Extras implements Navigator.Extras {

        @Nullable
        private final ActivityOptionsCompat activityOptions;
        private final int flags;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/navigation/ActivityNavigator$Extras$Builder;", "", "()V", "activityOptions", "Landroidx/core/app/ActivityOptionsCompat;", "flags", "", "addFlags", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Landroidx/navigation/ActivityNavigator$Extras;", "setActivityOptions", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Builder {

            @Nullable
            private ActivityOptionsCompat activityOptions;
            private int flags;

            @NotNull
            public final Builder addFlags(int flags) {
                this.flags = flags | this.flags;
                return this;
            }

            @NotNull
            public final Extras build() {
                return new Extras(this.flags, this.activityOptions);
            }

            @NotNull
            public final Builder setActivityOptions(@NotNull ActivityOptionsCompat activityOptions) {
                activityOptions.getClass();
                this.activityOptions = activityOptions;
                return this;
            }
        }

        public Extras(int i, @Nullable ActivityOptionsCompat activityOptionsCompat) {
            this.flags = i;
            this.activityOptions = activityOptionsCompat;
        }

        @Nullable
        public final ActivityOptionsCompat getActivityOptions() {
            return this.activityOptions;
        }

        public final int getFlags() {
            return this.flags;
        }
    }

    public ActivityNavigator(@NotNull Context context) {
        Object obj;
        context.getClass();
        this.context = context;
        Iterator it2 = SequencesKt.generateSequence(context, new Function1<Context, Context>() { // from class: androidx.navigation.ActivityNavigator$hostActivity$1
            @Override // kotlin.jvm.functions.Function1
            public final Context invoke(Context context2) {
                context2.getClass();
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            }
        }).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it2.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.hostActivity = (Activity) obj;
    }

    @JvmStatic
    public static final void applyPopAnimationsToPendingTransition(@NotNull Activity activity) {
        INSTANCE.applyPopAnimationsToPendingTransition(activity);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.Navigator
    @NotNull
    public Destination createDestination() {
        return new Destination(this);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.navigation.Navigator
    @Nullable
    public NavDestination navigate(@NotNull Destination destination, @Nullable Bundle args, @Nullable NavOptions navOptions, @Nullable Navigator.Extras navigatorExtras) {
        Intent intent;
        int intExtra;
        destination.getClass();
        if (destination.getIntent() == null) {
            throw new IllegalStateException(("Destination " + destination.getId() + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(destination.getIntent());
        if (args != null) {
            intent2.putExtras(args);
            String dataPattern = destination.getDataPattern();
            if (dataPattern != null && dataPattern.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(dataPattern);
                while (matcher.find()) {
                    String group = matcher.group(1);
                    if (!args.containsKey(group)) {
                        Gson$$ExternalSyntheticBUOutline0.m("Could not find ", group, " in ", args, " to fill data pattern ", dataPattern);
                        return null;
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(args.get(group))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z = navigatorExtras instanceof Extras;
        if (z) {
            intent2.addFlags(((Extras) navigatorExtras).getFlags());
        }
        if (this.hostActivity == null) {
            intent2.addFlags(268435456);
        }
        if (navOptions != null && navOptions.getSingleTop()) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.hostActivity;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra(EXTRA_NAV_CURRENT, 0)) != 0) {
            intent2.putExtra(EXTRA_NAV_SOURCE, intExtra);
        }
        intent2.putExtra(EXTRA_NAV_CURRENT, destination.getId());
        Resources resources = this.context.getResources();
        if (navOptions != null) {
            int popEnterAnim = navOptions.getPopEnterAnim();
            int popExitAnim = navOptions.getPopExitAnim();
            if ((popEnterAnim <= 0 || !Intrinsics.areEqual(resources.getResourceTypeName(popEnterAnim), "animator")) && (popExitAnim <= 0 || !Intrinsics.areEqual(resources.getResourceTypeName(popExitAnim), "animator"))) {
                intent2.putExtra(EXTRA_POP_ENTER_ANIM, popEnterAnim);
                intent2.putExtra(EXTRA_POP_EXIT_ANIM, popExitAnim);
            } else {
                Log.w(LOG_TAG, "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(popEnterAnim) + " and popExit resource " + resources.getResourceName(popExitAnim) + " when launching " + destination);
            }
        }
        if (z) {
            ActivityOptionsCompat activityOptions = ((Extras) navigatorExtras).getActivityOptions();
            Context context = this.context;
            if (activityOptions != null) {
                ContextCompat.startActivity(context, intent2, activityOptions.toBundle());
            } else {
                context.startActivity(intent2);
            }
        } else {
            this.context.startActivity(intent2);
        }
        if (navOptions == null || this.hostActivity == null) {
            return null;
        }
        int enterAnim = navOptions.getEnterAnim();
        int exitAnim = navOptions.getExitAnim();
        if ((enterAnim <= 0 || !Intrinsics.areEqual(resources.getResourceTypeName(enterAnim), "animator")) && (exitAnim <= 0 || !Intrinsics.areEqual(resources.getResourceTypeName(exitAnim), "animator"))) {
            if (enterAnim < 0 && exitAnim < 0) {
                return null;
            }
            this.hostActivity.overridePendingTransition(RangesKt.coerceAtLeast(enterAnim, 0), RangesKt.coerceAtLeast(exitAnim, 0));
            return null;
        }
        Log.w(LOG_TAG, "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(enterAnim) + " and exit resource " + resources.getResourceName(exitAnim) + "when launching " + destination);
        return null;
    }

    @Override // androidx.navigation.Navigator
    public boolean popBackStack() {
        Activity activity = this.hostActivity;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/navigation/ActivityNavigator$Companion;", "", "()V", "EXTRA_NAV_CURRENT", "", "EXTRA_NAV_SOURCE", "EXTRA_POP_ENTER_ANIM", "EXTRA_POP_EXIT_ANIM", "LOG_TAG", "applyPopAnimationsToPendingTransition", "", "activity", "Landroid/app/Activity;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void applyPopAnimationsToPendingTransition(@NotNull Activity activity) {
            activity.getClass();
            Intent intent = activity.getIntent();
            if (intent == null) {
                return;
            }
            int intExtra = intent.getIntExtra(ActivityNavigator.EXTRA_POP_ENTER_ANIM, -1);
            int intExtra2 = intent.getIntExtra(ActivityNavigator.EXTRA_POP_EXIT_ANIM, -1);
            if (intExtra == -1 && intExtra2 == -1) {
                return;
            }
            if (intExtra == -1) {
                intExtra = 0;
            }
            if (intExtra2 == -1) {
                intExtra2 = 0;
            }
            activity.overridePendingTransition(intExtra, intExtra2);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0017J\u001c\u0010)\u001a\u0004\u0018\u00010\t2\u0006\u0010%\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010+\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0010\u0010,\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010\rJ\u0010\u0010.\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u0010\u0010/\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\tJ\u0010\u00100\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017J\u0010\u00101\u001a\u00020\u00002\b\u00102\u001a\u0004\u0018\u00010\tJ\b\u00103\u001a\u00020\u001eH\u0017J\b\u00104\u001a\u00020\tH\u0016R$\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\b\u001a\u0004\u0018\u00010\r8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u00118F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\"\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\b\u001a\u0004\u0018\u00010\u0017@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\f¨\u00065"}, d2 = {"Landroidx/navigation/ActivityNavigator$Destination;", "Landroidx/navigation/NavDestination;", "navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "(Landroidx/navigation/NavigatorProvider;)V", "activityNavigator", "Landroidx/navigation/Navigator;", "(Landroidx/navigation/Navigator;)V", "<set-?>", "", "action", "getAction", "()Ljava/lang/String;", "Landroid/content/ComponentName;", JsonFields.COMPONENT, "getComponent", "()Landroid/content/ComponentName;", "Landroid/net/Uri;", "data", "getData", "()Landroid/net/Uri;", "dataPattern", "getDataPattern", "Landroid/content/Intent;", "intent", "getIntent", "()Landroid/content/Intent;", "targetPackage", "getTargetPackage", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "onInflate", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "parseApplicationId", "pattern", "setAction", "setComponentName", "name", "setData", "setDataPattern", "setIntent", "setTargetPackage", "packageName", "supportsActions", "toString", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @NavDestination.ClassType(Activity.class)
    @SourceDebugExtension({"SMAP\nActivityNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator$Destination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,499:1\n232#2,3:500\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator$Destination\n*L\n256#1:500,3\n*E\n"})
    public static class Destination extends NavDestination {

        @Nullable
        private String action;

        @Nullable
        private ComponentName component;

        @Nullable
        private Uri data;

        @Nullable
        private String dataPattern;

        @Nullable
        private Intent intent;

        @Nullable
        private String targetPackage;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Destination(@NotNull NavigatorProvider navigatorProvider) {
            this((Navigator<? extends Destination>) navigatorProvider.getNavigator(ActivityNavigator.class));
            navigatorProvider.getClass();
        }

        private final String parseApplicationId(Context context, String pattern) {
            String replace$default;
            if (pattern == null) {
                return null;
            }
            String packageName = context.getPackageName();
            packageName.getClass();
            replace$default = StringsKt__StringsJVMKt.replace$default(pattern, NavInflater.APPLICATION_ID_PLACEHOLDER, packageName, false, 4, (Object) null);
            return replace$default;
        }

        @Override // androidx.navigation.NavDestination
        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other != null && (other instanceof Destination) && super.equals(other)) {
                Intent intent = this.intent;
                if ((intent != null ? intent.filterEquals(((Destination) other).intent) : ((Destination) other).intent == null) && Intrinsics.areEqual(this.dataPattern, ((Destination) other).dataPattern)) {
                    return true;
                }
            }
            return false;
        }

        @Nullable
        public final String getAction() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        @Nullable
        public final ComponentName getComponent() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        @Nullable
        public final Uri getData() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @Nullable
        public final String getDataPattern() {
            return this.dataPattern;
        }

        @Nullable
        public final Intent getIntent() {
            return this.intent;
        }

        @Nullable
        public final String getTargetPackage() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getPackage();
            }
            return null;
        }

        @Override // androidx.navigation.NavDestination
        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            Intent intent = this.intent;
            int filterHashCode = (hashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.dataPattern;
            return filterHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.NavDestination
        @CallSuper
        public void onInflate(@NotNull Context context, @NotNull AttributeSet attrs) {
            context.getClass();
            attrs.getClass();
            super.onInflate(context, attrs);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, R.styleable.ActivityNavigator);
            obtainAttributes.getClass();
            setTargetPackage(parseApplicationId(context, obtainAttributes.getString(R.styleable.ActivityNavigator_targetPackage)));
            String string = obtainAttributes.getString(R.styleable.ActivityNavigator_android_name);
            if (string != null) {
                if (string.charAt(0) == '.') {
                    string = context.getPackageName() + string;
                }
                setComponentName(new ComponentName(context, string));
            }
            setAction(obtainAttributes.getString(R.styleable.ActivityNavigator_action));
            String parseApplicationId = parseApplicationId(context, obtainAttributes.getString(R.styleable.ActivityNavigator_data));
            if (parseApplicationId != null) {
                setData(Uri.parse(parseApplicationId));
            }
            setDataPattern(parseApplicationId(context, obtainAttributes.getString(R.styleable.ActivityNavigator_dataPattern)));
            obtainAttributes.recycle();
        }

        @NotNull
        public final Destination setAction(@Nullable String action) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            intent.getClass();
            intent.setAction(action);
            return this;
        }

        @NotNull
        public final Destination setComponentName(@Nullable ComponentName name) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            intent.getClass();
            intent.setComponent(name);
            return this;
        }

        @NotNull
        public final Destination setData(@Nullable Uri data) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            intent.getClass();
            intent.setData(data);
            return this;
        }

        @NotNull
        public final Destination setDataPattern(@Nullable String dataPattern) {
            this.dataPattern = dataPattern;
            return this;
        }

        @NotNull
        public final Destination setIntent(@Nullable Intent intent) {
            this.intent = intent;
            return this;
        }

        @NotNull
        public final Destination setTargetPackage(@Nullable String packageName) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            intent.getClass();
            intent.setPackage(packageName);
            return this;
        }

        @Override // androidx.navigation.NavDestination
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public boolean supportsActions() {
            return false;
        }

        @Override // androidx.navigation.NavDestination
        @NotNull
        public String toString() {
            ComponentName component = getComponent();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (component != null) {
                sb.append(" class=");
                sb.append(component.getClassName());
            } else {
                String action = getAction();
                if (action != null) {
                    sb.append(" action=");
                    sb.append(action);
                }
            }
            return sb.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Destination(@NotNull Navigator<? extends Destination> navigator) {
            super(navigator);
            navigator.getClass();
        }
    }
}
