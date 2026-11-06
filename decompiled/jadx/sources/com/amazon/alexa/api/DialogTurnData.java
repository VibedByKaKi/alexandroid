package com.amazon.alexa.api;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.Bundles;
import com.amazon.alexa.utils.validation.Preconditions;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class DialogTurnData {
    private static final String TAG = "DialogTurnData";
    private final String dialogTurnId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String dialogTurnId;

        public DialogTurnData build() {
            Preconditions.notNull(this.dialogTurnId, "Dialog Turn ID must be supplied");
            return new DialogTurnData(this.dialogTurnId);
        }

        public Builder setDialogTurnId(String str) {
            this.dialogTurnId = str;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DialogTurnDataAdapter implements BundleAdapter<DialogTurnData> {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @VisibleForTesting
        public enum DialogTurnDataKey implements Bundles.Key {
            DIALOG_TURN_ID
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.api.BundleAdapter
        public DialogTurnData createFromBundle(Bundle bundle) {
            return new DialogTurnData(Bundles.getString(bundle, DialogTurnDataKey.DIALOG_TURN_ID));
        }

        @Override // com.amazon.alexa.api.BundleAdapter
        public Bundle toBundle(DialogTurnData dialogTurnData) {
            Bundle bundle = new Bundle();
            bundle.putString(DialogTurnDataKey.DIALOG_TURN_ID.name(), dialogTurnData.dialogTurnId);
            return bundle;
        }
    }

    private DialogTurnData(String str) {
        Preconditions.notNull(str, "Dialog Turn ID must be supplied");
        this.dialogTurnId = str;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DialogTurnData) {
            return getDialogTurnId().equals(((DialogTurnData) obj).getDialogTurnId());
        }
        return false;
    }

    public String getDialogTurnId() {
        return this.dialogTurnId;
    }

    public int hashCode() {
        return Objects.hash(getDialogTurnId());
    }
}
