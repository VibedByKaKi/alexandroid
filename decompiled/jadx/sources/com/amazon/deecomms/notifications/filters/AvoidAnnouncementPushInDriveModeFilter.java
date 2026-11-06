package com.amazon.deecomms.notifications.filters;

import android.os.Bundle;
import com.amazon.deecomms.common.processor.Task;
import com.amazon.deecomms.notifications.PushProcessStatus;
import com.amazon.deecomms.notifications.PushTypeHelper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class AvoidAnnouncementPushInDriveModeFilter implements Task<PushProcessStatus, Bundle> {
    @Override // com.amazon.deecomms.common.processor.Task
    public PushProcessStatus execute(Bundle bundle) {
        PushTypeHelper.PushType determineType = PushTypeHelper.determineType(bundle.getString("amznMessage"));
        return (determineType == PushTypeHelper.PushType.AudioAnnouncement || determineType == PushTypeHelper.PushType.TextAnnouncement) ? PushProcessStatus.CONTINUE : PushProcessStatus.CONTINUE;
    }
}
