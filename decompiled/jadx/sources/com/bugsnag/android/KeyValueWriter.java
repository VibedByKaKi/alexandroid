package com.bugsnag.android;

import com.amazon.clouddrive.extended.model.BulkOperationType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001J\b\u0010\u000b\u001a\u00020\tH\u0016R\u0012\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bugsnag/android/KeyValueWriter;", "", "()V", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", BulkOperationType.add, "", "key", "", "value", "toString", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
final class KeyValueWriter {
    private final StringBuilder sb = new StringBuilder();

    public final void add(@NotNull String key, @NotNull Object value) {
        key.getClass();
        value.getClass();
        this.sb.append(key + '=' + value);
        this.sb.append("\n");
    }

    @NotNull
    public String toString() {
        return this.sb.toString();
    }
}
