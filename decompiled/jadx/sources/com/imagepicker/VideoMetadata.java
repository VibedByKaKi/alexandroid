package com.imagepicker;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class VideoMetadata extends Metadata {
    private int bitrate;
    private int duration;

    public VideoMetadata(Uri uri, Context context) {
        try {
            CustomMediaMetadataRetriever customMediaMetadataRetriever = new CustomMediaMetadataRetriever();
            try {
                customMediaMetadataRetriever.setDataSource(context, uri);
                String extractMetadata = customMediaMetadataRetriever.extractMetadata(9);
                String extractMetadata2 = customMediaMetadataRetriever.extractMetadata(20);
                String extractMetadata3 = customMediaMetadataRetriever.extractMetadata(5);
                if (extractMetadata != null) {
                    this.duration = Math.round(Float.parseFloat(extractMetadata)) / 1000;
                }
                if (extractMetadata2 != null) {
                    this.bitrate = Integer.parseInt(extractMetadata2);
                }
                int i = 0;
                if (extractMetadata3 != null) {
                    this.datetime = getDateTimeInUTC(extractMetadata3.substring(0, extractMetadata3.indexOf(".")).concat("+GMT"), "yyyyMMdd'T'HHmmss+zzz");
                }
                String extractMetadata4 = customMediaMetadataRetriever.extractMetadata(18);
                String extractMetadata5 = customMediaMetadataRetriever.extractMetadata(19);
                if (extractMetadata5 != null && extractMetadata4 != null) {
                    String extractMetadata6 = customMediaMetadataRetriever.extractMetadata(24);
                    if (extractMetadata6 != null) {
                        i = Integer.parseInt(extractMetadata6);
                    }
                    if (i != 90 && i != 270) {
                        this.width = Integer.parseInt(extractMetadata4);
                        this.height = Integer.parseInt(extractMetadata5);
                    }
                    this.width = Integer.parseInt(extractMetadata5);
                    this.height = Integer.parseInt(extractMetadata4);
                }
                customMediaMetadataRetriever.close();
            } finally {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getBitrate() {
        return this.bitrate;
    }

    @Override // com.imagepicker.Metadata
    public String getDateTime() {
        return this.datetime;
    }

    public int getDuration() {
        return this.duration;
    }

    @Override // com.imagepicker.Metadata
    public int getHeight() {
        return this.height;
    }

    @Override // com.imagepicker.Metadata
    public int getWidth() {
        return this.width;
    }
}
