package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CameraImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class Camera2CameraImpl$ErrorTimeoutReopenScheduler$ScheduleNode$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Camera2CameraImpl.ErrorTimeoutReopenScheduler.ScheduleNode f$0;

    public /* synthetic */ Camera2CameraImpl$ErrorTimeoutReopenScheduler$ScheduleNode$$ExternalSyntheticLambda0(Camera2CameraImpl.ErrorTimeoutReopenScheduler.ScheduleNode scheduleNode, int i) {
        this.$r8$classId = i;
        this.f$0 = scheduleNode;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Camera2CameraImpl.ErrorTimeoutReopenScheduler.ScheduleNode scheduleNode = this.f$0;
        switch (i) {
            case 0:
                scheduleNode.execute();
                break;
            default:
                scheduleNode.executeInternal();
                break;
        }
    }
}
