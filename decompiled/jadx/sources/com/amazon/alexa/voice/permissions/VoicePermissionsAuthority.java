package com.amazon.alexa.voice.permissions;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.amazon.alexa.protocols.lifecycle.ApplicationLifecycleObserver;
import com.amazon.alexa.protocols.lifecycle.ApplicationLifecycleService;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.Arrays;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes19.dex */
public class VoicePermissionsAuthority implements ApplicationLifecycleObserver {
    private static final String TAG = "VoicePermissionsAuthority";
    private final BehaviorSubject<Boolean> allPermissionsBehaviorSubject;
    private final ApplicationLifecycleService applicationLifecycleService;
    private final Context context;
    private final BehaviorSubject<Boolean> minimumPermissionsBehaviorSubject;
    private static final String[] MINIMUM_PERMISSIONS = {"android.permission.RECORD_AUDIO"};
    private static final String[] ALL_PERMISSIONS = {"android.permission.RECORD_AUDIO", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};

    @Inject
    public VoicePermissionsAuthority(Context context, ApplicationLifecycleService applicationLifecycleService) {
        this.context = context;
        this.minimumPermissionsBehaviorSubject = BehaviorSubject.createDefault(Boolean.valueOf(PermissionsUtils.hasPermissions(context, MINIMUM_PERMISSIONS)));
        this.allPermissionsBehaviorSubject = BehaviorSubject.createDefault(Boolean.valueOf(PermissionsUtils.hasPermissions(context, ALL_PERMISSIONS)));
        this.applicationLifecycleService = applicationLifecycleService;
        applicationLifecycleService.addObserver(this);
    }

    public static String[] getAllPermissions() {
        String[] strArr = ALL_PERMISSIONS;
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public static String[] getMinimumPermissions() {
        String[] strArr = MINIMUM_PERMISSIONS;
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    private boolean hasPermissions(@NonNull String[] strArr) {
        for (String str : strArr) {
            if (ContextCompat.checkSelfPermission(this.context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    public BehaviorSubject<Boolean> allPermissions() {
        return this.allPermissionsBehaviorSubject;
    }

    public boolean hasAllPermissions() {
        return hasPermissions(ALL_PERMISSIONS);
    }

    public boolean hasMinimumPermissions() {
        return hasPermissions(MINIMUM_PERMISSIONS);
    }

    public BehaviorSubject<Boolean> minimumPermissions() {
        return this.minimumPermissionsBehaviorSubject;
    }

    @Override // com.amazon.alexa.protocols.lifecycle.ApplicationLifecycleObserver
    public void onStart() {
        update();
    }

    public synchronized void release() {
        this.applicationLifecycleService.removeObserver(this);
    }

    public synchronized void update() {
        try {
            boolean hasMinimumPermissions = hasMinimumPermissions();
            if (this.minimumPermissionsBehaviorSubject.getValue().booleanValue() != hasMinimumPermissions) {
                Log.i(TAG, "minimumPermissionsBehaviorSubject?: " + hasMinimumPermissions);
                this.minimumPermissionsBehaviorSubject.onNext(Boolean.valueOf(hasMinimumPermissions));
            }
            boolean hasAllPermissions = hasAllPermissions();
            if (this.allPermissionsBehaviorSubject.getValue().booleanValue() != hasAllPermissions) {
                Log.i(TAG, "allPermissionsBehaviorSubject?: " + hasAllPermissions);
                this.allPermissionsBehaviorSubject.onNext(Boolean.valueOf(hasAllPermissions));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.amazon.alexa.protocols.lifecycle.ApplicationLifecycleObserver
    public void onStop() {
    }
}
