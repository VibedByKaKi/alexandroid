package com.amazon.alexa.client.alexaservice.audio.core;

import android.media.MediaDataSource;
import androidx.annotation.RequiresApi;
import com.amazon.alexa.client.alexaservice.networking.attachments.Attachment;
import com.amazon.alexa.client.alexaservice.networking.attachments.AttachmentStore;
import com.amazon.alexa.utils.concurrent.ManagedExecutorFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(api = 23)
/* loaded from: classes17.dex */
public class AudioDataSource extends MediaDataSource {
    private static final String AUDIO_THREAD = "alexaspeech-download";
    private final Attachment attachment;
    private final AttachmentStore attachmentStore;
    private volatile byte[] audioBuffer;
    private Future<Void> audioDownloadFuture;
    private final AudioDownloader audioDownloader;
    private final ExecutorService audioExecutorService = ManagedExecutorFactory.newSingleThreadCachedThreadPool(AUDIO_THREAD);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AudioDownloader implements Callable<Void> {
        private final Attachment attachment;
        private final AttachmentStore attachmentStore;
        private byte[] downloadedData;

        public AudioDownloader(Attachment attachment, AttachmentStore attachmentStore) {
            this.attachment = attachment;
            this.attachmentStore = attachmentStore;
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws IOException {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    InputStream inputStream = this.attachment.getInputStream();
                    try {
                        int available = inputStream.available();
                        byte[] bArr = new byte[available];
                        while (true) {
                            int read = inputStream.read(bArr, 0, available);
                            if (read == -1) {
                                byteArrayOutputStream.flush();
                                this.downloadedData = byteArrayOutputStream.toByteArray();
                                this.attachmentStore.delete(this.attachment.getAttachmentIdentifier());
                                inputStream.close();
                                byteArrayOutputStream.close();
                                return null;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                    } finally {
                    }
                } finally {
                }
            } catch (IOException unused) {
                Buffer$$ExternalSyntheticBUOutline0.m$2("Error in downloading audio");
                return null;
            }
        }

        public byte[] getDownloadedData() {
            return this.downloadedData;
        }
    }

    public AudioDataSource(Attachment attachment, AttachmentStore attachmentStore) {
        this.attachment = attachment;
        this.attachmentStore = attachmentStore;
        this.audioDownloader = new AudioDownloader(attachment, attachmentStore);
    }

    private void checkAudioDownloaded() throws IOException {
        try {
            this.audioDownloadFuture.get();
        } catch (Exception unused) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("Error in downloading data");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.attachmentStore.delete(this.attachment.getAttachmentIdentifier());
    }

    @Override // android.media.MediaDataSource
    public synchronized long getSize() throws IOException {
        try {
            checkAudioDownloaded();
            if (this.audioBuffer == null) {
                this.audioBuffer = this.audioDownloader.getDownloadedData();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.audioBuffer.length;
    }

    @Override // android.media.MediaDataSource
    public synchronized int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        try {
            checkAudioDownloaded();
            if (this.audioBuffer == null) {
                this.audioBuffer = this.audioDownloader.getDownloadedData();
            }
            long length = this.audioBuffer.length;
            if (j >= length) {
                return -1;
            }
            long j2 = i2;
            long j3 = j + j2;
            if (j3 > length) {
                i2 = (int) (j2 - (j3 - length));
            }
            System.arraycopy(this.audioBuffer, (int) j, bArr, i, i2);
            return i2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void startDownloadingAudio() {
        this.audioDownloadFuture = this.audioExecutorService.submit(this.audioDownloader);
    }
}
