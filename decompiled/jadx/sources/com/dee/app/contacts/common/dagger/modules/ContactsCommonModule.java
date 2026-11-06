package com.dee.app.contacts.common.dagger.modules;

import android.content.Context;
import androidx.annotation.Nullable;
import com.amazon.commscore.api.identity.AlexaCommsCoreIdentityService;
import com.amazon.commscore.api.metrics.AlexaCommsCoreMetricsService;
import com.dee.app.contacts.common.utils.ActivityLifecycleUtil;
import com.dee.app.contacts.common.utils.ContactsMetricsRecorder;
import com.dee.app.contacts.common.utils.NetworkUtils;
import com.dee.app.contacts.common.utils.PermissionsUtils;
import com.dee.app.contacts.common.utils.UserAgent;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes6.dex */
public class ContactsCommonModule {
    @Provides
    public ContactsMetricsRecorder getContactsMetricsRecorder(AlexaCommsCoreMetricsService alexaCommsCoreMetricsService) {
        return new ContactsMetricsRecorder(alexaCommsCoreMetricsService);
    }

    @Provides
    public NetworkUtils getNetworkUtils(@Nullable AlexaCommsCoreIdentityService alexaCommsCoreIdentityService) {
        return new NetworkUtils(alexaCommsCoreIdentityService);
    }

    @Provides
    public PermissionsUtils getPermissionsUtils(ActivityLifecycleUtil activityLifecycleUtil, Context context) {
        return new PermissionsUtils(activityLifecycleUtil, context);
    }

    @Provides
    public UserAgent getUserAgent(@Named("ApplicationName") String str) {
        return new UserAgent(str);
    }
}
