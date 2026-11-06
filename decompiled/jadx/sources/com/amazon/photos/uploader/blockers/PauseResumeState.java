package com.amazon.photos.uploader.blockers;

import android.content.SharedPreferences;
import androidx.work.Operation;
import com.amazon.photos.uploader.SchedulingCallback;
import com.amazon.photos.uploader.UploadFrameworkContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/amazon/photos/uploader/blockers/PauseResumeState;", "", "context", "Lcom/amazon/photos/uploader/UploadFrameworkContext;", "schedulingCallback", "Lcom/amazon/photos/uploader/SchedulingCallback;", "(Lcom/amazon/photos/uploader/UploadFrameworkContext;Lcom/amazon/photos/uploader/SchedulingCallback;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "clearState", "", "getPauseResumeState", "", "setPauseResumeState", "Landroidx/work/Operation;", "state", "Companion", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PauseResumeState {

    @NotNull
    public static final String PAUSE_RESUME_STATE_PREFERENCES = "UPLOADER_PAUSE_RESUME_STATE";

    @NotNull
    public static final String UPLOAD_PAUSE_RESUME_STATE = "UPLOAD_PAUSE_RESUME_STATE";

    @NotNull
    private final SchedulingCallback schedulingCallback;
    private final SharedPreferences sharedPreferences;

    public PauseResumeState(@NotNull UploadFrameworkContext uploadFrameworkContext, @NotNull SchedulingCallback schedulingCallback) {
        uploadFrameworkContext.getClass();
        schedulingCallback.getClass();
        this.schedulingCallback = schedulingCallback;
        this.sharedPreferences = uploadFrameworkContext.getApplicationContext().getSharedPreferences("UPLOADER_PAUSE_RESUME_STATE_" + uploadFrameworkContext.getHashedDirectedId() + ')', 0);
    }

    public final void clearState() {
        this.sharedPreferences.edit().clear().apply();
    }

    @NotNull
    public final String getPauseResumeState() {
        String string = this.sharedPreferences.getString(UPLOAD_PAUSE_RESUME_STATE, "RESUME");
        return string == null ? "RESUME" : string;
    }

    @Nullable
    public final Operation setPauseResumeState(@NotNull String state) {
        state.getClass();
        if (Intrinsics.areEqual(state, getPauseResumeState())) {
            return null;
        }
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putString(UPLOAD_PAUSE_RESUME_STATE, state);
        edit.apply();
        return this.schedulingCallback.reevaluateBlockers();
    }
}
