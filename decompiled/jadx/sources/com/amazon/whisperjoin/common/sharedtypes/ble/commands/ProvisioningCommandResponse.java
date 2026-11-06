package com.amazon.whisperjoin.common.sharedtypes.ble.commands;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.Map;
import java.util.UUID;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ProvisioningCommandResponse implements Parcelable {
    public static final Parcelable.ClassLoaderCreator<ProvisioningCommandResponse> CREATOR = new Parcelable.ClassLoaderCreator<ProvisioningCommandResponse>() { // from class: com.amazon.whisperjoin.common.sharedtypes.ble.commands.ProvisioningCommandResponse.1
        @Override // android.os.Parcelable.Creator
        public ProvisioningCommandResponse createFromParcel(Parcel parcel) {
            if (parcel != null) {
                return new ProvisioningCommandResponse(parcel, ProvisioningCommandResponse.class.getClassLoader());
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public ProvisioningCommandResponse[] newArray(int i) {
            if (i >= 0) {
                return new ProvisioningCommandResponse[i];
            }
            Single$$ExternalSyntheticBUOutline0.m$3("size cannot be negative.");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public ProvisioningCommandResponse createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel != null) {
                return new ProvisioningCommandResponse(parcel, classLoader);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }
    };
    private static final String DATA_KEY = "da";
    private static final String IDENTIFIER_KEY = "id";
    private static final String STATUS_KEY = "st";
    private static final String TAG = "ProvisioningCommandResponse";
    private final byte[] mData;
    private final UUID mIdentifier;
    private final int mStatus;

    private ProvisioningCommandResponse(Parcel parcel, ClassLoader classLoader) {
        Bundle readBundle = parcel.readBundle(classLoader);
        this.mIdentifier = UUID.fromString(readBundle.getString("id"));
        this.mStatus = readBundle.getInt("st");
        this.mData = readBundle.getByteArray("da");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
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

    public int getStatus() {
        return this.mStatus;
    }

    public String getStatusMessage() {
        Map<UUID, Map<Integer, String>> map = ProvisioningCommands.PROVISIONING_COMMANDS_STATUS_MAPS;
        if (map.containsKey(this.mIdentifier) && map.get(this.mIdentifier).containsKey(Integer.valueOf(this.mStatus))) {
            return map.get(this.mIdentifier).get(Integer.valueOf(this.mStatus));
        }
        return null;
    }

    public String toString() {
        return "ProvisioningCommandResponse [id=" + this.mIdentifier + ", status=" + getStatusMessage() + MarkdownConstants.RIGHT_BRACKET;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("dest cannot be null.");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("id", this.mIdentifier.toString());
        bundle.putInt("st", this.mStatus);
        bundle.putByteArray("da", this.mData);
        parcel.writeBundle(bundle);
    }

    public ProvisioningCommandResponse(UUID uuid, int i) {
        this(uuid, i, (byte[]) null);
    }

    public ProvisioningCommandResponse(UUID uuid, int i, byte[] bArr) {
        if (uuid != null) {
            this.mIdentifier = uuid;
            this.mStatus = i;
            this.mData = bArr == null ? null : (byte[]) bArr.clone();
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("identifier cannot be null.");
        throw null;
    }
}
