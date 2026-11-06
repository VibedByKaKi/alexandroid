package com.amazon.deecomms.perms;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.amazon.deecomms.util.IBuildVersionProvider;
import java.util.Arrays;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes5.dex */
public class VoicePermissionsAuthority {
    private static final String[] MINIMUM_PERMISSIONS = {"android.permission.RECORD_AUDIO"};
    private static final String TAG = "VoicePermissionsAuthority";
    private IBuildVersionProvider mBuildVersionProvider;
    private Context mContext;

    @Inject
    public VoicePermissionsAuthority(Context context, IBuildVersionProvider iBuildVersionProvider) {
        this.mContext = context;
        this.mBuildVersionProvider = iBuildVersionProvider;
    }

    public static String[] getMinimumPermissions() {
        String[] strArr = MINIMUM_PERMISSIONS;
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    private boolean hasPermissions(@NonNull String[] strArr) {
        if (this.mBuildVersionProvider.getCurrentBuildVersion() < 23) {
            return true;
        }
        for (String str : strArr) {
            if (ContextCompat.checkSelfPermission(this.mContext, str) != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean hasMinimumPermissions() {
        return hasPermissions(MINIMUM_PERMISSIONS);
    }
}
