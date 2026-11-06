package com.amazon.whisperjoin.common.sharedtypes.ble.commands;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.UUID;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ProvisioningCommand implements Parcelable {
    public static final Parcelable.ClassLoaderCreator<ProvisioningCommand> CREATOR = new Parcelable.ClassLoaderCreator<ProvisioningCommand>() { // from class: com.amazon.whisperjoin.common.sharedtypes.ble.commands.ProvisioningCommand.1
        @Override // android.os.Parcelable.Creator
        public ProvisioningCommand createFromParcel(Parcel parcel) {
            if (parcel != null) {
                return new ProvisioningCommand(parcel, ProvisioningCommand.class.getClassLoader());
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public ProvisioningCommand[] newArray(int i) {
            if (i >= 0) {
                return new ProvisioningCommand[i];
            }
            Single$$ExternalSyntheticBUOutline0.m$3("size cannot be negative.");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public ProvisioningCommand createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel != null) {
                return new ProvisioningCommand(parcel, classLoader);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }
    };
    public static final String DATA_KEY = "da";
    public static final String IDENTIFIER_KEY = "id";
    private static final String TAG = "ProvisioningCommand";
    private final byte[] mData;
    private final UUID mIdentifier;

    private ProvisioningCommand(Parcel parcel, ClassLoader classLoader) {
        Bundle readBundle = parcel.readBundle(classLoader);
        this.mIdentifier = UUID.fromString(readBundle.getString("id"));
        this.mData = readBundle.getByteArray(DATA_KEY);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProvisioningCommand provisioningCommand = (ProvisioningCommand) obj;
        return new EqualsBuilder().append(this.mIdentifier, provisioningCommand.mIdentifier).append(this.mData, provisioningCommand.mData).isEquals();
    }

    public byte[] getData() {
        byte[] bArr = this.mData;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public UUID getIdentifier() {
        return this.mIdentifier;
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(this.mIdentifier).append(this.mData).toHashCode();
    }

    public String toString() {
        return "ProvisioningCommand [id=" + this.mIdentifier + MarkdownConstants.RIGHT_BRACKET;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("dest cannot be null.");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("id", this.mIdentifier.toString());
        bundle.putByteArray(DATA_KEY, this.mData);
        parcel.writeBundle(bundle);
    }

    public ProvisioningCommand(UUID uuid) {
        this(uuid, (byte[]) null);
    }

    public ProvisioningCommand(UUID uuid, byte[] bArr) {
        if (uuid != null) {
            this.mIdentifier = uuid;
            this.mData = bArr == null ? null : (byte[]) bArr.clone();
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("identifier cannot be null.");
            throw null;
        }
    }
}
