package com.amazon.dee.app.jobs;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.app.notification.util.Constants;
import com.amazon.alexa.protocols.jobs.JobIDProvider;
import com.amazon.dee.app.services.logging.Log;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class StaticJobIDProvider implements JobIDProvider {
    private static final String TAG = Log.tag((Class<?>) StaticJobIDProvider.class);
    private static final Map<String, Integer> jobIdMap;

    static {
        HashMap hashMap = new HashMap();
        jobIdMap = hashMap;
        TableInfo$$ExternalSyntheticOutline0.m(53259213, hashMap, "com.amazon.dee.app.services.conversation.FireOSDirectiveHandlerService", Constants.AMAZON_MESSAGE_RECEIVER_JOB_ID, "com.amazon.dee.app.services.messaging.AmazonMessageReceiver");
        hashMap.put("com.amazon.alexa.system.UserInactivityAuthority.UserInactivityReportingJob", 234613);
    }

    public StaticJobIDProvider(@NonNull Context context) {
    }

    public static int getJobIdentification(@NonNull Class cls) {
        String canonicalName = cls.getCanonicalName();
        Map<String, Integer> map = jobIdMap;
        if (map.containsKey(canonicalName)) {
            return map.get(canonicalName).intValue();
        }
        return -1;
    }

    @Override // com.amazon.alexa.protocols.jobs.JobIDProvider
    public int getJobId(@NonNull Class cls) {
        return getJobIdentification(cls);
    }
}
