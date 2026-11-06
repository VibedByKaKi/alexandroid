package com.amazon.alexa.api;

import android.os.Bundle;
import com.amazon.alexa.api.Bundles;
import com.amazon.alexa.utils.validation.Preconditions;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class DialogData {
    private static final String TAG = "DialogData";
    private final String dialogId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String dialogId;

        public DialogData build() {
            Preconditions.notNull(this.dialogId, "Dialog ID must be supplied");
            return new DialogData(this.dialogId);
        }

        public Builder setDialogId(String str) {
            this.dialogId = str;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DialogTurnDataAdapter implements BundleAdapter<DialogData> {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum DialogDataKey implements Bundles.Key {
            DIALOG_ID
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.api.BundleAdapter
        public DialogData createFromBundle(Bundle bundle) {
            return new DialogData(Bundles.getString(bundle, DialogDataKey.DIALOG_ID));
        }

        @Override // com.amazon.alexa.api.BundleAdapter
        public Bundle toBundle(DialogData dialogData) {
            Bundle bundle = new Bundle();
            bundle.putString(DialogDataKey.DIALOG_ID.name(), dialogData.dialogId);
            return bundle;
        }
    }

    private DialogData(String str) {
        this.dialogId = str;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DialogData) {
            return getDialogId().equals(((DialogData) obj).getDialogId());
        }
        return false;
    }

    public String getDialogId() {
        return this.dialogId;
    }

    public int hashCode() {
        return Objects.hash(getDialogId());
    }
}
