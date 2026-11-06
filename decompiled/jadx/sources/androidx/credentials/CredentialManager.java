package androidx.credentials;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.os.CancellationSignal;
import androidx.annotation.RequiresApi;
import androidx.credentials.PrepareGetCredentialResponse;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.webkit.WebStorageCompat$$ExternalSyntheticLambda0;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 '2\u00020\u0001:\u0001'J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010\u0006J8\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\rH&J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J>\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00142\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170\rH&J\b\u0010\u0018\u001a\u00020\u0019H'J\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0097@¢\u0006\u0002\u0010 J>\u0010!\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u001c2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\"0\rH&J>\u0010!\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\"0\rH'J\u0016\u0010#\u001a\u00020$2\u0006\u0010\u0004\u001a\u00020\u001cH\u0097@¢\u0006\u0002\u0010%J6\u0010&\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u001c2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\"0\rH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006(À\u0006\u0001"}, d2 = {"Landroidx/credentials/CredentialManager;", "", "clearCredentialState", "", MissingTokenPull.TRIGGER_REQUEST, "Landroidx/credentials/ClearCredentialStateRequest;", "(Landroidx/credentials/ClearCredentialStateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearCredentialStateAsync", "cancellationSignal", "Landroid/os/CancellationSignal;", "executor", "Ljava/util/concurrent/Executor;", "callback", "Landroidx/credentials/CredentialManagerCallback;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "createCredential", "Landroidx/credentials/CreateCredentialResponse;", "context", "Landroid/content/Context;", "Landroidx/credentials/CreateCredentialRequest;", "(Landroid/content/Context;Landroidx/credentials/CreateCredentialRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCredentialAsync", "Landroidx/credentials/exceptions/CreateCredentialException;", "createSettingsPendingIntent", "Landroid/app/PendingIntent;", "getCredential", "Landroidx/credentials/GetCredentialResponse;", "Landroidx/credentials/GetCredentialRequest;", "(Landroid/content/Context;Landroidx/credentials/GetCredentialRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pendingGetCredentialHandle", "Landroidx/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;", "(Landroid/content/Context;Landroidx/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCredentialAsync", "Landroidx/credentials/exceptions/GetCredentialException;", "prepareGetCredential", "Landroidx/credentials/PrepareGetCredentialResponse;", "(Landroidx/credentials/GetCredentialRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prepareGetCredentialAsync", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ObsoleteSdkInt"})
@SourceDebugExtension({"SMAP\nCredentialManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CredentialManager.kt\nandroidx/credentials/CredentialManager\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,475:1\n314#2,11:476\n314#2,11:487\n314#2,11:498\n314#2,11:509\n314#2,11:520\n*S KotlinDebug\n*F\n+ 1 CredentialManager.kt\nandroidx/credentials/CredentialManager\n*L\n110#1:476,11\n163#1:487,11\n210#1:498,11\n257#1:509,11\n309#1:520,11\n*E\n"})
/* loaded from: classes13.dex */
public interface CredentialManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/credentials/CredentialManager$Companion;", "", "()V", "create", "Landroidx/credentials/CredentialManager;", "context", "Landroid/content/Context;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final CredentialManager create(@NotNull Context context) {
            context.getClass();
            return new CredentialManagerImpl(context);
        }
    }

    static /* synthetic */ Object clearCredentialState$suspendImpl(CredentialManager credentialManager, ClearCredentialStateRequest clearCredentialStateRequest, Continuation<? super Unit> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellationSignal cancellationSignal = new CancellationSignal();
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: androidx.credentials.CredentialManager$clearCredentialState$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                cancellationSignal.cancel();
            }
        });
        credentialManager.clearCredentialStateAsync(clearCredentialStateRequest, cancellationSignal, new WebStorageCompat$$ExternalSyntheticLambda0(3), new CredentialManagerCallback<Void, ClearCredentialException>() { // from class: androidx.credentials.CredentialManager$clearCredentialState$2$callback$1
            @Override // androidx.credentials.CredentialManagerCallback
            public void onError(ClearCredentialException e) {
                e.getClass();
                if (cancellableContinuationImpl.isActive()) {
                    CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m25294constructorimpl(ResultKt.createFailure(e)));
                }
            }

            @Override // androidx.credentials.CredentialManagerCallback
            public void onResult(Void result) {
                if (cancellableContinuationImpl.isActive()) {
                    CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m25294constructorimpl(Unit.INSTANCE));
                }
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    @JvmStatic
    @NotNull
    static CredentialManager create(@NotNull Context context) {
        return INSTANCE.create(context);
    }

    static /* synthetic */ Object createCredential$suspendImpl(CredentialManager credentialManager, Context context, CreateCredentialRequest createCredentialRequest, Continuation<? super CreateCredentialResponse> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellationSignal cancellationSignal = new CancellationSignal();
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: androidx.credentials.CredentialManager$createCredential$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                cancellationSignal.cancel();
            }
        });
        credentialManager.createCredentialAsync(context, createCredentialRequest, cancellationSignal, new WebStorageCompat$$ExternalSyntheticLambda0(3), new CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException>() { // from class: androidx.credentials.CredentialManager$createCredential$2$callback$1
            @Override // androidx.credentials.CredentialManagerCallback
            public void onError(CreateCredentialException e) {
                e.getClass();
                if (cancellableContinuationImpl.isActive()) {
                    CancellableContinuation<CreateCredentialResponse> cancellableContinuation = cancellableContinuationImpl;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m25294constructorimpl(ResultKt.createFailure(e)));
                }
            }

            @Override // androidx.credentials.CredentialManagerCallback
            public void onResult(CreateCredentialResponse result) {
                result.getClass();
                if (cancellableContinuationImpl.isActive()) {
                    cancellableContinuationImpl.resumeWith(Result.m25294constructorimpl(result));
                }
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    static /* synthetic */ Object getCredential$suspendImpl(CredentialManager credentialManager, Context context, GetCredentialRequest getCredentialRequest, Continuation<? super GetCredentialResponse> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellationSignal cancellationSignal = new CancellationSignal();
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: androidx.credentials.CredentialManager$getCredential$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                cancellationSignal.cancel();
            }
        });
        credentialManager.getCredentialAsync(context, getCredentialRequest, cancellationSignal, new WebStorageCompat$$ExternalSyntheticLambda0(3), new CredentialManagerCallback<GetCredentialResponse, GetCredentialException>() { // from class: androidx.credentials.CredentialManager$getCredential$2$callback$1
            @Override // androidx.credentials.CredentialManagerCallback
            public void onError(GetCredentialException e) {
                e.getClass();
                if (cancellableContinuationImpl.isActive()) {
                    CancellableContinuation<GetCredentialResponse> cancellableContinuation = cancellableContinuationImpl;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m25294constructorimpl(ResultKt.createFailure(e)));
                }
            }

            @Override // androidx.credentials.CredentialManagerCallback
            public void onResult(GetCredentialResponse result) {
                result.getClass();
                if (cancellableContinuationImpl.isActive()) {
                    cancellableContinuationImpl.resumeWith(Result.m25294constructorimpl(result));
                }
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @RequiresApi(34)
    static /* synthetic */ Object prepareGetCredential$suspendImpl(CredentialManager credentialManager, GetCredentialRequest getCredentialRequest, Continuation<? super PrepareGetCredentialResponse> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellationSignal cancellationSignal = new CancellationSignal();
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: androidx.credentials.CredentialManager$prepareGetCredential$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                cancellationSignal.cancel();
            }
        });
        credentialManager.prepareGetCredentialAsync(getCredentialRequest, cancellationSignal, new WebStorageCompat$$ExternalSyntheticLambda0(3), new CredentialManagerCallback<PrepareGetCredentialResponse, GetCredentialException>() { // from class: androidx.credentials.CredentialManager$prepareGetCredential$2$callback$1
            @Override // androidx.credentials.CredentialManagerCallback
            public void onError(GetCredentialException e) {
                e.getClass();
                if (cancellableContinuationImpl.isActive()) {
                    CancellableContinuation<PrepareGetCredentialResponse> cancellableContinuation = cancellableContinuationImpl;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m25294constructorimpl(ResultKt.createFailure(e)));
                }
            }

            @Override // androidx.credentials.CredentialManagerCallback
            public void onResult(PrepareGetCredentialResponse result) {
                result.getClass();
                if (cancellableContinuationImpl.isActive()) {
                    cancellableContinuationImpl.resumeWith(Result.m25294constructorimpl(result));
                }
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Nullable
    default Object clearCredentialState(@NotNull ClearCredentialStateRequest clearCredentialStateRequest, @NotNull Continuation<? super Unit> continuation) {
        return clearCredentialState$suspendImpl(this, clearCredentialStateRequest, continuation);
    }

    void clearCredentialStateAsync(@NotNull ClearCredentialStateRequest request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull CredentialManagerCallback<Void, ClearCredentialException> callback);

    @Nullable
    default Object createCredential(@NotNull Context context, @NotNull CreateCredentialRequest createCredentialRequest, @NotNull Continuation<? super CreateCredentialResponse> continuation) {
        return createCredential$suspendImpl(this, context, createCredentialRequest, continuation);
    }

    void createCredentialAsync(@NotNull Context context, @NotNull CreateCredentialRequest request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> callback);

    @RequiresApi(34)
    @NotNull
    PendingIntent createSettingsPendingIntent();

    @Nullable
    default Object getCredential(@NotNull Context context, @NotNull GetCredentialRequest getCredentialRequest, @NotNull Continuation<? super GetCredentialResponse> continuation) {
        return getCredential$suspendImpl(this, context, getCredentialRequest, continuation);
    }

    void getCredentialAsync(@NotNull Context context, @NotNull GetCredentialRequest request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull CredentialManagerCallback<GetCredentialResponse, GetCredentialException> callback);

    @RequiresApi(34)
    void getCredentialAsync(@NotNull Context context, @NotNull PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull CredentialManagerCallback<GetCredentialResponse, GetCredentialException> callback);

    @RequiresApi(34)
    @Nullable
    default Object prepareGetCredential(@NotNull GetCredentialRequest getCredentialRequest, @NotNull Continuation<? super PrepareGetCredentialResponse> continuation) {
        return prepareGetCredential$suspendImpl(this, getCredentialRequest, continuation);
    }

    @RequiresApi(34)
    void prepareGetCredentialAsync(@NotNull GetCredentialRequest request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull CredentialManagerCallback<PrepareGetCredentialResponse, GetCredentialException> callback);

    @RequiresApi(34)
    @Nullable
    default Object getCredential(@NotNull Context context, @NotNull PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle, @NotNull Continuation<? super GetCredentialResponse> continuation) {
        return getCredential$suspendImpl(this, context, pendingGetCredentialHandle, continuation);
    }

    @RequiresApi(34)
    static /* synthetic */ Object getCredential$suspendImpl(CredentialManager credentialManager, Context context, PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle, Continuation<? super GetCredentialResponse> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellationSignal cancellationSignal = new CancellationSignal();
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: androidx.credentials.CredentialManager$getCredential$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                cancellationSignal.cancel();
            }
        });
        credentialManager.getCredentialAsync(context, pendingGetCredentialHandle, cancellationSignal, new WebStorageCompat$$ExternalSyntheticLambda0(3), new CredentialManagerCallback<GetCredentialResponse, GetCredentialException>() { // from class: androidx.credentials.CredentialManager$getCredential$4$callback$1
            @Override // androidx.credentials.CredentialManagerCallback
            public void onError(GetCredentialException e) {
                e.getClass();
                if (cancellableContinuationImpl.isActive()) {
                    CancellableContinuation<GetCredentialResponse> cancellableContinuation = cancellableContinuationImpl;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m25294constructorimpl(ResultKt.createFailure(e)));
                }
            }

            @Override // androidx.credentials.CredentialManagerCallback
            public void onResult(GetCredentialResponse result) {
                result.getClass();
                if (cancellableContinuationImpl.isActive()) {
                    cancellableContinuationImpl.resumeWith(Result.m25294constructorimpl(result));
                }
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
