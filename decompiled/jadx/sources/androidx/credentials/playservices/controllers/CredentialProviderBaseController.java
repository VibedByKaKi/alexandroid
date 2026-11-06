package androidx.credentials.playservices.controllers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialInterruptedException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.exifinterface.media.ExifInterface;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0010\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0004J!\u0010\r\u001a\u0004\u0018\u00010\b\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u0002H\u000e¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/credentials/playservices/controllers/CredentialProviderBaseController;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "generateHiddenActivityIntent", "", "resultReceiver", "Landroid/os/ResultReceiver;", "hiddenIntent", "Landroid/content/Intent;", "typeTag", "", "toIpcFriendlyResultReceiver", ExifInterface.GPS_DIRECTION_TRUE, "(Landroid/os/ResultReceiver;)Landroid/os/ResultReceiver;", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public class CredentialProviderBaseController {

    @NotNull
    public static final String ACTIVITY_REQUEST_CODE_TAG = "ACTIVITY_REQUEST_CODE";

    @NotNull
    public static final String BEGIN_SIGN_IN_TAG = "BEGIN_SIGN_IN";

    @NotNull
    public static final String CREATE_CANCELED = "CREATE_CANCELED";

    @NotNull
    public static final String CREATE_INTERRUPTED = "CREATE_INTERRUPTED";

    @NotNull
    public static final String CREATE_PASSWORD_TAG = "CREATE_PASSWORD";

    @NotNull
    public static final String CREATE_PUBLIC_KEY_CREDENTIAL_TAG = "CREATE_PUBLIC_KEY_CREDENTIAL";

    @NotNull
    public static final String CREATE_UNKNOWN = "CREATE_UNKNOWN";

    @NotNull
    public static final String EXCEPTION_MESSAGE_TAG = "EXCEPTION_MESSAGE";

    @NotNull
    public static final String EXCEPTION_TYPE_TAG = "EXCEPTION_TYPE";

    @NotNull
    public static final String EXTRA_GET_CREDENTIAL_INTENT = "EXTRA_GET_CREDENTIAL_INTENT";

    @NotNull
    public static final String FAILURE_RESPONSE_TAG = "FAILURE_RESPONSE";

    @NotNull
    public static final String GET_CANCELED = "GET_CANCELED_TAG";

    @NotNull
    public static final String GET_INTERRUPTED = "GET_INTERRUPTED";

    @NotNull
    public static final String GET_NO_CREDENTIALS = "GET_NO_CREDENTIALS";

    @NotNull
    public static final String GET_UNKNOWN = "GET_UNKNOWN";

    @NotNull
    public static final String REQUEST_TAG = "REQUEST_TYPE";

    @NotNull
    public static final String RESULT_DATA_TAG = "RESULT_DATA";

    @NotNull
    public static final String RESULT_RECEIVER_TAG = "RESULT_RECEIVER";

    @NotNull
    public static final String SIGN_IN_INTENT_TAG = "SIGN_IN_INTENT";

    @NotNull
    public static final String TYPE_TAG = "TYPE";

    @NotNull
    private final Context context;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Set<Integer> retryables = SetsKt.setOf((Object[]) new Integer[]{7, 20});
    private static final int CONTROLLER_REQUEST_CODE = 1;

    public CredentialProviderBaseController(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    public final void generateHiddenActivityIntent(@NotNull ResultReceiver resultReceiver, @NotNull Intent hiddenIntent, @NotNull String typeTag) {
        resultReceiver.getClass();
        hiddenIntent.getClass();
        typeTag.getClass();
        hiddenIntent.putExtra(TYPE_TAG, typeTag);
        hiddenIntent.putExtra(ACTIVITY_REQUEST_CODE_TAG, CONTROLLER_REQUEST_CODE);
        hiddenIntent.putExtra(RESULT_RECEIVER_TAG, toIpcFriendlyResultReceiver(resultReceiver));
        hiddenIntent.setFlags(65536);
    }

    @Nullable
    public final <T extends ResultReceiver> ResultReceiver toIpcFriendlyResultReceiver(T resultReceiver) {
        Parcel obtain = Parcel.obtain();
        obtain.getClass();
        resultReceiver.getClass();
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return resultReceiver2;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0002\b%J!\u0010&\u001a\u00020'2\b\u0010#\u001a\u0004\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0002\b(J!\u0010)\u001a\u00020**\u00020+2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0004H\u0000¢\u0006\u0002\b.J+\u0010/\u001a\u00020**\u00020+2\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\b\u00102\u001a\u0004\u0018\u000103H\u0000¢\u0006\u0002\b4R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u00020\u00078\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00065"}, d2 = {"Landroidx/credentials/playservices/controllers/CredentialProviderBaseController$Companion;", "", "()V", "ACTIVITY_REQUEST_CODE_TAG", "", "BEGIN_SIGN_IN_TAG", "CONTROLLER_REQUEST_CODE", "", "getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release$annotations", "getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release", "()I", CredentialProviderBaseController.CREATE_CANCELED, CredentialProviderBaseController.CREATE_INTERRUPTED, "CREATE_PASSWORD_TAG", "CREATE_PUBLIC_KEY_CREDENTIAL_TAG", CredentialProviderBaseController.CREATE_UNKNOWN, "EXCEPTION_MESSAGE_TAG", "EXCEPTION_TYPE_TAG", CredentialProviderBaseController.EXTRA_GET_CREDENTIAL_INTENT, "FAILURE_RESPONSE_TAG", "GET_CANCELED", CredentialProviderBaseController.GET_INTERRUPTED, CredentialProviderBaseController.GET_NO_CREDENTIALS, CredentialProviderBaseController.GET_UNKNOWN, "REQUEST_TAG", "RESULT_DATA_TAG", "RESULT_RECEIVER_TAG", "SIGN_IN_INTENT_TAG", "TYPE_TAG", "retryables", "", "getRetryables", "()Ljava/util/Set;", "createCredentialExceptionTypeToException", "Landroidx/credentials/exceptions/CreateCredentialException;", "typeName", "msg", "createCredentialExceptionTypeToException$credentials_play_services_auth_release", "getCredentialExceptionTypeToException", "Landroidx/credentials/exceptions/GetCredentialException;", "getCredentialExceptionTypeToException$credentials_play_services_auth_release", "reportError", "", "Landroid/os/ResultReceiver;", "errName", "errMsg", "reportError$credentials_play_services_auth_release", "reportResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "reportResult$credentials_play_services_auth_release", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CreateCredentialException createCredentialExceptionTypeToException$credentials_play_services_auth_release(@Nullable String typeName, @Nullable String msg) {
            return Intrinsics.areEqual(typeName, CredentialProviderBaseController.CREATE_CANCELED) ? new CreateCredentialCancellationException(msg) : Intrinsics.areEqual(typeName, CredentialProviderBaseController.CREATE_INTERRUPTED) ? new CreateCredentialInterruptedException(msg) : new CreateCredentialUnknownException(msg);
        }

        public final int getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release() {
            return CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        }

        @NotNull
        public final GetCredentialException getCredentialExceptionTypeToException$credentials_play_services_auth_release(@Nullable String typeName, @Nullable String msg) {
            if (typeName != null) {
                int hashCode = typeName.hashCode();
                if (hashCode != -1567968963) {
                    if (hashCode != -154594663) {
                        if (hashCode == 1996705159 && typeName.equals(CredentialProviderBaseController.GET_NO_CREDENTIALS)) {
                            return new NoCredentialException(msg);
                        }
                    } else if (typeName.equals(CredentialProviderBaseController.GET_INTERRUPTED)) {
                        return new GetCredentialInterruptedException(msg);
                    }
                } else if (typeName.equals(CredentialProviderBaseController.GET_CANCELED)) {
                    return new GetCredentialCancellationException(msg);
                }
            }
            return new GetCredentialUnknownException(msg);
        }

        @NotNull
        public final Set<Integer> getRetryables() {
            return CredentialProviderBaseController.retryables;
        }

        public final void reportError$credentials_play_services_auth_release(@NotNull ResultReceiver resultReceiver, @NotNull String str, @NotNull String str2) {
            resultReceiver.getClass();
            str.getClass();
            str2.getClass();
            Bundle bundle = new Bundle();
            bundle.putBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG, true);
            bundle.putString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG, str);
            bundle.putString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG, str2);
            resultReceiver.send(Integer.MAX_VALUE, bundle);
        }

        public final void reportResult$credentials_play_services_auth_release(@NotNull ResultReceiver resultReceiver, int i, int i2, @Nullable Intent intent) {
            resultReceiver.getClass();
            Bundle bundle = new Bundle();
            bundle.putBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG, false);
            bundle.putInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, i);
            bundle.putParcelable(CredentialProviderBaseController.RESULT_DATA_TAG, intent);
            resultReceiver.send(i2, bundle);
        }

        private Companion() {
        }

        @JvmStatic
        public static /* synthetic */ void getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release$annotations() {
        }
    }
}
