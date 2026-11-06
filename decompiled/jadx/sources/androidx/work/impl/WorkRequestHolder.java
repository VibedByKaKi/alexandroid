package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.WorkRequest;
import androidx.work.impl.model.WorkSpec;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes14.dex */
public class WorkRequestHolder extends WorkRequest {
    public WorkRequestHolder(@NonNull UUID uuid, @NonNull WorkSpec workSpec, @NonNull Set<String> set) {
        super(uuid, workSpec, set);
    }
}
