package dagger.android;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.ContentProvider;
import android.content.Context;
import android.util.Log;
import dagger.internal.Preconditions;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class AndroidInjection {
    private static final String TAG = "dagger.android";

    private AndroidInjection() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static HasAndroidInjector findHasAndroidInjectorForFragment(Fragment fragment) {
        Fragment fragment2 = fragment;
        do {
            fragment2 = fragment2.getParentFragment();
            if (fragment2 == 0) {
                Activity activity = fragment.getActivity();
                if (activity instanceof HasAndroidInjector) {
                    return (HasAndroidInjector) activity;
                }
                if (activity.getApplication() instanceof HasAndroidInjector) {
                    return (HasAndroidInjector) activity.getApplication();
                }
                Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("No injector was found for ", fragment.getClass().getCanonicalName()));
                return null;
            }
        } while (!(fragment2 instanceof HasAndroidInjector));
        return (HasAndroidInjector) fragment2;
    }

    public static void inject(Fragment fragment) {
        Preconditions.checkNotNull(fragment, "fragment");
        HasAndroidInjector findHasAndroidInjectorForFragment = findHasAndroidInjectorForFragment(fragment);
        if (Log.isLoggable(TAG, 3)) {
            String canonicalName = fragment.getClass().getCanonicalName();
            String canonicalName2 = findHasAndroidInjectorForFragment.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder("An injector for ");
            sb.append(canonicalName);
            sb.append(" was found in ");
            sb.append(canonicalName2);
        }
        inject(fragment, findHasAndroidInjectorForFragment);
    }

    public static void inject(Activity activity) {
        Preconditions.checkNotNull(activity, "activity");
        ComponentCallbacks2 application = activity.getApplication();
        if (application instanceof HasAndroidInjector) {
            inject(activity, (HasAndroidInjector) application);
        } else {
            Single$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m$1(application.getClass().getCanonicalName(), " does not implement ", HasAndroidInjector.class.getCanonicalName()));
        }
    }

    public static void inject(Service service) {
        Preconditions.checkNotNull(service, "service");
        ComponentCallbacks2 application = service.getApplication();
        if (application instanceof HasAndroidInjector) {
            inject(service, (HasAndroidInjector) application);
        } else {
            Single$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m$1(application.getClass().getCanonicalName(), " does not implement ", HasAndroidInjector.class.getCanonicalName()));
        }
    }

    public static void inject(BroadcastReceiver broadcastReceiver, Context context) {
        Preconditions.checkNotNull(broadcastReceiver, "broadcastReceiver");
        Preconditions.checkNotNull(context, "context");
        ComponentCallbacks2 componentCallbacks2 = (Application) context.getApplicationContext();
        if (componentCallbacks2 instanceof HasAndroidInjector) {
            inject(broadcastReceiver, (HasAndroidInjector) componentCallbacks2);
        } else {
            Single$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m$1(componentCallbacks2.getClass().getCanonicalName(), " does not implement ", HasAndroidInjector.class.getCanonicalName()));
        }
    }

    public static void inject(ContentProvider contentProvider) {
        Preconditions.checkNotNull(contentProvider, "contentProvider");
        ComponentCallbacks2 componentCallbacks2 = (Application) contentProvider.getContext().getApplicationContext();
        if (componentCallbacks2 instanceof HasAndroidInjector) {
            inject(contentProvider, (HasAndroidInjector) componentCallbacks2);
        } else {
            Single$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m$1(componentCallbacks2.getClass().getCanonicalName(), " does not implement ", HasAndroidInjector.class.getCanonicalName()));
        }
    }

    private static void inject(Object obj, HasAndroidInjector hasAndroidInjector) {
        AndroidInjector<Object> androidInjector = hasAndroidInjector.androidInjector();
        Preconditions.checkNotNull(androidInjector, "%s.androidInjector() returned null", hasAndroidInjector.getClass());
        androidInjector.inject(obj);
    }
}
