package com.mapbox.common.location;

import android.app.Activity;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0011\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0016J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0011H\u0016J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0011H\u0016J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u000f2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0011H\u0016J\f\u0010\u0012\u001a\u00060\u0004j\u0002`\u0005H\u0016J\r\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J'\u0010\u0013\u001a\u00028\u0000\"\n\b\u0001\u0010\u0015*\u0004\u0018\u00010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0018H\u0016¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0016R\u0012\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/mapbox/common/location/FailedTask;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/google/android/gms/tasks/Task;", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "addOnCanceledListener", "p0", "Lcom/google/android/gms/tasks/OnCanceledListener;", "addOnFailureListener", "Landroid/app/Activity;", "p1", "Lcom/google/android/gms/tasks/OnFailureListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljava/util/concurrent/Executor;", "addOnSuccessListener", "Lcom/google/android/gms/tasks/OnSuccessListener;", "getException", "getResult", "()Ljava/lang/Object;", "X", "", "exceptionType", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "isCanceled", "", "isComplete", "isSuccessful", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class FailedTask<T> extends Task<T> {

    @NotNull
    private final Exception exception;

    public FailedTask(@NotNull Exception exc) {
        exc.getClass();
        this.exception = exc;
    }

    @Override // com.google.android.gms.tasks.Task
    @NotNull
    public Task<T> addOnCanceledListener(@NotNull OnCanceledListener p0) {
        p0.getClass();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NotNull
    public Task<T> addOnFailureListener(@NotNull Executor p0, @NotNull OnFailureListener p1) {
        p0.getClass();
        p1.getClass();
        throw new NotImplementedError("Please use addOnFailureListener(listener: OnFailureListener)");
    }

    @Override // com.google.android.gms.tasks.Task
    @NotNull
    public Task<T> addOnSuccessListener(@NotNull Activity p0, @NotNull OnSuccessListener<? super T> p1) {
        p0.getClass();
        p1.getClass();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NotNull
    public Exception getException() {
        return this.exception;
    }

    @Override // com.google.android.gms.tasks.Task
    public <X extends Throwable> T getResult(@NotNull Class<X> exceptionType) {
        exceptionType.getClass();
        boolean isInstance = exceptionType.isInstance(this.exception);
        Exception exc = this.exception;
        if (isInstance) {
            throw exc;
        }
        throw new RuntimeExecutionException(exc);
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isCanceled() {
        return false;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isComplete() {
        return true;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isSuccessful() {
        return false;
    }

    @Override // com.google.android.gms.tasks.Task
    @NotNull
    public Task<T> addOnSuccessListener(@NotNull OnSuccessListener<? super T> p0) {
        p0.getClass();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NotNull
    public Task<T> addOnSuccessListener(@NotNull Executor p0, @NotNull OnSuccessListener<? super T> p1) {
        p0.getClass();
        p1.getClass();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NotNull
    public Task<T> addOnFailureListener(@NotNull OnFailureListener listener) {
        listener.getClass();
        listener.onFailure(this.exception);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NotNull
    public Task<T> addOnFailureListener(@NotNull Activity p0, @NotNull OnFailureListener p1) {
        p0.getClass();
        p1.getClass();
        throw new NotImplementedError("Please use addOnFailureListener(listener: OnFailureListener)");
    }

    @Override // com.google.android.gms.tasks.Task
    public T getResult() {
        throw new RuntimeExecutionException(this.exception);
    }
}
