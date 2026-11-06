package androidx.credentials.exceptions;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\b&\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\fB\u001b\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/credentials/exceptions/ClearCredentialException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "type", "", "errorMessage", "", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "getErrorMessage", "()Ljava/lang/CharSequence;", "getType", "()Ljava/lang/String;", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ClearCredentialException extends Exception {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String EXTRA_CLEAR_CREDENTIAL_EXCEPTION_MESSAGE = "androidx.credentials.provider.extra.CLEAR_CREDENTIAL_EXCEPTION_MESSAGE";

    @NotNull
    private static final String EXTRA_CLEAR_CREDENTIAL_EXCEPTION_TYPE = "androidx.credentials.provider.extra.CLEAR_CREDENTIAL_EXCEPTION_TYPE";

    @Nullable
    private final CharSequence errorMessage;

    @NotNull
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ClearCredentialException(@NotNull String str, @Nullable CharSequence charSequence) {
        super(charSequence != null ? charSequence.toString() : null);
        str.getClass();
        this.type = str;
        this.errorMessage = charSequence;
    }

    @JvmStatic
    @NotNull
    public static final Bundle asBundle(@NotNull ClearCredentialException clearCredentialException) {
        return INSTANCE.asBundle(clearCredentialException);
    }

    @JvmStatic
    @NotNull
    public static final ClearCredentialException fromBundle(@NotNull Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public CharSequence getErrorMessage() {
        return this.errorMessage;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public String getType() {
        return this.type;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/credentials/exceptions/ClearCredentialException$Companion;", "", "()V", "EXTRA_CLEAR_CREDENTIAL_EXCEPTION_MESSAGE", "", "EXTRA_CLEAR_CREDENTIAL_EXCEPTION_TYPE", "asBundle", "Landroid/os/Bundle;", "ex", "Landroidx/credentials/exceptions/ClearCredentialException;", "fromBundle", "bundle", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Bundle asBundle(@NotNull ClearCredentialException ex) {
            ex.getClass();
            Bundle bundle = new Bundle();
            bundle.putString(ClearCredentialException.EXTRA_CLEAR_CREDENTIAL_EXCEPTION_TYPE, ex.getType());
            CharSequence errorMessage = ex.getErrorMessage();
            if (errorMessage != null) {
                bundle.putCharSequence(ClearCredentialException.EXTRA_CLEAR_CREDENTIAL_EXCEPTION_MESSAGE, errorMessage);
            }
            return bundle;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        @JvmStatic
        @NotNull
        public final ClearCredentialException fromBundle(@NotNull Bundle bundle) {
            bundle.getClass();
            String string = bundle.getString(ClearCredentialException.EXTRA_CLEAR_CREDENTIAL_EXCEPTION_TYPE);
            if (string == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("Bundle was missing exception type.");
                return null;
            }
            CharSequence charSequence = bundle.getCharSequence(ClearCredentialException.EXTRA_CLEAR_CREDENTIAL_EXCEPTION_MESSAGE);
            switch (string.hashCode()) {
                case -404396566:
                    if (string.equals(ClearCredentialInterruptedException.TYPE_CLEAR_CREDENTIAL_INTERRUPTED_EXCEPTION)) {
                        return new ClearCredentialInterruptedException(charSequence);
                    }
                    break;
                case 1050953245:
                    if (string.equals(ClearCredentialUnsupportedException.TYPE_CLEAR_CREDENTIAL_UNSUPPORTED_EXCEPTION)) {
                        return new ClearCredentialUnsupportedException(charSequence);
                    }
                    break;
                case 1202393376:
                    if (string.equals(ClearCredentialProviderConfigurationException.TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION)) {
                        return new ClearCredentialProviderConfigurationException(charSequence);
                    }
                    break;
                case 1859614946:
                    if (string.equals(ClearCredentialUnknownException.TYPE_CLEAR_CREDENTIAL_UNKNOWN_EXCEPTION)) {
                        return new ClearCredentialUnknownException(charSequence);
                    }
                    break;
            }
            return new ClearCredentialCustomException(string, charSequence);
        }

        private Companion() {
        }
    }

    public /* synthetic */ ClearCredentialException(String str, CharSequence charSequence, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : charSequence);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ClearCredentialException(@NotNull String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        str.getClass();
    }
}
