package com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.persistence;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Entity(tableName = "artifact_detail")
/* loaded from: classes15.dex */
public class Artifact {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "artifact_id")
    public int artifactIdentifier;

    @NonNull
    @ColumnInfo(name = "artifact_key")
    public String artifactKey;

    @NonNull
    @ColumnInfo(name = "artifact_size_bytes")
    public Long artifactSizeInBytes;

    @NonNull
    @ColumnInfo(name = "artifact_type")
    public String artifactType;

    @ColumnInfo(name = "update_check_required")
    public boolean artifactUpdateCheckRequired;

    @NonNull
    @ColumnInfo(name = "checksum_md5")
    public String checksumValue;

    @NonNull
    @ColumnInfo(name = "davs_artifact_id")
    public String davsArtifactIdentifier;

    @NonNull
    @ColumnInfo(name = "last_updated_timestamp")
    public Long lastUpdatedTimeStamp;

    @NonNull
    @ColumnInfo(name = "local_filepath")
    public String localFilePath;

    @ColumnInfo(name = "update_interval_hours")
    public int updateCheckIntervalInHours;
}
