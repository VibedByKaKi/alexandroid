package com.amazon.comms.calling.domain.model;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\rJ\u000b\u0010\u000e\u001a\u00028\u0000¢\u0006\u0002\u0010\rR\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/amazon/comms/calling/domain/model/SingleEvent;", ExifInterface.GPS_DIRECTION_TRUE, "", "content", "<init>", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "value", "", "hasBeenHandled", "getHasBeenHandled", "()Z", "getContentIfNotHandled", "()Ljava/lang/Object;", "peekContent", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public class SingleEvent<T> {
    private final T content;
    private boolean hasBeenHandled;

    public SingleEvent(T t) {
        this.content = t;
    }

    @Nullable
    public final T getContentIfNotHandled() {
        if (this.hasBeenHandled) {
            return null;
        }
        this.hasBeenHandled = true;
        return this.content;
    }

    public final boolean getHasBeenHandled() {
        return this.hasBeenHandled;
    }

    public final T peekContent() {
        return this.content;
    }
}
